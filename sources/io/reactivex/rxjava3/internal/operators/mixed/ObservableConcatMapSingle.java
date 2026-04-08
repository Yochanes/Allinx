package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapSingleMainObserver<T, R> extends ConcatMapXMainObserver<T> {

        /* JADX INFO: renamed from: g */
        public final Observer f50361g;

        /* JADX INFO: renamed from: i */
        public final ConcatMapSingleObserver f50362i = new ConcatMapSingleObserver(this);

        /* JADX INFO: renamed from: j */
        public Object f50363j;

        /* JADX INFO: renamed from: n */
        public volatile int f50364n;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapSingleMainObserver f50365a;

            public ConcatMapSingleObserver(ConcatMapSingleMainObserver concatMapSingleMainObserver) {
                this.f50365a = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.f50365a;
                if (concatMapSingleMainObserver.f50286a.m18231a(th)) {
                    concatMapSingleMainObserver.f50288c.dispose();
                    concatMapSingleMainObserver.f50364n = 0;
                    concatMapSingleMainObserver.mo18113e();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.f50365a;
                concatMapSingleMainObserver.f50363j = obj;
                concatMapSingleMainObserver.f50364n = 2;
                concatMapSingleMainObserver.mo18113e();
            }
        }

        public ConcatMapSingleMainObserver(Observer observer) {
            this.f50361g = observer;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo18111a() {
            this.f50363j = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo18112b() {
            ConcatMapSingleObserver concatMapSingleObserver = this.f50362i;
            concatMapSingleObserver.getClass();
            DisposableHelper.m17952a(concatMapSingleObserver);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            throw null;
         */
        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18113e() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f50361g;
            SimpleQueue simpleQueue = this.f50287b;
            AtomicThrowable atomicThrowable = this.f50286a;
            int iAddAndGet = 1;
            while (true) {
                if (this.f50290f) {
                    simpleQueue.clear();
                    this.f50363j = null;
                } else {
                    int i = this.f50364n;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z2 = this.f50289d;
                        try {
                            boolean z3 = simpleQueue.poll() == null;
                            if (z2 && z3) {
                                atomicThrowable.m18234d(observer);
                                return;
                            }
                            if (!z3) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    Exceptions.m17950a(th);
                                    this.f50288c.dispose();
                                    simpleQueue.clear();
                                    atomicThrowable.m18231a(th);
                                    atomicThrowable.m18234d(observer);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.m17950a(th2);
                            this.f50290f = true;
                            this.f50288c.dispose();
                            atomicThrowable.m18231a(th2);
                            atomicThrowable.m18234d(observer);
                            return;
                        }
                    } else if (i == 2) {
                        Object obj = this.f50363j;
                        this.f50363j = null;
                        observer.onNext(obj);
                        this.f50364n = 0;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: f */
        public final void mo18114f() {
            this.f50361g.mo12365c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new ConcatMapSingleMainObserver(observer);
        throw null;
    }
}
