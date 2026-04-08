package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.schedulers.ScheduledRunnable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public LinkedList f49385a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f49386b;

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: a */
    public final boolean mo17942a(Disposable disposable) {
        if (!mo17944c(disposable)) {
            return false;
        }
        ((ScheduledRunnable) disposable).dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: b */
    public final boolean mo17943b(Disposable disposable) {
        if (!this.f49386b) {
            synchronized (this) {
                try {
                    if (!this.f49386b) {
                        LinkedList linkedList = this.f49385a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f49385a = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: c */
    public final boolean mo17944c(Disposable disposable) {
        if (this.f49386b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49386b) {
                    return false;
                }
                LinkedList linkedList = this.f49385a;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49386b;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f49386b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49386b) {
                    return;
                }
                this.f49386b = true;
                LinkedList linkedList = this.f49385a;
                ArrayList arrayList = null;
                this.f49385a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.m18251f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
