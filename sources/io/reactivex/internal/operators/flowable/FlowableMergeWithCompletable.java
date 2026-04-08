package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47915a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f47916b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f47917c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f47918d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f47919f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public volatile boolean f47920g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f47921i;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final MergeWithSubscriber f47922a;

            public OtherObserver(MergeWithSubscriber mergeWithSubscriber) {
                this.f47922a = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                MergeWithSubscriber mergeWithSubscriber = this.f47922a;
                mergeWithSubscriber.f47921i = true;
                if (mergeWithSubscriber.f47920g) {
                    HalfSerializer.m17891b(mergeWithSubscriber.f47915a, mergeWithSubscriber, mergeWithSubscriber.f47918d);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithSubscriber mergeWithSubscriber = this.f47922a;
                SubscriptionHelper.m17867a(mergeWithSubscriber.f47916b);
                HalfSerializer.m17893d(mergeWithSubscriber.f47915a, th, mergeWithSubscriber, mergeWithSubscriber.f47918d);
            }
        }

        public MergeWithSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47915a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this.f47916b);
            DisposableHelper.m17615a(this.f47917c);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this.f47916b, this.f47919f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47920g = true;
            if (this.f47921i) {
                HalfSerializer.m17891b(this.f47915a, this, this.f47918d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f47916b);
            HalfSerializer.m17893d(this.f47915a, th, this, this.f47918d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.m17895f(this.f47915a, obj, this, this.f47918d);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this.f47916b, this.f47919f, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber((FlowableSubscriber) subscriber);
        subscriber.mo12367j(mergeWithSubscriber);
        this.f47628b.m17582b(mergeWithSubscriber);
        throw null;
    }
}
