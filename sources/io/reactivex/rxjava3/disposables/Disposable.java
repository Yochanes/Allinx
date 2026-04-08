package io.reactivex.rxjava3.disposables;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Disposable {
    /* JADX INFO: renamed from: k */
    static Disposable m17946k(Runnable runnable) {
        return new RunnableDisposable(runnable);
    }

    /* JADX INFO: renamed from: d */
    boolean mo12353d();

    void dispose();
}
