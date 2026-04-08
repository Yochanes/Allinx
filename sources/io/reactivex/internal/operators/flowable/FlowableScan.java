package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48086a;

        /* JADX INFO: renamed from: b */
        public Subscription f48087b;

        /* JADX INFO: renamed from: c */
        public Object f48088c;

        /* JADX INFO: renamed from: d */
        public boolean f48089d;

        public ScanSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48086a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48087b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48087b, subscription)) {
                this.f48087b = subscription;
                this.f48086a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48089d) {
                return;
            }
            this.f48089d = true;
            this.f48086a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48089d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48089d = true;
                this.f48086a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48089d) {
                return;
            }
            if (this.f48088c == null) {
                this.f48088c = obj;
                this.f48086a.onNext(obj);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48087b.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48087b.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new ScanSubscriber((FlowableSubscriber) subscriber));
    }
}
