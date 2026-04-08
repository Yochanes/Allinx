package io.reactivex.internal.functions;

import io.reactivex.Notification;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Functions {

    /* JADX INFO: renamed from: a */
    public static final Function f47559a = new Identity();

    /* JADX INFO: renamed from: b */
    public static final Runnable f47560b = new EmptyRunnable();

    /* JADX INFO: renamed from: c */
    public static final Action f47561c = null;

    /* JADX INFO: renamed from: d */
    public static final Consumer f47562d = null;

    /* JADX INFO: renamed from: e */
    public static final LongConsumer f47563e = null;

    /* JADX INFO: compiled from: Proguard */
    public static final class ActionConsumer<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Array2Func<T1, T2, R> implements Function<Object[], R> {
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
        @Override // io.reactivex.functions.Function
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
    public static final class ArrayListCapacityCallable<T> implements Callable<List<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new ArrayList(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BooleanSupplierPredicateReverse<T> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class BoundedConsumer implements Consumer<Subscription> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CastToClass<T, U> implements Function<T, U> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ClassFilter<T, U> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyLongConsumer implements LongConsumer {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualsPredicate<T> implements Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return ObjectHelper.m17627a(obj, null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m17911b((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FalsePredicate implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FutureAction implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class HashSetCallable implements Callable<Set<Object>> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ HashSetCallable[] f47564a = {new HashSetCallable("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        HashSetCallable EF5;

        public static HashSetCallable valueOf(String str) {
            return (HashSetCallable) Enum.valueOf(HashSetCallable.class, str);
        }

        public static HashSetCallable[] values() {
            return (HashSetCallable[]) f47564a.clone();
        }

        @Override // java.util.concurrent.Callable
        public final Set<Object> call() {
            return new HashSet();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JustValue<T, U> implements Callable<U>, Function<T, U> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ListSorter<T> implements Function<List<T>, List<T>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, null);
            return list;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MaxRequestSubscription implements Consumer<Subscription> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NaturalComparator implements Comparator<Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ NaturalComparator[] f47565a = {new NaturalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        NaturalComparator EF5;

        public static NaturalComparator valueOf(String str) {
            return (NaturalComparator) Enum.valueOf(NaturalComparator.class, str);
        }

        public static NaturalComparator[] values() {
            return (NaturalComparator[]) f47565a.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NaturalObjectComparator implements Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            Notification.m17587a((Throwable) obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NotificationOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            ObjectHelper.m17628b(obj, "value is null");
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NullCallable implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorMissingConsumer implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            RxJavaPlugins.m17911b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimestampFunction<T> implements Function<T, Timed<T>> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMapKeySelector<K, T> implements BiConsumer<Map<K, T>, T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, V>, T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ToMultimapKeyValueSelector<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TruePredicate implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyAction implements Action {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // io.reactivex.functions.Action
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

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Identity implements Function<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
