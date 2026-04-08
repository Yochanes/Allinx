package io.ktor.util.collections;

import io.ktor.util.InternalAPI;
import io.ktor.util.Lock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/collections/ConcurrentSet;", "", "Key", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConcurrentSet<Key> implements Set<Key>, KMutableSet {

    /* JADX INFO: renamed from: a */
    public final Lock f46547a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f46548b;

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentSet$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/util/collections/ConcurrentSet$iterator$1", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class C59481 implements Iterator<Object>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        public final ConcurrentMap$iterator$1 f46549a;

        public C59481(ConcurrentSet concurrentSet) {
            ConcurrentMap concurrentMap = concurrentSet.f46548b;
            concurrentMap.getClass();
            this.f46549a = new ConcurrentMap$iterator$1(concurrentMap);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f46549a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.f46549a.next().getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f46549a.remove();
        }
    }

    public ConcurrentSet() {
        Lock lock = new Lock();
        ConcurrentMap concurrentMap = new ConcurrentMap(lock, 0, 2);
        this.f46547a = lock;
        this.f46548b = concurrentMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object element) {
        ConcurrentMap concurrentMap = this.f46548b;
        Intrinsics.m18599g(element, "element");
        Lock lock = this.f46547a;
        try {
            lock.f46472a.lock();
            boolean z2 = !concurrentMap.containsKey(element);
            concurrentMap.put(element, Unit.f51459a);
            return z2;
        } finally {
            lock.m17171a();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (add(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f46548b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            return this.f46548b.containsKey(obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f46548b.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        Lock lock = this.f46547a;
        try {
            lock.f46472a.lock();
            boolean z2 = false;
            if (obj != null && (obj instanceof Set) && ((Set) obj).size() == this.f46548b._size) {
                C59481 c59481 = new C59481(this);
                while (true) {
                    if (!c59481.f46549a.hasNext()) {
                        z2 = true;
                        break;
                    }
                    if (!((Set) obj).contains(c59481.next())) {
                        break;
                    }
                }
            }
            return z2;
        } finally {
            lock.m17171a();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        Lock lock = this.f46547a;
        try {
            lock.f46472a.lock();
            C59481 c59481 = new C59481(this);
            int iHashCode = 7;
            while (c59481.f46549a.hasNext()) {
                iHashCode = ArraysKt.m18364d0(new Object[]{Integer.valueOf(c59481.next().hashCode()), Integer.valueOf(iHashCode)}).hashCode();
            }
            return iHashCode;
        } finally {
            lock.m17171a();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f46548b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C59481(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj != null) {
            return Intrinsics.m18594b((Unit) this.f46548b.remove(obj), Unit.f51459a);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!remove(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        C59481 c59481 = new C59481(this);
        boolean z2 = false;
        while (c59481.f46549a.hasNext()) {
            if (!elements.contains(c59481.next())) {
                c59481.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f46548b._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        Lock lock = this.f46547a;
        try {
            lock.f46472a.lock();
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            C59481 c59481 = new C59481(this);
            int i = 0;
            while (c59481.hasNext()) {
                Object next = c59481.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.m18455s0();
                    throw null;
                }
                sb.append(String.valueOf(next));
                if (i != this.f46548b._size - 1) {
                    sb.append(", ");
                }
                i = i2;
            }
            sb.append("]");
            String string = sb.toString();
            Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
            lock.m17171a();
            return string;
        } catch (Throwable th) {
            lock.m17171a();
            throw th;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
