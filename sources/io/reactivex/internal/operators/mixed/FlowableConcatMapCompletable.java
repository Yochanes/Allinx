package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f48402a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48403b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final ConcatMapInnerObserver f48404c = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: d */
        public final SpscArrayQueue f48405d = new SpscArrayQueue(0);

        /* JADX INFO: renamed from: f */
        public Subscription f48406f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48407g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f48408i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f48409j;

        /* JADX INFO: renamed from: n */
        public int f48410n;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final ConcatMapCompletableObserver f48411a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.f48411a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17617c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f48411a;
                concatMapCompletableObserver.f48407g = false;
                concatMapCompletableObserver.m17764a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f48411a;
                AtomicThrowable atomicThrowable = concatMapCompletableObserver.f48403b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    concatMapCompletableObserver.f48407g = false;
                    concatMapCompletableObserver.m17764a();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f48402a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17764a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f48409j) {
                if (!this.f48407g) {
                    boolean z2 = this.f48408i;
                    boolean z3 = this.f48405d.poll() == null;
                    if (z2 && z3) {
                        AtomicThrowable atomicThrowable = this.f48403b;
                        atomicThrowable.getClass();
                        Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                        if (thM17888b != null) {
                            this.f48402a.onError(thM17888b);
                            return;
                        } else {
                            this.f48402a.onComplete();
                            return;
                        }
                    }
                    if (!z3) {
                        int i = this.f48410n + 1;
                        if (i == 0) {
                            this.f48410n = 0;
                            this.f48406f.request(0);
                        } else {
                            this.f48410n = i;
                        }
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
                            this.f48405d.clear();
                            this.f48406f.cancel();
                            AtomicThrowable atomicThrowable2 = this.f48403b;
                            atomicThrowable2.getClass();
                            ExceptionHelper.m17887a(atomicThrowable2, th);
                            AtomicThrowable atomicThrowable3 = this.f48403b;
                            atomicThrowable3.getClass();
                            this.f48402a.onError(ExceptionHelper.m17888b(atomicThrowable3));
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f48405d.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48409j;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48409j = true;
            this.f48406f.cancel();
            ConcatMapInnerObserver concatMapInnerObserver = this.f48404c;
            concatMapInnerObserver.getClass();
            DisposableHelper.m17615a(concatMapInnerObserver);
            if (getAndIncrement() == 0) {
                this.f48405d.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48406f, subscription)) {
                this.f48406f = subscription;
                this.f48402a.mo17580c(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48408i = true;
            m17764a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48403b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48408i = true;
                m17764a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48405d.offer(obj)) {
                m17764a();
            } else {
                this.f48406f.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
