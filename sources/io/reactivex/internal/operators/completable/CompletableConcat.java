package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableConcat extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47593a;

        /* JADX INFO: renamed from: f */
        public int f47597f;

        /* JADX INFO: renamed from: g */
        public int f47598g;

        /* JADX INFO: renamed from: i */
        public SimpleQueue f47599i;

        /* JADX INFO: renamed from: j */
        public Subscription f47600j;

        /* JADX INFO: renamed from: n */
        public volatile boolean f47601n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f47602o;

        /* JADX INFO: renamed from: c */
        public final ConcatInnerObserver f47595c = new ConcatInnerObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f47596d = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final int f47594b = 0;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final CompletableConcatSubscriber f47603a;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.f47603a = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                CompletableConcatSubscriber completableConcatSubscriber = this.f47603a;
                completableConcatSubscriber.f47602o = false;
                completableConcatSubscriber.m17643a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                CompletableConcatSubscriber completableConcatSubscriber = this.f47603a;
                if (!completableConcatSubscriber.f47596d.compareAndSet(false, true)) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    completableConcatSubscriber.f47600j.cancel();
                    completableConcatSubscriber.f47593a.onError(th);
                }
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver) {
            this.f47593a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17643a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!mo17596d()) {
                if (!this.f47602o) {
                    boolean z2 = this.f47601n;
                    try {
                        CompletableSource completableSource = (CompletableSource) this.f47599i.poll();
                        boolean z3 = completableSource == null;
                        if (z2 && z3) {
                            if (this.f47596d.compareAndSet(false, true)) {
                                this.f47593a.onComplete();
                                return;
                            }
                            return;
                        } else if (!z3) {
                            this.f47602o = true;
                            completableSource.mo17578a(this.f47595c);
                            if (this.f47597f != 1) {
                                int i = this.f47598g + 1;
                                if (i == this.f47594b) {
                                    this.f47598g = 0;
                                    this.f47600j.request(i);
                                } else {
                                    this.f47598g = i;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.m17612a(th);
                        if (!this.f47596d.compareAndSet(false, true)) {
                            RxJavaPlugins.m17911b(th);
                            return;
                        } else {
                            this.f47600j.cancel();
                            this.f47593a.onError(th);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(this.f47595c.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47600j.cancel();
            DisposableHelper.m17615a(this.f47595c);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47600j, subscription)) {
                this.f47600j = subscription;
                long j = 0;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17626e = queueSubscription.mo17626e(3);
                    if (iMo17626e == 1) {
                        this.f47597f = iMo17626e;
                        this.f47599i = queueSubscription;
                        this.f47601n = true;
                        this.f47593a.mo17580c(this);
                        m17643a();
                        return;
                    }
                    if (iMo17626e == 2) {
                        this.f47597f = iMo17626e;
                        this.f47599i = queueSubscription;
                        this.f47593a.mo17580c(this);
                        subscription.request(j);
                        return;
                    }
                }
                this.f47599i = new SpscArrayQueue(0);
                this.f47593a.mo17580c(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47601n = true;
            m17643a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!this.f47596d.compareAndSet(false, true)) {
                RxJavaPlugins.m17911b(th);
            } else {
                DisposableHelper.m17615a(this.f47595c);
                this.f47593a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.f47597f != 0 || this.f47599i.offer(completableSource)) {
                m17643a();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new CompletableConcatSubscriber(completableObserver);
        throw null;
    }
}
