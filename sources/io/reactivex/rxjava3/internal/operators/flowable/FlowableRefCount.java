package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public RefConnection f49929b;

    /* JADX INFO: compiled from: Proguard */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: a */
        public final FlowableRefCount f49930a;

        /* JADX INFO: renamed from: b */
        public long f49931b;

        /* JADX INFO: renamed from: c */
        public boolean f49932c;

        /* JADX INFO: renamed from: d */
        public boolean f49933d;

        public RefConnection(FlowableRefCount flowableRefCount) {
            this.f49930a = flowableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.m17954c(this, (Disposable) obj);
            synchronized (this.f49930a) {
                try {
                    if (this.f49933d) {
                        this.f49930a.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49930a.m18063e(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49934a;

        /* JADX INFO: renamed from: b */
        public final FlowableRefCount f49935b;

        /* JADX INFO: renamed from: c */
        public final RefConnection f49936c;

        /* JADX INFO: renamed from: d */
        public Subscription f49937d;

        public RefCountSubscriber(FlowableSubscriber flowableSubscriber, FlowableRefCount flowableRefCount, RefConnection refConnection) {
            this.f49934a = flowableSubscriber;
            this.f49935b = flowableRefCount;
            this.f49936c = refConnection;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49937d.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.f49935b;
                RefConnection refConnection = this.f49936c;
                synchronized (flowableRefCount) {
                    try {
                        RefConnection refConnection2 = flowableRefCount.f49929b;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.f49931b - 1;
                            refConnection.f49931b = j;
                            if (j == 0 && refConnection.f49932c) {
                                flowableRefCount.m18063e(refConnection);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49937d, subscription)) {
                this.f49937d = subscription;
                this.f49934a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f49935b.m18062c(this.f49936c);
                this.f49934a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49935b.m18062c(this.f49936c);
                this.f49934a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49934a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49937d.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.f49929b;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f49929b = refConnection;
                }
                long j = refConnection.f49931b + 1;
                refConnection.f49931b = j;
                if (!refConnection.f49932c && j == 0) {
                    refConnection.f49932c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountSubscriber((FlowableSubscriber) subscriber, this, refConnection);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18062c(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.f49929b == refConnection) {
                    refConnection.getClass();
                    long j = refConnection.f49931b - 1;
                    refConnection.f49931b = j;
                    if (j == 0) {
                        this.f49929b = null;
                        throw null;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18063e(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.f49931b == 0 && refConnection == this.f49929b) {
                    this.f49929b = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.m17952a(refConnection);
                    if (disposable != null) {
                        throw null;
                    }
                    refConnection.f49933d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
