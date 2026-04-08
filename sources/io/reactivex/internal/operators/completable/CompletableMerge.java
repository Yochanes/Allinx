package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMerge extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47615a;

        /* JADX INFO: renamed from: d */
        public Subscription f47618d;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f47617c = new CompositeDisposable();

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f47616b = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public MergeInnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo17596d() {
                return DisposableHelper.m17616b(get());
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.m17615a(this);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                completableMergeSubscriber.f47617c.mo17606c(this);
                if (completableMergeSubscriber.decrementAndGet() != 0) {
                    completableMergeSubscriber.f47618d.request(1L);
                    return;
                }
                Throwable th = completableMergeSubscriber.f47616b.get();
                CompletableObserver completableObserver = completableMergeSubscriber.f47615a;
                if (th != null) {
                    completableObserver.onError(th);
                } else {
                    completableObserver.onComplete();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                CompositeDisposable compositeDisposable = completableMergeSubscriber.f47617c;
                compositeDisposable.mo17606c(this);
                completableMergeSubscriber.f47618d.cancel();
                compositeDisposable.dispose();
                AtomicThrowable atomicThrowable = completableMergeSubscriber.f47616b;
                atomicThrowable.getClass();
                if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                    RxJavaPlugins.m17911b(th);
                } else if (completableMergeSubscriber.getAndSet(0) > 0) {
                    completableMergeSubscriber.f47615a.onError(ExceptionHelper.m17888b(atomicThrowable));
                }
            }
        }

        public CompletableMergeSubscriber(CompletableObserver completableObserver) {
            this.f47615a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47617c.f47546b;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47618d.cancel();
            this.f47617c.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47618d, subscription)) {
                this.f47618d = subscription;
                this.f47615a.mo17580c(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.f47616b;
                Throwable th = atomicThrowable.get();
                CompletableObserver completableObserver = this.f47615a;
                if (th == null) {
                    completableObserver.onComplete();
                } else {
                    atomicThrowable.getClass();
                    completableObserver.onError(ExceptionHelper.m17888b(atomicThrowable));
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47617c.dispose();
            AtomicThrowable atomicThrowable = this.f47616b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
            } else if (getAndSet(0) > 0) {
                this.f47615a.onError(ExceptionHelper.m17888b(atomicThrowable));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.f47617c.mo17605b(mergeInnerObserver);
            ((CompletableSource) obj).mo17578a(mergeInnerObserver);
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new CompletableMergeSubscriber(completableObserver);
        throw null;
    }
}
