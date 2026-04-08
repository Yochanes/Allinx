package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableCollectionAdapter;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class ImmutableCollectionAdapter<E> implements ImmutableCollection<E>, Collection<E>, KMappedMarker {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
