package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLast<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48908a;

        /* JADX INFO: renamed from: b */
        public Disposable f48909b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48910c;

        public TakeLastObserver(Observer observer) {
            this.f48908a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48909b, disposable)) {
                this.f48909b = disposable;
                this.f48908a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48910c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48910c) {
                return;
            }
            this.f48910c = true;
            this.f48909b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer observer = this.f48908a;
            while (!this.f48910c) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f48910c) {
                        return;
                    }
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48908a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (size() == 0) {
                poll();
            }
            offer(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new TakeLastObserver(observer);
        throw null;
    }
}
