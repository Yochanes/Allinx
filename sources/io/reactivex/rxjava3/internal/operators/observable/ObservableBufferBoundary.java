package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
        public final Observer f50443a;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50447f;

        /* JADX INFO: renamed from: i */
        public volatile boolean f50449i;

        /* JADX INFO: renamed from: g */
        public final SpscLinkedArrayQueue f50448g = new SpscLinkedArrayQueue(Flowable.f49359a);

        /* JADX INFO: renamed from: b */
        public final CompositeDisposable f50444b = new CompositeDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50445c = new AtomicReference();

        /* JADX INFO: renamed from: j */
        public LinkedHashMap f50450j = new LinkedHashMap();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50446d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {

            /* JADX INFO: renamed from: a */
            public final BufferBoundaryObserver f50451a;

            public BufferOpenObserver(BufferBoundaryObserver bufferBoundaryObserver) {
                this.f50451a = bufferBoundaryObserver;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            /* JADX INFO: renamed from: c */
            public final void mo12365c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo12353d() {
                return get() == DisposableHelper.f49380a;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.m17952a(this);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                lazySet(DisposableHelper.f49380a);
                BufferBoundaryObserver bufferBoundaryObserver = this.f50451a;
                bufferBoundaryObserver.f50444b.mo17944c(this);
                if (bufferBoundaryObserver.f50444b.m17945e() == 0) {
                    DisposableHelper.m17952a(bufferBoundaryObserver.f50445c);
                    bufferBoundaryObserver.f50447f = true;
                    bufferBoundaryObserver.m18133b();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                lazySet(DisposableHelper.f49380a);
                BufferBoundaryObserver bufferBoundaryObserver = this.f50451a;
                DisposableHelper.m17952a(bufferBoundaryObserver.f50445c);
                bufferBoundaryObserver.f50444b.mo17944c(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                BufferBoundaryObserver bufferBoundaryObserver = this.f50451a;
                bufferBoundaryObserver.getClass();
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    DisposableHelper.m17952a(bufferBoundaryObserver.f50445c);
                    bufferBoundaryObserver.onError(th);
                }
            }
        }

        public BufferBoundaryObserver(Observer observer) {
            this.f50443a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final void m18132a(BufferCloseObserver bufferCloseObserver, long j) {
            boolean z2;
            this.f50444b.mo17944c(bufferCloseObserver);
            if (this.f50444b.m17945e() == 0) {
                DisposableHelper.m17952a(this.f50445c);
                z2 = true;
            } else {
                z2 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f50450j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f50448g.offer(linkedHashMap.remove(Long.valueOf(j)));
                    if (z2) {
                        this.f50447f = true;
                    }
                    m18133b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m18133b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f50443a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f50448g;
            int iAddAndGet = 1;
            while (!this.f50449i) {
                boolean z2 = this.f50447f;
                if (z2 && this.f50446d.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f50446d.m18234d(observer);
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

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17955e(this.f50445c, disposable)) {
                this.f50444b.mo17943b(new BufferOpenObserver(this));
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50445c.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (DisposableHelper.m17952a(this.f50445c)) {
                this.f50449i = true;
                this.f50444b.dispose();
                synchronized (this) {
                    this.f50450j = null;
                }
                if (getAndIncrement() != 0) {
                    this.f50448g.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50444b.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f50450j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f50448g.offer((Collection) it.next());
                    }
                    this.f50450j = null;
                    this.f50447f = true;
                    m18133b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50446d.m18231a(th)) {
                this.f50444b.dispose();
                synchronized (this) {
                    this.f50450j = null;
                }
                this.f50447f = true;
                m18133b();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f50450j;
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
        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            disposable.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(observer);
        observer.mo12365c(bufferBoundaryObserver);
        this.f50392a.mo17931a(bufferBoundaryObserver);
    }
}
