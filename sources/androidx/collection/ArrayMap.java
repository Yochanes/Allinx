package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d */
    public EntrySet f3634d;

    /* JADX INFO: renamed from: f */
    public KeySet f3635f;

    /* JADX INFO: renamed from: g */
    public ValueCollection f3636g;

    /* JADX INFO: compiled from: Proguard */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.f3884c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.f3884c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: c */
        public final Object mo1978c(int i) {
            return ArrayMap.this.m2128j(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: e */
        public final void mo1979e(int i) {
            ArrayMap.this.mo2129k(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f3640a;

        /* JADX INFO: renamed from: b */
        public int f3641b = -1;

        /* JADX INFO: renamed from: c */
        public boolean f3642c;

        public MapIterator() {
            this.f3640a = ArrayMap.this.f3884c - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f3642c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f3641b;
            ArrayMap arrayMap = ArrayMap.this;
            return Intrinsics.m18594b(key, arrayMap.m2128j(i)) && Intrinsics.m18594b(entry.getValue(), arrayMap.m2131m(this.f3641b));
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.f3642c) {
                return ArrayMap.this.m2128j(this.f3641b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.f3642c) {
                return ArrayMap.this.m2131m(this.f3641b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3641b < this.f3640a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f3642c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f3641b;
            ArrayMap arrayMap = ArrayMap.this;
            Object objM2128j = arrayMap.m2128j(i);
            Object objM2131m = arrayMap.m2131m(this.f3641b);
            return (objM2128j == null ? 0 : objM2128j.hashCode()) ^ (objM2131m != null ? objM2131m.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3641b++;
            this.f3642c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f3642c) {
                throw new IllegalStateException();
            }
            ArrayMap.this.mo2129k(this.f3641b);
            this.f3641b--;
            this.f3640a--;
            this.f3642c = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.f3642c) {
                return ArrayMap.this.mo2130l(this.f3641b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.f3884c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: c */
        public final Object mo1978c(int i) {
            return ArrayMap.this.m2131m(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        /* JADX INFO: renamed from: e */
        public final void mo1979e(int i) {
            ArrayMap.this.mo2129k(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayMap(ArrayMap arrayMap) {
        super(0);
        int i = arrayMap.f3884c;
        m2124e(this.f3884c + i);
        if (this.f3884c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(arrayMap.m2128j(i2), arrayMap.m2131m(i2));
            }
        } else if (i > 0) {
            ArraysKt.m18379n(0, 0, arrayMap.f3882a, this.f3882a, i);
            ArraysKt.m18383r(arrayMap.f3883b, 0, this.f3883b, 0, i << 1);
            this.f3884c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.f3634d;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.f3634d = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        KeySet keySet = this.f3635f;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f3635f = keySet2;
        return keySet2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1975n(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo1976o(Collection collection) {
        int i = this.f3884c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f3884c;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo1977p(Collection collection) {
        int i = this.f3884c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m2128j(i2))) {
                mo2129k(i2);
            }
        }
        return i != this.f3884c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2124e(map.size() + this.f3884c);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ValueCollection valueCollection = this.f3636g;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.f3636g = valueCollection2;
        return valueCollection2;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return ArrayMap.this.m1975n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            ArrayMap arrayMap = ArrayMap.this;
            try {
                if (arrayMap.f3884c == set.size()) {
                    return arrayMap.m1975n(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int iHashCode = 0;
            for (int i = arrayMap.f3884c - 1; i >= 0; i--) {
                Object objM2128j = arrayMap.m2128j(i);
                iHashCode += objM2128j == null ? 0 : objM2128j.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iM2126g = arrayMap.m2126g(obj);
            if (iM2126g < 0) {
                return false;
            }
            arrayMap.mo2129k(iM2126g);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            return ArrayMap.this.mo1976o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.mo1977p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.f3884c;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.m2128j(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.m2128j(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ValueCollection implements Collection<V> {
        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.m2123c(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iM2123c = arrayMap.m2123c(obj);
            if (iM2123c < 0) {
                return false;
            }
            arrayMap.mo2129k(iM2123c);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < i) {
                if (collection.contains(arrayMap.m2131m(i2))) {
                    arrayMap.mo2129k(i2);
                    i2--;
                    i--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < i) {
                if (!collection.contains(arrayMap.m2131m(i2))) {
                    arrayMap.mo2129k(i2);
                    i2--;
                    i--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.f3884c;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.m2131m(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.f3884c;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.m2131m(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }
    }
}
