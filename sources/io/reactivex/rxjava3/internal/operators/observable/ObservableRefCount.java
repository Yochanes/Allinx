package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableRefCount<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public RefConnection f50750a;

    /* JADX INFO: compiled from: Proguard */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: a */
        public final ObservableRefCount f50751a;

        /* JADX INFO: renamed from: b */
        public long f50752b;

        /* JADX INFO: renamed from: c */
        public boolean f50753c;

        /* JADX INFO: renamed from: d */
        public boolean f50754d;

        public RefConnection(ObservableRefCount observableRefCount) {
            this.f50751a = observableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.m17954c(this, (Disposable) obj);
            synchronized (this.f50751a) {
                try {
                    if (this.f50754d) {
                        this.f50751a.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f50751a.m18165j(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50755a;

        /* JADX INFO: renamed from: b */
        public final ObservableRefCount f50756b;

        /* JADX INFO: renamed from: c */
        public final RefConnection f50757c;

        /* JADX INFO: renamed from: d */
        public Disposable f50758d;

        public RefCountObserver(Observer observer, ObservableRefCount observableRefCount, RefConnection refConnection) {
            this.f50755a = observer;
            this.f50756b = observableRefCount;
            this.f50757c = refConnection;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50758d, disposable)) {
                this.f50758d = disposable;
                this.f50755a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50758d.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50758d.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount observableRefCount = this.f50756b;
                RefConnection refConnection = this.f50757c;
                synchronized (observableRefCount) {
                    try {
                        RefConnection refConnection2 = observableRefCount.f50750a;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.f50752b - 1;
                            refConnection.f50752b = j;
                            if (j == 0 && refConnection.f50753c) {
                                observableRefCount.m18165j(refConnection);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f50756b.m18164i(this.f50757c);
                this.f50755a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50756b.m18164i(this.f50757c);
                this.f50755a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50755a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.f50750a;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f50750a = refConnection;
                }
                long j = refConnection.f50752b + 1;
                refConnection.f50752b = j;
                if (!refConnection.f50753c && j == 0) {
                    refConnection.f50753c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountObserver(observer, this, refConnection);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final void m18164i(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.f50750a == refConnection) {
                    refConnection.getClass();
                    long j = refConnection.f50752b - 1;
                    refConnection.f50752b = j;
                    if (j == 0) {
                        this.f50750a = null;
                        throw null;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m18165j(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.f50752b == 0 && refConnection == this.f50750a) {
                    this.f50750a = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.m17952a(refConnection);
                    if (disposable != null) {
                        throw null;
                    }
                    refConnection.f50754d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
