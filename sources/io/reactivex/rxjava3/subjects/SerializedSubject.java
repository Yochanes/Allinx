package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SerializedSubject<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

    /* JADX INFO: renamed from: a */
    public boolean f51332a;

    /* JADX INFO: renamed from: b */
    public AppendOnlyLinkedArrayList f51333b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f51334c;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        boolean z2 = true;
        if (!this.f51334c) {
            synchronized (this) {
                try {
                    if (!this.f51334c) {
                        if (this.f51332a) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51333b;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f51333b = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m18229b(NotificationLite.m18261d(disposable));
                            return;
                        }
                        this.f51332a = true;
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (!z2) {
            throw null;
        }
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final void m18284j() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f51333b;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f51332a = false;
                        return;
                    }
                    this.f51333b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.m18230c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.f51334c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51334c) {
                    return;
                }
                this.f51334c = true;
                if (!this.f51332a) {
                    this.f51332a = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51333b;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51333b = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m18229b(NotificationLite.f51228a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.f51334c) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51334c) {
                    this.f51334c = true;
                    if (this.f51332a) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51333b;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51333b = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f51216a[0] = NotificationLite.m18262e(th);
                        return;
                    }
                    this.f51332a = true;
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

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f51334c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51334c) {
                    return;
                }
                if (!this.f51332a) {
                    this.f51332a = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51333b;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51333b = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m18229b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        return NotificationLite.m18260c(null, obj);
    }
}
