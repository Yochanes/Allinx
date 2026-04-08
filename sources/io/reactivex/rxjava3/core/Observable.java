package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.core.Observable$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59701 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49363a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f49363a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49363a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49363a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49363a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static ObservableJust m17930f(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new ObservableJust(obj);
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    /* JADX INFO: renamed from: a */
    public final void mo17931a(Observer observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            mo12361h(observer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public final LambdaObserver m17932b(Consumer consumer, Consumer consumer2) {
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2);
        mo17931a(lambdaObserver);
        return lambdaObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final Observable m17933e(Function function, int i) {
        int i2 = Flowable.f49359a;
        ObjectHelper.m17964a(i, "maxConcurrency");
        ObjectHelper.m17964a(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableFlatMap(this, function, i, i2);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? ObservableEmpty.f50572a : ObservableScalarXMap.m18179a(obj, function);
    }

    /* JADX INFO: renamed from: g */
    public final ObservableObserveOn m17934g(Scheduler scheduler) {
        int i = Flowable.f49359a;
        ObjectHelper.m17964a(i, "bufferSize");
        return new ObservableObserveOn(this, scheduler, i);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo12361h(Observer observer);
}
