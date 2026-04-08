package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BehaviorSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: i */
    public static final BehaviorDisposable[] f51304i = new BehaviorDisposable[0];

    /* JADX INFO: renamed from: j */
    public static final BehaviorDisposable[] f51305j = new BehaviorDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51306a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f51307b;

    /* JADX INFO: renamed from: c */
    public final Lock f51308c;

    /* JADX INFO: renamed from: d */
    public final Lock f51309d;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f51310f;

    /* JADX INFO: renamed from: g */
    public long f51311g;

    /* JADX INFO: compiled from: Proguard */
    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final Observer f51312a;

        /* JADX INFO: renamed from: b */
        public final BehaviorSubject f51313b;

        /* JADX INFO: renamed from: c */
        public boolean f51314c;

        /* JADX INFO: renamed from: d */
        public boolean f51315d;

        /* JADX INFO: renamed from: f */
        public AppendOnlyLinkedArrayList f51316f;

        /* JADX INFO: renamed from: g */
        public boolean f51317g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f51318i;

        /* JADX INFO: renamed from: j */
        public long f51319j;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.f51312a = observer;
            this.f51313b = behaviorSubject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18282a(long j, Object obj) {
            if (this.f51318i) {
                return;
            }
            if (!this.f51317g) {
                synchronized (this) {
                    try {
                        if (this.f51318i) {
                            return;
                        }
                        if (this.f51319j == j) {
                            return;
                        }
                        if (this.f51315d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f51316f;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f51316f = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m18229b(obj);
                            return;
                        }
                        this.f51314c = true;
                        this.f51317g = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51318i;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f51318i) {
                return;
            }
            this.f51318i = true;
            this.f51313b.m18281j(this);
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.f51318i || NotificationLite.m18258a(this.f51312a, obj);
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f51308c = reentrantReadWriteLock.readLock();
        this.f51309d = reentrantReadWriteLock.writeLock();
        this.f51307b = new AtomicReference(f51304i);
        this.f51306a = new AtomicReference(null);
        this.f51310f = new AtomicReference();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (this.f51310f.get() != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.mo12365c(behaviorDisposable);
        while (true) {
            AtomicReference atomicReference = this.f51307b;
            BehaviorDisposable[] behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == f51305j) {
                Throwable th = (Throwable) this.f51310f.get();
                if (th == ExceptionHelper.f51225a) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            BehaviorDisposable[] behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
            while (!atomicReference.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2)) {
                if (atomicReference.get() != behaviorDisposableArr) {
                    break;
                }
            }
            if (behaviorDisposable.f51318i) {
                m18281j(behaviorDisposable);
                return;
            }
            if (behaviorDisposable.f51318i) {
                return;
            }
            synchronized (behaviorDisposable) {
                try {
                    if (behaviorDisposable.f51318i) {
                        return;
                    }
                    if (behaviorDisposable.f51314c) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = behaviorDisposable.f51313b;
                    Lock lock = behaviorSubject.f51308c;
                    lock.lock();
                    behaviorDisposable.f51319j = behaviorSubject.f51311g;
                    Object obj = behaviorSubject.f51306a.get();
                    lock.unlock();
                    behaviorDisposable.f51315d = obj != null;
                    behaviorDisposable.f51314c = true;
                    if (obj == null || behaviorDisposable.test(obj)) {
                        return;
                    }
                    while (!behaviorDisposable.f51318i) {
                        synchronized (behaviorDisposable) {
                            try {
                                appendOnlyLinkedArrayList = behaviorDisposable.f51316f;
                                if (appendOnlyLinkedArrayList == null) {
                                    behaviorDisposable.f51315d = false;
                                    return;
                                }
                                behaviorDisposable.f51316f = null;
                            } finally {
                            }
                        }
                        appendOnlyLinkedArrayList.m18230c(behaviorDisposable);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m18281j(BehaviorDisposable behaviorDisposable) {
        BehaviorDisposable[] behaviorDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f51307b;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr2[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr = f51304i;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr2, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr2, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr = behaviorDisposableArr3;
            }
            while (!atomicReference.compareAndSet(behaviorDisposableArr2, behaviorDisposableArr)) {
                if (atomicReference.get() != behaviorDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.f51310f;
        Throwable th = ExceptionHelper.f51225a;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        NotificationLite notificationLite = NotificationLite.f51228a;
        Lock lock = this.f51309d;
        lock.lock();
        this.f51311g++;
        this.f51306a.lazySet(notificationLite);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f51307b.getAndSet(f51305j)) {
            behaviorDisposable.m18282a(this.f51311g, notificationLite);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.f51310f;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                RxJavaPlugins.m18275b(th);
                return;
            }
        }
        Object objM18262e = NotificationLite.m18262e(th);
        Lock lock = this.f51309d;
        lock.lock();
        this.f51311g++;
        this.f51306a.lazySet((Serializable) objM18262e);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f51307b.getAndSet(f51305j)) {
            behaviorDisposable.m18282a(this.f51311g, objM18262e);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        if (this.f51310f.get() != null) {
            return;
        }
        Lock lock = this.f51309d;
        lock.lock();
        this.f51311g++;
        this.f51306a.lazySet(obj);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f51307b.get()) {
            behaviorDisposable.m18282a(this.f51311g, obj);
        }
    }
}
