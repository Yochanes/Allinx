package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/collections/ArrayAsCollection;", "T", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
final class ArrayAsCollection<T> implements Collection<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Object[] f51481a;

    /* JADX INFO: renamed from: b */
    public final boolean f51482b;

    public ArrayAsCollection(Object[] values, boolean z2) {
        Intrinsics.m18599g(values, "values");
        this.f51481a = values;
        this.f51482b = z2;
    }

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
        return ArraysKt.m18376k(this.f51481a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!ArraysKt.m18376k(this.f51481a, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f51481a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ArrayIteratorKt.m18576a(this.f51481a);
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
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f51481a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f51481a;
        Intrinsics.m18599g(objArr, "<this>");
        if (this.f51482b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.m18599g(array, "array");
        return CollectionToArray.m18591b(this, array);
    }
}
