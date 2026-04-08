package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromStream<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractStreamSubscription<T> extends AtomicLong implements QueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public Iterator f49415a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49416b;

        /* JADX INFO: renamed from: c */
        public boolean f49417c;

        /* JADX INFO: renamed from: a */
        public abstract void mo17968a(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49416b = true;
            request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49415a = null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            lazySet(Long.MAX_VALUE);
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f49415a;
            if (it == null) {
                return true;
            }
            if (!this.f49417c || it.hasNext()) {
                return false;
            }
            this.f49415a = null;
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49415a;
            if (it == null) {
                return null;
            }
            if (!this.f49417c) {
                this.f49417c = true;
            } else if (!it.hasNext()) {
                this.f49415a = null;
                return null;
            }
            Object next = this.f49415a.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j) && BackpressureHelper.m18237a(this, j) == 0) {
                mo17968a(j);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StreamConditionalSubscription<T> extends AbstractStreamSubscription<T> {
        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.AbstractStreamSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17968a(long j) {
            Iterator it = this.f49415a;
            if (this.f49416b) {
                this.f49415a = null;
                return;
            }
            try {
                Objects.requireNonNull(it.next(), "The Stream's Iterator returned a null value");
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StreamSubscription<T> extends AbstractStreamSubscription<T> {
        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.AbstractStreamSubscription
        /* JADX INFO: renamed from: a */
        public final void mo17968a(long j) {
            Iterator it = this.f49415a;
            if (this.f49416b) {
                this.f49415a = null;
                return;
            }
            try {
                Objects.requireNonNull(it.next(), "The Stream's Iterator returned a null value");
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        FlowableSubscriber flowableSubscriber = (FlowableSubscriber) subscriber;
        try {
            throw null;
        } finally {
            try {
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
            }
        }
    }
}
