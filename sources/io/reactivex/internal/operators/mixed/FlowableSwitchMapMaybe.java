package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: n */
        public static final SwitchMapMaybeObserver f48445n = new SwitchMapMaybeObserver(null);

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48446a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48447b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48448c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f48449d = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public Subscription f48450f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48451g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48452i;

        /* JADX INFO: renamed from: j */
        public long f48453j;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapMaybeSubscriber f48454a;

            /* JADX INFO: renamed from: b */
            public volatile Object f48455b;

            public SwitchMapMaybeObserver(SwitchMapMaybeSubscriber switchMapMaybeSubscriber) {
                this.f48454a = switchMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                SwitchMapMaybeSubscriber switchMapMaybeSubscriber = this.f48454a;
                AtomicReference atomicReference = switchMapMaybeSubscriber.f48449d;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeSubscriber.m17768b();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapMaybeSubscriber switchMapMaybeSubscriber = this.f48454a;
                AtomicReference atomicReference = switchMapMaybeSubscriber.f48449d;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapMaybeSubscriber.f48447b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapMaybeSubscriber.f48450f.cancel();
                            switchMapMaybeSubscriber.m17767a();
                            switchMapMaybeSubscriber.m17768b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f48455b = obj;
                this.f48454a.m17768b();
            }
        }

        public SwitchMapMaybeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48446a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17767a() {
            AtomicReference atomicReference = this.f48449d;
            SwitchMapMaybeObserver switchMapMaybeObserver = f48445n;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapMaybeObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m17768b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f48446a;
            AtomicThrowable atomicThrowable = this.f48447b;
            AtomicReference atomicReference = this.f48449d;
            AtomicLong atomicLong = this.f48448c;
            long j = this.f48453j;
            int iAddAndGet = 1;
            while (!this.f48452i) {
                if (atomicThrowable.get() != null) {
                    flowableSubscriber.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                boolean z2 = this.f48451g;
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z3 = switchMapMaybeObserver == null;
                if (z2 && z3) {
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b != null) {
                        flowableSubscriber.onError(thM17888b);
                        return;
                    } else {
                        flowableSubscriber.onComplete();
                        return;
                    }
                }
                if (z3 || switchMapMaybeObserver.f48455b == null || j == atomicLong.get()) {
                    this.f48453j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    flowableSubscriber.onNext(switchMapMaybeObserver.f48455b);
                    j++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48452i = true;
            this.f48450f.cancel();
            m17767a();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48450f, subscription)) {
                this.f48450f = subscription;
                this.f48446a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48451g = true;
            m17768b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48447b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            m17767a();
            this.f48451g = true;
            m17768b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f48449d;
            SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver != null) {
                DisposableHelper.m17615a(switchMapMaybeObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48450f.cancel();
                atomicReference.getAndSet(f48445n);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m17878a(this.f48448c, j);
            m17768b();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new SwitchMapMaybeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
