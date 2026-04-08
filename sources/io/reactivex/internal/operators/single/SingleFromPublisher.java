package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Subscription f49078a;

        /* JADX INFO: renamed from: b */
        public Object f49079b;

        /* JADX INFO: renamed from: c */
        public boolean f49080c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49081d;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49081d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49081d = true;
            this.f49078a.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f49078a, subscription)) {
                this.f49078a = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49080c) {
                return;
            }
            this.f49080c = true;
            this.f49079b = null;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49080c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49080c = true;
                this.f49079b = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49080c) {
                return;
            }
            if (this.f49079b == null) {
                this.f49079b = obj;
                return;
            }
            this.f49078a.cancel();
            this.f49080c = true;
            this.f49079b = null;
            new IndexOutOfBoundsException("Too many elements in the Publisher");
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
