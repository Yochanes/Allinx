package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public LinkedList f47557a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f47558b;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: a */
    public final boolean mo17604a(Disposable disposable) {
        if (!mo17606c(disposable)) {
            return false;
        }
        ((ScheduledRunnable) disposable).dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: b */
    public final boolean mo17605b(Disposable disposable) {
        if (!this.f47558b) {
            synchronized (this) {
                try {
                    if (!this.f47558b) {
                        LinkedList linkedList = this.f47557a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f47557a = linkedList;
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

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: c */
    public final boolean mo17606c(Disposable disposable) {
        if (this.f47558b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f47558b) {
                    return false;
                }
                LinkedList linkedList = this.f47557a;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f47558b;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f47558b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f47558b) {
                    return;
                }
                this.f47558b = true;
                LinkedList linkedList = this.f47557a;
                ArrayList arrayList = null;
                this.f47557a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
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
                    throw ExceptionHelper.m17889c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
