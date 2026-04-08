package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: compiled from: Proguard */
    @DoNotMock
    public static final class Builder<R, C, V> {
        private final List<Table.Cell<R, C, V>> cells = Lists.newArrayList();

        @CheckForNull
        private Comparator<? super C> columnComparator;

        @CheckForNull
        private Comparator<? super R> rowComparator;

        public ImmutableTable<R, C, V> build() {
            return buildOrThrow();
        }

        public ImmutableTable<R, C, V> buildOrThrow() {
            int size = this.cells.size();
            return size != 0 ? size != 1 ? RegularImmutableTable.forCells(this.cells, this.rowComparator, this.columnComparator) : new SingletonImmutableTable((Table.Cell) Iterables.getOnlyElement(this.cells)) : ImmutableTable.m14939of();
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> combine(Builder<R, C, V> builder) {
            this.cells.addAll(builder.cells);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderColumnsBy(Comparator<? super C> comparator) {
            this.columnComparator = (Comparator) Preconditions.checkNotNull(comparator, "columnComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderRowsBy(Comparator<? super R> comparator) {
            this.rowComparator = (Comparator) Preconditions.checkNotNull(comparator, "rowComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(R r, C c2, V v) {
            this.cells.add(ImmutableTable.cellOf(r, c2, v));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> putAll(Table<? extends R, ? extends C, ? extends V> table) {
            Iterator<Table.Cell<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (!(cell instanceof Tables.ImmutableCell)) {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
                return this;
            }
            Preconditions.checkNotNull(cell.getRowKey(), "row");
            Preconditions.checkNotNull(cell.getColumnKey(), "column");
            Preconditions.checkNotNull(cell.getValue(), "value");
            this.cells.add(cell);
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        public static SerializedForm create(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ImmutableTable.m14939of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.m14940of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i >= objArr2.length) {
                    return RegularImmutableTable.forOrderedComponents(builder.build(), ImmutableSet.copyOf(this.rowKeys), ImmutableSet.copyOf(this.columnKeys));
                }
                builder.add(ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                i++;
            }
        }
    }

    public static <R, C, V> Builder<R, C, V> builder() {
        return new Builder<>();
    }

    public static <R, C, V> Table.Cell<R, C, V> cellOf(R r, C c2, V v) {
        return Tables.immutableCell(Preconditions.checkNotNull(r, "rowKey"), Preconditions.checkNotNull(c2, "columnKey"), Preconditions.checkNotNull(v, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Table<? extends R, ? extends C, ? extends V> table) {
        return table instanceof ImmutableTable ? (ImmutableTable) table : copyOf(table.cellSet());
    }

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m14939of() {
        return (ImmutableTable<R, C, V>) SparseImmutableTable.EMPTY;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3) {
        return TableCollectors.toImmutableTable(function, function2, function3);
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Iterator cellIterator() {
        return cellIterator();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set cellSet() {
        return cellSet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return column(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return columnKeySet();
    }

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
        return columnMap();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable
    public abstract ImmutableSet<Table.Cell<R, C, V>> createCellSet();

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Set createCellSet() {
        return createCellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ Collection createValues() {
        return createValues();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(R r, C c2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return row(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return rowKeySet();
    }

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map rowMap() {
        return rowMap();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract Object writeReplace();

    /* JADX INFO: renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m14940of(R r, C c2, V v) {
        return new SingletonImmutableTable(r, c2, v);
    }

    @IgnoreJRERequirement
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator) {
        return TableCollectors.toImmutableTable(function, function2, function3, binaryOperator);
    }

    @Override // com.google.common.collect.AbstractTable
    public final UnmodifiableIterator<Table.Cell<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<Table.Cell<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c2) {
        Preconditions.checkNotNull(c2, "columnKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) columnMap().get(c2), ImmutableMap.m14843of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<C, V> row(R r) {
        Preconditions.checkNotNull(r, "rowKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) rowMap().get(r), ImmutableMap.m14843of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends Table.Cell<? extends R, ? extends C, ? extends V>> iterable) {
        Builder builder = builder();
        Iterator<? extends Table.Cell<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            builder.put(it.next());
        }
        return builder.build();
    }
}
