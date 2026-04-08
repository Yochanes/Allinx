package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResourceSubscriber<T> implements FlowableSubscriber<T>, Disposable {
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
        if (EndConsumerHelper.m17886c(null, subscription, getClass())) {
            throw null;
        }
    }
}
