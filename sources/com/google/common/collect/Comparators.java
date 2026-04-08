package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Comparators {
    private Comparators() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TopKSelector m14807a(int i, Comparator comparator) {
        return lambda$least$0(i, comparator);
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> greatest(int i, Comparator<? super T> comparator) {
        return least(i, comparator.reversed());
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    private static /* synthetic */ TopKSelector lambda$least$0(int i, Comparator comparator) {
        return TopKSelector.least(i, comparator);
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> least(int i, Comparator<? super T> comparator) {
        CollectPreconditions.checkNonnegative(i, "k");
        Preconditions.checkNotNull(comparator);
        return Collector.of(new C4365m(i, comparator), new C4356d(1), new C4353a(7), new C4357e(3), Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T max(T t, T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T extends Comparable<? super T>> T min(T t, T t2) {
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @ParametricNullness
    public static <T> T max(@ParametricNullness T t, @ParametricNullness T t2, Comparator<? super T> comparator) {
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @ParametricNullness
    public static <T> T min(@ParametricNullness T t, @ParametricNullness T t2, Comparator<? super T> comparator) {
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }
}
