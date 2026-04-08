package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f48944a;

        /* JADX INFO: renamed from: b */
        public long f48945b;

        /* JADX INFO: renamed from: c */
        public Disposable f48946c;

        /* JADX INFO: renamed from: d */
        public UnicastSubject f48947d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48948f;

        public WindowExactObserver(Observer observer) {
            this.f48944a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48946c, disposable)) {
                this.f48946c = disposable;
                this.f48944a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48948f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48948f = true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            UnicastSubject unicastSubject = this.f48947d;
            if (unicastSubject != null) {
                this.f48947d = null;
                unicastSubject.onComplete();
            }
            this.f48944a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            UnicastSubject unicastSubject = this.f48947d;
            if (unicastSubject != null) {
                this.f48947d = null;
                unicastSubject.onError(th);
            }
            this.f48944a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            UnicastSubject unicastSubject = this.f48947d;
            if (unicastSubject == null && !this.f48948f) {
                unicastSubject = new UnicastSubject(this);
                this.f48947d = unicastSubject;
                this.f48944a.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(obj);
                long j = this.f48945b + 1;
                this.f48945b = j;
                if (j >= 0) {
                    this.f48945b = 0L;
                    this.f48947d = null;
                    unicastSubject.onComplete();
                    if (this.f48948f) {
                        this.f48946c.dispose();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48948f) {
                this.f48946c.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48949a;

        /* JADX INFO: renamed from: b */
        public Disposable f48950b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48950b, disposable)) {
                this.f48950b = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48949a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48949a = true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (0 % 0 != 0 || !this.f48949a) {
                throw null;
            }
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new WindowExactObserver(observer);
        throw null;
    }
}
