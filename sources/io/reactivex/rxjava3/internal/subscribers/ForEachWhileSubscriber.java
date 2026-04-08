package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {
    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == SubscriptionHelper.f51214a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m18221a(this);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        SubscriptionHelper.m18224d(this, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }
}
