package io.ktor.util.collections;

import androidx.compose.animation.AbstractC0455a;
import io.ktor.util.KtorExperimentalAPI;
import io.ktor.util.collections.internal.ConcurrentListSlice;
import io.ktor.util.collections.internal.SharedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KtorExperimentalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/collections/ConcurrentList;", "T", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConcurrentList<T> implements List<T>, KMutableList {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty[] f46512a;

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentList$listIterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010+\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/util/collections/ConcurrentList$listIterator$1", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class C59391 implements ListIterator<Object>, KMutableListIterator {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ KProperty[] f46515c = {Reflection.f51660a.mo18615e(new MutablePropertyReference1Impl(C59391.class, "current", "getCurrent()I", 0))};

        /* JADX INFO: renamed from: a */
        public final ConcurrentList$listIterator$1$$special$$inlined$shared$1 f46516a;

        public C59391(int i) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentList$listIterator$1$$special$$inlined$shared$1 concurrentList$listIterator$1$$special$$inlined$shared$1 = new ConcurrentList$listIterator$1$$special$$inlined$shared$1();
            concurrentList$listIterator$1$$special$$inlined$shared$1.f46518a = numValueOf;
            this.f46516a = concurrentList$listIterator$1$$special$$inlined$shared$1;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            ConcurrentList.this.add(m17186c(), obj);
        }

        /* JADX INFO: renamed from: c */
        public final int m17186c() {
            return ((Number) this.f46516a.getValue(this, f46515c[0])).intValue();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return m17186c() < ConcurrentList.this.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return m17186c() > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            this.f46516a.setValue(this, f46515c[0], Integer.valueOf(m17186c() + 1));
            throw null;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return m17186c() + 1;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            this.f46516a.setValue(this, f46515c[0], Integer.valueOf(m17186c() - 1));
            throw null;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return m17186c() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            m17186c();
            throw null;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            m17186c();
            throw null;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ConcurrentList.class, "data", "getData()Lio/ktor/util/collections/internal/SharedList;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f46512a = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(ConcurrentList.class, "size", "getSize()I", 0, reflectionFactory)};
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw null;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        m17185e(i, elements.size());
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            m17184c().m17195c(i, it.next());
            i++;
        }
        return !elements.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final SharedList m17184c() {
        KProperty kProperty = f46512a[0];
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next();
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m17185e(int i, int i2) {
        if (m17184c().f46582b < size() + i2) {
            SharedList sharedList = new SharedList(m17184c().f46582b * 2);
            int i3 = m17184c().f46582b;
            for (int i4 = 0; i4 < i3; i4++) {
                sharedList.m17195c(i4, m17184c().f46581a.get(i4));
            }
            KProperty kProperty = f46512a[0];
            throw null;
        }
        int size = size();
        while (true) {
            size--;
            if (size < i) {
                break;
            } else {
                m17184c().m17195c(size + i2, m17184c().f46581a.get(size));
            }
        }
        int i5 = i2 + i;
        while (i < i5) {
            m17184c().m17195c(i, null);
            i++;
        }
        size();
        KProperty kProperty2 = f46512a[1];
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw null;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C59391(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator<T> it = elements.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        KProperty kProperty = f46512a[1];
        throw null;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new ConcurrentListSlice(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        throw null;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m17185e(i, 1);
        m17184c().m17195c(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C59391(i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
        return !elements.isEmpty();
    }
}
