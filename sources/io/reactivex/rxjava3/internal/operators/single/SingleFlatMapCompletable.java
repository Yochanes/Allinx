package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f51027a;

        public FlatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f51027a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
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
            this.f51027a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51027a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new FlatMapCompletableObserver(completableObserver));
        throw null;
    }
}
