package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {

        /* JADX INFO: renamed from: a */
        public Subscription f49038a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49039b;

        /* JADX INFO: renamed from: c */
        public Throwable f49040c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49041d;

        /* JADX INFO: renamed from: f */
        public int f49042f;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f49041d) {
                return;
            }
            this.f49041d = true;
            this.f49038a.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49039b) {
                return;
            }
            this.f49039b = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49039b) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f49040c = th;
            this.f49039b = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f49039b) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
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
            if (SubscriptionHelper.m17874i(this.f49038a, subscription)) {
                this.f49038a = subscription;
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
            if (SubscriptionHelper.m17874i(this.f49038a, subscription)) {
                this.f49038a = subscription;
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }
}
