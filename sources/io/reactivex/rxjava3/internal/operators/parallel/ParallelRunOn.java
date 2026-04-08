package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f50996a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f50997b;

        /* JADX INFO: renamed from: c */
        public Throwable f50998c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50999d;

        /* JADX INFO: renamed from: f */
        public int f51000f;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50999d) {
                return;
            }
            this.f50999d = true;
            this.f50996a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f50997b) {
                return;
            }
            this.f50997b = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f50997b) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            this.f50998c = th;
            this.f50997b = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f50997b) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                if (getAndIncrement() == 0) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50996a, subscription)) {
                this.f50996a = subscription;
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50996a, subscription)) {
                this.f50996a = subscription;
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }
}
