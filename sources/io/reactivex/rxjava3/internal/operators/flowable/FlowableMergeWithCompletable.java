package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
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
        public final FlowableSubscriber f49822a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49823b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f49824c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f49825d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f49826f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public volatile boolean f49827g;

        /* JADX INFO: renamed from: i */
        public volatile boolean f49828i;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final MergeWithSubscriber f49829a;

            public OtherObserver(MergeWithSubscriber mergeWithSubscriber) {
                this.f49829a = mergeWithSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                MergeWithSubscriber mergeWithSubscriber = this.f49829a;
                mergeWithSubscriber.f49828i = true;
                if (mergeWithSubscriber.f49827g) {
                    HalfSerializer.m18253b(mergeWithSubscriber.f49822a, mergeWithSubscriber, mergeWithSubscriber.f49825d);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithSubscriber mergeWithSubscriber = this.f49829a;
                SubscriptionHelper.m18221a(mergeWithSubscriber.f49823b);
                HalfSerializer.m18255d(mergeWithSubscriber.f49822a, th, mergeWithSubscriber, mergeWithSubscriber.f49825d);
            }
        }

        public MergeWithSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49822a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f49823b);
            DisposableHelper.m17952a(this.f49824c);
            this.f49825d.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f49823b, this.f49826f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49827g = true;
            if (this.f49828i) {
                HalfSerializer.m18253b(this.f49822a, this, this.f49825d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f49824c);
            HalfSerializer.m18255d(this.f49822a, th, this, this.f49825d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.m18257f(this.f49822a, obj, this, this.f49825d);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f49823b, this.f49826f, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new MergeWithSubscriber((FlowableSubscriber) subscriber));
        throw null;
    }
}
