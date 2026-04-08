package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49727a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f49728b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49729c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Subscription f49730d;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
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
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainSubscriber(CompletableObserver completableObserver) {
            this.f49727a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49729c.f49374b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49730d.cancel();
            this.f49729c.dispose();
            this.f49728b.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49730d, subscription)) {
                this.f49730d = subscription;
                this.f49727a.mo12363c(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f49728b.m18233c(this.f49727a);
            } else {
                this.f49730d.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49728b.m18231a(th)) {
                this.f49730d.cancel();
                this.f49729c.dispose();
                this.f49728b.m18233c(this.f49727a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49730d.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new FlatMapCompletableMainSubscriber(completableObserver);
        throw null;
    }
}
