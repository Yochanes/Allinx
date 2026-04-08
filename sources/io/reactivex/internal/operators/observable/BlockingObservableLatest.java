package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingObservableLatestIterator();
        ObjectHelper.m17628b(null, "source is null");
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public Notification f48531b;

        /* JADX INFO: renamed from: c */
        public final Semaphore f48532c = new Semaphore(0);

        /* JADX INFO: renamed from: d */
        public final AtomicReference f48533d = new AtomicReference();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification notification = this.f48531b;
            if (notification != null && NotificationLite.m17903i(notification.f47534a)) {
                throw ExceptionHelper.m17889c(this.f48531b.m17588b());
            }
            if (this.f48531b == null) {
                try {
                    this.f48532c.acquire();
                    Notification notification2 = (Notification) this.f48533d.getAndSet(null);
                    this.f48531b = notification2;
                    if (NotificationLite.m17903i(notification2.f47534a)) {
                        throw ExceptionHelper.m17889c(notification2.m17588b());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f48531b = Notification.m17587a(e);
                    throw ExceptionHelper.m17889c(e);
                }
            }
            return this.f48531b.m17590d();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objM17589c = this.f48531b.m17589c();
            this.f48531b = null;
            return objM17589c;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48533d.getAndSet((Notification) obj) == null) {
                this.f48532c.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
