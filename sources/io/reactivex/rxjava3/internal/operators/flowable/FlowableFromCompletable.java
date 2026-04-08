package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromCompletable<T> extends Flowable<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public Disposable f49760a;

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49760a, disposable)) {
                this.f49760a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, org.reactivestreams.Subscription
        public final void cancel() {
            this.f49760a.dispose();
            this.f49760a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f49760a = DisposableHelper.f49380a;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49760a = DisposableHelper.f49380a;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        throw null;
    }
}
