package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f51320a;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.f51320a = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new CompletableDisposable(completableObserver, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo12363c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }
}
