package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
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
        public final CompletableObserver f49501a;

        /* JADX INFO: renamed from: f */
        public int f49505f;

        /* JADX INFO: renamed from: g */
        public int f49506g;

        /* JADX INFO: renamed from: i */
        public SimpleQueue f49507i;

        /* JADX INFO: renamed from: j */
        public Subscription f49508j;

        /* JADX INFO: renamed from: n */
        public volatile boolean f49509n;

        /* JADX INFO: renamed from: o */
        public volatile boolean f49510o;

        /* JADX INFO: renamed from: c */
        public final ConcatInnerObserver f49503c = new ConcatInnerObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f49504d = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final int f49502b = 0;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final CompletableConcatSubscriber f49511a;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.f49511a = completableConcatSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                CompletableConcatSubscriber completableConcatSubscriber = this.f49511a;
                completableConcatSubscriber.f49510o = false;
                completableConcatSubscriber.m17983a();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                CompletableConcatSubscriber completableConcatSubscriber = this.f49511a;
                if (!completableConcatSubscriber.f49504d.compareAndSet(false, true)) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    completableConcatSubscriber.f49508j.cancel();
                    completableConcatSubscriber.f49501a.onError(th);
                }
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver) {
            this.f49501a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17983a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!mo12353d()) {
                if (!this.f49510o) {
                    boolean z2 = this.f49509n;
                    try {
                        CompletableSource completableSource = (CompletableSource) this.f49507i.poll();
                        boolean z3 = completableSource == null;
                        if (z2 && z3) {
                            this.f49501a.onComplete();
                            return;
                        }
                        if (!z3) {
                            this.f49510o = true;
                            completableSource.mo12368a(this.f49503c);
                            if (this.f49505f != 1) {
                                int i = this.f49506g + 1;
                                if (i == this.f49502b) {
                                    this.f49506g = 0;
                                    this.f49508j.request(i);
                                } else {
                                    this.f49506g = i;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        if (!this.f49504d.compareAndSet(false, true)) {
                            RxJavaPlugins.m18275b(th);
                            return;
                        } else {
                            this.f49508j.cancel();
                            this.f49501a.onError(th);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(this.f49503c.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49508j.cancel();
            DisposableHelper.m17952a(this.f49503c);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49508j, subscription)) {
                this.f49508j = subscription;
                long j = 0;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iMo17962e = queueSubscription.mo17962e(3);
                    if (iMo17962e == 1) {
                        this.f49505f = iMo17962e;
                        this.f49507i = queueSubscription;
                        this.f49509n = true;
                        this.f49501a.mo12363c(this);
                        m17983a();
                        return;
                    }
                    if (iMo17962e == 2) {
                        this.f49505f = iMo17962e;
                        this.f49507i = queueSubscription;
                        this.f49501a.mo12363c(this);
                        subscription.request(j);
                        return;
                    }
                }
                this.f49507i = new SpscArrayQueue(0);
                this.f49501a.mo12363c(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49509n = true;
            m17983a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!this.f49504d.compareAndSet(false, true)) {
                RxJavaPlugins.m18275b(th);
            } else {
                DisposableHelper.m17952a(this.f49503c);
                this.f49501a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.f49505f != 0 || this.f49507i.offer(completableSource)) {
                m17983a();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new CompletableConcatSubscriber(completableObserver);
        throw null;
    }
}
