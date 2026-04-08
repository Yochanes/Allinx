package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLast<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50867a;

        /* JADX INFO: renamed from: b */
        public Disposable f50868b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50869c;

        public TakeLastObserver(Observer observer) {
            this.f50867a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50868b, disposable)) {
                this.f50868b = disposable;
                this.f50867a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50869c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50869c) {
                return;
            }
            this.f50869c = true;
            this.f50868b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer observer = this.f50867a;
            while (!this.f50869c) {
                T tPoll = poll();
                if (tPoll == null) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50867a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (size() == 0) {
                poll();
            }
            offer(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new TakeLastObserver(observer));
    }
}
