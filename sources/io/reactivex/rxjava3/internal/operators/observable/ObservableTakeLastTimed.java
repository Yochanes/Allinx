package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50873a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50874b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public Disposable f50875c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50876d;

        public TakeLastTimedObserver(Observer observer) {
            this.f50873a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18185a() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50875c, disposable)) {
                this.f50875c = disposable;
                this.f50873a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50876d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50876d) {
                return;
            }
            this.f50876d = true;
            this.f50875c.dispose();
            if (compareAndSet(false, true)) {
                this.f50874b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            m18185a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            m18185a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new TakeLastTimedObserver(observer));
    }
}
