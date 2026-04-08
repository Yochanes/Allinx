package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48480a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48481b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ConcatMapMaybeObserver f48482c = new ConcatMapMaybeObserver(this);

        /* JADX INFO: renamed from: d */
        public final SpscLinkedArrayQueue f48483d = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: f */
        public Disposable f48484f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48485g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48486i;

        /* JADX INFO: renamed from: j */
        public Object f48487j;

        /* JADX INFO: renamed from: n */
        public volatile int f48488n;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapMaybeMainObserver f48489a;

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver concatMapMaybeMainObserver) {
                this.f48489a = concatMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f48489a;
                concatMapMaybeMainObserver.f48488n = 0;
                concatMapMaybeMainObserver.m17772a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f48489a;
                AtomicThrowable atomicThrowable = concatMapMaybeMainObserver.f48481b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                concatMapMaybeMainObserver.f48484f.dispose();
                concatMapMaybeMainObserver.f48488n = 0;
                concatMapMaybeMainObserver.m17772a();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.f48489a;
                concatMapMaybeMainObserver.f48487j = obj;
                concatMapMaybeMainObserver.f48488n = 2;
                concatMapMaybeMainObserver.m17772a();
            }
        }

        public ConcatMapMaybeMainObserver(Observer observer) {
            this.f48480a = observer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        
            throw null;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17772a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48480a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48483d;
            AtomicThrowable atomicThrowable = this.f48481b;
            int iAddAndGet = 1;
            while (true) {
                if (this.f48486i) {
                    spscLinkedArrayQueue.clear();
                    this.f48487j = null;
                } else {
                    int i = this.f48488n;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z2 = this.f48485g;
                        boolean z3 = spscLinkedArrayQueue.poll() == null;
                        if (z2 && z3) {
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(thM17888b);
                                return;
                            }
                        }
                        if (!z3) {
                            try {
                                break;
                            } catch (Throwable th) {
                                Exceptions.m17612a(th);
                                this.f48484f.dispose();
                                spscLinkedArrayQueue.clear();
                                ExceptionHelper.m17887a(atomicThrowable, th);
                                observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                                return;
                            }
                        }
                    } else if (i == 2) {
                        Object obj = this.f48487j;
                        this.f48487j = null;
                        observer.onNext(obj);
                        this.f48488n = 0;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48484f, disposable)) {
                this.f48484f = disposable;
                this.f48480a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48486i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48486i = true;
            this.f48484f.dispose();
            ConcatMapMaybeObserver concatMapMaybeObserver = this.f48482c;
            concatMapMaybeObserver.getClass();
            DisposableHelper.m17615a(concatMapMaybeObserver);
            if (getAndIncrement() == 0) {
                this.f48483d.clear();
                this.f48487j = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48485g = true;
            m17772a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48481b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48485g = true;
                m17772a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48483d.offer(obj);
            m17772a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new ConcatMapMaybeMainObserver(observer);
        throw null;
    }
}
