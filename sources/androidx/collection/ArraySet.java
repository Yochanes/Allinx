package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "ElementIterator", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: a */
    public int[] f3646a = ContainerHelpersKt.f3905a;

    /* JADX INFO: renamed from: b */
    public Object[] f3647b = ContainerHelpersKt.f3907c;

    /* JADX INFO: renamed from: c */
    public int f3648c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.f3648c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: c */
        public final Object mo1978c(int i) {
            return ArraySet.this.f3647b[i];
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: e */
        public final void mo1979e(int i) {
            ArraySet.this.m1980c(i);
        }
    }

    public ArraySet(int i) {
        if (i > 0) {
            ArraySetKt.m1981a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM1982b;
        int i2 = this.f3648c;
        if (obj == null) {
            iM1982b = ArraySetKt.m1982b(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM1982b = ArraySetKt.m1982b(this, obj, iHashCode);
        }
        if (iM1982b >= 0) {
            return false;
        }
        int i3 = ~iM1982b;
        int[] iArr = this.f3646a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f3647b;
            ArraySetKt.m1981a(this, i4);
            if (i2 != this.f3648c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3646a;
            if (iArr2.length != 0) {
                ArraysKt.m18384s(0, iArr.length, iArr, iArr2, 6);
                ArraysKt.m18385t(objArr, 0, this.f3647b, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f3646a;
            int i5 = i3 + 1;
            ArraysKt.m18379n(i5, i3, iArr3, iArr3, i2);
            Object[] objArr2 = this.f3647b;
            ArraysKt.m18383r(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.f3648c;
        if (i2 == i6) {
            int[] iArr4 = this.f3646a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f3647b[i3] = obj;
                this.f3648c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        int size = elements.size() + this.f3648c;
        int i = this.f3648c;
        int[] iArr = this.f3646a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3647b;
            ArraySetKt.m1981a(this, size);
            int i2 = this.f3648c;
            if (i2 > 0) {
                ArraysKt.m18384s(0, i2, iArr, this.f3646a, 6);
                ArraysKt.m18385t(objArr, 0, this.f3647b, this.f3648c, 6);
            }
        }
        if (this.f3648c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1980c(int i) {
        int i2 = this.f3648c;
        Object[] objArr = this.f3647b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f3646a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ArraysKt.m18379n(i, i4, iArr, iArr, i2);
                Object[] objArr2 = this.f3647b;
                ArraysKt.m18383r(objArr2, i, objArr2, i4, i2);
            }
            this.f3647b[i3] = null;
        } else {
            ArraySetKt.m1981a(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                ArraysKt.m18384s(0, i, iArr, this.f3646a, 6);
                ArraysKt.m18385t(objArr, 0, this.f3647b, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                ArraysKt.m18379n(i, i5, iArr, this.f3646a, i2);
                ArraysKt.m18383r(objArr, i, this.f3647b, i5, i2);
            }
        }
        if (i2 != this.f3648c) {
            throw new ConcurrentModificationException();
        }
        this.f3648c = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f3648c != 0) {
            this.f3646a = ContainerHelpersKt.f3905a;
            this.f3647b = ContainerHelpersKt.f3907c;
            this.f3648c = 0;
        }
        if (this.f3648c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ArraySetKt.m1982b(this, null, 0) : ArraySetKt.m1982b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator<E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f3648c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f3648c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f3647b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3646a;
        int i = this.f3648c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3648c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM1982b = obj == null ? ArraySetKt.m1982b(this, null, 0) : ArraySetKt.m1982b(this, obj, obj.hashCode());
        if (iM1982b < 0) {
            return false;
        }
        m1980c(iM1982b);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator<E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        boolean z2 = false;
        for (int i = this.f3648c - 1; -1 < i; i--) {
            if (!CollectionsKt.m18454s(elements, this.f3647b[i])) {
                m1980c(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3648c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.m18387v(0, this.f3648c, this.f3647b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3648c * 14);
        sb.append('{');
        int i = this.f3648c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3647b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.m18599g(array, "array");
        int i = this.f3648c;
        if (array.length < i) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i);
        } else if (array.length > i) {
            array[i] = null;
        }
        ArraysKt.m18383r(this.f3647b, 0, array, 0, this.f3648c);
        return array;
    }
}
