package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48643a;

        /* JADX INFO: renamed from: b */
        public Disposable f48644b;

        /* JADX INFO: renamed from: c */
        public QueueDisposable f48645c;

        /* JADX INFO: renamed from: d */
        public boolean f48646d;

        public DoFinallyObserver(Observer observer) {
            this.f48643a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17787a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48644b, disposable)) {
                this.f48644b = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f48645c = (QueueDisposable) disposable;
                }
                this.f48643a.mo17593c(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48645c.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48644b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48644b.dispose();
            m17787a();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            QueueDisposable queueDisposable = this.f48645c;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17626e = queueDisposable.mo17626e(i);
            if (iMo17626e != 0) {
                this.f48646d = iMo17626e == 1;
            }
            return iMo17626e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48645c.isEmpty();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48643a.onComplete();
            m17787a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48643a.onError(th);
            m17787a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48643a.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f48645c.poll();
            if (objPoll == null && this.f48646d) {
                m17787a();
            }
            return objPoll;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new DoFinallyObserver(observer);
        throw null;
    }
}
