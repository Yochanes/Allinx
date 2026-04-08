package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Object f47735a;

        /* JADX INFO: renamed from: b */
        public final long f47736b;

        /* JADX INFO: renamed from: c */
        public final DebounceTimedSubscriber f47737c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f47738d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedSubscriber debounceTimedSubscriber) {
            this.f47735a = obj;
            this.f47736b = j;
            this.f47737c = debounceTimedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m17662a() {
            if (this.f47738d.compareAndSet(false, true)) {
                DebounceTimedSubscriber debounceTimedSubscriber = this.f47737c;
                long j = this.f47736b;
                Object obj = this.f47735a;
                if (j == debounceTimedSubscriber.f47744g) {
                    if (debounceTimedSubscriber.get() == 0) {
                        debounceTimedSubscriber.cancel();
                        debounceTimedSubscriber.f47739a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        debounceTimedSubscriber.f47739a.onNext(obj);
                        BackpressureHelper.m17882e(debounceTimedSubscriber, 1L);
                        DisposableHelper.m17615a(this);
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            m17662a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f47739a;

        /* JADX INFO: renamed from: b */
        public final TimeUnit f47740b;

        /* JADX INFO: renamed from: c */
        public final Scheduler.Worker f47741c;

        /* JADX INFO: renamed from: d */
        public Subscription f47742d;

        /* JADX INFO: renamed from: f */
        public Disposable f47743f;

        /* JADX INFO: renamed from: g */
        public volatile long f47744g;

        /* JADX INFO: renamed from: i */
        public boolean f47745i;

        public DebounceTimedSubscriber(SerializedSubscriber serializedSubscriber, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f47739a = serializedSubscriber;
            this.f47740b = timeUnit;
            this.f47741c = worker;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47742d.cancel();
            this.f47741c.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47742d, subscription)) {
                this.f47742d = subscription;
                this.f47739a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47745i) {
                return;
            }
            this.f47745i = true;
            Disposable disposable = this.f47743f;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.m17662a();
            }
            this.f47739a.onComplete();
            this.f47741c.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47745i) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f47745i = true;
            Disposable disposable = this.f47743f;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            this.f47739a.onError(th);
            this.f47741c.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47745i) {
                return;
            }
            long j = this.f47744g + 1;
            this.f47744g = j;
            Disposable disposable = this.f47743f;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f47743f = debounceEmitter;
            DisposableHelper.m17617c(debounceEmitter, this.f47741c.mo17599c(debounceEmitter, 0L, this.f47740b));
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new SerializedSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
