package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {

        /* JADX INFO: renamed from: g */
        public final Function f47913g;

        public MapConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Function function) {
            super(conditionalSubscriber);
            this.f47913g = function;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (this.f49222d) {
                return false;
            }
            try {
                Object objApply = this.f47913g.apply(obj);
                ObjectHelper.m17628b(objApply, "The mapper function returned a null value.");
                return this.f49219a.mo17630f(objApply);
            } catch (Throwable th) {
                m17852a(th);
                return true;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49222d) {
                return;
            }
            int i = this.f49223f;
            ConditionalSubscriber conditionalSubscriber = this.f49219a;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                Object objApply = this.f47913g.apply(obj);
                ObjectHelper.m17628b(objApply, "The mapper function returned a null value.");
                conditionalSubscriber.onNext(objApply);
            } catch (Throwable th) {
                m17852a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49221c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f47913g.apply(objPoll);
            ObjectHelper.m17628b(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {

        /* JADX INFO: renamed from: g */
        public final Function f47914g;

        public MapSubscriber(FlowableSubscriber flowableSubscriber, Function function) {
            super(flowableSubscriber);
            this.f47914g = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49227d) {
                return;
            }
            int i = this.f49228f;
            FlowableSubscriber flowableSubscriber = this.f49224a;
            if (i != 0) {
                flowableSubscriber.onNext(null);
                return;
            }
            try {
                Object objApply = this.f47914g.apply(obj);
                ObjectHelper.m17628b(objApply, "The mapper function returned a null value.");
                flowableSubscriber.onNext(objApply);
            } catch (Throwable th) {
                m17853a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49226c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f47914g.apply(objPoll);
            ObjectHelper.m17628b(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        boolean z2 = subscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.f47628b;
        if (z2) {
            flowable.m17582b(new MapConditionalSubscriber((ConditionalSubscriber) subscriber, null));
        } else {
            flowable.m17582b(new MapSubscriber((FlowableSubscriber) subscriber, null));
        }
    }
}
