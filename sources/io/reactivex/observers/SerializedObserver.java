package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f49292a;

    /* JADX INFO: renamed from: b */
    public Disposable f49293b;

    /* JADX INFO: renamed from: c */
    public boolean f49294c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f49295d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49296f;

    public SerializedObserver(Observer observer) {
        this.f49292a = observer;
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17620h(this.f49293b, disposable)) {
            this.f49293b = disposable;
            this.f49292a.mo17593c(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f49293b.mo17596d();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f49293b.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f49296f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49296f) {
                    return;
                }
                if (!this.f49294c) {
                    this.f49296f = true;
                    this.f49294c = true;
                    this.f49292a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49295d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f49295d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m17876b(NotificationLite.f49279a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f49296f) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.f49296f) {
                    if (this.f49294c) {
                        this.f49296f = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49295d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f49295d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f49268a[0] = NotificationLite.m17900e(th);
                        return;
                    }
                    this.f49296f = true;
                    this.f49294c = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    this.f49292a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.f49296f) {
            return;
        }
        if (obj == null) {
            this.f49293b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f49296f) {
                    return;
                }
                if (this.f49294c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f49295d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f49295d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m17876b(obj);
                    return;
                }
                this.f49294c = true;
                this.f49292a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f49295d;
                            if (appendOnlyLinkedArrayList2 == null) {
                                this.f49294c = false;
                                return;
                            }
                            this.f49295d = null;
                            Observer observer = this.f49292a;
                            for (Object[] objArr2 = appendOnlyLinkedArrayList2.f49268a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (NotificationLite.m17898c(objArr, observer)) {
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
