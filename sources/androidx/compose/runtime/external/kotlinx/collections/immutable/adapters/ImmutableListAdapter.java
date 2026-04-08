package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableListAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ImmutableListAdapter<E> implements ImmutableList<E>, List<E>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final List f16757a;

    public ImmutableListAdapter(List list) {
        this.f16757a = list;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16757a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f16757a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f16757a.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f16757a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f16757a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f16757a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f16757a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f16757a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f16757a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f16757a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f16757a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new ImmutableListAdapter(this.f16757a.subList(i, i2));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        return this.f16757a.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f16757a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
