package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlattenStreamAsFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlattenStreamMultiObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T>, SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49419a;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f49420b = new AtomicLong();

        /* JADX INFO: renamed from: c */
        public Disposable f49421c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator f49422d;

        /* JADX INFO: renamed from: f */
        public Stream f49423f;

        /* JADX INFO: renamed from: g */
        public boolean f49424g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49425i;

        /* JADX INFO: renamed from: j */
        public boolean f49426j;

        /* JADX INFO: renamed from: n */
        public long f49427n;

        public FlattenStreamMultiObserver(FlowableSubscriber flowableSubscriber) {
            this.f49419a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: b */
        public final void m17970b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f49419a;
            long j = this.f49427n;
            long j2 = this.f49420b.get();
            Iterator it = this.f49422d;
            int iAddAndGet = 1;
            while (true) {
                if (this.f49425i) {
                    clear();
                } else if (this.f49426j) {
                    if (it != null) {
                        flowableSubscriber.onNext(null);
                        flowableSubscriber.onComplete();
                    }
                } else if (it != null && j != j2) {
                    try {
                        Object next = it.next();
                        if (!this.f49425i) {
                            flowableSubscriber.onNext(next);
                            j++;
                            if (!this.f49425i) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f49425i && !zHasNext) {
                                        flowableSubscriber.onComplete();
                                        this.f49425i = true;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.m17950a(th);
                                    flowableSubscriber.onError(th);
                                    this.f49425i = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17950a(th2);
                        flowableSubscriber.onError(th2);
                        this.f49425i = true;
                    }
                }
                this.f49427n = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j2 = this.f49420b.get();
                if (it == null) {
                    it = this.f49422d;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49421c, disposable)) {
                this.f49421c = disposable;
                this.f49419a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49425i = true;
            this.f49421c.dispose();
            if (this.f49426j) {
                return;
            }
            m17970b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49422d = null;
            Stream stream = this.f49423f;
            this.f49423f = null;
            if (stream != null) {
                try {
                    stream.close();
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f49426j = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f49422d;
            if (it == null) {
                return true;
            }
            if (!this.f49424g || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f49419a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f49419a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49419a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49422d;
            if (it == null) {
                return null;
            }
            if (!this.f49424g) {
                this.f49424g = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this.f49420b, j);
                m17970b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlattenStreamMultiObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
