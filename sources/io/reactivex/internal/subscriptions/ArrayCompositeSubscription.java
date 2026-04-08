package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<Subscription> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get(0) == SubscriptionHelper.f49266a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Subscription andSet;
        Subscription subscription = get(0);
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f49266a;
        if (subscription != subscriptionHelper) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }
}
