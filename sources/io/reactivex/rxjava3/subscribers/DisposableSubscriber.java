package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51348a = new AtomicReference();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f51348a.get() == SubscriptionHelper.f51214a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m18221a(this.f51348a);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        AtomicReference atomicReference = this.f51348a;
        if (EndConsumerHelper.m18245c(atomicReference, subscription, getClass())) {
            ((Subscription) atomicReference.get()).request(Long.MAX_VALUE);
        }
    }
}
