package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRefCount<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public RefConnection f48804a;

    /* JADX INFO: compiled from: Proguard */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: a */
        public final ObservableRefCount f48805a;

        /* JADX INFO: renamed from: b */
        public long f48806b;

        /* JADX INFO: renamed from: c */
        public boolean f48807c;

        public RefConnection(ObservableRefCount observableRefCount) {
            this.f48805a = observableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.m17617c(this, (Disposable) obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48805a.m17810e(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48808a;

        /* JADX INFO: renamed from: b */
        public final ObservableRefCount f48809b;

        /* JADX INFO: renamed from: c */
        public final RefConnection f48810c;

        /* JADX INFO: renamed from: d */
        public Disposable f48811d;

        public RefCountObserver(Observer observer, ObservableRefCount observableRefCount, RefConnection refConnection) {
            this.f48808a = observer;
            this.f48809b = observableRefCount;
            this.f48810c = refConnection;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48811d, disposable)) {
                this.f48811d = disposable;
                this.f48808a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48811d.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48811d.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount observableRefCount = this.f48809b;
                RefConnection refConnection = this.f48810c;
                synchronized (observableRefCount) {
                    try {
                        if (observableRefCount.f48804a == null) {
                            return;
                        }
                        long j = refConnection.f48806b - 1;
                        refConnection.f48806b = j;
                        if (j == 0 && refConnection.f48807c) {
                            observableRefCount.m17810e(refConnection);
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                ObservableRefCount observableRefCount = this.f48809b;
                RefConnection refConnection = this.f48810c;
                synchronized (observableRefCount) {
                    try {
                        if (observableRefCount.f48804a != null) {
                            observableRefCount.f48804a = null;
                            refConnection.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f48808a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            ObservableRefCount observableRefCount = this.f48809b;
            RefConnection refConnection = this.f48810c;
            synchronized (observableRefCount) {
                try {
                    if (observableRefCount.f48804a != null) {
                        observableRefCount.f48804a = null;
                        refConnection.getClass();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f48808a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48808a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.f48804a;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f48804a = refConnection;
                }
                long j = refConnection.f48806b + 1;
                refConnection.f48806b = j;
                if (!refConnection.f48807c && j == 0) {
                    refConnection.f48807c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountObserver(observer, this, refConnection);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m17810e(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.f48806b == 0 && refConnection == this.f48804a) {
                    this.f48804a = null;
                    DisposableHelper.m17615a(refConnection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
