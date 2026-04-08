package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
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
        public final SpscLinkedArrayQueue f48526a = new SpscLinkedArrayQueue(0);

        /* JADX INFO: renamed from: b */
        public final ReentrantLock f48527b;

        /* JADX INFO: renamed from: c */
        public final Condition f48528c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48529d;

        /* JADX INFO: renamed from: f */
        public Throwable f48530f;

        public BlockingObservableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f48527b = reentrantLock;
            this.f48528c = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public final void m17778a() {
            ReentrantLock reentrantLock = this.f48527b;
            reentrantLock.lock();
            try {
                this.f48528c.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                boolean z2 = this.f48529d;
                boolean zIsEmpty = this.f48526a.isEmpty();
                if (z2) {
                    Throwable th = this.f48530f;
                    if (th != null) {
                        throw ExceptionHelper.m17889c(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    this.f48527b.lock();
                    while (!this.f48529d && this.f48526a.isEmpty()) {
                        try {
                            this.f48528c.await();
                        } finally {
                        }
                    }
                    this.f48527b.unlock();
                } catch (InterruptedException e) {
                    DisposableHelper.m17615a(this);
                    m17778a();
                    throw ExceptionHelper.m17889c(e);
                }
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                return this.f48526a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48529d = true;
            m17778a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48530f = th;
            this.f48529d = true;
            m17778a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48526a.offer(obj);
            m17778a();
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
