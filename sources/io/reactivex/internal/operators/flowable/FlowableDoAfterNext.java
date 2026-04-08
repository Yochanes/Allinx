package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            boolean zMo17630f = this.f49219a.mo17630f(obj);
            try {
                throw null;
            } catch (Throwable th) {
                m17852a(th);
                return zMo17630f;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49219a.onNext(obj);
            if (this.f49223f != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17852a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49221c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49227d) {
                return;
            }
            this.f49224a.onNext(obj);
            if (this.f49228f != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17853a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49226c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        boolean z2 = subscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.f47628b;
        if (z2) {
            flowable.m17582b(new DoAfterConditionalSubscriber((ConditionalSubscriber) subscriber));
        } else {
            flowable.m17582b(new DoAfterSubscriber((FlowableSubscriber) subscriber));
        }
    }
}
