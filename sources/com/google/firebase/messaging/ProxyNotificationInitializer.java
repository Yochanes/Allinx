package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.snackbar.AbstractC3999a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15249a(Context context, boolean z2, TaskCompletionSource taskCompletionSource) {
        lambda$setEnableProxyNotification$0(context, z2, taskCompletionSource);
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @WorkerThread
    public static void initialize(Context context) {
        if (ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new ExecutorC0154a(1), context, shouldEnableProxyNotification(context));
    }

    public static boolean isProxyNotificationEnabled(Context context) {
        if (PlatformVersion.isAtLeastQ()) {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(AbstractC3999a.m14725e((NotificationManager) context.getSystemService(NotificationManager.class)))) {
                if (!Log.isLoggable(Constants.TAG, 3)) {
                    return true;
                }
                Log.d(Constants.TAG, "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    private static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z2, TaskCompletionSource taskCompletionSource) {
        try {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
            } else {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z2) {
                    AbstractC3999a.m14727g(notificationManager);
                } else if ("com.google.android.gms".equals(AbstractC3999a.m14725e(notificationManager))) {
                    AbstractC3999a.m14732l(notificationManager);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    public static Task<Void> setEnableProxyNotification(Executor executor, Context context, boolean z2) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new RunnableC4750m(context, z2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
