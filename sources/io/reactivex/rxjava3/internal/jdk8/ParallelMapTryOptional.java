package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelMapTryOptional<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.jdk8.ParallelMapTryOptional$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59711 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49458a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f49458a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49458a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49458a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapTryConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49459a;

        /* JADX INFO: renamed from: b */
        public boolean f49460b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49459a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f49460b) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    cancel();
                    onError(new CompositeException(th, th));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49459a, subscription)) {
                this.f49459a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49460b) {
                return;
            }
            this.f49460b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49460b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49460b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            if (this.f49460b) {
                return;
            }
            this.f49459a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49459a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapTrySubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49461a;

        /* JADX INFO: renamed from: b */
        public boolean f49462b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49461a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f49462b) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    cancel();
                    onError(new CompositeException(th, th));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49461a, subscription)) {
                this.f49461a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49462b) {
                return;
            }
            this.f49462b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49462b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49462b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            if (this.f49462b) {
                return;
            }
            this.f49461a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49461a.request(j);
        }
    }
}
