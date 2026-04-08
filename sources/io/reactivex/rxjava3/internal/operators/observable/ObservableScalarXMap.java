package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableScalarXMap {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f50794a;

        /* JADX INFO: renamed from: b */
        public final Object f50795b;

        public ScalarDisposable(Observer observer, Object obj) {
            this.f50794a = observer;
            this.f50795b = obj;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f50795b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                Object obj = this.f50795b;
                Observer observer = this.f50794a;
                observer.onNext(obj);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarXMapObservable<T, R> extends Observable<R> {

        /* JADX INFO: renamed from: a */
        public final Object f50796a;

        /* JADX INFO: renamed from: b */
        public final Function f50797b;

        public ScalarXMapObservable(Object obj, Function function) {
            this.f50796a = obj;
            this.f50797b = function;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        /* JADX INFO: renamed from: h */
        public final void mo12361h(Observer observer) {
            try {
                Object objApply = this.f50797b.apply(this.f50796a);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objApply;
                if (!(observableSource instanceof Supplier)) {
                    observableSource.mo17931a(observer);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj == null) {
                        EmptyDisposable.m17957a(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj);
                    observer.mo12365c(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    EmptyDisposable.m17960f(th, observer);
                }
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                EmptyDisposable.m17960f(th2, observer);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Observable m18179a(Object obj, Function function) {
        return new ScalarXMapObservable(obj, function);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18180b(ObservableSource observableSource, Observer observer, Function function) {
        if (!(observableSource instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observableSource).get();
            if (obj == null) {
                EmptyDisposable.m17957a(observer);
                return true;
            }
            try {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objApply;
                if (!(observableSource2 instanceof Supplier)) {
                    observableSource2.mo17931a(observer);
                    return true;
                }
                try {
                    Object obj2 = ((Supplier) observableSource2).get();
                    if (obj2 == null) {
                        EmptyDisposable.m17957a(observer);
                        return true;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj2);
                    observer.mo12365c(scalarDisposable);
                    scalarDisposable.run();
                    return true;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    EmptyDisposable.m17960f(th, observer);
                    return true;
                }
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                EmptyDisposable.m17960f(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.m17950a(th3);
            EmptyDisposable.m17960f(th3, observer);
            return true;
        }
    }
}
