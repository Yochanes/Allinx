package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public Object f51181a;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (getCount() != 0) {
            await();
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        SubscriptionHelper.m18224d(null, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f51181a != null) {
            throw null;
        }
        onError(new NoSuchElementException("The source is empty"));
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f51181a != null) {
            throw null;
        }
        this.f51181a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.m18250e(j, timeUnit));
        }
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
