package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, Subscription {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.m17867a(null);
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m17867a(null);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17872f(null, subscription)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        DisposableHelper.m17615a(this);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        DisposableHelper.m17615a(this);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (SubscriptionHelper.m17873h(j)) {
            throw null;
        }
    }
}
