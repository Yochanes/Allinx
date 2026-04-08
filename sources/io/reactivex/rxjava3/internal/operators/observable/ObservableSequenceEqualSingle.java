package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f50815a;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50818d;

        /* JADX INFO: renamed from: f */
        public Object f50819f;

        /* JADX INFO: renamed from: g */
        public Object f50820g;

        /* JADX INFO: renamed from: c */
        public final EqualObserver[] f50817c = {new EqualObserver(this, 0), new EqualObserver(this, 1)};

        /* JADX INFO: renamed from: b */
        public final ArrayCompositeDisposable f50816b = new ArrayCompositeDisposable(2);

        public EqualCoordinator(SingleObserver singleObserver) {
            this.f50815a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m18182a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f50817c;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.f50822b;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.f50822b;
            int iAddAndGet = 1;
            while (!this.f50818d) {
                boolean z2 = equalObserver.f50824d;
                if (z2 && (th2 = equalObserver.f50825f) != null) {
                    this.f50818d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50815a.onError(th2);
                    return;
                }
                boolean z3 = equalObserver2.f50824d;
                if (z3 && (th = equalObserver2.f50825f) != null) {
                    this.f50818d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50815a.onError(th);
                    return;
                }
                if (this.f50819f == null) {
                    this.f50819f = spscLinkedArrayQueue.poll();
                }
                boolean z4 = this.f50819f == null;
                if (this.f50820g == null) {
                    this.f50820g = spscLinkedArrayQueue2.poll();
                }
                boolean z5 = this.f50820g == null;
                if (z2 && z3 && z4 && z5) {
                    this.f50815a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z2 && z3 && z4 != z5) {
                    this.f50818d = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f50815a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z4 && !z5) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        Exceptions.m17950a(th3);
                        this.f50818d = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f50815a.onError(th3);
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
            return this.f50818d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50818d) {
                return;
            }
            this.f50818d = true;
            this.f50816b.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f50817c;
                equalObserverArr[0].f50822b.clear();
                equalObserverArr[1].f50822b.clear();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f50821a;

        /* JADX INFO: renamed from: b */
        public final SpscLinkedArrayQueue f50822b = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: c */
        public final int f50823c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50824d;

        /* JADX INFO: renamed from: f */
        public Throwable f50825f;

        public EqualObserver(EqualCoordinator equalCoordinator, int i) {
            this.f50821a = equalCoordinator;
            this.f50823c = i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            this.f50821a.f50816b.m17951a(this.f50823c, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50824d = true;
            this.f50821a.m18182a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50825f = th;
            this.f50824d = true;
            this.f50821a.m18182a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50822b.offer(obj);
            this.f50821a.m18182a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver);
        singleObserver.mo12366c(equalCoordinator);
        EqualObserver equalObserver = equalCoordinator.f50817c[0];
        throw null;
    }
}
