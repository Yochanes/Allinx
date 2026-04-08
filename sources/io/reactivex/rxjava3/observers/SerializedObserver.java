package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f51241a;

    /* JADX INFO: renamed from: b */
    public Disposable f51242b;

    /* JADX INFO: renamed from: c */
    public boolean f51243c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f51244d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f51245f;

    public SerializedObserver(Observer observer) {
        this.f51241a = observer;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f51242b, disposable)) {
            this.f51242b = disposable;
            this.f51241a.mo12365c(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f51242b.mo12353d();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f51245f = true;
        this.f51242b.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.f51245f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f51245f) {
                    return;
                }
                if (!this.f51243c) {
                    this.f51245f = true;
                    this.f51243c = true;
                    this.f51241a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51244d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f51244d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m18229b(NotificationLite.f51228a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.f51245f) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f51245f) {
                    if (this.f51243c) {
                        this.f51245f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51244d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f51244d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f51216a[0] = NotificationLite.m18262e(th);
                        return;
                    }
                    this.f51245f = true;
                    this.f51243c = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    this.f51241a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.f51245f) {
            return;
        }
        if (obj == null) {
            this.f51242b.dispose();
            onError(ExceptionHelper.m18247b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f51245f) {
                    return;
                }
                if (this.f51243c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51244d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f51244d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m18229b(obj);
                    return;
                }
                this.f51243c = true;
                this.f51241a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f51244d;
                            if (appendOnlyLinkedArrayList2 == null) {
                                this.f51243c = false;
                                return;
                            }
                            this.f51244d = null;
                            Observer observer = this.f51241a;
                            for (Object[] objArr2 = appendOnlyLinkedArrayList2.f51216a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (NotificationLite.m18260c(observer, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
