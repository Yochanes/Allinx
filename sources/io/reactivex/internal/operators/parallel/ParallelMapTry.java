package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59601 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49027a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f49027a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49027a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49027a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapTryConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49028a;

        /* JADX INFO: renamed from: b */
        public boolean f49029b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49028a.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49029b) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    cancel();
                    onError(new CompositeException(th, th));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49028a, subscription)) {
                this.f49028a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49029b) {
                return;
            }
            this.f49029b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49029b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49029b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17630f(obj);
            if (this.f49029b) {
                return;
            }
            this.f49028a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49028a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelMapTrySubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49030a;

        /* JADX INFO: renamed from: b */
        public boolean f49031b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49030a.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49031b) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    cancel();
                    onError(new CompositeException(th, th));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49030a, subscription)) {
                this.f49030a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49031b) {
                return;
            }
            this.f49031b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49031b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49031b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17630f(obj);
            if (this.f49031b) {
                return;
            }
            this.f49030a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49030a.request(j);
        }
    }
}
