package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51396a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public void mo15430a() {
        ((Subscription) this.f51396a.get()).request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f51396a.get() == SubscriptionHelper.f49266a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m17867a(this.f51396a);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (EndConsumerHelper.m17886c(this.f51396a, subscription, getClass())) {
            mo15430a();
        }
    }
}
