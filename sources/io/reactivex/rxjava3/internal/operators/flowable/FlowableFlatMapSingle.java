package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49739a;

        /* JADX INFO: renamed from: i */
        public Subscription f49745i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f49746j;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49740b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49741c = new CompositeDisposable();

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f49743f = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f49742d = new AtomicInteger(1);

        /* JADX INFO: renamed from: g */
        public final AtomicReference f49744g = new AtomicReference();

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
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

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapSingleSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49739a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18015a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.f49744g.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m18016b() {
            FlowableSubscriber flowableSubscriber = this.f49739a;
            AtomicInteger atomicInteger = this.f49742d;
            AtomicReference atomicReference = this.f49744g;
            int iAddAndGet = 1;
            do {
                long j = this.f49740b.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f49746j) {
                        m18015a();
                        return;
                    }
                    if (this.f49743f.get() != null) {
                        m18015a();
                        this.f49743f.m18236f(this.f49739a);
                        return;
                    }
                    boolean z2 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z3 = objPoll == null;
                    if (z2 && z3) {
                        this.f49743f.m18236f(flowableSubscriber);
                        return;
                    } else {
                        if (z3) {
                            break;
                        }
                        flowableSubscriber.onNext(objPoll);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.f49746j) {
                        m18015a();
                        return;
                    }
                    if (this.f49743f.get() != null) {
                        m18015a();
                        this.f49743f.m18236f(flowableSubscriber);
                        return;
                    }
                    boolean z4 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z5 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z4 && z5) {
                        this.f49743f.m18236f(flowableSubscriber);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m18241e(this.f49740b, j2);
                    this.f49745i.request(j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public final SpscLinkedArrayQueue m18017c() {
            AtomicReference atomicReference = this.f49744g;
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
            if (spscLinkedArrayQueue != null) {
                return spscLinkedArrayQueue;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.f49359a);
            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                if (atomicReference.get() != null) {
                    return (SpscLinkedArrayQueue) atomicReference.get();
                }
            }
            return spscLinkedArrayQueue2;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49746j = true;
            this.f49745i.cancel();
            this.f49741c.dispose();
            this.f49743f.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49745i, subscription)) {
                this.f49745i = subscription;
                this.f49739a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49742d.decrementAndGet();
            if (getAndIncrement() == 0) {
                m18016b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49742d.decrementAndGet();
            if (this.f49743f.m18231a(th)) {
                this.f49741c.dispose();
                if (getAndIncrement() == 0) {
                    m18016b();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49745i.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49740b, j);
                if (getAndIncrement() == 0) {
                    m18016b();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlatMapSingleSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
