package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48178a;

        /* JADX INFO: renamed from: b */
        public Subscription f48179b;

        /* JADX INFO: renamed from: c */
        public boolean f48180c;

        public InnerSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48178a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48179b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48179b, subscription)) {
                this.f48179b = subscription;
                this.f48178a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48180c) {
                return;
            }
            this.f48180c = true;
            this.f48178a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48180c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48180c = true;
                this.f48178a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48180c) {
                return;
            }
            this.f48178a.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48179b.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48179b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new InnerSubscriber((FlowableSubscriber) subscriber));
    }
}
