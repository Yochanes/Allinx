package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47810a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f47811b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f47812c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Subscription f47813d;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
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
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainSubscriber(CompletableObserver completableObserver) {
            this.f47810a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47812c.f47546b;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47813d.cancel();
            this.f47812c.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47813d, subscription)) {
                this.f47813d = subscription;
                this.f47810a.mo17580c(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() != 0) {
                this.f47813d.request(1L);
                return;
            }
            AtomicThrowable atomicThrowable = this.f47811b;
            atomicThrowable.getClass();
            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
            CompletableObserver completableObserver = this.f47810a;
            if (thM17888b != null) {
                completableObserver.onError(thM17888b);
            } else {
                completableObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f47811b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.f47810a.onError(ExceptionHelper.m17888b(atomicThrowable));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f47813d.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new FlatMapCompletableMainSubscriber(completableObserver);
        throw null;
    }
}
