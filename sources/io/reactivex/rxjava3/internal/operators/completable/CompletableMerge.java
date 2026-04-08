package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMerge extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49527a;

        /* JADX INFO: renamed from: d */
        public Subscription f49530d;

        /* JADX INFO: renamed from: c */
        public final CompositeDisposable f49529c = new CompositeDisposable();

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f49528b = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public MergeInnerObserver() {
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            /* JADX INFO: renamed from: d */
            public final boolean mo12353d() {
                return DisposableHelper.m17953b(get());
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.m17952a(this);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                completableMergeSubscriber.f49529c.mo17944c(this);
                if (completableMergeSubscriber.decrementAndGet() == 0) {
                    completableMergeSubscriber.f49528b.m18233c(completableMergeSubscriber.f49527a);
                } else {
                    completableMergeSubscriber.f49530d.request(1L);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                CompositeDisposable compositeDisposable = completableMergeSubscriber.f49529c;
                compositeDisposable.mo17944c(this);
                completableMergeSubscriber.f49530d.cancel();
                compositeDisposable.dispose();
                AtomicThrowable atomicThrowable = completableMergeSubscriber.f49528b;
                if (!atomicThrowable.m18231a(th) || completableMergeSubscriber.getAndSet(0) <= 0) {
                    return;
                }
                atomicThrowable.m18233c(completableMergeSubscriber.f49527a);
            }
        }

        public CompletableMergeSubscriber(CompletableObserver completableObserver) {
            this.f49527a = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49529c.f49374b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49530d.cancel();
            this.f49529c.dispose();
            this.f49528b.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49530d, subscription)) {
                this.f49530d = subscription;
                this.f49527a.mo12363c(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f49528b.m18233c(this.f49527a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49529c.dispose();
            AtomicThrowable atomicThrowable = this.f49528b;
            if (!atomicThrowable.m18231a(th) || getAndSet(0) <= 0) {
                return;
            }
            atomicThrowable.m18233c(this.f49527a);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.f49529c.mo17943b(mergeInnerObserver);
            ((CompletableSource) obj).mo12368a(mergeInnerObserver);
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new CompletableMergeSubscriber(completableObserver);
        throw null;
    }
}
