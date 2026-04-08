package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GlobalLifecycle extends Lifecycle {

    /* JADX INFO: renamed from: b */
    public static final GlobalLifecycle f33832b = new GlobalLifecycle();

    /* JADX INFO: renamed from: c */
    public static final GlobalLifecycle$owner$1 f33833c = new GlobalLifecycle$owner$1();

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: a */
    public final void mo9123a(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        GlobalLifecycle$owner$1 globalLifecycle$owner$1 = f33833c;
        defaultLifecycleObserver.mo9116i(globalLifecycle$owner$1);
        defaultLifecycleObserver.onStart(globalLifecycle$owner$1);
        defaultLifecycleObserver.onResume(globalLifecycle$owner$1);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: b */
    public final Lifecycle.State getF24894d() {
        return Lifecycle.State.f24884f;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: c */
    public final void mo9125c(LifecycleObserver lifecycleObserver) {
    }
}
