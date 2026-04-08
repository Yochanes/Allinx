package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50837a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50838b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public Disposable f50839c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50840d;

        public SkipLastTimedObserver(Observer observer) {
            this.f50837a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18183a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50838b;
            if (this.f50840d) {
                this.f50838b.clear();
            } else {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50839c, disposable)) {
                this.f50839c = disposable;
                this.f50837a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50840d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50840d) {
                return;
            }
            this.f50840d = true;
            this.f50839c.dispose();
            if (getAndIncrement() == 0) {
                this.f50838b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            m18183a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            m18183a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new SkipLastTimedObserver(observer));
    }
}
