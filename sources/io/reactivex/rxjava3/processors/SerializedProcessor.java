package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public boolean f51279b;

    /* JADX INFO: renamed from: c */
    public AppendOnlyLinkedArrayList f51280c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f51281d;

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m18277e() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f51280c;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f51279b = false;
                        return;
                    }
                    this.f51280c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.m18228a(null);
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        boolean z2 = true;
        if (!this.f51281d) {
            synchronized (this) {
                try {
                    if (!this.f51281d) {
                        if (this.f51279b) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51280c;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f51280c = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m18229b(NotificationLite.m18266j(subscription));
                            return;
                        }
                        this.f51279b = true;
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (!z2) {
            throw null;
        }
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f51281d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51281d) {
                    return;
                }
                this.f51281d = true;
                if (!this.f51279b) {
                    this.f51279b = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51280c;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51280c = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m18229b(NotificationLite.f51228a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f51281d) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51281d) {
                    this.f51281d = true;
                    if (this.f51279b) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51280c;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51280c = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f51216a[0] = NotificationLite.m18262e(th);
                        return;
                    }
                    this.f51279b = true;
                    z2 = false;
                }
                if (!z2) {
                    throw null;
                }
                RxJavaPlugins.m18275b(th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f51281d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51281d) {
                    return;
                }
                if (!this.f51279b) {
                    this.f51279b = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51280c;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51280c = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m18229b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
