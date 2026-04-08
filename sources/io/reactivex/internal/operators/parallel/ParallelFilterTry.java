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
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59591 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49016a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f49016a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49016a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49016a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49017a;

        /* JADX INFO: renamed from: b */
        public boolean f49018b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49017a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17630f(obj) || this.f49018b) {
                return;
            }
            this.f49017a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49017a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49018b) {
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
            if (SubscriptionHelper.m17874i(this.f49017a, subscription)) {
                this.f49017a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49018b) {
                return;
            }
            this.f49018b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49018b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49018b = true;
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49018b) {
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
            if (SubscriptionHelper.m17874i(this.f49017a, subscription)) {
                this.f49017a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49018b) {
                return;
            }
            this.f49018b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49018b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49018b = true;
                throw null;
            }
        }
    }
}
