package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements Disposable {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                do {
                    innerDisposableArr = andSet.get();
                    int length = innerDisposableArr.length;
                    if (length == 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (innerDisposableArr[i] == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    innerDisposableArr2 = PublishConnection.f50736a;
                    if (length != 1) {
                        innerDisposableArr2 = new InnerDisposable[length - 1];
                        System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i);
                        System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr2, i, (length - i) - 1);
                    }
                } while (!andSet.compareAndSet(innerDisposableArr, innerDisposableArr2));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public static final InnerDisposable[] f50736a = new InnerDisposable[0];

        /* JADX INFO: renamed from: b */
        public static final InnerDisposable[] f50737b = new InnerDisposable[0];

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(null, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == f50737b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            getAndSet(f50737b);
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            InnerDisposable<T>[] innerDisposableArr = get();
            if (innerDisposableArr.length <= 0) {
                return;
            }
            innerDisposableArr[0].getClass();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
