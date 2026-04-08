package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50183a;

        /* JADX INFO: renamed from: g */
        public long f50188g;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f50184b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final SequentialDisposable f50186d = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50185c = new AtomicReference(NotificationLite.f51228a);

        /* JADX INFO: renamed from: f */
        public final AtomicThrowable f50187f = new AtomicThrowable();

        public ConcatMaybeObserver(FlowableSubscriber flowableSubscriber) {
            this.f50183a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18107a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f50185c;
            do {
                SequentialDisposable sequentialDisposable = this.f50186d;
                if (sequentialDisposable.mo12353d()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.f51228a) {
                        long j = this.f50188g;
                        if (j != this.f50184b.get()) {
                            this.f50188g = j + 1;
                            atomicReference.lazySet(null);
                            this.f50183a.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.mo12353d()) {
                        throw null;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50186d;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.f50186d;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
            this.f50187f.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50185c.lazySet(NotificationLite.f51228a);
            m18107a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50185c.lazySet(NotificationLite.f51228a);
            if (this.f50187f.m18231a(th)) {
                m18107a();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50185c.lazySet(obj);
            m18107a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f50184b, j);
                m18107a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver((FlowableSubscriber) subscriber);
        subscriber.mo12367j(concatMaybeObserver);
        concatMaybeObserver.m18107a();
    }
}
