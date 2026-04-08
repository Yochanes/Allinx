package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class TableCollectors {

    /* JADX INFO: compiled from: Proguard */
    @IgnoreJRERequirement
    public static final class MutableCell<R, C, V> extends Tables.AbstractCell<R, C, V> {
        private final C column;
        private final R row;
        private V value;

        public MutableCell(R r, C c2, V v) {
            this.row = (R) Preconditions.checkNotNull(r, "row");
            this.column = (C) Preconditions.checkNotNull(c2, "column");
            this.value = (V) Preconditions.checkNotNull(v, "value");
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.column;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.row;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }

        public void merge(V v, BinaryOperator<V> binaryOperator) {
            Preconditions.checkNotNull(v, "value");
            this.value = (V) Preconditions.checkNotNull(binaryOperator.apply(this.value, v), "mergeFunction.apply");
        }
    }

    private TableCollectors() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14948a(Function function, Function function2, Function function3, BinaryOperator binaryOperator, ImmutableTableCollectorState immutableTableCollectorState, Object obj) {
        lambda$toImmutableTable$2(function, function2, function3, binaryOperator, immutableTableCollectorState, obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m14949b(Object obj, Object obj2) {
        return lambda$toTable$5(obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14950c(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        lambda$toTable$6(function, function2, function3, binaryOperator, table, obj);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ImmutableTable m14951d(ImmutableTableCollectorState immutableTableCollectorState) {
        return lambda$toImmutableTable$4(immutableTableCollectorState);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ImmutableTableCollectorState m14952e(BinaryOperator binaryOperator, ImmutableTableCollectorState immutableTableCollectorState, ImmutableTableCollectorState immutableTableCollectorState2) {
        return lambda$toImmutableTable$3(binaryOperator, immutableTableCollectorState, immutableTableCollectorState2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ImmutableTableCollectorState m14953f() {
        return lambda$toImmutableTable$1();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Table m14954g(BinaryOperator binaryOperator, Table table, Table table2) {
        return lambda$toTable$7(binaryOperator, table, table2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14955h(Function function, Function function2, Function function3, ImmutableTable.Builder builder, Object obj) {
        lambda$toImmutableTable$0(function, function2, function3, builder, obj);
    }

    private static /* synthetic */ void lambda$toImmutableTable$0(Function function, Function function2, Function function3, ImmutableTable.Builder builder, Object obj) {
        builder.put(function.apply(obj), function2.apply(obj), function3.apply(obj));
    }

    private static /* synthetic */ ImmutableTableCollectorState lambda$toImmutableTable$1() {
        return new ImmutableTableCollectorState(null);
    }

    private static /* synthetic */ void lambda$toImmutableTable$2(Function function, Function function2, Function function3, BinaryOperator binaryOperator, ImmutableTableCollectorState immutableTableCollectorState, Object obj) {
        immutableTableCollectorState.put(function.apply(obj), function2.apply(obj), function3.apply(obj), binaryOperator);
    }

    private static /* synthetic */ ImmutableTableCollectorState lambda$toImmutableTable$3(BinaryOperator binaryOperator, ImmutableTableCollectorState immutableTableCollectorState, ImmutableTableCollectorState immutableTableCollectorState2) {
        return immutableTableCollectorState.combine(immutableTableCollectorState2, binaryOperator);
    }

    private static /* synthetic */ ImmutableTable lambda$toImmutableTable$4(ImmutableTableCollectorState immutableTableCollectorState) {
        return immutableTableCollectorState.toTable();
    }

    private static /* synthetic */ Object lambda$toTable$5(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    private static /* synthetic */ void lambda$toTable$6(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        mergeTables(table, function.apply(obj), function2.apply(obj), function3.apply(obj), binaryOperator);
    }

    private static /* synthetic */ Table lambda$toTable$7(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            mergeTables(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <R, C, V> void mergeTables(Table<R, C, V> table, @ParametricNullness R r, @ParametricNullness C c2, V v, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(v);
        V v2 = table.get(r, c2);
        if (v2 == null) {
            table.put(r, c2, v);
            return;
        }
        Object objApply = binaryOperator.apply(v2, v);
        if (objApply == null) {
            table.remove(r, c2);
        } else {
            table.put(r, c2, objApply);
        }
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        return Collector.of(new C4355c(14), new C4375w(function, function2, function3), new C4353a(21), new C4357e(21), new Collector.Characteristics[0]);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, Supplier<I> supplier) {
        return toTable(function, function2, function3, new C4353a(9), supplier);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator, Supplier<I> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(function3);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new C4373u(function, function2, function3, binaryOperator, 0), new C4374v(binaryOperator, 0), new Collector.Characteristics[0]);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ImmutableTableCollectorState<R, C, V> {
        final List<MutableCell<R, C, V>> insertionOrder;
        final Table<R, C, MutableCell<R, C, V>> table;

        private ImmutableTableCollectorState() {
            this.insertionOrder = new ArrayList();
            this.table = HashBasedTable.create();
        }

        public ImmutableTableCollectorState<R, C, V> combine(ImmutableTableCollectorState<R, C, V> immutableTableCollectorState, BinaryOperator<V> binaryOperator) {
            for (MutableCell<R, C, V> mutableCell : immutableTableCollectorState.insertionOrder) {
                put(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), binaryOperator);
            }
            return this;
        }

        public void put(R r, C c2, V v, BinaryOperator<V> binaryOperator) {
            MutableCell<R, C, V> mutableCell = this.table.get(r, c2);
            if (mutableCell != null) {
                mutableCell.merge(v, binaryOperator);
                return;
            }
            MutableCell<R, C, V> mutableCell2 = new MutableCell<>(r, c2, v);
            this.insertionOrder.add(mutableCell2);
            this.table.put(r, c2, mutableCell2);
        }

        public ImmutableTable<R, C, V> toTable() {
            return ImmutableTable.copyOf(this.insertionOrder);
        }

        public /* synthetic */ ImmutableTableCollectorState(C43241 c43241) {
            this();
        }
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        return Collector.of(new C4355c(3), new C4373u(function, function2, function3, binaryOperator, 1), new C4374v(binaryOperator, 1), new C4357e(6), new Collector.Characteristics[0]);
    }
}
