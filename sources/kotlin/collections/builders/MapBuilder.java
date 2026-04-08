package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u0006\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* JADX INFO: renamed from: s */
    public static final MapBuilder f51542s;

    /* JADX INFO: renamed from: a */
    public Object[] f51543a;

    /* JADX INFO: renamed from: b */
    public Object[] f51544b;

    /* JADX INFO: renamed from: c */
    public int[] f51545c;

    /* JADX INFO: renamed from: d */
    public int[] f51546d;

    /* JADX INFO: renamed from: f */
    public int f51547f;

    /* JADX INFO: renamed from: g */
    public int f51548g;

    /* JADX INFO: renamed from: i */
    public int f51549i;

    /* JADX INFO: renamed from: j */
    public int f51550j;

    /* JADX INFO: renamed from: n */
    public int f51551n;

    /* JADX INFO: renamed from: o */
    public MapBuilderKeys f51552o;

    /* JADX INFO: renamed from: p */
    public MapBuilderValues f51553p;

    /* JADX INFO: renamed from: q */
    public MapBuilderEntries f51554q;

    /* JADX INFO: renamed from: r */
    public boolean f51555r;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            m18543c();
            int i = this.f51560b;
            MapBuilder mapBuilder = this.f51559a;
            if (i >= mapBuilder.f51548g) {
                throw new NoSuchElementException();
            }
            this.f51560b = i + 1;
            this.f51561c = i;
            EntryRef entryRef = new EntryRef(mapBuilder, i);
            m18544e();
            return entryRef;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a */
        public final MapBuilder f51556a;

        /* JADX INFO: renamed from: b */
        public final int f51557b;

        /* JADX INFO: renamed from: c */
        public final int f51558c;

        public EntryRef(MapBuilder map, int i) {
            Intrinsics.m18599g(map, "map");
            this.f51556a = map;
            this.f51557b = i;
            this.f51558c = map.f51550j;
        }

        /* JADX INFO: renamed from: c */
        public final void m18542c() {
            if (this.f51556a.f51550j != this.f51558c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.m18594b(entry.getKey(), getKey()) && Intrinsics.m18594b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            m18542c();
            return this.f51556a.f51543a[this.f51557b];
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            m18542c();
            Object[] objArr = this.f51556a.f51544b;
            Intrinsics.m18596d(objArr);
            return objArr[this.f51557b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            m18542c();
            MapBuilder mapBuilder = this.f51556a;
            mapBuilder.m18532f();
            Object[] objArr = mapBuilder.f51544b;
            if (objArr == null) {
                int length = mapBuilder.f51543a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                mapBuilder.f51544b = objArr;
            }
            int i = this.f51557b;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class Itr<K, V> {

        /* JADX INFO: renamed from: a */
        public final MapBuilder f51559a;

        /* JADX INFO: renamed from: b */
        public int f51560b;

        /* JADX INFO: renamed from: c */
        public int f51561c;

        /* JADX INFO: renamed from: d */
        public int f51562d;

        public Itr(MapBuilder map) {
            Intrinsics.m18599g(map, "map");
            this.f51559a = map;
            this.f51561c = -1;
            this.f51562d = map.f51550j;
            m18544e();
        }

        /* JADX INFO: renamed from: c */
        public final void m18543c() {
            if (this.f51559a.f51550j != this.f51562d) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m18544e() {
            while (true) {
                int i = this.f51560b;
                MapBuilder mapBuilder = this.f51559a;
                if (i >= mapBuilder.f51548g || mapBuilder.f51545c[i] >= 0) {
                    return;
                } else {
                    this.f51560b = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f51560b < this.f51559a.f51548g;
        }

        public final void remove() {
            m18543c();
            if (this.f51561c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            MapBuilder mapBuilder = this.f51559a;
            mapBuilder.m18532f();
            mapBuilder.m18541q(this.f51561c);
            this.f51561c = -1;
            this.f51562d = mapBuilder.f51550j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            m18543c();
            int i = this.f51560b;
            MapBuilder mapBuilder = this.f51559a;
            if (i >= mapBuilder.f51548g) {
                throw new NoSuchElementException();
            }
            this.f51560b = i + 1;
            this.f51561c = i;
            Object obj = mapBuilder.f51543a[i];
            m18544e();
            return obj;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        @Override // java.util.Iterator
        public final Object next() {
            m18543c();
            int i = this.f51560b;
            MapBuilder mapBuilder = this.f51559a;
            if (i >= mapBuilder.f51548g) {
                throw new NoSuchElementException();
            }
            this.f51560b = i + 1;
            this.f51561c = i;
            Object[] objArr = mapBuilder.f51544b;
            Intrinsics.m18596d(objArr);
            Object obj = objArr[this.f51561c];
            m18544e();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f51555r = true;
        f51542s = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    /* JADX INFO: renamed from: c */
    public final int m18530c(Object obj) {
        m18532f();
        while (true) {
            int iM18539o = m18539o(obj);
            int i = this.f51547f * 2;
            int length = this.f51546d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f51546d;
                int i3 = iArr[iM18539o];
                if (i3 <= 0) {
                    int i4 = this.f51548g;
                    Object[] objArr = this.f51543a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f51548g = i5;
                        objArr[i4] = obj;
                        this.f51545c[i4] = iM18539o;
                        iArr[iM18539o] = i5;
                        this.f51551n++;
                        this.f51550j++;
                        if (i2 > this.f51547f) {
                            this.f51547f = i2;
                        }
                        return i4;
                    }
                    m18536l(1);
                } else {
                    if (Intrinsics.m18594b(this.f51543a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m18540p(this.f51546d.length * 2);
                        break;
                    }
                    iM18539o = iM18539o == 0 ? this.f51546d.length - 1 : iM18539o - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m18532f();
        int i = this.f51548g - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f51545c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f51546d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ListBuilderKt.m18529c(0, this.f51548g, this.f51543a);
        Object[] objArr = this.f51544b;
        if (objArr != null) {
            ListBuilderKt.m18529c(0, this.f51548g, objArr);
        }
        this.f51551n = 0;
        this.f51548g = 0;
        this.f51550j++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m18537m(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m18538n(obj) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public final MapBuilder m18531e() {
        m18532f();
        this.f51555r = true;
        if (this.f51551n > 0) {
            return this;
        }
        MapBuilder mapBuilder = f51542s;
        Intrinsics.m18597e(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        MapBuilderEntries mapBuilderEntries = this.f51554q;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.f51554q = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f51551n == map.size() && m18534j(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final void m18532f() {
        if (this.f51555r) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18533g(boolean z2) {
        int i;
        Object[] objArr = this.f51544b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f51548g;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f51545c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f51543a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z2) {
                    iArr[i3] = i4;
                    this.f51546d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        ListBuilderKt.m18529c(i3, i, this.f51543a);
        if (objArr != null) {
            ListBuilderKt.m18529c(i3, this.f51548g, objArr);
        }
        this.f51548g = i3;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM18537m = m18537m(obj);
        if (iM18537m < 0) {
            return null;
        }
        Object[] objArr = this.f51544b;
        Intrinsics.m18596d(objArr);
        return objArr[iM18537m];
    }

    @Override // java.util.Map
    public final int hashCode() {
        EntriesItr entriesItr = new EntriesItr(this);
        int i = 0;
        while (entriesItr.hasNext()) {
            int i2 = entriesItr.f51560b;
            MapBuilder mapBuilder = entriesItr.f51559a;
            if (i2 >= mapBuilder.f51548g) {
                throw new NoSuchElementException();
            }
            entriesItr.f51560b = i2 + 1;
            entriesItr.f51561c = i2;
            Object obj = mapBuilder.f51543a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.f51544b;
            Intrinsics.m18596d(objArr);
            Object obj2 = objArr[entriesItr.f51561c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            entriesItr.m18544e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f51551n == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18534j(Collection m) {
        Intrinsics.m18599g(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!m18535k((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m18535k(Map.Entry entry) {
        Intrinsics.m18599g(entry, "entry");
        int iM18537m = m18537m(entry.getKey());
        if (iM18537m < 0) {
            return false;
        }
        Object[] objArr = this.f51544b;
        Intrinsics.m18596d(objArr);
        return Intrinsics.m18594b(objArr[iM18537m], entry.getValue());
    }

    @Override // java.util.Map
    public final Set keySet() {
        MapBuilderKeys mapBuilderKeys = this.f51552o;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this);
        this.f51552o = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* JADX INFO: renamed from: l */
    public final void m18536l(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f51543a;
        int length = objArr.length;
        int i2 = this.f51548g;
        int i3 = length - i2;
        int i4 = i2 - this.f51551n;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m18533g(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int iM18323e = AbstractList.Companion.m18323e(objArr.length, i5);
            Object[] objArr2 = this.f51543a;
            Intrinsics.m18599g(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iM18323e);
            Intrinsics.m18598f(objArrCopyOf2, "copyOf(...)");
            this.f51543a = objArrCopyOf2;
            Object[] objArr3 = this.f51544b;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iM18323e);
                Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f51544b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f51545c, iM18323e);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f51545c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iM18323e >= 1 ? iM18323e : 1) * 3);
            if (iHighestOneBit > this.f51546d.length) {
                m18540p(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m18537m(Object obj) {
        int iM18539o = m18539o(obj);
        int i = this.f51547f;
        while (true) {
            int i2 = this.f51546d[iM18539o];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.m18594b(this.f51543a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM18539o = iM18539o == 0 ? this.f51546d.length - 1 : iM18539o - 1;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m18538n(Object obj) {
        int i = this.f51548g;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f51545c[i] >= 0) {
                Object[] objArr = this.f51544b;
                Intrinsics.m18596d(objArr);
                if (Intrinsics.m18594b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m18539o(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f51549i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f51545c[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18540p(int i) {
        this.f51550j++;
        int i2 = 0;
        if (this.f51548g > this.f51551n) {
            m18533g(false);
        }
        this.f51546d = new int[i];
        this.f51549i = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f51548g) {
            int i3 = i2 + 1;
            int iM18539o = m18539o(this.f51543a[i2]);
            int i4 = this.f51547f;
            while (true) {
                int[] iArr = this.f51546d;
                if (iArr[iM18539o] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM18539o = iM18539o == 0 ? iArr.length - 1 : iM18539o - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m18532f();
        int iM18530c = m18530c(obj);
        Object[] objArr = this.f51544b;
        if (objArr == null) {
            int length = this.f51543a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f51544b = objArr;
        }
        if (iM18530c >= 0) {
            objArr[iM18530c] = obj2;
            return null;
        }
        int i = (-iM18530c) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.m18599g(from, "from");
        m18532f();
        Set<Map.Entry<K, V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m18536l(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iM18530c = m18530c(entry.getKey());
            Object[] objArr = this.f51544b;
            if (objArr == null) {
                int length = this.f51543a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f51544b = objArr;
            }
            if (iM18530c >= 0) {
                objArr[iM18530c] = entry.getValue();
            } else {
                int i = (-iM18530c) - 1;
                if (!Intrinsics.m18594b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18541q(int i) {
        Object[] objArr = this.f51543a;
        Intrinsics.m18599g(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f51544b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f51545c[i];
        int i2 = this.f51547f * 2;
        int length2 = this.f51546d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        while (true) {
            length = length == 0 ? this.f51546d.length - 1 : length - 1;
            i4++;
            if (i4 > this.f51547f) {
                this.f51546d[i5] = 0;
                break;
            }
            int[] iArr = this.f51546d;
            int i6 = iArr[length];
            if (i6 == 0) {
                iArr[i5] = 0;
                break;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                int iM18539o = m18539o(this.f51543a[i7]) - length;
                int[] iArr2 = this.f51546d;
                if ((iM18539o & (iArr2.length - 1)) >= i4) {
                    iArr2[i5] = i6;
                    this.f51545c[i7] = i5;
                }
                i3--;
                if (i3 >= 0) {
                    this.f51546d[i5] = -1;
                    break;
                }
            }
            i5 = length;
            i4 = 0;
            i3--;
            if (i3 >= 0) {
            }
        }
        this.f51545c[i] = -1;
        this.f51551n--;
        this.f51550j++;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m18532f();
        int iM18537m = m18537m(obj);
        if (iM18537m < 0) {
            return null;
        }
        Object[] objArr = this.f51544b;
        Intrinsics.m18596d(objArr);
        Object obj2 = objArr[iM18537m];
        m18541q(iM18537m);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f51551n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f51551n * 3) + 2);
        sb.append("{");
        EntriesItr entriesItr = new EntriesItr(this);
        int i = 0;
        while (entriesItr.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = entriesItr.f51560b;
            MapBuilder mapBuilder = entriesItr.f51559a;
            if (i2 >= mapBuilder.f51548g) {
                throw new NoSuchElementException();
            }
            entriesItr.f51560b = i2 + 1;
            entriesItr.f51561c = i2;
            Object obj = mapBuilder.f51543a[i2];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.f51544b;
            Intrinsics.m18596d(objArr);
            Object obj2 = objArr[entriesItr.f51561c];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            entriesItr.m18544e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        MapBuilderValues mapBuilderValues = this.f51553p;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.f51553p = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f51543a = objArr;
        this.f51544b = null;
        this.f51545c = iArr;
        this.f51546d = new int[iHighestOneBit];
        this.f51547f = 2;
        this.f51548g = 0;
        this.f51549i = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
