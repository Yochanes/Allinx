package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
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
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49731a;

        /* JADX INFO: renamed from: i */
        public Subscription f49737i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f49738j;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49732b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49733c = new CompositeDisposable();

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f49735f = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f49734d = new AtomicInteger(1);

        /* JADX INFO: renamed from: g */
        public final AtomicReference f49736g = new AtomicReference();

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
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
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapMaybeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49731a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18012a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.f49736g.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m18013b() {
            FlowableSubscriber flowableSubscriber = this.f49731a;
            AtomicInteger atomicInteger = this.f49734d;
            AtomicReference atomicReference = this.f49736g;
            int iAddAndGet = 1;
            do {
                long j = this.f49732b.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f49738j) {
                        m18012a();
                        return;
                    }
                    if (this.f49735f.get() != null) {
                        m18012a();
                        this.f49735f.m18236f(flowableSubscriber);
                        return;
                    }
                    boolean z2 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z3 = objPoll == null;
                    if (z2 && z3) {
                        this.f49735f.m18236f(flowableSubscriber);
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
                    if (this.f49738j) {
                        m18012a();
                        return;
                    }
                    if (this.f49735f.get() != null) {
                        m18012a();
                        this.f49735f.m18236f(flowableSubscriber);
                        return;
                    }
                    boolean z4 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z5 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z4 && z5) {
                        this.f49735f.m18236f(flowableSubscriber);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m18241e(this.f49732b, j2);
                    this.f49737i.request(j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public final SpscLinkedArrayQueue m18014c() {
            AtomicReference atomicReference = this.f49736g;
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
            this.f49738j = true;
            this.f49737i.cancel();
            this.f49733c.dispose();
            this.f49735f.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49737i, subscription)) {
                this.f49737i = subscription;
                this.f49731a.mo12367j(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49734d.decrementAndGet();
            if (getAndIncrement() == 0) {
                m18013b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49734d.decrementAndGet();
            if (this.f49735f.m18231a(th)) {
                this.f49733c.dispose();
                if (getAndIncrement() == 0) {
                    m18013b();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49737i.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49732b, j);
                if (getAndIncrement() == 0) {
                    m18013b();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlatMapMaybeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
