package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class CollectCollectors {
    private static final Collector<Object, ?, ImmutableList<Object>> TO_IMMUTABLE_LIST = Collector.of(new C4355c(4), new C4356d(4), new C4353a(12), new C4357e(9), new Collector.Characteristics[0]);
    private static final Collector<Object, ?, ImmutableSet<Object>> TO_IMMUTABLE_SET = Collector.of(new C4355c(6), new C4356d(5), new C4353a(13), new C4357e(10), new Collector.Characteristics[0]);

    @GwtIncompatible
    private static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> TO_IMMUTABLE_RANGE_SET = Collector.of(new C4355c(7), new C4356d(6), new C4353a(11), new C4357e(8), new Collector.Characteristics[0]);

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static class EnumMapAccumulator<K extends Enum<K>, V> {

        @CheckForNull
        private EnumMap<K, V> map = null;
        private final BinaryOperator<V> mergeFunction;

        public EnumMapAccumulator(BinaryOperator<V> binaryOperator) {
            this.mergeFunction = binaryOperator;
        }

        public EnumMapAccumulator<K, V> combine(EnumMapAccumulator<K, V> enumMapAccumulator) {
            if (this.map == null) {
                return enumMapAccumulator;
            }
            EnumMap<K, V> enumMap = enumMapAccumulator.map;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new C4364l(this));
            return this;
        }

        public void put(K k, V v) {
            EnumMap<K, V> enumMap = this.map;
            if (enumMap == null) {
                this.map = new EnumMap<>(Collections.singletonMap(k, v));
            } else {
                enumMap.merge(k, v, this.mergeFunction);
            }
        }

        public ImmutableMap<K, V> toImmutableMap() {
            EnumMap<K, V> enumMap = this.map;
            return enumMap == null ? ImmutableMap.m14843of() : ImmutableEnumMap.asImmutable(enumMap);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static final class EnumSetAccumulator<E extends Enum<E>> {
        static final Collector<Enum<?>, ?, ImmutableSet<? extends Enum<?>>> TO_IMMUTABLE_ENUM_SET = CollectCollectors.access$000();

        @CheckForNull
        private EnumSet<E> set;

        private EnumSetAccumulator() {
        }

        public void add(E e) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                this.set = EnumSet.of((Enum) e);
            } else {
                enumSet.add(e);
            }
        }

        public EnumSetAccumulator<E> combine(EnumSetAccumulator<E> enumSetAccumulator) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return enumSetAccumulator;
            }
            EnumSet<E> enumSet2 = enumSetAccumulator.set;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        public ImmutableSet<E> toImmutableSet() {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return ImmutableSet.m14872of();
            }
            ImmutableSet<E> immutableSetAsImmutable = ImmutableEnumSet.asImmutable(enumSet);
            this.set = null;
            return immutableSetAsImmutable;
        }

        public /* synthetic */ EnumSetAccumulator(C41761 c41761) {
            this();
        }
    }

    private CollectCollectors() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ EnumMapAccumulator m14779A(BinaryOperator binaryOperator) {
        return lambda$toImmutableEnumMap$15(binaryOperator);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Multimap m14780B(Multimap multimap, Multimap multimap2) {
        return lambda$flatteningToMultimap$27(multimap, multimap2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Stream m14781a(Function function, Object obj) {
        return lambda$flatteningToImmutableListMultimap$20(function, obj);
    }

    public static /* synthetic */ Collector access$000() {
        return toImmutableEnumSetGeneric();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ImmutableSortedMap.Builder m14782b(Comparator comparator) {
        return lambda$toImmutableSortedMap$8(comparator);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14783c(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        lambda$toImmutableMultiset$2(function, toIntFunction, multiset, obj);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ EnumMapAccumulator m14784d() {
        return lambda$toImmutableEnumMap$13();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m14785e(Function function, Object obj) {
        return lambda$flatteningToImmutableSetMultimap$22(function, obj);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14786f(Function function, Function function2, ImmutableListMultimap.Builder builder, Object obj) {
        lambda$toImmutableListMultimap$18(function, function2, builder, obj);
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        C4358f c4358f = new C4358f(function, 0);
        C4358f c4358f2 = new C4358f(function2, 1);
        MultimapBuilder.ListMultimapBuilder<Object, Object> listMultimapBuilderArrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(listMultimapBuilderArrayListValues);
        return Collectors.collectingAndThen(flatteningToMultimap(c4358f, c4358f2, new C4363k(listMultimapBuilderArrayListValues, 1)), new C4357e(11));
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        C4358f c4358f = new C4358f(function, 2);
        C4358f c4358f2 = new C4358f(function2, 3);
        MultimapBuilder.SetMultimapBuilder<Object, Object> setMultimapBuilderLinkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(setMultimapBuilderLinkedHashSetValues);
        return Collectors.collectingAndThen(flatteningToMultimap(c4358f, c4358f2, new C4363k(setMultimapBuilderLinkedHashSetValues, 2)), new C4357e(12));
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new C4354b(function, function2, 1), new C4353a(2), new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ImmutableSortedSet.Builder m14787g(Comparator comparator) {
        return lambda$toImmutableSortedSet$0(comparator);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Multimap m14788h(Multimap multimap, Multimap multimap2) {
        return lambda$toMultimap$25(multimap, multimap2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m14789i(Function function, Function function2, Multimap multimap, Object obj) {
        lambda$toMultimap$24(function, function2, multimap, obj);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m14790j(Function function, Object obj) {
        return lambda$flatteningToImmutableListMultimap$19(function, obj);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ImmutableMultiset m14791k(Multiset multiset) {
        return lambda$toImmutableMultiset$4(multiset);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Stream m14792l(Function function, Object obj) {
        return lambda$flatteningToImmutableSetMultimap$23(function, obj);
    }

    private static /* synthetic */ Object lambda$flatteningToImmutableListMultimap$19(Function function, Object obj) {
        return Preconditions.checkNotNull(function.apply(obj));
    }

    private static /* synthetic */ Stream lambda$flatteningToImmutableListMultimap$20(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new C4361i());
    }

    private static /* synthetic */ Object lambda$flatteningToImmutableSetMultimap$22(Function function, Object obj) {
        return Preconditions.checkNotNull(function.apply(obj));
    }

    private static /* synthetic */ Stream lambda$flatteningToImmutableSetMultimap$23(Function function, Object obj) {
        return ((Stream) function.apply(obj)).peek(new C4361i());
    }

    private static /* synthetic */ void lambda$flatteningToMultimap$26(Function function, Function function2, Multimap multimap, Object obj) {
        Collection collection = multimap.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new C4362j(collection));
    }

    private static /* synthetic */ Multimap lambda$flatteningToMultimap$27(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    private static /* synthetic */ void lambda$toImmutableBiMap$11(Function function, Function function2, ImmutableBiMap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ Object lambda$toImmutableEnumMap$12(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }

    private static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$13() {
        return new EnumMapAccumulator(new C4353a(0));
    }

    private static /* synthetic */ void lambda$toImmutableEnumMap$14(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        enumMapAccumulator.put((Enum) Preconditions.checkNotNull((Enum) function.apply(obj), "Null key for input %s", obj), Preconditions.checkNotNull(function2.apply(obj), "Null value for input %s", obj));
    }

    private static /* synthetic */ EnumMapAccumulator lambda$toImmutableEnumMap$15(BinaryOperator binaryOperator) {
        return new EnumMapAccumulator(binaryOperator);
    }

    private static /* synthetic */ void lambda$toImmutableEnumMap$16(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        enumMapAccumulator.put((Enum) Preconditions.checkNotNull((Enum) function.apply(obj), "Null key for input %s", obj), Preconditions.checkNotNull(function2.apply(obj), "Null value for input %s", obj));
    }

    private static /* synthetic */ EnumSetAccumulator lambda$toImmutableEnumSetGeneric$1() {
        return new EnumSetAccumulator(null);
    }

    private static /* synthetic */ void lambda$toImmutableListMultimap$18(Function function, Function function2, ImmutableListMultimap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ void lambda$toImmutableMap$7(Function function, Function function2, ImmutableMap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ void lambda$toImmutableMultiset$2(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        multiset.add(Preconditions.checkNotNull(function.apply(obj)), toIntFunction.applyAsInt(obj));
    }

    private static /* synthetic */ Multiset lambda$toImmutableMultiset$3(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    private static /* synthetic */ ImmutableMultiset lambda$toImmutableMultiset$4(Multiset multiset) {
        return ImmutableMultiset.copyFromEntries(multiset.entrySet());
    }

    private static /* synthetic */ void lambda$toImmutableRangeMap$17(Function function, Function function2, ImmutableRangeMap.Builder builder, Object obj) {
        builder.put((Range) function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ void lambda$toImmutableSetMultimap$21(Function function, Function function2, ImmutableSetMultimap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ TreeMap lambda$toImmutableSortedMap$10(Comparator comparator) {
        return new TreeMap(comparator);
    }

    private static /* synthetic */ ImmutableSortedMap.Builder lambda$toImmutableSortedMap$8(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    private static /* synthetic */ void lambda$toImmutableSortedMap$9(Function function, Function function2, ImmutableSortedMap.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ ImmutableSortedSet.Builder lambda$toImmutableSortedSet$0(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    private static /* synthetic */ void lambda$toMultimap$24(Function function, Function function2, Multimap multimap, Object obj) {
        multimap.put(function.apply(obj), function2.apply(obj));
    }

    private static /* synthetic */ Multimap lambda$toMultimap$25(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    private static /* synthetic */ void lambda$toMultiset$5(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        multiset.add(function.apply(obj), toIntFunction.applyAsInt(obj));
    }

    private static /* synthetic */ Multiset lambda$toMultiset$6(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Multiset m14793m(Multiset multiset, Multiset multiset2) {
        return lambda$toImmutableMultiset$3(multiset, multiset2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m14794n(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        lambda$toImmutableEnumMap$14(function, function2, enumMapAccumulator, obj);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Multiset m14795o(Multiset multiset, Multiset multiset2) {
        return lambda$toMultiset$6(multiset, multiset2);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ TreeMap m14796p(Comparator comparator) {
        return lambda$toImmutableSortedMap$10(comparator);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ EnumSetAccumulator m14797q() {
        return lambda$toImmutableEnumSetGeneric$1();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m14798r(Function function, Function function2, ImmutableRangeMap.Builder builder, Object obj) {
        lambda$toImmutableRangeMap$17(function, function2, builder, obj);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m14799s(Function function, Function function2, ImmutableSortedMap.Builder builder, Object obj) {
        lambda$toImmutableSortedMap$9(function, function2, builder, obj);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m14800t(Function function, Function function2, Multimap multimap, Object obj) {
        lambda$flatteningToMultimap$26(function, function2, multimap, obj);
    }

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new C4355c(13), new C4354b(function, function2, 0), new C4353a(10), new C4357e(7), new Collector.Characteristics[0]);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new C4355c(1), new C4354b(function, function2, 3), new C4353a(4), new C4357e(2), Collector.Characteristics.UNORDERED);
    }

    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return (Collector<E, ?, ImmutableSet<E>>) EnumSetAccumulator.TO_IMMUTABLE_ENUM_SET;
    }

    private static <E extends Enum<E>> Collector<E, EnumSetAccumulator<E>, ImmutableSet<E>> toImmutableEnumSetGeneric() {
        return Collector.of(new C4355c(0), new C4356d(0), new C4353a(1), new C4357e(0), Collector.Characteristics.UNORDERED);
    }

    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return (Collector<E, ?, ImmutableList<E>>) TO_IMMUTABLE_LIST;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new C4355c(10), new C4354b(function, function2, 5), new C4353a(17), new C4357e(17), new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new C4355c(9), new C4354b(function, function2, 4), new C4353a(15), new C4357e(15), new Collector.Characteristics[0]);
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new C4355c(8), new C4359g(function, toIntFunction, 0), new C4353a(3), new C4357e(1), new Collector.Characteristics[0]);
    }

    @GwtIncompatible
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(Function<? super T, Range<K>> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new C4355c(5), new C4354b(function, function2, 2), new C4353a(14), new C4357e(14), new Collector.Characteristics[0]);
    }

    @GwtIncompatible
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) TO_IMMUTABLE_RANGE_SET;
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return (Collector<E, ?, ImmutableSet<E>>) TO_IMMUTABLE_SET;
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new C4355c(11), new C4354b(function, function2, 6), new C4353a(18), new C4357e(18), new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new C4360h(comparator, 2), new C4354b(function, function2, 7), new C4353a(19), new C4357e(20), Collector.Characteristics.UNORDERED);
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new C4360h(comparator, 1), new C4356d(7), new C4353a(16), new C4357e(16), new Collector.Characteristics[0]);
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new C4354b(function, function2, 9), new C4353a(6), new Collector.Characteristics[0]);
    }

    public static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new C4359g(function, toIntFunction, 1), new C4353a(5), new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m14801u(Function function, Function function2, ImmutableSetMultimap.Builder builder, Object obj) {
        lambda$toImmutableSetMultimap$21(function, function2, builder, obj);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m14802v(Function function, Function function2, ImmutableBiMap.Builder builder, Object obj) {
        lambda$toImmutableBiMap$11(function, function2, builder, obj);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m14803w(Function function, Function function2, ImmutableMap.Builder builder, Object obj) {
        lambda$toImmutableMap$7(function, function2, builder, obj);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m14804x(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        lambda$toMultiset$5(function, toIntFunction, multiset, obj);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m14805y(Object obj, Object obj2) {
        return lambda$toImmutableEnumMap$12(obj, obj2);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14806z(Function function, Function function2, EnumMapAccumulator enumMapAccumulator, Object obj) {
        lambda$toImmutableEnumMap$16(function, function2, enumMapAccumulator, obj);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collector.of(new C4363k(binaryOperator, 0), new C4354b(function, function2, 8), new C4353a(4), new C4357e(2), new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new C4355c(12)), new C4357e(19));
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new C4360h(comparator, 0)), new C4357e(13));
    }
}
