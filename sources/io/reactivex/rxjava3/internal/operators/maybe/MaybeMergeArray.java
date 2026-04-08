package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {

        /* JADX INFO: renamed from: a */
        public int f50244a;

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = super.poll();
            if (objPoll != null) {
                this.f50244a++;
            }
            return objPoll;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public volatile boolean f50245a;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f50245a) {
                return;
            }
            this.f50245a = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(null, j);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {

        /* JADX INFO: renamed from: a */
        public int f50246a;

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            T t;
            int i = this.f50246a;
            if (i == length()) {
                t = null;
            } else {
                t = get(i);
                t.getClass();
                this.f50246a = i + 1;
                lazySet(i, null);
            }
            if (t != null) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            Objects.requireNonNull(obj, "value is null");
            throw null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.f50246a;
            if (i == length()) {
                return null;
            }
            T t = get(i);
            t.getClass();
            this.f50246a = i + 1;
            lazySet(i, null);
            return t;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
