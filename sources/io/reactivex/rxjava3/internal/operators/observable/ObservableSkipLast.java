package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkipLast<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50835a;

        /* JADX INFO: renamed from: b */
        public Disposable f50836b;

        public SkipLastObserver(Observer observer) {
            super(0);
            this.f50835a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50836b, disposable)) {
                this.f50836b = disposable;
                this.f50835a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50836b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50836b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50835a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50835a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (size() == 0) {
                this.f50835a.onNext(poll());
            }
            offer(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new SkipLastObserver(observer));
    }
}
