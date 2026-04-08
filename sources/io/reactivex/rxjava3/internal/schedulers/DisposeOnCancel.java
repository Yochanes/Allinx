package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DisposeOnCancel implements Future<Object> {

    /* JADX INFO: renamed from: a */
    public final Disposable f51092a;

    public DisposeOnCancel(Disposable disposable) {
        this.f51092a = disposable;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        this.f51092a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
