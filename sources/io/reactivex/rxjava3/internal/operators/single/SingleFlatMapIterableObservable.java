package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f51034a;

        /* JADX INFO: renamed from: b */
        public Disposable f51035b;

        /* JADX INFO: renamed from: c */
        public volatile Iterator f51036c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f51037d;

        public FlatMapIterableObserver(Observer observer) {
            this.f51034a = observer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51035b, disposable)) {
                this.f51035b = disposable;
                this.f51034a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f51036c = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51037d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51037d = true;
            this.f51035b.dispose();
            this.f51035b = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f51036c == null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51035b = DisposableHelper.f49380a;
            this.f51034a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f51034a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f51036c;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f51036c = null;
            }
            return next;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new FlatMapIterableObserver(observer);
        throw null;
    }
}
