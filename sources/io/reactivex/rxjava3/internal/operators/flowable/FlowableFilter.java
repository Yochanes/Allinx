package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51170d) {
                return false;
            }
            if (this.f51171f != 0) {
                return this.f51167a.mo17969f(null);
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
                return true;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17969f(obj)) {
                return;
            }
            this.f51168b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (this.f51169c.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51175d) {
                return false;
            }
            if (this.f51176f != 0) {
                this.f51172a.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18207a(th);
                return true;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17969f(obj)) {
                return;
            }
            this.f51173b.request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (this.f51174c.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            new FilterConditionalSubscriber((ConditionalSubscriber) subscriber);
            throw null;
        }
        new FilterSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
