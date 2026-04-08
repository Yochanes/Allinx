package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SequentialDisposable f48371a = new SequentialDisposable();

        /* JADX INFO: renamed from: b */
        public final MaybeObserver f48372b;

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f48372b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
            SequentialDisposable sequentialDisposable = this.f48371a;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48372b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48372b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48372b.onSuccess(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeTask<T> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new SubscribeOnMaybeObserver(maybeObserver));
        throw null;
    }
}
