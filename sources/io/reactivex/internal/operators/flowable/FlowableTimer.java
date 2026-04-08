package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimer extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimerSubscriber extends AtomicReference<Disposable> implements Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48196a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48197b;

        public TimerSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48196a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17615a(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                this.f48197b = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.f47552a) {
                boolean z2 = this.f48197b;
                EmptyDisposable emptyDisposable = EmptyDisposable.f47554a;
                if (!z2) {
                    lazySet(emptyDisposable);
                    this.f48196a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f48196a.onNext(0L);
                    lazySet(emptyDisposable);
                    this.f48196a.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new TimerSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
