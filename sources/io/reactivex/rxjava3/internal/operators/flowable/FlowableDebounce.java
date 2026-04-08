package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f49667a;

        /* JADX INFO: renamed from: b */
        public Subscription f49668b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49669c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile long f49670d;

        /* JADX INFO: renamed from: f */
        public boolean f49671f;

        /* JADX INFO: compiled from: Proguard */
        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {

            /* JADX INFO: renamed from: b */
            public boolean f49672b;

            /* JADX INFO: renamed from: a */
            public final void m18005a() {
                throw null;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (this.f49672b) {
                    return;
                }
                this.f49672b = true;
                m18005a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                if (this.f49672b) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    this.f49672b = true;
                    throw null;
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                if (this.f49672b) {
                    return;
                }
                this.f49672b = true;
                dispose();
                m18005a();
            }
        }

        public DebounceSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f49667a = serializedSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49668b.cancel();
            DisposableHelper.m17952a(this.f49669c);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49668b, subscription)) {
                this.f49668b = subscription;
                this.f49667a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49671f) {
                return;
            }
            this.f49671f = true;
            AtomicReference atomicReference = this.f49669c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (DisposableHelper.m17953b(disposable)) {
                return;
            }
            DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
            if (debounceInnerSubscriber != null) {
                debounceInnerSubscriber.m18005a();
            }
            DisposableHelper.m17952a(atomicReference);
            this.f49667a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f49669c);
            this.f49667a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49671f) {
                return;
            }
            this.f49670d++;
            Disposable disposable = (Disposable) this.f49669c.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                this.f49667a.onError(th);
            }
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
        new DebounceSubscriber(new SerializedSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
