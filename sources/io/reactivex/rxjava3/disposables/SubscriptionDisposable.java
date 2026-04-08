package io.reactivex.rxjava3.disposables;

import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo17941a(Object obj) {
        ((Subscription) obj).cancel();
    }
}
