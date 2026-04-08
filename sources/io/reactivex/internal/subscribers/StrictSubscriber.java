package io.reactivex.internal.subscribers;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
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
    public final Subscriber f49249a;

    /* JADX INFO: renamed from: b */
    public final AtomicThrowable f49250b = new AtomicThrowable();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f49251c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f49252d = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f49253f = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    public volatile boolean f49254g;

    public StrictSubscriber(Subscriber subscriber) {
        this.f49249a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f49254g) {
            return;
        }
        SubscriptionHelper.m17867a(this.f49252d);
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f49253f.compareAndSet(false, true)) {
            this.f49249a.mo12367j(this);
            SubscriptionHelper.m17869c(this.f49252d, this.f49251c, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f49254g = true;
        HalfSerializer.m17891b(this.f49249a, this, this.f49250b);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f49254g = true;
        HalfSerializer.m17893d(this.f49249a, th, this, this.f49250b);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        HalfSerializer.m17895f(this.f49249a, obj, this, this.f49250b);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.m17868b(this.f49252d, this.f49251c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(AbstractC0455a.m2238m(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
