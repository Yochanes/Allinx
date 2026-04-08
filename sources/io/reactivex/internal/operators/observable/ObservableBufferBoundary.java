package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48558a;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48562f;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48564i;

        /* JADX INFO: renamed from: g */
        public final SpscLinkedArrayQueue f48563g = new SpscLinkedArrayQueue(Flowable.f47532a);

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f48559b = new CompositeDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48560c = new AtomicReference();

        /* JADX INFO: renamed from: j */
        public LinkedHashMap f48565j = new LinkedHashMap();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48561d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {

            /* JADX INFO: renamed from: a */
            public final BufferBoundaryObserver f48566a;

            public BufferOpenObserver(BufferBoundaryObserver bufferBoundaryObserver) {
                this.f48566a = bufferBoundaryObserver;
            }

            @Override // io.reactivex.Observer
            /* JADX INFO: renamed from: c */
            public final void mo17593c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo17596d() {
                return get() == DisposableHelper.f47552a;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.m17615a(this);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                lazySet(DisposableHelper.f47552a);
                BufferBoundaryObserver bufferBoundaryObserver = this.f48566a;
                bufferBoundaryObserver.f48559b.mo17606c(this);
                if (bufferBoundaryObserver.f48559b.m17607e() == 0) {
                    DisposableHelper.m17615a(bufferBoundaryObserver.f48560c);
                    bufferBoundaryObserver.f48562f = true;
                    bufferBoundaryObserver.m17781b();
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                lazySet(DisposableHelper.f47552a);
                BufferBoundaryObserver bufferBoundaryObserver = this.f48566a;
                DisposableHelper.m17615a(bufferBoundaryObserver.f48560c);
                bufferBoundaryObserver.f48559b.mo17606c(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                BufferBoundaryObserver bufferBoundaryObserver = this.f48566a;
                bufferBoundaryObserver.getClass();
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    DisposableHelper.m17615a(bufferBoundaryObserver.f48560c);
                    bufferBoundaryObserver.onError(th);
                }
            }
        }

        public BufferBoundaryObserver(Observer observer) {
            this.f48558a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m17780a(BufferCloseObserver bufferCloseObserver, long j) {
            boolean z2;
            this.f48559b.mo17606c(bufferCloseObserver);
            if (this.f48559b.m17607e() == 0) {
                DisposableHelper.m17615a(this.f48560c);
                z2 = true;
            } else {
                z2 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f48565j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f48563g.offer(linkedHashMap.remove(Long.valueOf(j)));
                    if (z2) {
                        this.f48562f = true;
                    }
                    m17781b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m17781b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f48558a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f48563g;
            int iAddAndGet = 1;
            while (!this.f48564i) {
                boolean z2 = this.f48562f;
                if (z2 && this.f48561d.get() != null) {
                    spscLinkedArrayQueue.clear();
                    AtomicThrowable atomicThrowable = this.f48561d;
                    atomicThrowable.getClass();
                    observer.onError(ExceptionHelper.m17888b(atomicThrowable));
                    return;
                }
                Collection collection = (Collection) spscLinkedArrayQueue.poll();
                boolean z3 = collection == null;
                if (z2 && z3) {
                    observer.onComplete();
                    return;
                } else if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(collection);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17619f(this.f48560c, disposable)) {
                this.f48559b.mo17605b(new BufferOpenObserver(this));
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48560c.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (DisposableHelper.m17615a(this.f48560c)) {
                this.f48564i = true;
                this.f48559b.dispose();
                synchronized (this) {
                    this.f48565j = null;
                }
                if (getAndIncrement() != 0) {
                    this.f48563g.clear();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48559b.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f48565j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f48563g.offer((Collection) it.next());
                    }
                    this.f48565j = null;
                    this.f48562f = true;
                    m17781b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48561d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48559b.dispose();
            synchronized (this) {
                this.f48565j = null;
            }
            this.f48562f = true;
            m17781b();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f48565j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m17911b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            disposable.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new BufferBoundaryObserver(observer));
        throw null;
    }
}
