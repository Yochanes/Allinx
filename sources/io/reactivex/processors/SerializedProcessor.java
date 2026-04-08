package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public final FlowableProcessor f49331b;

    /* JADX INFO: renamed from: c */
    public boolean f49332c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f49333d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49334f;

    public SerializedProcessor(FlowableProcessor flowableProcessor) {
        this.f49331b = flowableProcessor;
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f49331b.mo15432g(subscriber);
    }

    /* JADX INFO: renamed from: h */
    public final void m17916h() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f49333d;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f49332c = false;
                        return;
                    }
                    this.f49333d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.m17875a(this.f49331b);
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        boolean z2 = true;
        if (!this.f49334f) {
            synchronized (this) {
                try {
                    if (!this.f49334f) {
                        if (this.f49332c) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49333d;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f49333d = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m17876b(NotificationLite.m17904j(subscription));
                            return;
                        }
                        this.f49332c = true;
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (z2) {
            subscription.cancel();
        } else {
            this.f49331b.mo12367j(subscription);
            m17916h();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f49334f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49334f) {
                    return;
                }
                this.f49334f = true;
                if (!this.f49332c) {
                    this.f49332c = true;
                    this.f49331b.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49333d;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f49333d = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m17876b(NotificationLite.f49279a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f49334f) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f49334f) {
                    this.f49334f = true;
                    if (this.f49332c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49333d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f49333d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f49268a[0] = NotificationLite.m17900e(th);
                        return;
                    }
                    this.f49332c = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    this.f49331b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f49334f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49334f) {
                    return;
                }
                if (!this.f49332c) {
                    this.f49332c = true;
                    this.f49331b.onNext(obj);
                    m17916h();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49333d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f49333d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m17876b(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
