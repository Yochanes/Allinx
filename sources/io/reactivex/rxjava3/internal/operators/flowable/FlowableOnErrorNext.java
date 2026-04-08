package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: n */
        public final FlowableSubscriber f49892n;

        /* JADX INFO: renamed from: o */
        public boolean f49893o;

        /* JADX INFO: renamed from: p */
        public boolean f49894p;

        /* JADX INFO: renamed from: q */
        public long f49895q;

        public OnErrorNextSubscriber(FlowableSubscriber flowableSubscriber) {
            super(false);
            this.f49892n = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49894p) {
                return;
            }
            this.f49894p = true;
            this.f49893o = true;
            this.f49892n.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            boolean z2 = this.f49893o;
            FlowableSubscriber flowableSubscriber = this.f49892n;
            if (z2) {
                if (this.f49894p) {
                    RxJavaPlugins.m18275b(th);
                    return;
                } else {
                    flowableSubscriber.onError(th);
                    return;
                }
            }
            this.f49893o = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                flowableSubscriber.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49894p) {
                return;
            }
            if (!this.f49893o) {
                this.f49895q++;
            }
            this.f49892n.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new OnErrorNextSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
