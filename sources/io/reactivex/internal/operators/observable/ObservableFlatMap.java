package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {

        /* JADX INFO: renamed from: a */
        public final long f48656a;

        /* JADX INFO: renamed from: b */
        public final MergeObserver f48657b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48658c;

        /* JADX INFO: renamed from: d */
        public volatile SimpleQueue f48659d;

        /* JADX INFO: renamed from: f */
        public int f48660f;

        public InnerObserver(MergeObserver mergeObserver, long j) {
            this.f48656a = j;
            this.f48657b = mergeObserver;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo17626e = queueDisposable.mo17626e(7);
                if (iMo17626e == 1) {
                    this.f48660f = iMo17626e;
                    this.f48659d = queueDisposable;
                    this.f48658c = true;
                    this.f48657b.m17790e();
                    return;
                }
                if (iMo17626e == 2) {
                    this.f48660f = iMo17626e;
                    this.f48659d = queueDisposable;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48658c = true;
            this.f48657b.m17790e();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48657b.f48666d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            MergeObserver mergeObserver = this.f48657b;
            mergeObserver.getClass();
            mergeObserver.m17789b();
            this.f48658c = true;
            this.f48657b.m17790e();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48660f != 0) {
                this.f48657b.m17790e();
                return;
            }
            MergeObserver mergeObserver = this.f48657b;
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.f48663a.onNext(obj);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.f48659d;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(0);
                    this.f48659d = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.m17791f();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: r */
        public static final InnerObserver[] f48661r = new InnerObserver[0];

        /* JADX INFO: renamed from: s */
        public static final InnerObserver[] f48662s = new InnerObserver[0];

        /* JADX INFO: renamed from: a */
        public final Observer f48663a;

        /* JADX INFO: renamed from: b */
        public volatile SimplePlainQueue f48664b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48665c;

        /* JADX INFO: renamed from: f */
        public volatile boolean f48667f;

        /* JADX INFO: renamed from: i */
        public Disposable f48669i;

        /* JADX INFO: renamed from: j */
        public long f48670j;

        /* JADX INFO: renamed from: n */
        public long f48671n;

        /* JADX INFO: renamed from: o */
        public int f48672o;

        /* JADX INFO: renamed from: q */
        public int f48674q;

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48666d = new AtomicThrowable();

        /* JADX INFO: renamed from: p */
        public final ArrayDeque f48673p = new ArrayDeque(0);

        /* JADX INFO: renamed from: g */
        public final AtomicReference f48668g = new AtomicReference(f48661r);

        public MergeObserver(Observer observer) {
            this.f48663a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17788a() {
            if (!this.f48667f) {
                if (this.f48666d.get() == null) {
                    return false;
                }
                m17789b();
                AtomicThrowable atomicThrowable = this.f48666d;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b != ExceptionHelper.f49276a) {
                    this.f48663a.onError(thM17888b);
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m17789b() {
            InnerObserver[] innerObserverArr;
            this.f48669i.dispose();
            AtomicReference atomicReference = this.f48668g;
            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
            InnerObserver[] innerObserverArr3 = f48662s;
            if (innerObserverArr2 == innerObserverArr3 || (innerObserverArr = (InnerObserver[]) atomicReference.getAndSet(innerObserverArr3)) == innerObserverArr3) {
                return false;
            }
            for (InnerObserver innerObserver : innerObserverArr) {
                innerObserver.getClass();
                DisposableHelper.m17615a(innerObserver);
            }
            return true;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48669i, disposable)) {
                this.f48669i = disposable;
                this.f48663a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48667f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48667f) {
                return;
            }
            this.f48667f = true;
            if (m17789b()) {
                AtomicThrowable atomicThrowable = this.f48666d;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b == null || thM17888b == ExceptionHelper.f49276a) {
                    return;
                }
                RxJavaPlugins.m17911b(thM17888b);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m17790e() {
            if (getAndIncrement() == 0) {
                m17791f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:180:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:151:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m17791f() {
            int size;
            Object objCall;
            Observer observer = this.f48663a;
            int iAddAndGet = 1;
            while (!m17788a()) {
                SimplePlainQueue simplePlainQueue = this.f48664b;
                if (simplePlainQueue != null) {
                    while (!m17788a()) {
                        Object objPoll = simplePlainQueue.poll();
                        if (objPoll != null) {
                            observer.onNext(objPoll);
                        } else if (objPoll == null) {
                        }
                    }
                    return;
                }
                boolean z2 = this.f48665c;
                SimplePlainQueue simplePlainQueue2 = this.f48664b;
                InnerObserver[] innerObserverArr = (InnerObserver[]) this.f48668g.get();
                int length = innerObserverArr.length;
                synchronized (this) {
                    size = this.f48673p.size();
                }
                if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                    AtomicThrowable atomicThrowable = this.f48666d;
                    atomicThrowable.getClass();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b != ExceptionHelper.f49276a) {
                        if (thM17888b == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thM17888b);
                            return;
                        }
                    }
                    return;
                }
                boolean z3 = false;
                if (length != 0) {
                    long j = this.f48671n;
                    int i = this.f48672o;
                    if (length <= i || innerObserverArr[i].f48656a != j) {
                        if (length <= i) {
                            i = 0;
                        }
                        for (int i2 = 0; i2 < length && innerObserverArr[i].f48656a != j; i2++) {
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                        }
                        this.f48672o = i;
                        this.f48671n = innerObserverArr[i].f48656a;
                    }
                    int i3 = 0;
                    boolean z4 = false;
                    while (i3 < length) {
                        if (m17788a()) {
                            return;
                        }
                        InnerObserver innerObserver = innerObserverArr[i];
                        while (!m17788a()) {
                            SimpleQueue simpleQueue = innerObserver.f48659d;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        Object objPoll2 = simpleQueue.poll();
                                        if (objPoll2 != null) {
                                            observer.onNext(objPoll2);
                                        } else if (objPoll2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.m17612a(th);
                                        DisposableHelper.m17615a(innerObserver);
                                        AtomicThrowable atomicThrowable2 = this.f48666d;
                                        atomicThrowable2.getClass();
                                        ExceptionHelper.m17887a(atomicThrowable2, th);
                                        if (m17788a()) {
                                            return;
                                        }
                                        m17792g(innerObserver);
                                        i3++;
                                        z4 = true;
                                    }
                                } while (!m17788a());
                                return;
                            }
                            boolean z5 = innerObserver.f48658c;
                            SimpleQueue simpleQueue2 = innerObserver.f48659d;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                m17792g(innerObserver);
                                if (m17788a()) {
                                    return;
                                } else {
                                    z4 = true;
                                }
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                            i3++;
                        }
                        return;
                    }
                    this.f48672o = i;
                    this.f48671n = innerObserverArr[i].f48656a;
                    z3 = z4;
                }
                if (z3) {
                    synchronized (this) {
                        try {
                            ObservableSource observableSource = (ObservableSource) this.f48673p.poll();
                            if (observableSource != null) {
                                while (true) {
                                    boolean z6 = false;
                                    if (!(observableSource instanceof Callable)) {
                                        long j2 = this.f48670j;
                                        this.f48670j = 1 + j2;
                                        InnerObserver innerObserver2 = new InnerObserver(this, j2);
                                        while (true) {
                                            AtomicReference atomicReference = this.f48668g;
                                            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
                                            if (innerObserverArr2 != f48662s) {
                                                int length2 = innerObserverArr2.length;
                                                InnerObserver[] innerObserverArr3 = new InnerObserver[length2 + 1];
                                                System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, length2);
                                                innerObserverArr3[length2] = innerObserver2;
                                                while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr3)) {
                                                    if (atomicReference.get() != innerObserverArr2) {
                                                        break;
                                                    }
                                                }
                                                observableSource.mo17591a(innerObserver2);
                                                break;
                                            }
                                            DisposableHelper.m17615a(innerObserver2);
                                            break;
                                        }
                                    }
                                    try {
                                        objCall = ((Callable) observableSource).call();
                                    } catch (Throwable th2) {
                                        Exceptions.m17612a(th2);
                                        AtomicThrowable atomicThrowable3 = this.f48666d;
                                        atomicThrowable3.getClass();
                                        ExceptionHelper.m17887a(atomicThrowable3, th2);
                                        m17790e();
                                    }
                                    if (objCall != null) {
                                        if (get() != 0 || !compareAndSet(0, 1)) {
                                            SimplePlainQueue spscArrayQueue = this.f48664b;
                                            if (spscArrayQueue == null) {
                                                spscArrayQueue = new SpscArrayQueue(0);
                                                this.f48664b = spscArrayQueue;
                                            }
                                            if (!spscArrayQueue.offer(objCall)) {
                                                onError(new IllegalStateException("Scalar queue full?!"));
                                                synchronized (this) {
                                                    try {
                                                        observableSource = (ObservableSource) this.f48673p.poll();
                                                        if (observableSource == null) {
                                                            this.f48674q--;
                                                            z6 = true;
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                if (z6) {
                                                    m17790e();
                                                    break;
                                                }
                                            } else {
                                                if (getAndIncrement() != 0) {
                                                    break;
                                                }
                                                m17791f();
                                                synchronized (this) {
                                                }
                                            }
                                        } else {
                                            this.f48663a.onNext(objCall);
                                            if (decrementAndGet() != 0) {
                                                m17791f();
                                            }
                                            synchronized (this) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f48674q--;
                            }
                        } finally {
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public final void m17792g(InnerObserver innerObserver) {
            InnerObserver[] innerObserverArr;
            while (true) {
                AtomicReference atomicReference = this.f48668g;
                InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
                int length = innerObserverArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr2[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr = f48661r;
                } else {
                    InnerObserver[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr2, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr = innerObserverArr3;
                }
                while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                    if (atomicReference.get() != innerObserverArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48665c) {
                return;
            }
            this.f48665c = true;
            m17790e();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48665c) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.f48666d;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48665c = true;
                m17790e();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48665c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48669i.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new MergeObserver(observer);
        throw null;
    }
}
