package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48847a;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48850d;

        /* JADX INFO: renamed from: f */
        public Object f48851f;

        /* JADX INFO: renamed from: g */
        public Object f48852g;

        /* JADX INFO: renamed from: c */
        public final EqualObserver[] f48849c = {new EqualObserver(this, 0), new EqualObserver(this, 1)};

        /* JADX INFO: renamed from: b */
        public final ArrayCompositeDisposable f48848b = new ArrayCompositeDisposable(2);

        public EqualCoordinator(Observer observer) {
            this.f48847a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17825a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f48849c;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.f48854b;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.f48854b;
            int iAddAndGet = 1;
            while (!this.f48850d) {
                boolean z2 = equalObserver.f48856d;
                if (z2 && (th2 = equalObserver.f48857f) != null) {
                    this.f48850d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48847a.onError(th2);
                    return;
                }
                boolean z3 = equalObserver2.f48856d;
                if (z3 && (th = equalObserver2.f48857f) != null) {
                    this.f48850d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48847a.onError(th);
                    return;
                }
                if (this.f48851f == null) {
                    this.f48851f = spscLinkedArrayQueue.poll();
                }
                boolean z4 = this.f48851f == null;
                if (this.f48852g == null) {
                    this.f48852g = spscLinkedArrayQueue2.poll();
                }
                boolean z5 = this.f48852g == null;
                if (z2 && z3 && z4 && z5) {
                    this.f48847a.onNext(Boolean.TRUE);
                    this.f48847a.onComplete();
                    return;
                }
                if (z2 && z3 && z4 != z5) {
                    this.f48850d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48847a.onNext(Boolean.FALSE);
                    this.f48847a.onComplete();
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        Exceptions.m17612a(th3);
                        this.f48850d = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f48847a.onError(th3);
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

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48850d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48850d) {
                return;
            }
            this.f48850d = true;
            this.f48848b.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f48849c;
                equalObserverArr[0].f48854b.clear();
                equalObserverArr[1].f48854b.clear();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f48853a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48854b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public final int f48855c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48856d;

        /* JADX INFO: renamed from: f */
        public Throwable f48857f;

        public EqualObserver(EqualCoordinator equalCoordinator, int i) {
            this.f48853a = equalCoordinator;
            this.f48855c = i;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            this.f48853a.f48848b.m17614a(this.f48855c, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48856d = true;
            this.f48853a.m17825a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48857f = th;
            this.f48856d = true;
            this.f48853a.m17825a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48854b.offer(obj);
            this.f48853a.m17825a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer);
        observer.mo17593c(equalCoordinator);
        EqualObserver equalObserver = equalCoordinator.f48849c[0];
        throw null;
    }
}
