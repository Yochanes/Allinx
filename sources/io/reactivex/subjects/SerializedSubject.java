package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SerializedSubject<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

    /* JADX INFO: renamed from: a */
    public boolean f51380a;

    /* JADX INFO: renamed from: b */
    public AppendOnlyLinkedArrayList f51381b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f51382c;

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        boolean z2 = true;
        if (!this.f51382c) {
            synchronized (this) {
                try {
                    if (!this.f51382c) {
                        if (this.f51380a) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51381b;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f51381b = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m17876b(NotificationLite.m17899d(disposable));
                            return;
                        }
                        this.f51380a = true;
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

    /* JADX INFO: renamed from: f */
    public final void m18290f() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f51381b;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f51380a = false;
                        return;
                    }
                    this.f51381b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.m17877c(this);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f51382c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51382c) {
                    return;
                }
                this.f51382c = true;
                if (!this.f51380a) {
                    this.f51380a = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51381b;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51381b = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m17876b(NotificationLite.f49279a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f51382c) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51382c) {
                    this.f51382c = true;
                    if (this.f51380a) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51381b;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51381b = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f49268a[0] = NotificationLite.m17900e(th);
                        return;
                    }
                    this.f51380a = true;
                    z2 = false;
                }
                if (!z2) {
                    throw null;
                }
                RxJavaPlugins.m17911b(th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f51382c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51382c) {
                    return;
                }
                if (!this.f51380a) {
                    this.f51380a = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51381b;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f51381b = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m17876b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        return NotificationLite.m17898c(obj, null);
    }
}
