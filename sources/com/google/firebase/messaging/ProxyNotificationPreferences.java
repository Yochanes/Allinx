package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ExecutorC0154a;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15250a(Context context, boolean z2, Void r2) {
        lambda$setProxyRetention$0(context, z2, r2);
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @WorkerThread
    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    @WorkerThread
    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z2) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z2;
    }

    private static /* synthetic */ void lambda$setProxyRetention$0(Context context, boolean z2, Void r2) {
        setProxyRetentionPreferences(context, z2);
    }

    @WorkerThread
    public static void setProxyNotificationsInitialized(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z2);
        editorEdit.apply();
    }

    @WorkerThread
    public static void setProxyRetention(Context context, GmsRpc gmsRpc, boolean z2) {
        if (PlatformVersion.isAtLeastQ() && !isProxyNotificationRetentionSet(getPreference(context), z2)) {
            gmsRpc.setRetainProxiedNotifications(z2).addOnSuccessListener(new ExecutorC0154a(1), new C4751n(context, z2));
        }
    }

    @WorkerThread
    public static void setProxyRetentionPreferences(Context context, boolean z2) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z2);
        editorEdit.apply();
    }
}
