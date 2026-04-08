package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NoSuchElementSupplier implements Supplier<NoSuchElementException> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ NoSuchElementSupplier[] f51049a = {new NoSuchElementSupplier("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NoSuchElementSupplier EF5;

        public static NoSuchElementSupplier valueOf(String str) {
            return (NoSuchElementSupplier) Enum.valueOf(NoSuchElementSupplier.class, str);
        }

        public static NoSuchElementSupplier[] values() {
            return (NoSuchElementSupplier[]) f51049a.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ToFlowable implements Function<SingleSource, Publisher> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ToFlowable[] f51050a = {new ToFlowable("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        ToFlowable EF5;

        public static ToFlowable valueOf(String str) {
            return (ToFlowable) Enum.valueOf(ToFlowable.class, str);
        }

        public static ToFlowable[] values() {
            return (ToFlowable[]) f51050a.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Function
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
}
