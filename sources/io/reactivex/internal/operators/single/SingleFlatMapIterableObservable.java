package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f49070a;

        /* JADX INFO: renamed from: b */
        public Disposable f49071b;

        /* JADX INFO: renamed from: c */
        public volatile Iterator f49072c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f49073d;

        public FlatMapIterableObserver(Observer observer) {
            this.f49070a = observer;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49071b, disposable)) {
                this.f49071b = disposable;
                this.f49070a.mo17593c(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f49072c = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49073d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49073d = true;
            this.f49071b.dispose();
            this.f49071b = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f49072c == null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49071b = DisposableHelper.f47552a;
            this.f49070a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49070a.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49072c;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            ObjectHelper.m17628b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f49072c = null;
            }
            return next;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new FlatMapIterableObserver(observer);
        throw null;
    }
}
