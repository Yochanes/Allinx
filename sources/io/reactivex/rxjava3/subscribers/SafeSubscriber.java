package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public Subscription f51349a;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        try {
            this.f51349a.cancel();
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51349a, subscription)) {
            this.f51349a = subscription;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                try {
                    subscription.cancel();
                    RxJavaPlugins.m18275b(th);
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    RxJavaPlugins.m18275b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        try {
            this.f51349a.request(j);
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            try {
                this.f51349a.cancel();
                RxJavaPlugins.m18275b(th);
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                RxJavaPlugins.m18275b(new CompositeException(th, th2));
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }
}
