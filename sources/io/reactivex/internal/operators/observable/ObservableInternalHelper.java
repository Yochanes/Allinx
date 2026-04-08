package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableInternalHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedTimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class MapToInt implements Function<Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ MapToInt[] f48731a = {new MapToInt("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        MapToInt EF5;

        public static MapToInt valueOf(String str) {
            return (MapToInt) Enum.valueOf(MapToInt.class, str);
        }

        public static MapToInt[] values() {
            return (MapToInt[]) f48731a.clone();
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayFunction<T, R> implements Function<Observable<T>, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipIterableFunction<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            int i = Flowable.f47532a;
            ObjectHelper.m17628b(null, "zipper is null");
            throw null;
        }
    }
}
