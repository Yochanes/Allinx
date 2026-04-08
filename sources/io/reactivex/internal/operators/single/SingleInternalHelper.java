package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NoSuchElementCallable implements Callable<NoSuchElementException> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ NoSuchElementCallable[] f49083a = {new NoSuchElementCallable("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoSuchElementCallable EF5;

        public static NoSuchElementCallable valueOf(String str) {
            return (NoSuchElementCallable) Enum.valueOf(NoSuchElementCallable.class, str);
        }

        public static NoSuchElementCallable[] values() {
            return (NoSuchElementCallable[]) f49083a.clone();
        }

        @Override // java.util.concurrent.Callable
        public final NoSuchElementException call() {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ToFlowable implements Function<SingleSource, Publisher> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ToFlowable[] f49084a = {new ToFlowable("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ToFlowable EF5;

        public static ToFlowable valueOf(String str) {
            return (ToFlowable) Enum.valueOf(ToFlowable.class, str);
        }

        public static ToFlowable[] values() {
            return (ToFlowable[]) f49084a.clone();
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return new SingleToFlowable((SingleSource) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToFlowableIterable<T> implements Iterable<Flowable<T>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToFlowableIterator<T> implements Iterator<Flowable<T>> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ToObservable implements Function<SingleSource, Observable> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ToObservable[] f49085a = {new ToObservable("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ToObservable EF5;

        public static ToObservable valueOf(String str) {
            return (ToObservable) Enum.valueOf(ToObservable.class, str);
        }

        public static ToObservable[] values() {
            return (ToObservable[]) f49085a.clone();
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return new SingleToObservable((SingleSource) obj);
        }
    }
}
