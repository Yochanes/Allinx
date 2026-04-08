package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48759a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48760b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f48761c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48762d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile SpscLinkedArrayQueue f48763f;

        /* JADX INFO: renamed from: g */
        public Object f48764g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48765i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48766j;

        /* JADX INFO: renamed from: n */
        public volatile int f48767n;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f48768a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f48768a = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.f48768a;
                mergeWithObserver.f48767n = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.m17807a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f48768a;
                AtomicThrowable atomicThrowable = mergeWithObserver.f48762d;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                DisposableHelper.m17615a(mergeWithObserver.f48760b);
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.m17807a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f48768a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f48759a.onNext(obj);
                    mergeWithObserver.f48767n = 2;
                } else {
                    mergeWithObserver.f48764g = obj;
                    mergeWithObserver.f48767n = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m17807a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f48759a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17807a() {
            Observer observer = this.f48759a;
            int iAddAndGet = 1;
            while (!this.f48765i) {
                if (this.f48762d.get() != null) {
                    this.f48764g = null;
                    this.f48763f = null;
                    AtomicThrowable atomicThrowable = this.f48762d;
                    atomicThrowable.getClass();
                    observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                int i = this.f48767n;
                if (i == 1) {
                    Object obj = this.f48764g;
                    this.f48764g = null;
                    this.f48767n = 2;
                    observer.onNext(obj);
                    i = 2;
                }
                boolean z2 = this.f48766j;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48763f;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3 && i == 2) {
                    this.f48763f = null;
                    observer.onComplete();
                    return;
                } else if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            this.f48764g = null;
            this.f48763f = null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48760b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48760b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48765i = true;
            DisposableHelper.m17615a(this.f48760b);
            DisposableHelper.m17615a(this.f48761c);
            if (getAndIncrement() == 0) {
                this.f48763f = null;
                this.f48764g = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48766j = true;
            if (getAndIncrement() == 0) {
                m17807a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48762d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            DisposableHelper.m17615a(this.f48760b);
            if (getAndIncrement() == 0) {
                m17807a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.f48759a.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48763f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f47532a);
                    this.f48763f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17807a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new MergeWithObserver(observer));
        throw null;
    }
}
