package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingObservableLatestIterator();
        Objects.requireNonNull((Object) null, "source is null");
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public Notification f50398b;

        /* JADX INFO: renamed from: c */
        public final Semaphore f50399c = new Semaphore(0);

        /* JADX INFO: renamed from: d */
        public final AtomicReference f50400d = new AtomicReference();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification notification = this.f50398b;
            if (notification != null && NotificationLite.m18265i(notification.f49362a)) {
                throw ExceptionHelper.m18251f(this.f50398b.m17926b());
            }
            if (this.f50398b == null) {
                try {
                    this.f50399c.acquire();
                    Notification notification2 = (Notification) this.f50400d.getAndSet(null);
                    this.f50398b = notification2;
                    if (NotificationLite.m18265i(notification2.f49362a)) {
                        throw ExceptionHelper.m18251f(notification2.m17926b());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f50398b = Notification.m17925a(e);
                    throw ExceptionHelper.m18251f(e);
                }
            }
            return this.f50398b.m17929e();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objM17927c = this.f50398b.m17927c();
            this.f50398b = null;
            return objM17927c;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            RxJavaPlugins.m18275b(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50400d.getAndSet((Notification) obj) == null) {
                this.f50399c.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }
    }
}
