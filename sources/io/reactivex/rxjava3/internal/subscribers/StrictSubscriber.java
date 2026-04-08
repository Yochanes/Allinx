package io.reactivex.rxjava3.internal.subscribers;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final Subscriber f51196a;

    /* JADX INFO: renamed from: b */
    public final AtomicThrowable f51197b = new AtomicThrowable();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f51198c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f51199d = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f51200f = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    public volatile boolean f51201g;

    public StrictSubscriber(Subscriber subscriber) {
        this.f51196a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f51201g) {
            return;
        }
        SubscriptionHelper.m18221a(this.f51199d);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f51200f.compareAndSet(false, true)) {
            this.f51196a.mo12367j(this);
            SubscriptionHelper.m18223c(this.f51199d, this.f51198c, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f51201g = true;
        HalfSerializer.m18253b(this.f51196a, this, this.f51197b);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f51201g = true;
        HalfSerializer.m18255d(this.f51196a, th, this, this.f51197b);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        HalfSerializer.m18257f(this.f51196a, obj, this, this.f51197b);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.m18222b(this.f51199d, this.f51198c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(AbstractC0455a.m2238m(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
