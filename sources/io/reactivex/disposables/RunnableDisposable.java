package io.reactivex.disposables;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17603a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + mo17596d() + ", " + get() + ")";
    }
}
