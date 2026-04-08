package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f48858a;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48861d;

        /* JADX INFO: renamed from: f */
        public Object f48862f;

        /* JADX INFO: renamed from: g */
        public Object f48863g;

        /* JADX INFO: renamed from: c */
        public final EqualObserver[] f48860c = {new EqualObserver(this, 0), new EqualObserver(this, 1)};

        /* JADX INFO: renamed from: b */
        public final ArrayCompositeDisposable f48859b = new ArrayCompositeDisposable(2);

        public EqualCoordinator(SingleObserver singleObserver) {
            this.f48858a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17826a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f48860c;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.f48865b;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.f48865b;
            int iAddAndGet = 1;
            while (!this.f48861d) {
                boolean z2 = equalObserver.f48867d;
                if (z2 && (th2 = equalObserver.f48868f) != null) {
                    this.f48861d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48858a.onError(th2);
                    return;
                }
                boolean z3 = equalObserver2.f48867d;
                if (z3 && (th = equalObserver2.f48868f) != null) {
                    this.f48861d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48858a.onError(th);
                    return;
                }
                if (this.f48862f == null) {
                    this.f48862f = spscLinkedArrayQueue.poll();
                }
                boolean z4 = this.f48862f == null;
                if (this.f48863g == null) {
                    this.f48863g = spscLinkedArrayQueue2.poll();
                }
                boolean z5 = this.f48863g == null;
                if (z2 && z3 && z4 && z5) {
                    this.f48858a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z2 && z3 && z4 != z5) {
                    this.f48861d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f48858a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        Exceptions.m17612a(th3);
                        this.f48861d = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f48858a.onError(th3);
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
            return this.f48861d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48861d) {
                return;
            }
            this.f48861d = true;
            this.f48859b.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f48860c;
                equalObserverArr[0].f48865b.clear();
                equalObserverArr[1].f48865b.clear();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f48864a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f48865b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public final int f48866c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48867d;

        /* JADX INFO: renamed from: f */
        public Throwable f48868f;

        public EqualObserver(EqualCoordinator equalCoordinator, int i) {
            this.f48864a = equalCoordinator;
            this.f48866c = i;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            this.f48864a.f48859b.m17614a(this.f48866c, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48867d = true;
            this.f48864a.m17826a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48868f = th;
            this.f48867d = true;
            this.f48864a.m17826a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48865b.offer(obj);
            this.f48864a.m17826a();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver);
        singleObserver.mo17602c(equalCoordinator);
        EqualObserver equalObserver = equalCoordinator.f48860c[0];
        throw null;
    }
}
