package io.reactivex.internal.subscriptions;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionHelper implements Subscription {

    /* JADX INFO: renamed from: a */
    public static final SubscriptionHelper f49266a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ SubscriptionHelper[] f49267b;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        f49266a = subscriptionHelper;
        f49267b = new SubscriptionHelper[]{subscriptionHelper};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17867a(AtomicReference atomicReference) {
        Subscription subscription;
        Subscription subscription2 = (Subscription) atomicReference.get();
        SubscriptionHelper subscriptionHelper = f49266a;
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
    public static void m17868b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
            return;
        }
        if (m17873h(j)) {
            BackpressureHelper.m17878a(atomicLong, j);
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
    public static void m17869c(AtomicReference atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (m17872f(atomicReference, subscription)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m17870d(Subscription subscription) {
        return subscription == f49266a;
    }

    /* JADX INFO: renamed from: e */
    public static void m17871e(AtomicReference atomicReference, Subscription subscription, long j) {
        if (m17872f(atomicReference, subscription)) {
            subscription.request(j);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17872f(AtomicReference atomicReference, Subscription subscription) {
        ObjectHelper.m17628b(subscription, "s is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == f49266a) {
                    return false;
                }
                RxJavaPlugins.m17911b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17873h(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.m17911b(new IllegalArgumentException(AbstractC0455a.m2238m(j, "n > 0 required but it was ")));
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17874i(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            RxJavaPlugins.m17911b(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        RxJavaPlugins.m17911b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) f49267b.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
