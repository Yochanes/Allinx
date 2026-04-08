package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public RefConnection f48029b;

    /* JADX INFO: compiled from: Proguard */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: a */
        public final FlowableRefCount f48030a;

        /* JADX INFO: renamed from: b */
        public long f48031b;

        /* JADX INFO: renamed from: c */
        public boolean f48032c;

        public RefConnection(FlowableRefCount flowableRefCount) {
            this.f48030a = flowableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.m17617c(this, (Disposable) obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48030a.m17719e(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f48033a;

        /* JADX INFO: renamed from: b */
        public final FlowableRefCount f48034b;

        /* JADX INFO: renamed from: c */
        public final RefConnection f48035c;

        /* JADX INFO: renamed from: d */
        public Subscription f48036d;

        public RefCountSubscriber(FlowableSubscriber flowableSubscriber, FlowableRefCount flowableRefCount, RefConnection refConnection) {
            this.f48033a = flowableSubscriber;
            this.f48034b = flowableRefCount;
            this.f48035c = refConnection;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48036d.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.f48034b;
                RefConnection refConnection = this.f48035c;
                synchronized (flowableRefCount) {
                    try {
                        if (flowableRefCount.f48029b == null) {
                            return;
                        }
                        long j = refConnection.f48031b - 1;
                        refConnection.f48031b = j;
                        if (j == 0 && refConnection.f48032c) {
                            flowableRefCount.m17719e(refConnection);
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48036d, subscription)) {
                this.f48036d = subscription;
                this.f48033a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.f48034b;
                RefConnection refConnection = this.f48035c;
                synchronized (flowableRefCount) {
                    try {
                        if (flowableRefCount.f48029b != null) {
                            flowableRefCount.f48029b = null;
                            refConnection.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f48033a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            FlowableRefCount flowableRefCount = this.f48034b;
            RefConnection refConnection = this.f48035c;
            synchronized (flowableRefCount) {
                try {
                    if (flowableRefCount.f48029b != null) {
                        flowableRefCount.f48029b = null;
                        refConnection.getClass();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f48033a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f48033a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f48036d.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.f48029b;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f48029b = refConnection;
                }
                long j = refConnection.f48031b + 1;
                refConnection.f48031b = j;
                if (!refConnection.f48032c && j == 0) {
                    refConnection.f48032c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountSubscriber((FlowableSubscriber) subscriber, this, refConnection);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m17719e(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.f48031b == 0 && refConnection == this.f48029b) {
                    this.f48029b = null;
                    DisposableHelper.m17615a(refConnection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
