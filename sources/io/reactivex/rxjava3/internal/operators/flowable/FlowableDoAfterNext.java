package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            boolean zMo17969f = this.f51167a.mo17969f(obj);
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
                return zMo17969f;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51167a.onNext(obj);
            if (this.f51171f != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f51169c.poll();
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
            if (this.f51175d) {
                return;
            }
            this.f51172a.onNext(obj);
            if (this.f51176f != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18207a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f51174c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            new DoAfterConditionalSubscriber((ConditionalSubscriber) subscriber);
            throw null;
        }
        new DoAfterSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
