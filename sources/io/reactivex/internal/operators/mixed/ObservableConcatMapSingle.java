package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
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
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48490a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48491b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ConcatMapSingleObserver f48492c = new ConcatMapSingleObserver(this);

        /* JADX INFO: renamed from: d */
        public final SpscLinkedArrayQueue f48493d = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: f */
        public Disposable f48494f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48495g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48496i;

        /* JADX INFO: renamed from: j */
        public Object f48497j;

        /* JADX INFO: renamed from: n */
        public volatile int f48498n;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapSingleMainObserver f48499a;

            public ConcatMapSingleObserver(ConcatMapSingleMainObserver concatMapSingleMainObserver) {
                this.f48499a = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.f48499a;
                AtomicThrowable atomicThrowable = concatMapSingleMainObserver.f48491b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                concatMapSingleMainObserver.f48494f.dispose();
                concatMapSingleMainObserver.f48498n = 0;
                concatMapSingleMainObserver.m17773a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.f48499a;
                concatMapSingleMainObserver.f48497j = obj;
                concatMapSingleMainObserver.f48498n = 2;
                concatMapSingleMainObserver.m17773a();
            }
        }

        public ConcatMapSingleMainObserver(Observer observer) {
            this.f48490a = observer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        
            throw null;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17773a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48490a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48493d;
            AtomicThrowable atomicThrowable = this.f48491b;
            int iAddAndGet = 1;
            while (true) {
                if (this.f48496i) {
                    spscLinkedArrayQueue.clear();
                    this.f48497j = null;
                } else {
                    int i = this.f48498n;
                    atomicThrowable.get();
                    if (i == 0) {
                        boolean z2 = this.f48495g;
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
                                this.f48494f.dispose();
                                spscLinkedArrayQueue.clear();
                                ExceptionHelper.m17887a(atomicThrowable, th);
                                observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                                return;
                            }
                        }
                    } else if (i == 2) {
                        Object obj = this.f48497j;
                        this.f48497j = null;
                        observer.onNext(obj);
                        this.f48498n = 0;
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
            if (DisposableHelper.m17620h(this.f48494f, disposable)) {
                this.f48494f = disposable;
                this.f48490a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48496i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48496i = true;
            this.f48494f.dispose();
            ConcatMapSingleObserver concatMapSingleObserver = this.f48492c;
            concatMapSingleObserver.getClass();
            DisposableHelper.m17615a(concatMapSingleObserver);
            if (getAndIncrement() == 0) {
                this.f48493d.clear();
                this.f48497j = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48495g = true;
            m17773a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48491b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48495g = true;
                m17773a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48493d.offer(obj);
            m17773a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new ConcatMapSingleMainObserver(observer);
        throw null;
    }
}
