package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SpscLinkedArrayQueue f50393a = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: b */
        public final ReentrantLock f50394b;

        /* JADX INFO: renamed from: c */
        public final Condition f50395c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50396d;

        /* JADX INFO: renamed from: f */
        public volatile Throwable f50397f;

        public BlockingObservableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f50394b = reentrantLock;
            this.f50395c = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public final void m18130a() {
            ReentrantLock reentrantLock = this.f50394b;
            reentrantLock.lock();
            try {
                this.f50395c.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            m18130a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!mo12353d()) {
                boolean z2 = this.f50396d;
                boolean zIsEmpty = this.f50393a.isEmpty();
                if (z2) {
                    Throwable th = this.f50397f;
                    if (th != null) {
                        throw ExceptionHelper.m18251f(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    this.f50394b.lock();
                    while (!this.f50396d && this.f50393a.isEmpty() && !mo12353d()) {
                        try {
                            this.f50395c.await();
                        } catch (Throwable th2) {
                            this.f50394b.unlock();
                            throw th2;
                        }
                    }
                    this.f50394b.unlock();
                } catch (InterruptedException e) {
                    DisposableHelper.m17952a(this);
                    m18130a();
                    throw ExceptionHelper.m18251f(e);
                }
            }
            Throwable th3 = this.f50397f;
            if (th3 == null) {
                return false;
            }
            throw ExceptionHelper.m18251f(th3);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                return this.f50393a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50396d = true;
            m18130a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50397f = th;
            this.f50396d = true;
            m18130a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50393a.offer(obj);
            m18130a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingObservableIterator();
        throw null;
    }
}
