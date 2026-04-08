package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48913a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48914b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public Disposable f48915c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48916d;

        /* JADX INFO: renamed from: f */
        public Throwable f48917f;

        public TakeLastTimedObserver(Observer observer) {
            this.f48913a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17830a() {
            if (compareAndSet(false, true)) {
                Observer observer = this.f48913a;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48914b;
                if (this.f48916d) {
                    spscLinkedArrayQueue.clear();
                    return;
                }
                Throwable th = this.f48917f;
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                Object objPoll = spscLinkedArrayQueue.poll();
                if (objPoll != null) {
                    spscLinkedArrayQueue.poll();
                    throw null;
                }
                Throwable th2 = this.f48917f;
                if (th2 != null) {
                    observer.onError(th2);
                } else {
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48915c, disposable)) {
                this.f48915c = disposable;
                this.f48913a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48916d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48916d) {
                return;
            }
            this.f48916d = true;
            this.f48915c.dispose();
            if (compareAndSet(false, true)) {
                this.f48914b.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            m17830a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48917f = th;
            m17830a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new TakeLastTimedObserver(observer);
        throw null;
    }
}
