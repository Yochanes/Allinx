package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class TopicsSyncTask implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK = new Object();

    @GuardedBy
    private static Boolean hasAccessNetworkStatePermission;

    @GuardedBy
    private static Boolean hasWakeLockPermission;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public class ConnectivityChangeReceiver extends BroadcastReceiver {

        @Nullable
        @GuardedBy
        private TopicsSyncTask task;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                TopicsSyncTask topicsSyncTask = this.task;
                if (topicsSyncTask == null) {
                    return;
                }
                if (TopicsSyncTask.access$000(topicsSyncTask)) {
                    if (TopicsSyncTask.access$100()) {
                        Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                    }
                    TopicsSyncTask.access$200(this.task).scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                    context.unregisterReceiver(this);
                    this.task = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void registerReceiver() {
            if (TopicsSyncTask.access$100()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            TopicsSyncTask.access$300(TopicsSyncTask.this).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    public static /* synthetic */ boolean access$000(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.isDeviceConnected();
    }

    public static /* synthetic */ boolean access$100() {
        return isLoggable();
    }

    public static /* synthetic */ TopicsSubscriber access$200(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.topicsSubscriber;
    }

    public static /* synthetic */ Context access$300(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.context;
    }

    private static String createPermissionMissingLog(String str) {
        return AbstractC0000a.m3D("Missing Permission: ", str, ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }

    private static boolean hasAccessNetworkStatePermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasAccessNetworkStatePermission;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                hasAccessNetworkStatePermission = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean hasPermission(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z2 && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, createPermissionMissingLog(str));
        }
        return z2;
    }

    private static boolean hasWakeLockPermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasWakeLockPermission;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                hasWakeLockPermission = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean isDeviceConnected() {
        boolean z2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z2 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    private static boolean isLoggable() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        } else {
                            wakeLock = this.syncWakeLock;
                        }
                    } else if (!hasAccessNetworkStatePermission(this.context) || isDeviceConnected()) {
                        if (this.topicsSubscriber.syncTopics()) {
                            this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        } else {
                            this.topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                        }
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        } else {
                            wakeLock = this.syncWakeLock;
                        }
                    } else {
                        new ConnectivityChangeReceiver(this).registerReceiver();
                        if (!hasWakeLockPermission(this.context)) {
                            return;
                        } else {
                            wakeLock = this.syncWakeLock;
                        }
                    }
                    wakeLock.release();
                } catch (RuntimeException unused) {
                    Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e) {
                Log.e(Constants.TAG, "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (hasWakeLockPermission(this.context)) {
                    this.syncWakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (hasWakeLockPermission(this.context)) {
                try {
                    this.syncWakeLock.release();
                } catch (RuntimeException unused2) {
                    Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
