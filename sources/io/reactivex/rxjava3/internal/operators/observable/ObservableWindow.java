package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f50907a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f50908b = new AtomicBoolean();

        /* JADX INFO: renamed from: c */
        public long f50909c;

        /* JADX INFO: renamed from: d */
        public Disposable f50910d;

        /* JADX INFO: renamed from: f */
        public UnicastSubject f50911f;

        public WindowExactObserver(Observer observer) {
            this.f50907a = observer;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50910d, disposable)) {
                this.f50910d = disposable;
                this.f50907a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50908b.get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50908b.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            UnicastSubject unicastSubject = this.f50911f;
            if (unicastSubject != null) {
                this.f50911f = null;
                unicastSubject.onComplete();
            }
            this.f50907a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            UnicastSubject unicastSubject = this.f50911f;
            if (unicastSubject != null) {
                this.f50911f = null;
                unicastSubject.onError(th);
            }
            this.f50907a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept;
            UnicastSubject unicastSubjectM18286j = this.f50911f;
            if (unicastSubjectM18286j != null || this.f50908b.get()) {
                observableWindowSubscribeIntercept = null;
            } else {
                getAndIncrement();
                unicastSubjectM18286j = UnicastSubject.m18286j(this);
                this.f50911f = unicastSubjectM18286j;
                observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectM18286j);
                this.f50907a.onNext(observableWindowSubscribeIntercept);
            }
            if (unicastSubjectM18286j != null) {
                unicastSubjectM18286j.onNext(obj);
                long j = this.f50909c + 1;
                this.f50909c = j;
                if (j >= 0) {
                    this.f50909c = 0L;
                    this.f50911f = null;
                    unicastSubjectM18286j.onComplete();
                }
                if (observableWindowSubscribeIntercept == null || !observableWindowSubscribeIntercept.m18192i()) {
                    return;
                }
                this.f50911f = null;
                unicastSubjectM18286j.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f50910d.dispose();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WindowSkipObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f50912a;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50912a, disposable)) {
                this.f50912a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (0 % 0 != 0) {
                throw null;
            }
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f50912a.dispose();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new WindowExactObserver(observer));
    }
}
