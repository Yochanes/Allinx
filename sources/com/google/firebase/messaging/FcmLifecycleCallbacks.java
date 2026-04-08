package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private static final int RECENTLY_LOGGED_MESSAGE_IDS_MAX_SIZE = 10;
    private final Queue<String> recentlyLoggedMessageIds = new ArrayDeque(10);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15229a(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        fcmLifecycleCallbacks.lambda$onActivityCreated$0(intent);
    }

    private /* synthetic */ void lambda$onActivityCreated$0(Intent intent) {
        logNotificationOpen(intent);
    }

    private void logNotificationOpen(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String messageId = MessagingAnalytics.getMessageId(extras);
                if (!TextUtils.isEmpty(messageId)) {
                    if (this.recentlyLoggedMessageIds.contains(messageId)) {
                        return;
                    } else {
                        this.recentlyLoggedMessageIds.add(messageId);
                    }
                }
                bundle = extras.getBundle(Constants.MessageNotificationKeys.ANALYTICS_DATA);
            }
        } catch (RuntimeException e) {
            Log.w(Constants.TAG, "Failed trying to get analytics data from Intent extras.", e);
        }
        if (MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4741d(0, this, intent));
        } else {
            logNotificationOpen(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
