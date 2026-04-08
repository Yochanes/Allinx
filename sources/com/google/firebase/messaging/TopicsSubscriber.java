package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class TopicsSubscriber {
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final long RPC_TIMEOUT_SEC = 30;
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;

    @GuardedBy
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> pendingOperations = new ArrayMap(0);

    @GuardedBy
    private boolean syncScheduledOrRunning = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TopicsSubscriber m15253a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return lambda$createInstance$0(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
    }

    private void addToPendingOperations(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    arrayDeque = this.pendingOperations.get(strSerialize);
                } else {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.pendingOperations.put(strSerialize, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    private static <T> void awaitTask(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    @WorkerThread
    private void blockingSubscribeToTopic(String str) throws IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @WorkerThread
    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @VisibleForTesting
    public static Task<TopicsSubscriber> createInstance(FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new CallableC4754q(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc));
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    private static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.pendingOperations.get(strSerialize);
                    TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                    if (taskCompletionSourcePoll != null) {
                        taskCompletionSourcePoll.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.pendingOperations.remove(strSerialize);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    @VisibleForTesting
    public TopicsStore getStore() {
        return this.store;
    }

    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    public synchronized boolean isSyncScheduledOrRunning() {
        return this.syncScheduledOrRunning;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performTopicOperation(TopicOperation topicOperation) throws IOException {
        byte b2;
        try {
            String operation = topicOperation.getOperation();
            int iHashCode = operation.hashCode();
            if (iHashCode != 83) {
                b2 = (iHashCode == 85 && operation.equals("U")) ? (byte) 1 : (byte) -1;
            } else if (operation.equals("S")) {
                b2 = 0;
            }
            if (b2 == 0) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.");
                }
            } else if (b2 == 1) {
                blockingUnsubscribeFromTopic(topicOperation.getTopic());
                if (isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.");
                }
            } else if (isDebugLogEnabled()) {
                Log.d(Constants.TAG, "Unknown topic operation" + topicOperation + ".");
            }
            return true;
        } catch (IOException e) {
            if (!ERROR_SERVICE_NOT_AVAILABLE.equals(e.getMessage()) && !ERROR_INTERNAL_SERVER_ERROR.equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.e(Constants.TAG, "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e(Constants.TAG, "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    public Task<Void> scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public synchronized void setSyncScheduledOrRunning(boolean z2) {
        this.syncScheduledOrRunning = z2;
    }

    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    public Task<Void> subscribeToTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (isDebugLogEnabled() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "topic sync succeeded");
     */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean syncTopics() {
        while (true) {
            synchronized (this) {
                try {
                    TopicOperation nextTopicOperation = this.store.getNextTopicOperation();
                    if (nextTopicOperation == null) {
                        break;
                    }
                    if (!performTopicOperation(nextTopicOperation)) {
                        return false;
                    }
                    this.store.removeTopicOperation(nextTopicOperation);
                    markCompletePendingOperation(nextTopicOperation);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }
}
