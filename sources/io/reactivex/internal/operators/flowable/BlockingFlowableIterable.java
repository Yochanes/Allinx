package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
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
        public final SpscArrayQueue f47629a = new SpscArrayQueue(0);

        /* JADX INFO: renamed from: b */
        public final long f47630b = 0;

        /* JADX INFO: renamed from: c */
        public final long f47631c = 0;

        /* JADX INFO: renamed from: d */
        public final ReentrantLock f47632d;

        /* JADX INFO: renamed from: f */
        public final Condition f47633f;

        /* JADX INFO: renamed from: g */
        public long f47634g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f47635i;

        /* JADX INFO: renamed from: j */
        public Throwable f47636j;

        public BlockingFlowableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f47632d = reentrantLock;
            this.f47633f = reentrantLock.newCondition();
        }

        /* JADX INFO: renamed from: a */
        public final void m17646a() {
            ReentrantLock reentrantLock = this.f47632d;
            reentrantLock.lock();
            try {
                this.f47633f.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return SubscriptionHelper.m17870d(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.m17867a(this);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                boolean z2 = this.f47635i;
                boolean zIsEmpty = this.f47629a.isEmpty();
                if (z2) {
                    Throwable th = this.f47636j;
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
                this.f47632d.lock();
                while (!this.f47635i && this.f47629a.isEmpty()) {
                    try {
                        try {
                            this.f47633f.await();
                        } catch (InterruptedException e) {
                            run();
                            throw ExceptionHelper.m17889c(e);
                        }
                    } finally {
                        this.f47632d.unlock();
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17871e(this, subscription, this.f47630b);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objPoll = this.f47629a.poll();
            long j = this.f47634g + 1;
            if (j != this.f47631c) {
                this.f47634g = j;
                return objPoll;
            }
            this.f47634g = 0L;
            get().request(j);
            return objPoll;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47635i = true;
            m17646a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47636j = th;
            this.f47635i = true;
            m17646a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47629a.offer(obj)) {
                m17646a();
            } else {
                SubscriptionHelper.m17867a(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.m17867a(this);
            m17646a();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingFlowableIterator();
        throw null;
    }
}
