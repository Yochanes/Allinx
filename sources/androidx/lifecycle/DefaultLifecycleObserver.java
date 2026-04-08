package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface DefaultLifecycleObserver extends LifecycleObserver {
    /* JADX INFO: renamed from: i */
    default void mo9116i(LifecycleOwner owner) {
        Intrinsics.m18599g(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        Intrinsics.m18599g(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        Intrinsics.m18599g(owner, "owner");
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
    }
}
