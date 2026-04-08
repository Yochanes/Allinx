package io.reactivex.rxjava3.internal.fuseable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CancellableQueueFuseable<T> extends AbstractEmptyQueueFuseable<T> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f49395a;

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, org.reactivestreams.Subscription
    public final void cancel() {
        this.f49395a = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49395a;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f49395a = true;
    }
}
