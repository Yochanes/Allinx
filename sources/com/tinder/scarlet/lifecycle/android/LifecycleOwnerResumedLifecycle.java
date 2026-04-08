package com.tinder.scarlet.lifecycle.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.tinder.scarlet.Lifecycle;
import kotlin.Metadata;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/LifecycleOwnerResumedLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "ALifecycleObserver", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class LifecycleOwnerResumedLifecycle implements Lifecycle {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Lcom/tinder/scarlet/lifecycle/android/LifecycleOwnerResumedLifecycle$ALifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "", "onPause", "()V", "onResume", "onDestroy", "scarlet-lifecycle-android_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public final class ALifecycleObserver implements LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            throw null;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            throw null;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            throw null;
        }
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        throw null;
    }
}
