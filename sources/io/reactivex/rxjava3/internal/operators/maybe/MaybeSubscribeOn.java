package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SequentialDisposable f50254a = new SequentialDisposable();

        /* JADX INFO: renamed from: b */
        public final MaybeObserver f50255b;

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f50255b = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            SequentialDisposable sequentialDisposable = this.f50254a;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50255b.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50255b.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50255b.onSuccess(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeTask<T> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(new SubscribeOnMaybeObserver(maybeObserver));
        throw null;
    }
}
