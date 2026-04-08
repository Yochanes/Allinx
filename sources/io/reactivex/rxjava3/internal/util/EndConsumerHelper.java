package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EndConsumerHelper {
    /* JADX INFO: renamed from: a */
    public static void m18243a(Class cls) {
        String name = cls.getName();
        RxJavaPlugins.m18275b(new ProtocolViolationException(AbstractC0000a.m15l("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    /* JADX INFO: renamed from: b */
    public static void m18244b(AtomicReference atomicReference, Disposable disposable, Class cls) {
        Objects.requireNonNull(disposable, "next is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() != DisposableHelper.f49380a) {
                    m18243a(cls);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18245c(AtomicReference atomicReference, Subscription subscription, Class cls) {
        Objects.requireNonNull(subscription, "next is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == SubscriptionHelper.f51214a) {
                    return false;
                }
                m18243a(cls);
                return false;
            }
        }
        return true;
    }
}
