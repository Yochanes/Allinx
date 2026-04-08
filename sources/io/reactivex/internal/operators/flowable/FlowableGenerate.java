package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Object f47851a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f47852b;

        /* JADX INFO: renamed from: c */
        public boolean f47853c;

        /* JADX INFO: renamed from: a */
        public final void m17680a(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f47852b) {
                return;
            }
            this.f47852b = true;
            if (BackpressureHelper.m17878a(this, 1L) == 0) {
                Object obj = this.f47851a;
                this.f47851a = null;
                m17680a(obj);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j) && BackpressureHelper.m17878a(this, j) == 0) {
                Object obj = this.f47851a;
                while (0 == j) {
                    j = get();
                    if (0 == j) {
                        this.f47851a = obj;
                        j = addAndGet(-0L);
                        if (j == 0) {
                            return;
                        }
                    }
                }
                if (this.f47852b) {
                    this.f47851a = null;
                    m17680a(obj);
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    this.f47852b = true;
                    this.f47851a = null;
                    if (!this.f47853c) {
                        this.f47853c = true;
                        throw null;
                    }
                    RxJavaPlugins.m17911b(th);
                    m17680a(obj);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
