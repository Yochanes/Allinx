package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo18078a() {
            m18079b();
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber, java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo18078a() {
            this.f49983a.onComplete();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f49983a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49984b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f49985c = new SequentialDisposable();

        /* JADX INFO: renamed from: d */
        public Subscription f49986d;

        public SampleTimedSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f49983a = serializedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo18078a();

        /* JADX INFO: renamed from: b */
        public final void m18079b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f49984b;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.f49983a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.m18241e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.m17952a(this.f49985c);
            this.f49986d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49986d, subscription)) {
                this.f49986d = subscription;
                this.f49983a.mo12367j(this);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.m17952a(this.f49985c);
            mo18078a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f49985c);
            this.f49983a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49984b, j);
            }
        }

        public void run() {
            m18079b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SampleTimedNoLast(new SerializedSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
