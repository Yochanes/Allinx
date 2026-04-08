package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo17734a() {
            m17735b();
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber, java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo17734a() {
            this.f48082a.onComplete();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f48082a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48083b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f48084c = new SequentialDisposable();

        /* JADX INFO: renamed from: d */
        public Subscription f48085d;

        public SampleTimedSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f48082a = serializedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17734a();

        /* JADX INFO: renamed from: b */
        public final void m17735b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f48083b;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.f48082a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.m17882e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17615a(this.f48084c);
            this.f48085d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48085d, subscription)) {
                this.f48085d = subscription;
                this.f48082a.mo12367j(this);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.m17615a(this.f48084c);
            mo17734a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48084c);
            this.f48082a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48083b, j);
            }
        }

        public void run() {
            m17735b();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SampleTimedNoLast(new SerializedSubscriber((FlowableSubscriber) subscriber)));
    }
}
