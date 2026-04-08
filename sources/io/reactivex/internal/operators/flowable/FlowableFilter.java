package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49222d) {
                return false;
            }
            if (this.f49223f != 0) {
                return this.f49219a.mo17630f(null);
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17852a(th);
                return true;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17630f(obj)) {
                return;
            }
            this.f49220b.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f49221c.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49227d) {
                return false;
            }
            if (this.f49228f != 0) {
                this.f49224a.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17853a(th);
                return true;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (mo17630f(obj)) {
                return;
            }
            this.f49225b.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f49226c.poll() == null) {
                return null;
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
            flowable.m17582b(new FilterConditionalSubscriber((ConditionalSubscriber) subscriber));
        } else {
            flowable.m17582b(new FilterSubscriber((FlowableSubscriber) subscriber));
        }
    }
}
