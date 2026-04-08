package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f51398a;

    /* JADX INFO: renamed from: b */
    public Subscription f51399b;

    /* JADX INFO: renamed from: c */
    public boolean f51400c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f51401d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51402f;

    public SerializedSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f51398a = flowableSubscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f51399b.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m17874i(this.f51399b, subscription)) {
            this.f51399b = subscription;
            this.f51398a.mo12367j(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f51402f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51402f) {
                    return;
                }
                if (!this.f51400c) {
                    this.f51402f = true;
                    this.f51400c = true;
                    this.f51398a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51401d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f51401d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m17876b(NotificationLite.f49279a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f51402f) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51402f) {
                    if (this.f51400c) {
                        this.f51402f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51401d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51401d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f49268a[0] = NotificationLite.m17900e(th);
                        return;
                    }
                    this.f51402f = true;
                    this.f51400c = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    this.f51398a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.f51402f) {
            return;
        }
        if (obj == null) {
            this.f51399b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f51402f) {
                    return;
                }
                if (this.f51400c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f51401d;
                    if (appendOnlyLinkedArrayList2 == null) {
                        appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                        this.f51401d = appendOnlyLinkedArrayList2;
                    }
                    appendOnlyLinkedArrayList2.m17876b(obj);
                    return;
                }
                this.f51400c = true;
                this.f51398a.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            appendOnlyLinkedArrayList = this.f51401d;
                            if (appendOnlyLinkedArrayList == null) {
                                this.f51400c = false;
                                return;
                            }
                            this.f51401d = null;
                        } finally {
                        }
                    }
                } while (!appendOnlyLinkedArrayList.m17875a(this.f51398a));
            } finally {
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f51399b.request(j);
    }
}
