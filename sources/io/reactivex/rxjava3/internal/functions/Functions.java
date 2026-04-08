package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Functions {

    /* JADX INFO: renamed from: a */
    public static final Function f49387a = new Identity();

    /* JADX INFO: renamed from: b */
    public static final Runnable f49388b = new EmptyRunnable();

    /* JADX INFO: renamed from: c */
    public static final Action f49389c = new EmptyAction();

    /* JADX INFO: renamed from: d */
    public static final Consumer f49390d = new EmptyConsumer();

    /* JADX INFO: renamed from: e */
    public static final Consumer f49391e = new OnErrorMissingConsumer();

    /* JADX INFO: compiled from: Proguard */
    public static final class ActionConsumer<T> implements Consumer<T> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 2) {
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array3Func<T1, T2, T3, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array4Func<T1, T2, T3, T4, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array5Func<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            Object obj10 = objArr[8];
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ArrayListCapacityCallable<T> implements Supplier<List<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new ArrayList(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BooleanSupplierPredicateReverse<T> implements Predicate<T> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BoundedConsumer implements Consumer<Subscription> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CastToClass<T, U> implements Function<T, U> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ClassFilter<T, U> implements Predicate<T> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyLongConsumer implements LongConsumer {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualsPredicate<T> implements Predicate<T> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return Objects.equals(obj, null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m18275b((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FutureAction implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class HashSetSupplier implements Supplier<Set<Object>> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ HashSetSupplier[] f49392a = {new HashSetSupplier("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        HashSetSupplier EF5;

        public static HashSetSupplier valueOf(String str) {
            return (HashSetSupplier) Enum.valueOf(HashSetSupplier.class, str);
        }

        public static HashSetSupplier[] values() {
            return (HashSetSupplier[]) f49392a.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new HashSet();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JustValue<T, U> implements Callable<U>, Supplier<U>, Function<T, U> {

        /* JADX INFO: renamed from: a */
        public final Serializable f49393a;

        public JustValue(Serializable serializable) {
            this.f49393a = serializable;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return this.f49393a;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.f49393a;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return this.f49393a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ListSorter<T> implements Function<List<T>, List<T>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, null);
            return list;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MaxRequestSubscription implements Consumer<Subscription> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NaturalComparator implements Comparator<Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ NaturalComparator[] f49394a = {new NaturalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NaturalComparator EF5;

        public static NaturalComparator valueOf(String str) {
            return (NaturalComparator) Enum.valueOf(NaturalComparator.class, str);
        }

        public static NaturalComparator[] values() {
            return (NaturalComparator[]) f49394a.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnComplete<T> implements Action {
        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            Notification.m17925a((Throwable) obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            Objects.requireNonNull(obj, "value is null");
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NullProvider implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m18275b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimestampFunction<T> implements Function<T, Timed<T>> {
        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Supplier m17963a(Serializable serializable) {
        return new JustValue(serializable);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyAction implements Action {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyRunnable implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyConsumer implements Consumer<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Identity implements Function<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
