package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "PinnedItem", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList f7349a = new SnapshotStateList();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface PinnedItem {
        /* JADX INFO: renamed from: getIndex */
        int getF7337c();

        /* JADX INFO: renamed from: getKey */
        Object getF7335a();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return false;
        }
        return this.f7349a.contains((PinnedItem) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7349a.containsAll(collection);
    }

    @Override // java.util.List
    public final PinnedItem get(int i) {
        return (PinnedItem) this.f7349a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return this.f7349a.indexOf((PinnedItem) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7349a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7349a.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof PinnedItem)) {
            return -1;
        }
        return this.f7349a.lastIndexOf((PinnedItem) obj);
    }

    @Override // java.util.List
    public final ListIterator<PinnedItem> listIterator() {
        return this.f7349a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ PinnedItem remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<PinnedItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ PinnedItem set(int i, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7349a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super PinnedItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<PinnedItem> subList(int i, int i2) {
        return this.f7349a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<PinnedItem> listIterator(int i) {
        return this.f7349a.listIterator(i);
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
