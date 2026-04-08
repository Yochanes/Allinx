package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class NextIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final NextObserver f48536a;

        /* JADX INFO: renamed from: b */
        public Object f48537b;

        /* JADX INFO: renamed from: c */
        public boolean f48538c = true;

        /* JADX INFO: renamed from: d */
        public boolean f48539d = true;

        /* JADX INFO: renamed from: f */
        public Throwable f48540f;

        /* JADX INFO: renamed from: g */
        public boolean f48541g;

        public NextIterator(NextObserver nextObserver) {
            this.f48536a = nextObserver;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.f48540f;
            if (th != null) {
                throw ExceptionHelper.m17889c(th);
            }
            if (!this.f48538c) {
                return false;
            }
            if (!this.f48539d) {
                return true;
            }
            boolean z2 = this.f48541g;
            NextObserver nextObserver = this.f48536a;
            AtomicInteger atomicInteger = nextObserver.f48543c;
            if (!z2) {
                this.f48541g = true;
                atomicInteger.set(1);
                new ObservableMaterialize().mo17591a(nextObserver);
            }
            try {
                atomicInteger.set(1);
                Notification notification = (Notification) nextObserver.f48542b.take();
                if (notification.m17590d()) {
                    this.f48539d = false;
                    this.f48537b = notification.m17589c();
                    return true;
                }
                this.f48538c = false;
                if (notification.f47534a == null) {
                    return false;
                }
                Throwable thM17588b = notification.m17588b();
                this.f48540f = thM17588b;
                throw ExceptionHelper.m17889c(thM17588b);
            } catch (InterruptedException e) {
                nextObserver.dispose();
                this.f48540f = e;
                throw ExceptionHelper.m17889c(e);
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            Throwable th = this.f48540f;
            if (th != null) {
                throw ExceptionHelper.m17889c(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f48539d = true;
            return this.f48537b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new NextIterator(new NextObserver());
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NextObserver<T> extends DisposableObserver<Notification<T>> {

        /* JADX INFO: renamed from: b */
        public final ArrayBlockingQueue f48542b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f48543c = new AtomicInteger();

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f48543c.getAndSet(0) != 1 && notification.m17590d()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f48542b;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.m17590d()) {
                    notification = notification2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
