package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapSingle<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50612a;

        /* JADX INFO: renamed from: g */
        public Disposable f50617g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50618i;

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f50613b = new CompositeDisposable();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50615d = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f50614c = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final AtomicReference f50616f = new AtomicReference();

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo12353d() {
                return DisposableHelper.m17953b(get());
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.m17952a(this);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapSingleObserver(Observer observer) {
            this.f50612a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18148a() {
            Observer observer = this.f50612a;
            AtomicInteger atomicInteger = this.f50614c;
            AtomicReference atomicReference = this.f50616f;
            int iAddAndGet = 1;
            while (!this.f50618i) {
                if (this.f50615d.get() != null) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.f50616f.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    this.f50615d.m18234d(observer);
                    return;
                }
                boolean z2 = atomicInteger.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                Object objPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3) {
                    this.f50615d.m18234d(this.f50612a);
                    return;
                } else if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue) this.f50616f.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50617g, disposable)) {
                this.f50617g = disposable;
                this.f50612a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50618i;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50618i = true;
            this.f50617g.dispose();
            this.f50613b.dispose();
            this.f50615d.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50614c.decrementAndGet();
            if (getAndIncrement() == 0) {
                m18148a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50614c.decrementAndGet();
            if (this.f50615d.m18231a(th)) {
                this.f50613b.dispose();
                if (getAndIncrement() == 0) {
                    m18148a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50617g.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new FlatMapSingleObserver(observer));
    }
}
