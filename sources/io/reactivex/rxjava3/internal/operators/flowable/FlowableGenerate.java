package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Object f49767a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49768b;

        /* JADX INFO: renamed from: c */
        public boolean f49769c;

        /* JADX INFO: renamed from: a */
        public final void m18024a(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49768b) {
                return;
            }
            this.f49768b = true;
            if (BackpressureHelper.m18237a(this, 1L) == 0) {
                Object obj = this.f49767a;
                this.f49767a = null;
                m18024a(obj);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                Object obj = this.f49767a;
                while (0 == j) {
                    j = get();
                    if (0 == j) {
                        this.f49767a = obj;
                        j = addAndGet(-0L);
                        if (j == 0) {
                            return;
                        }
                    }
                }
                if (this.f49768b) {
                    this.f49767a = null;
                    m18024a(obj);
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    this.f49768b = true;
                    this.f49767a = null;
                    if (!this.f49769c) {
                        this.f49769c = true;
                        throw null;
                    }
                    RxJavaPlugins.m18275b(th);
                    m18024a(obj);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
