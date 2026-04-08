package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class WithinAppServiceConnection implements ServiceConnection {

    @Nullable
    private WithinAppServiceBinder binder;

    @GuardedBy
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    /* JADX INFO: compiled from: Proguard */
    public static class BindRequest {
        final Intent intent;
        private final TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();

        public BindRequest(Intent intent) {
            this.intent = intent;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15256a(ScheduledFuture scheduledFuture, Task task) {
            lambda$arrangeTimeout$1(scheduledFuture, task);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m15257b(BindRequest bindRequest) {
            bindRequest.lambda$arrangeTimeout$0();
        }

        private /* synthetic */ void lambda$arrangeTimeout$0() {
            Log.w(Constants.TAG, "Service took too long to process intent: " + this.intent.getAction() + " finishing.");
            finish();
        }

        private static /* synthetic */ void lambda$arrangeTimeout$1(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            getTask().addOnCompleteListener(scheduledExecutorService, new C4749l(scheduledExecutorService.schedule(new RunnableC4753p(this, 1), 20L, TimeUnit.SECONDS), 3));
        }

        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }

        public Task<Void> getTask() {
            return this.taskCompletionSource.getTask();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy
    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    private synchronized void flushQueue() {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "flush queue called");
            }
            while (!this.intentQueue.isEmpty()) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "found intent to be delivered");
                }
                WithinAppServiceBinder withinAppServiceBinder = this.binder;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    startConnectionIfNeeded();
                    return;
                }
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "binder is alive, sending the intent.");
                }
                this.binder.send(this.intentQueue.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy
    private void startConnectionIfNeeded() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.connectionInProgress);
            Log.d(Constants.TAG, sb.toString());
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
                return;
            } else {
                Log.e(Constants.TAG, "binding to the service failed");
            }
        } catch (SecurityException e) {
            Log.e(Constants.TAG, "Exception while binding the service", e);
        }
        this.connectionInProgress = false;
        finishAllInQueue();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "onServiceConnected: " + componentName);
            }
            this.connectionInProgress = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.binder = (WithinAppServiceBinder) iBinder;
                flushQueue();
            } else {
                Log.e(Constants.TAG, "Invalid service connection: " + iBinder);
                finishAllInQueue();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "onServiceDisconnected: " + componentName);
        }
        flushQueue();
    }

    @CanIgnoreReturnValue
    public synchronized Task<Void> sendIntent(Intent intent) {
        BindRequest bindRequest;
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "new intent queued in the bind-strategy delivery");
            }
            bindRequest = new BindRequest(intent);
            bindRequest.arrangeTimeout(this.scheduledExecutorService);
            this.intentQueue.add(bindRequest);
            flushQueue();
        } catch (Throwable th) {
            throw th;
        }
        return bindRequest.getTask();
    }

    @VisibleForTesting
    public WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService;
    }
}
