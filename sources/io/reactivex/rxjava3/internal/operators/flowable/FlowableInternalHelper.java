package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableInternalHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableFlowable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferedTimedReplay<T> implements Supplier<ConnectableFlowable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, Publisher<U>> {
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
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, Publisher<R>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ItemDelayFunction<T, U> implements Function<T, Publisher<T>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplaySupplier<T> implements Supplier<ConnectableFlowable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class RequestMax implements Consumer<Subscription> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ RequestMax[] f49800a = {new RequestMax("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        RequestMax EF5;

        public static RequestMax valueOf(String str) {
            return (RequestMax) Enum.valueOf(RequestMax.class, str);
        }

        public static RequestMax[] values() {
            return (RequestMax[]) f49800a.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriberOnComplete<T> implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriberOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedReplay<T> implements Supplier<ConnectableFlowable<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            throw null;
        }
    }
}
