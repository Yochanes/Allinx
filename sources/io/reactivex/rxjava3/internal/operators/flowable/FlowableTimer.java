package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTimer extends Flowable<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimerSubscriber extends AtomicReference<Disposable> implements Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50096a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f50097b;

        public TimerSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50096a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17952a(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                this.f50097b = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.f49380a) {
                boolean z2 = this.f50097b;
                EmptyDisposable emptyDisposable = EmptyDisposable.f49382a;
                if (!z2) {
                    lazySet(emptyDisposable);
                    this.f50096a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f50096a.onNext(0L);
                    lazySet(emptyDisposable);
                    this.f50096a.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new TimerSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
