package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoCloseableDisposable extends ReferenceDisposable<AutoCloseable> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17941a(Object obj) {
        try {
            ((AutoCloseable) obj).close();
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "AutoCloseableDisposable(disposed=" + mo12353d() + ", " + get() + ")";
    }
}
