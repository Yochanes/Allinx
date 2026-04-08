package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableAutoReleaseSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return SubscriptionHelper.f51214a == get();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m18221a(this);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18225e(this, subscription)) {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
        if (subscription == subscriptionHelper) {
            throw null;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f51214a;
        if (subscription == subscriptionHelper) {
            RxJavaPlugins.m18275b(th);
            throw null;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m17950a(th2);
            RxJavaPlugins.m18275b(new CompositeException(th, th2));
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (get() == SubscriptionHelper.f51214a) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            get().cancel();
            onError(th);
            throw null;
        }
    }
}
