package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableScalarXMap {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        @Override // io.reactivex.rxjava3.core.Flowable
        /* JADX INFO: renamed from: b */
        public final void mo12359b(Subscriber subscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                EmptySubscription.m18217b(th, subscriber);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18080a(Publisher publisher, FlowableSubscriber flowableSubscriber) {
        if (!(publisher instanceof Supplier)) {
            return false;
        }
        try {
            if (((Supplier) publisher).get() == null) {
                EmptySubscription.m18216a(flowableSubscriber);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                EmptySubscription.m18217b(th, flowableSubscriber);
                return true;
            }
        } catch (Throwable th2) {
            Exceptions.m17950a(th2);
            EmptySubscription.m18217b(th2, flowableSubscriber);
            return true;
        }
    }
}
