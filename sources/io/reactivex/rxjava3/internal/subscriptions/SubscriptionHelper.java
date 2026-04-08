package io.reactivex.rxjava3.internal.subscriptions;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionHelper implements Subscription {

    /* JADX INFO: renamed from: a */
    public static final SubscriptionHelper f51214a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ SubscriptionHelper[] f51215b;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        f51214a = subscriptionHelper;
        f51215b = new SubscriptionHelper[]{subscriptionHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18221a(AtomicReference atomicReference) {
        Subscription subscription;
        Subscription subscription2 = (Subscription) atomicReference.get();
        SubscriptionHelper subscriptionHelper = f51214a;
        if (subscription2 == subscriptionHelper || (subscription = (Subscription) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription.cancel();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m18222b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
            return;
        }
        if (m18226f(j)) {
            BackpressureHelper.m18237a(atomicLong, j);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18223c(AtomicReference atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (m18225e(atomicReference, subscription)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18224d(AtomicReference atomicReference, Subscription subscription, long j) {
        if (m18225e(atomicReference, subscription)) {
            subscription.request(j);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18225e(AtomicReference atomicReference, Subscription subscription) {
        Objects.requireNonNull(subscription, "s is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == f51214a) {
                    return false;
                }
                RxJavaPlugins.m18275b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18226f(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.m18275b(new IllegalArgumentException(AbstractC0455a.m2238m(j, "n > 0 required but it was ")));
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18227h(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            RxJavaPlugins.m18275b(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        RxJavaPlugins.m18275b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) f51215b.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
