package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EndConsumerHelper {
    /* JADX INFO: renamed from: a */
    public static void m17884a(Class cls) {
        String name = cls.getName();
        RxJavaPlugins.m17911b(new ProtocolViolationException(AbstractC0000a.m15l("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    /* JADX INFO: renamed from: b */
    public static void m17885b(AtomicReference atomicReference, Disposable disposable, Class cls) {
        ObjectHelper.m17628b(disposable, "next is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() != DisposableHelper.f47552a) {
                    m17884a(cls);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17886c(AtomicReference atomicReference, Subscription subscription, Class cls) {
        ObjectHelper.m17628b(subscription, "next is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == SubscriptionHelper.f49266a) {
                    return false;
                }
                m17884a(cls);
                return false;
            }
        }
        return true;
    }
}
