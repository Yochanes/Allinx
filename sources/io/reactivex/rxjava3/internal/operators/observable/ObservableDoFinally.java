package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50549a;

        /* JADX INFO: renamed from: b */
        public Disposable f50550b;

        /* JADX INFO: renamed from: c */
        public QueueDisposable f50551c;

        /* JADX INFO: renamed from: d */
        public boolean f50552d;

        public DoFinallyObserver(Observer observer) {
            this.f50549a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18139a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50550b, disposable)) {
                this.f50550b = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f50551c = (QueueDisposable) disposable;
                }
                this.f50549a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f50551c.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50550b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50550b.dispose();
            m18139a();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            QueueDisposable queueDisposable = this.f50551c;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int iMo17962e = queueDisposable.mo17962e(i);
            if (iMo17962e != 0) {
                this.f50552d = iMo17962e == 1;
            }
            return iMo17962e;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f50551c.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50549a.onComplete();
            m18139a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50549a.onError(th);
            m18139a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50549a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f50551c.poll();
            if (objPoll == null && this.f50552d) {
                m18139a();
            }
            return objPoll;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new DoFinallyObserver(observer));
    }
}
