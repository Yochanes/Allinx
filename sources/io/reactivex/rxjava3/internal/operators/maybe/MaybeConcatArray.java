package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50178a;

        /* JADX INFO: renamed from: f */
        public long f50182f;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f50179b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final SequentialDisposable f50181d = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50180c = new AtomicReference(NotificationLite.f51228a);

        public ConcatMaybeObserver(FlowableSubscriber flowableSubscriber) {
            this.f50178a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18106a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f50180c;
            do {
                SequentialDisposable sequentialDisposable = this.f50181d;
                if (sequentialDisposable.mo12353d()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.f51228a) {
                        long j = this.f50182f;
                        if (j != this.f50179b.get()) {
                            this.f50182f = j + 1;
                            atomicReference.lazySet(null);
                            this.f50178a.onNext(obj);
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
            SequentialDisposable sequentialDisposable = this.f50181d;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.f50181d;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50180c.lazySet(NotificationLite.f51228a);
            m18106a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50178a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50180c.lazySet(obj);
            m18106a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f50179b, j);
                m18106a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver((FlowableSubscriber) subscriber);
        subscriber.mo12367j(concatMaybeObserver);
        concatMaybeObserver.m18106a();
    }
}
