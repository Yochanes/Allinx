package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {
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

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m17868b(null, this, j);
        throw null;
    }
}
