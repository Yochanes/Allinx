package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "Iterator", "storage", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
public final class UShortArray implements Collection<UShort>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final short[] f51456a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final short[] f51457a;

        /* JADX INFO: renamed from: b */
        public int f51458b;

        public Iterator(short[] sArr) {
            this.f51457a = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f51458b < this.f51457a.length;
        }

        @Override // java.util.Iterator
        public final UShort next() {
            int i = this.f51458b;
            short[] sArr = this.f51457a;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f51458b));
            }
            this.f51458b = i + 1;
            return new UShort(sArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ UShortArray(short[] sArr) {
        this.f51456a = sArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof UShort)) {
            return false;
        }
        return ArraysKt.m18377l(this.f51456a, ((UShort) obj).f51455a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UShort)) {
                return false;
            }
            if (!ArraysKt.m18377l(this.f51456a, ((UShort) obj).f51455a)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof UShortArray) {
            return Intrinsics.m18594b(this.f51456a, ((UShortArray) obj).f51456a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f51456a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f51456a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new Iterator(this.f51456a);
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
        return this.f51456a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f51456a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.m18599g(array, "array");
        return CollectionToArray.m18591b(this, array);
    }
}
