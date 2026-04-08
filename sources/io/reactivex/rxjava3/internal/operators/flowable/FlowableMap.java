package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51170d) {
                return true;
            }
            if (this.f51171f != 0) {
                this.f51167a.mo17969f(null);
                return true;
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
            if (this.f51170d) {
                return;
            }
            if (this.f51171f != 0) {
                this.f51167a.onNext(null);
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
            if (this.f51169c.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f51175d) {
                return;
            }
            if (this.f51176f != 0) {
                this.f51172a.onNext(null);
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
            new MapConditionalSubscriber((ConditionalSubscriber) subscriber);
            throw null;
        }
        new MapSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
