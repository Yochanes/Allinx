package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlatMapCompletableMainSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49723a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f49724b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49725c = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public Subscription f49726d;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
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

        public FlatMapCompletableMainSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49723a = flowableSubscriber;
            lazySet(1);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49726d.cancel();
            this.f49725c.dispose();
            this.f49724b.m18232b();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49726d, subscription)) {
                this.f49726d = subscription;
                this.f49723a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f49724b.m18236f(this.f49723a);
            } else {
                this.f49726d.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49724b.m18231a(th)) {
                this.f49726d.cancel();
                this.f49725c.dispose();
                this.f49724b.m18236f(this.f49723a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49726d.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }
    }
}
