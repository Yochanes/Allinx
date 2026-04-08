package io.reactivex.rxjava3.disposables;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17941a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + mo12353d() + ", " + get() + ")";
    }
}
