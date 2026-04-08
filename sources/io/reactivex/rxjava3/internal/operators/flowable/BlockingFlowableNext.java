package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class NextIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final NextSubscriber f49569a;

        /* JADX INFO: renamed from: b */
        public Object f49570b;

        /* JADX INFO: renamed from: c */
        public boolean f49571c = true;

        /* JADX INFO: renamed from: d */
        public boolean f49572d = true;

        /* JADX INFO: renamed from: f */
        public Throwable f49573f;

        /* JADX INFO: renamed from: g */
        public boolean f49574g;

        public NextIterator(NextSubscriber nextSubscriber) {
            this.f49569a = nextSubscriber;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.f49573f;
            if (th != null) {
                throw ExceptionHelper.m18251f(th);
            }
            if (this.f49571c) {
                if (!this.f49572d) {
                    return true;
                }
                NextSubscriber nextSubscriber = this.f49569a;
                try {
                    boolean z2 = this.f49574g;
                    AtomicInteger atomicInteger = nextSubscriber.f49576c;
                    if (!z2) {
                        this.f49574g = true;
                        atomicInteger.set(1);
                        int i = Flowable.f49359a;
                        Objects.requireNonNull((Object) null, "publisher is null");
                        throw null;
                    }
                    atomicInteger.set(1);
                    Notification notification = (Notification) nextSubscriber.f49575b.take();
                    if (notification.m17929e()) {
                        this.f49572d = false;
                        this.f49570b = notification.m17927c();
                        return true;
                    }
                    this.f49571c = false;
                    if (!notification.m17928d()) {
                        Throwable thM17926b = notification.m17926b();
                        this.f49573f = thM17926b;
                        throw ExceptionHelper.m18251f(thM17926b);
                    }
                } catch (InterruptedException e) {
                    nextSubscriber.dispose();
                    this.f49573f = e;
                    throw ExceptionHelper.m18251f(e);
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Throwable th = this.f49573f;
            if (th != null) {
                throw ExceptionHelper.m18251f(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f49572d = true;
            return this.f49570b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new NextIterator(new NextSubscriber());
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {

        /* JADX INFO: renamed from: b */
        public final ArrayBlockingQueue f49575b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f49576c = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            RxJavaPlugins.m18275b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f49576c.getAndSet(0) != 1 && notification.m17929e()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f49575b;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.m17929e()) {
                    notification = notification2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
