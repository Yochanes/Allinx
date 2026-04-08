package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
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
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: n */
        public static final SwitchMapSingleObserver f48456n = new SwitchMapSingleObserver(null);

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48457a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48458b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48459c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f48460d = new AtomicReference();

        /* JADX INFO: renamed from: f */
        public Subscription f48461f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48462g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48463i;

        /* JADX INFO: renamed from: j */
        public long f48464j;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapSingleSubscriber f48465a;

            /* JADX INFO: renamed from: b */
            public volatile Object f48466b;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber switchMapSingleSubscriber) {
                this.f48465a = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber switchMapSingleSubscriber = this.f48465a;
                AtomicReference atomicReference = switchMapSingleSubscriber.f48460d;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapSingleSubscriber.f48458b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapSingleSubscriber.f48461f.cancel();
                            switchMapSingleSubscriber.m17769a();
                            switchMapSingleSubscriber.m17770b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.f48466b = obj;
                this.f48465a.m17770b();
            }
        }

        public SwitchMapSingleSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48457a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17769a() {
            AtomicReference atomicReference = this.f48460d;
            SwitchMapSingleObserver switchMapSingleObserver = f48456n;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapSingleObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m17770b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f48457a;
            AtomicThrowable atomicThrowable = this.f48458b;
            AtomicReference atomicReference = this.f48460d;
            AtomicLong atomicLong = this.f48459c;
            long j = this.f48464j;
            int iAddAndGet = 1;
            while (!this.f48463i) {
                if (atomicThrowable.get() != null) {
                    flowableSubscriber.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                boolean z2 = this.f48462g;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z3 = switchMapSingleObserver == null;
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
                if (z3 || switchMapSingleObserver.f48466b == null || j == atomicLong.get()) {
                    this.f48464j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    flowableSubscriber.onNext(switchMapSingleObserver.f48466b);
                    j++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48463i = true;
            this.f48461f.cancel();
            m17769a();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48461f, subscription)) {
                this.f48461f = subscription;
                this.f48457a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48462g = true;
            m17770b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48458b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            m17769a();
            this.f48462g = true;
            m17770b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f48460d;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.m17615a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48461f.cancel();
                atomicReference.getAndSet(f48456n);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.m17878a(this.f48459c, j);
            m17770b();
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new SwitchMapSingleSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
