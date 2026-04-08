package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new LatestSubscriberIterator();
        int i = Flowable.f49359a;
        Objects.requireNonNull((Object) null, "publisher is null");
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LatestSubscriberIterator<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public final Semaphore f49564b = new Semaphore(0);

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49565c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public Notification f49566d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification notification = this.f49566d;
            if (notification != null && NotificationLite.m18265i(notification.f49362a)) {
                throw ExceptionHelper.m18251f(this.f49566d.m17926b());
            }
            Notification notification2 = this.f49566d;
            if ((notification2 == null || notification2.m17929e()) && this.f49566d == null) {
                try {
                    this.f49564b.acquire();
                    Notification notification3 = (Notification) this.f49565c.getAndSet(null);
                    this.f49566d = notification3;
                    if (NotificationLite.m18265i(notification3.f49362a)) {
                        throw ExceptionHelper.m18251f(notification3.m17926b());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f49566d = Notification.m17925a(e);
                    throw ExceptionHelper.m18251f(e);
                }
            }
            return this.f49566d.m17929e();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext() || !this.f49566d.m17929e()) {
                throw new NoSuchElementException();
            }
            Object objM17927c = this.f49566d.m17927c();
            this.f49566d = null;
            return objM17927c;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            RxJavaPlugins.m18275b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49565c.getAndSet((Notification) obj) == null) {
                this.f49564b.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
