package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableResumeNext extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49539a;

        /* JADX INFO: renamed from: b */
        public boolean f49540b;

        public ResumeNextObserver(CompletableObserver completableObserver) {
            this.f49539a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            DisposableHelper.m17954c(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f49539a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            boolean z2 = this.f49540b;
            CompletableObserver completableObserver = this.f49539a;
            if (z2) {
                completableObserver.onError(th);
                return;
            }
            this.f49540b = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new ResumeNextObserver(completableObserver));
        throw null;
    }
}
