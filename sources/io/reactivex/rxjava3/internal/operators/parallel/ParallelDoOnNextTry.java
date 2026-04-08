package io.reactivex.rxjava3.internal.operators.parallel;

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
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.parallel.ParallelDoOnNextTry$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59761 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50967a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f50967a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50967a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50967a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelDoOnNextConditionalSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50968a;

        /* JADX INFO: renamed from: b */
        public boolean f50969b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50968a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f50969b) {
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
            if (SubscriptionHelper.m18227h(this.f50968a, subscription)) {
                this.f50968a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50969b) {
                return;
            }
            this.f50969b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50969b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50969b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            if (this.f50969b) {
                return;
            }
            this.f50968a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50968a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelDoOnNextSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f50970a;

        /* JADX INFO: renamed from: b */
        public boolean f50971b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f50970a.cancel();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f50971b) {
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
            if (SubscriptionHelper.m18227h(this.f50970a, subscription)) {
                this.f50970a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50971b) {
                return;
            }
            this.f50971b = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50971b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50971b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            this.f50970a.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f50970a.request(j);
        }
    }
}
