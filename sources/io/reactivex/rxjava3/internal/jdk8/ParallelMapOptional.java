package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelMapOptional<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49454a;

        /* JADX INFO: renamed from: b */
        public boolean f49455b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49454a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f49455b) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49454a, subscription)) {
                this.f49454a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49455b) {
                return;
            }
            this.f49455b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49455b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49455b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            this.f49454a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49454a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49456a;

        /* JADX INFO: renamed from: b */
        public boolean f49457b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49456a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f49457b) {
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                onError(th);
                return true;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49456a, subscription)) {
                this.f49456a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49457b) {
                return;
            }
            this.f49457b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49457b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49457b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49456a.request(j);
        }
    }
}
