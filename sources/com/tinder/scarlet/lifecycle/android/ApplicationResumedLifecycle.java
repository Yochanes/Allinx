package com.tinder.scarlet.lifecycle.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tinder.scarlet.Lifecycle;
import kotlin.Metadata;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/ApplicationResumedLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "ActivityLifecycleCallbacks", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class ApplicationResumedLifecycle implements Lifecycle {
    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/ApplicationResumedLifecycle$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public final class ActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
