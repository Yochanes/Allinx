package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Subscription f49032a;

        /* JADX INFO: renamed from: b */
        public boolean f49033b;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
                this.f49032a.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49032a, subscription)) {
                this.f49032a = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    subscription.cancel();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49033b) {
                return;
            }
            this.f49033b = true;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49033b) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
                this.f49032a.request(j);
            }
        }
    }
}
