package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription, Disposable, LambdaConsumerIntrospection {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.m17867a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == SubscriptionHelper.f49266a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m17867a(this);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17872f(this, subscription)) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
        if (subscription == subscriptionHelper) {
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
        if (subscription == subscriptionHelper) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m17612a(th2);
            RxJavaPlugins.m17911b(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (mo17596d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }
}
