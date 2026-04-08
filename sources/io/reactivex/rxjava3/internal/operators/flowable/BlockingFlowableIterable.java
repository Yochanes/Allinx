package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BlockingFlowableIterator<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final SpscArrayQueue f49556a = new SpscArrayQueue(0);

        /* JADX INFO: renamed from: b */
        public final long f49557b = 0;

        /* JADX INFO: renamed from: c */
        public final long f49558c = 0;

        /* JADX INFO: renamed from: d */
        public final ReentrantLock f49559d;

        /* JADX INFO: renamed from: f */
        public final Condition f49560f;

        /* JADX INFO: renamed from: g */
        public long f49561g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49562i;

        /* JADX INFO: renamed from: j */
        public volatile Throwable f49563j;

        public BlockingFlowableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f49559d = reentrantLock;
            this.f49560f = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public final void m17988a() {
            ReentrantLock reentrantLock = this.f49559d;
            reentrantLock.lock();
            try {
                this.f49560f.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == SubscriptionHelper.f51214a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.m18221a(this);
            m17988a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!mo12353d()) {
                boolean z2 = this.f49562i;
                boolean zIsEmpty = this.f49556a.isEmpty();
                if (z2) {
                    Throwable th = this.f49563j;
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
                this.f49559d.lock();
                while (!this.f49562i && this.f49556a.isEmpty() && !mo12353d()) {
                    try {
                        try {
                            this.f49560f.await();
                        } catch (InterruptedException e) {
                            run();
                            throw ExceptionHelper.m18251f(e);
                        }
                    } finally {
                        this.f49559d.unlock();
                    }
                }
            }
            Throwable th2 = this.f49563j;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.m18251f(th2);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18224d(this, subscription, this.f49557b);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objPoll = this.f49556a.poll();
            long j = this.f49561g + 1;
            if (j != this.f49558c) {
                this.f49561g = j;
                return objPoll;
            }
            this.f49561g = 0L;
            get().request(j);
            return objPoll;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49562i = true;
            m17988a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49563j = th;
            this.f49562i = true;
            m17988a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49556a.offer(obj)) {
                m17988a();
            } else {
                SubscriptionHelper.m18221a(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.m18221a(this);
            m17988a();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingFlowableIterator();
        throw null;
    }
}
