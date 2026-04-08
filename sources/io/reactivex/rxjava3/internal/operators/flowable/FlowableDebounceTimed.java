package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
        public final Object f49673a;

        /* JADX INFO: renamed from: b */
        public final long f49674b;

        /* JADX INFO: renamed from: c */
        public final DebounceTimedSubscriber f49675c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f49676d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedSubscriber debounceTimedSubscriber) {
            this.f49673a = obj;
            this.f49674b = j;
            this.f49675c = debounceTimedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m18006a() {
            if (this.f49676d.compareAndSet(false, true)) {
                DebounceTimedSubscriber debounceTimedSubscriber = this.f49675c;
                if (this.f49674b == debounceTimedSubscriber.f49679c) {
                    if (debounceTimedSubscriber.get() != 0) {
                        throw null;
                    }
                    debounceTimedSubscriber.cancel();
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            m18006a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49677a;

        /* JADX INFO: renamed from: b */
        public Disposable f49678b;

        /* JADX INFO: renamed from: c */
        public volatile long f49679c;

        /* JADX INFO: renamed from: d */
        public boolean f49680d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49677a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49677a, subscription)) {
                this.f49677a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49680d) {
                return;
            }
            this.f49680d = true;
            Disposable disposable = this.f49678b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.m18006a();
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49680d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f49680d = true;
            Disposable disposable = this.f49678b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49680d) {
                return;
            }
            long j = this.f49679c + 1;
            this.f49679c = j;
            Disposable disposable = this.f49678b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            this.f49678b = new DebounceEmitter(obj, j, this);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
