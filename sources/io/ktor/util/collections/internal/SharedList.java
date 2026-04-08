package io.ktor.util.collections.internal;

import io.ktor.util.InternalAPI;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/collections/internal/SharedList;", "T", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SharedList<T> implements List<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReferenceArray f46581a;

    /* JADX INFO: renamed from: b */
    public final int f46582b;

    /* JADX INFO: renamed from: io.ktor.util.collections.internal.SharedList$listIterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010*\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/util/collections/internal/SharedList$listIterator$1", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class C59521 implements ListIterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f46583b = AtomicIntegerFieldUpdater.newUpdater(C59521.class, "currentIndex");
        private volatile /* synthetic */ int currentIndex;

        public C59521(int i) {
            this.currentIndex = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.currentIndex < SharedList.this.f46582b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.currentIndex > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new IllegalStateException("Check failed.");
            }
            return SharedList.this.f46581a.get(f46583b.getAndIncrement(this));
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            if (hasNext()) {
                return this.currentIndex + 1;
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            if (!hasPrevious()) {
                throw new IllegalStateException("Check failed.");
            }
            return SharedList.this.f46581a.get(f46583b.getAndDecrement(this));
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            if (hasPrevious()) {
                return this.currentIndex - 1;
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SharedList(int i) {
        this.f46582b = i;
        this.f46581a = new AtomicReferenceArray(i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public final void m17195c(int i, Object obj) {
        this.f46581a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        for (int i = 0; i < this.f46582b; i++) {
            if (Intrinsics.m18594b(this.f46581a.get(i), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f46581a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f46582b; i++) {
            if (Intrinsics.m18594b(this.f46581a.get(i), obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f46582b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C59521(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ((AbstractList) CollectionsKt.m18440l(this)).indexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C59521(0);
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
        return this.f46582b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        SharedList sharedList = new SharedList(i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            sharedList.m17195c(i3 - i, this.f46581a.get(i3));
        }
        return sharedList;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
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
        return new C59521(i);
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
