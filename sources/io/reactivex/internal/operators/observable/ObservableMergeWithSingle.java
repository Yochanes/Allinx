package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
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
public final class ObservableMergeWithSingle<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48769a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48770b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f48771c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48772d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile SpscLinkedArrayQueue f48773f;

        /* JADX INFO: renamed from: g */
        public Object f48774g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48775i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48776j;

        /* JADX INFO: renamed from: n */
        public volatile int f48777n;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f48778a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f48778a = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f48778a;
                AtomicThrowable atomicThrowable = mergeWithObserver.f48772d;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                    return;
                }
                DisposableHelper.m17615a(mergeWithObserver.f48770b);
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.m17808a();
                }
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.f48778a;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.f48769a.onNext(obj);
                    mergeWithObserver.f48777n = 2;
                } else {
                    mergeWithObserver.f48774g = obj;
                    mergeWithObserver.f48777n = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m17808a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f48769a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17808a() {
            Observer observer = this.f48769a;
            int iAddAndGet = 1;
            while (!this.f48775i) {
                if (this.f48772d.get() != null) {
                    this.f48774g = null;
                    this.f48773f = null;
                    AtomicThrowable atomicThrowable = this.f48772d;
                    atomicThrowable.getClass();
                    observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                int i = this.f48777n;
                if (i == 1) {
                    Object obj = this.f48774g;
                    this.f48774g = null;
                    this.f48777n = 2;
                    observer.onNext(obj);
                    i = 2;
                }
                boolean z2 = this.f48776j;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48773f;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z3 = objPoll == null;
                if (z2 && z3 && i == 2) {
                    this.f48773f = null;
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
            this.f48774g = null;
            this.f48773f = null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48770b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48770b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48775i = true;
            DisposableHelper.m17615a(this.f48770b);
            DisposableHelper.m17615a(this.f48771c);
            if (getAndIncrement() == 0) {
                this.f48773f = null;
                this.f48774g = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48776j = true;
            if (getAndIncrement() == 0) {
                m17808a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48772d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            DisposableHelper.m17615a(this.f48770b);
            if (getAndIncrement() == 0) {
                m17808a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.f48769a.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48773f;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.f47532a);
                    this.f48773f = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17808a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new MergeWithObserver(observer));
        throw null;
    }
}
