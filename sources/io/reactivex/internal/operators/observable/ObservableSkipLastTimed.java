package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48879a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48880b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public Disposable f48881c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48882d;

        public SkipLastTimedObserver(Observer observer) {
            this.f48879a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17827a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48880b;
            if (this.f48882d) {
                this.f48880b.clear();
            } else {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48881c, disposable)) {
                this.f48881c = disposable;
                this.f48879a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48882d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48882d) {
                return;
            }
            this.f48882d = true;
            this.f48881c.dispose();
            if (getAndIncrement() == 0) {
                this.f48880b.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            m17827a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            m17827a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SkipLastTimedObserver(observer);
        throw null;
    }
}
