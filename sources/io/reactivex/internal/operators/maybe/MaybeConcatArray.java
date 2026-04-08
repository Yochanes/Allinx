package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
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
        public final FlowableSubscriber f48281a;

        /* JADX INFO: renamed from: f */
        public long f48285f;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f48282b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final SequentialDisposable f48284d = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48283c = new AtomicReference(NotificationLite.f49279a);

        public ConcatMaybeObserver(FlowableSubscriber flowableSubscriber) {
            this.f48281a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17759a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f48283c;
            do {
                SequentialDisposable sequentialDisposable = this.f48284d;
                if (sequentialDisposable.mo17596d()) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    if (obj != NotificationLite.f49279a) {
                        long j = this.f48285f;
                        if (j != this.f48282b.get()) {
                            this.f48285f = j + 1;
                            atomicReference.lazySet(null);
                            this.f48281a.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.mo17596d()) {
                        throw null;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48284d;
            sequentialDisposable.getClass();
            DisposableHelper.m17617c(sequentialDisposable, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.f48284d;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48283c.lazySet(NotificationLite.f49279a);
            m17759a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48281a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48283c.lazySet(obj);
            m17759a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f48282b, j);
                m17759a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver((FlowableSubscriber) subscriber);
        subscriber.mo12367j(concatMaybeObserver);
        concatMaybeObserver.m17759a();
    }
}
