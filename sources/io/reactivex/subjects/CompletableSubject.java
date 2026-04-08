package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f51368a;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.f51368a = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        completableObserver.mo17580c(new CompletableDisposable(completableObserver, this));
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo17580c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
