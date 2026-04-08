package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f51044a;

        /* JADX INFO: renamed from: b */
        public Object f51045b;

        /* JADX INFO: renamed from: c */
        public boolean f51046c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f51047d;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51047d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51047d = true;
            this.f51044a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f51044a, subscription)) {
                this.f51044a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f51046c) {
                return;
            }
            this.f51046c = true;
            this.f51045b = null;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f51046c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f51046c = true;
                this.f51045b = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f51046c) {
                return;
            }
            if (this.f51045b == null) {
                this.f51045b = obj;
                return;
            }
            this.f51044a.cancel();
            this.f51046c = true;
            this.f51045b = null;
            new IndexOutOfBoundsException("Too many elements in the Publisher");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
