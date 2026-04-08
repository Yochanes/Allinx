package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableScalarXMap {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        @Override // io.reactivex.Flowable
        /* JADX INFO: renamed from: c */
        public final void mo17583c(Subscriber subscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                EmptySubscription.m17863b(th, subscriber);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17736a(Publisher publisher, FlowableSubscriber flowableSubscriber) {
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            if (((Callable) publisher).call() == null) {
                EmptySubscription.m17862a(flowableSubscriber);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                EmptySubscription.m17863b(th, flowableSubscriber);
                return true;
            }
        } catch (Throwable th2) {
            Exceptions.m17612a(th2);
            EmptySubscription.m17863b(th2, flowableSubscriber);
            return true;
        }
    }
}
