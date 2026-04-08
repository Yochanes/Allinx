package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50804a;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50807d;

        /* JADX INFO: renamed from: f */
        public Object f50808f;

        /* JADX INFO: renamed from: g */
        public Object f50809g;

        /* JADX INFO: renamed from: c */
        public final EqualObserver[] f50806c = {new EqualObserver(this, 0), new EqualObserver(this, 1)};

        /* JADX INFO: renamed from: b */
        public final ArrayCompositeDisposable f50805b = new ArrayCompositeDisposable(2);

        public EqualCoordinator(Observer observer) {
            this.f50804a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18181a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f50806c;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.f50811b;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.f50811b;
            int iAddAndGet = 1;
            while (!this.f50807d) {
                boolean z2 = equalObserver.f50813d;
                if (z2 && (th2 = equalObserver.f50814f) != null) {
                    this.f50807d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50804a.onError(th2);
                    return;
                }
                boolean z3 = equalObserver2.f50813d;
                if (z3 && (th = equalObserver2.f50814f) != null) {
                    this.f50807d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50804a.onError(th);
                    return;
                }
                if (this.f50808f == null) {
                    this.f50808f = spscLinkedArrayQueue.poll();
                }
                boolean z4 = this.f50808f == null;
                if (this.f50809g == null) {
                    this.f50809g = spscLinkedArrayQueue2.poll();
                }
                boolean z5 = this.f50809g == null;
                if (z2 && z3 && z4 && z5) {
                    this.f50804a.onNext(Boolean.TRUE);
                    this.f50804a.onComplete();
                    return;
                }
                if (z2 && z3 && z4 != z5) {
                    this.f50807d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50804a.onNext(Boolean.FALSE);
                    this.f50804a.onComplete();
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        Exceptions.m17950a(th3);
                        this.f50807d = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f50804a.onError(th3);
                        return;
                    }
                }
                if (z4 || z5) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50807d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50807d) {
                return;
            }
            this.f50807d = true;
            this.f50805b.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f50806c;
                equalObserverArr[0].f50811b.clear();
                equalObserverArr[1].f50811b.clear();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f50810a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50811b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public final int f50812c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50813d;

        /* JADX INFO: renamed from: f */
        public Throwable f50814f;

        public EqualObserver(EqualCoordinator equalCoordinator, int i) {
            this.f50810a = equalCoordinator;
            this.f50812c = i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            this.f50810a.f50805b.m17951a(this.f50812c, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50813d = true;
            this.f50810a.m18181a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50814f = th;
            this.f50813d = true;
            this.f50810a.m18181a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50811b.offer(obj);
            this.f50810a.m18181a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer);
        observer.mo12365c(equalCoordinator);
        EqualObserver equalObserver = equalCoordinator.f50806c[0];
        throw null;
    }
}
