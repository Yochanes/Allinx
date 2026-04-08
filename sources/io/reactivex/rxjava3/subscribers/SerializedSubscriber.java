package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f51350a;

    /* JADX INFO: renamed from: b */
    public Subscription f51351b;

    /* JADX INFO: renamed from: c */
    public boolean f51352c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f51353d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51354f;

    public SerializedSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f51350a = flowableSubscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f51351b.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f51351b, subscription)) {
            this.f51351b = subscription;
            this.f51350a.mo12367j(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f51354f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51354f) {
                    return;
                }
                if (!this.f51352c) {
                    this.f51354f = true;
                    this.f51352c = true;
                    this.f51350a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51353d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f51353d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m18229b(NotificationLite.f51228a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f51354f) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51354f) {
                    if (this.f51352c) {
                        this.f51354f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51353d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51353d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f51216a[0] = NotificationLite.m18262e(th);
                        return;
                    }
                    this.f51354f = true;
                    this.f51352c = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    this.f51350a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.f51354f) {
            return;
        }
        if (obj == null) {
            this.f51351b.cancel();
            onError(ExceptionHelper.m18247b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f51354f) {
                    return;
                }
                if (this.f51352c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f51353d;
                    if (appendOnlyLinkedArrayList2 == null) {
                        appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                        this.f51353d = appendOnlyLinkedArrayList2;
                    }
                    appendOnlyLinkedArrayList2.m18229b(obj);
                    return;
                }
                this.f51352c = true;
                this.f51350a.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            appendOnlyLinkedArrayList = this.f51353d;
                            if (appendOnlyLinkedArrayList == null) {
                                this.f51352c = false;
                                return;
                            }
                            this.f51353d = null;
                        } finally {
                        }
                    }
                } while (!appendOnlyLinkedArrayList.m18228a(this.f51350a));
            } finally {
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.f51351b.request(j);
    }
}
