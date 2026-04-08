package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapMaybeMainObserver<T, R> extends ConcatMapXMainObserver<T> {

        /* JADX INFO: renamed from: g */
        public final Observer f50356g;

        /* JADX INFO: renamed from: i */
        public final ConcatMapMaybeObserver f50357i = new ConcatMapMaybeObserver(this);

        /* JADX INFO: renamed from: j */
        public Object f50358j;

        /* JADX INFO: renamed from: n */
        public volatile int f50359n;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapMaybeMainObserver f50360a;

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver concatMapMaybeMainObserver) {
                this.f50360a = concatMapMaybeMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f50360a;
                concatMapMaybeMainObserver.f50359n = 0;
                concatMapMaybeMainObserver.mo18113e();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f50360a;
                if (concatMapMaybeMainObserver.f50286a.m18231a(th)) {
                    concatMapMaybeMainObserver.f50288c.dispose();
                    concatMapMaybeMainObserver.f50359n = 0;
                    concatMapMaybeMainObserver.mo18113e();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f50360a;
                concatMapMaybeMainObserver.f50358j = obj;
                concatMapMaybeMainObserver.f50359n = 2;
                concatMapMaybeMainObserver.mo18113e();
            }
        }

        public ConcatMapMaybeMainObserver(Observer observer) {
            this.f50356g = observer;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo18111a() {
            this.f50358j = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo18112b() {
            ConcatMapMaybeObserver concatMapMaybeObserver = this.f50357i;
            concatMapMaybeObserver.getClass();
            DisposableHelper.m17952a(concatMapMaybeObserver);
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
            Observer observer = this.f50356g;
            SimpleQueue simpleQueue = this.f50287b;
            AtomicThrowable atomicThrowable = this.f50286a;
            int iAddAndGet = 1;
            while (true) {
                if (this.f50290f) {
                    simpleQueue.clear();
                    this.f50358j = null;
                } else {
                    int i = this.f50359n;
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
                        Object obj = this.f50358j;
                        this.f50358j = null;
                        observer.onNext(obj);
                        this.f50359n = 0;
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
            this.f50356g.mo12365c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new ConcatMapMaybeMainObserver(observer);
        throw null;
    }
}
