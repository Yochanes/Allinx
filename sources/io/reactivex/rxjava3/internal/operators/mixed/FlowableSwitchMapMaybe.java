package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
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
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: n */
        public static final SwitchMapMaybeObserver f50325n = new SwitchMapMaybeObserver(null);

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f50326a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50327b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f50328c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f50329d = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public Subscription f50330f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50331g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50332i;

        /* JADX INFO: renamed from: j */
        public long f50333j;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapMaybeSubscriber f50334a;

            /* JADX INFO: renamed from: b */
            public volatile Object f50335b;

            public SwitchMapMaybeObserver(SwitchMapMaybeSubscriber switchMapMaybeSubscriber) {
                this.f50334a = switchMapMaybeSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                SwitchMapMaybeSubscriber switchMapMaybeSubscriber = this.f50334a;
                AtomicReference atomicReference = switchMapMaybeSubscriber.f50329d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeSubscriber.m18122b();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapMaybeSubscriber switchMapMaybeSubscriber = this.f50334a;
                AtomicReference atomicReference = switchMapMaybeSubscriber.f50329d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                if (switchMapMaybeSubscriber.f50327b.m18231a(th)) {
                    switchMapMaybeSubscriber.f50330f.cancel();
                    switchMapMaybeSubscriber.m18121a();
                    switchMapMaybeSubscriber.m18122b();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f50335b = obj;
                this.f50334a.m18122b();
            }
        }

        public SwitchMapMaybeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f50326a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18121a() {
            AtomicReference atomicReference = this.f50329d;
            SwitchMapMaybeObserver switchMapMaybeObserver = f50325n;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapMaybeObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m18122b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f50326a;
            AtomicThrowable atomicThrowable = this.f50327b;
            AtomicReference atomicReference = this.f50329d;
            AtomicLong atomicLong = this.f50328c;
            long j = this.f50333j;
            int iAddAndGet = 1;
            while (!this.f50332i) {
                if (atomicThrowable.get() != null) {
                    atomicThrowable.m18236f(flowableSubscriber);
                    return;
                }
                boolean z2 = this.f50331g;
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z3 = switchMapMaybeObserver == null;
                if (z2 && z3) {
                    atomicThrowable.m18236f(flowableSubscriber);
                    return;
                }
                if (z3 || switchMapMaybeObserver.f50335b == null || j == atomicLong.get()) {
                    this.f50333j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    flowableSubscriber.onNext(switchMapMaybeObserver.f50335b);
                    j++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50332i = true;
            this.f50330f.cancel();
            m18121a();
            this.f50327b.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50330f, subscription)) {
                this.f50330f = subscription;
                this.f50326a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50331g = true;
            m18122b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50327b.m18231a(th)) {
                m18121a();
                this.f50331g = true;
                m18122b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f50329d;
            SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver != null) {
                DisposableHelper.m17952a(switchMapMaybeObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50330f.cancel();
                atomicReference.getAndSet(f50325n);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m18237a(this.f50328c, j);
            m18122b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new SwitchMapMaybeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
