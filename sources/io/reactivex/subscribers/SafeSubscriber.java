package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public Subscription f51397a;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        try {
            this.f51397a.cancel();
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f51397a, subscription)) {
            this.f51397a = subscription;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                try {
                    subscription.cancel();
                    RxJavaPlugins.m17911b(th);
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    RxJavaPlugins.m17911b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m17911b(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        try {
            this.f51397a.request(j);
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            try {
                this.f51397a.cancel();
                RxJavaPlugins.m17911b(th);
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                RxJavaPlugins.m17911b(new CompositeException(th, th2));
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
