package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.m18221a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m18221a(null);
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.m18222b(null, this, j);
        throw null;
    }
}
