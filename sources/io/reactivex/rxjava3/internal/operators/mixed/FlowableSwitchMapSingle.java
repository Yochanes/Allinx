package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: n */
        public static final SwitchMapSingleObserver f50336n = new SwitchMapSingleObserver(null);

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50337a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50338b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f50339c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f50340d = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public Subscription f50341f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50342g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50343i;

        /* JADX INFO: renamed from: j */
        public long f50344j;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapSingleSubscriber f50345a;

            /* JADX INFO: renamed from: b */
            public volatile Object f50346b;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber switchMapSingleSubscriber) {
                this.f50345a = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber switchMapSingleSubscriber = this.f50345a;
                AtomicReference atomicReference = switchMapSingleSubscriber.f50340d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                if (switchMapSingleSubscriber.f50338b.m18231a(th)) {
                    switchMapSingleSubscriber.f50341f.cancel();
                    switchMapSingleSubscriber.m18123a();
                    switchMapSingleSubscriber.m18124b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f50346b = obj;
                this.f50345a.m18124b();
            }
        }

        public SwitchMapSingleSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50337a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18123a() {
            AtomicReference atomicReference = this.f50340d;
            SwitchMapSingleObserver switchMapSingleObserver = f50336n;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapSingleObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m18124b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f50337a;
            AtomicThrowable atomicThrowable = this.f50338b;
            AtomicReference atomicReference = this.f50340d;
            AtomicLong atomicLong = this.f50339c;
            long j = this.f50344j;
            int iAddAndGet = 1;
            while (!this.f50343i) {
                if (atomicThrowable.get() != null) {
                    atomicThrowable.m18236f(flowableSubscriber);
                    return;
                }
                boolean z2 = this.f50342g;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z3 = switchMapSingleObserver == null;
                if (z2 && z3) {
                    atomicThrowable.m18236f(flowableSubscriber);
                    return;
                }
                if (z3 || switchMapSingleObserver.f50346b == null || j == atomicLong.get()) {
                    this.f50344j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    flowableSubscriber.onNext(switchMapSingleObserver.f50346b);
                    j++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50343i = true;
            this.f50341f.cancel();
            m18123a();
            this.f50338b.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50341f, subscription)) {
                this.f50341f = subscription;
                this.f50337a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50342g = true;
            m18124b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50338b.m18231a(th)) {
                m18123a();
                this.f50342g = true;
                m18124b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f50340d;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.m17952a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50341f.cancel();
                atomicReference.getAndSet(f50336n);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m18237a(this.f50339c, j);
            m18124b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SwitchMapSingleSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
