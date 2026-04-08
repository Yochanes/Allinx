package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMapOptional<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapOptionalConditionalSubscriber<T, R> extends BasicFuseableConditionalSubscriber<T, R> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51170d) {
                return true;
            }
            if (this.f51171f != 0) {
                this.f51167a.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18206a(th);
                return true;
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
    public static final class MapOptionalSubscriber<T, R> extends BasicFuseableSubscriber<T, R> implements ConditionalSubscriber<T> {
        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (this.f51175d) {
                return true;
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
            mo17969f(obj);
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
        if (!(subscriber instanceof ConditionalSubscriber)) {
            throw null;
        }
        throw null;
    }
}
