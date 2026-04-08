package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.observables.ConnectableObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableInternalHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedTimedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class MapToInt implements Function<Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ MapToInt[] f50663a = {new MapToInt("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        MapToInt EF5;

        public static MapToInt valueOf(String str) {
            return (MapToInt) Enum.valueOf(MapToInt.class, str);
        }

        public static MapToInt[] values() {
            return (MapToInt[]) f50663a.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnComplete<T> implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
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
    public static final class TimedReplayCallable<T> implements Supplier<ConnectableObservable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }
}
