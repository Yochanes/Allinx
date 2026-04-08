package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f50621a;

    /* JADX INFO: compiled from: Proguard */
    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50622a;

        /* JADX INFO: renamed from: b */
        public final Object[] f50623b;

        /* JADX INFO: renamed from: c */
        public int f50624c;

        /* JADX INFO: renamed from: d */
        public boolean f50625d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f50626f;

        public FromArrayDisposable(Observer observer, Object[] objArr) {
            this.f50622a = observer;
            this.f50623b = objArr;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f50624c = this.f50623b.length;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50626f;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50626f = true;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f50625d = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f50624c == this.f50623b.length;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.f50624c;
            Object[] objArr = this.f50623b;
            if (i == objArr.length) {
                return null;
            }
            this.f50624c = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "The array element is null");
            return obj;
        }
    }

    public ObservableFromArray(Object[] objArr) {
        this.f50621a = objArr;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        Object[] objArr = this.f50621a;
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, objArr);
        observer.mo12365c(fromArrayDisposable);
        if (fromArrayDisposable.f50625d) {
            return;
        }
        int length = objArr.length;
        for (int i = 0; i < length && !fromArrayDisposable.f50626f; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                fromArrayDisposable.f50622a.onError(new NullPointerException(AbstractC0000a.m10g(i, "The element at index ", " is null")));
                return;
            }
            fromArrayDisposable.f50622a.onNext(obj);
        }
        if (fromArrayDisposable.f50626f) {
            return;
        }
        fromArrayDisposable.f50622a.onComplete();
    }
}
