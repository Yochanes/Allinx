package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {

        /* JADX INFO: renamed from: a */
        public int f48358a;

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = super.poll();
            if (objPoll != null) {
                this.f48358a++;
            }
            return objPoll;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48359a;

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f48359a) {
                return;
            }
            this.f48359a = true;
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {

        /* JADX INFO: renamed from: a */
        public int f48360a;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            T t;
            int i = this.f48360a;
            if (i == length()) {
                t = null;
            } else {
                t = get(i);
                t.getClass();
                this.f48360a = i + 1;
                lazySet(i, null);
            }
            if (t != null) {
                throw null;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(Object obj) {
            ObjectHelper.m17628b(obj, "value is null");
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            int i = this.f48360a;
            if (i == length()) {
                return null;
            }
            T t = get(i);
            t.getClass();
            this.f48360a = i + 1;
            lazySet(i, null);
            return t;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }
}
