package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class KeylineList implements List<Keyline>, KMappedMarker {

    /* JADX INFO: renamed from: i */
    public static final KeylineList f15312i = new KeylineList(EmptyList.f51496a);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f15313a;

    /* JADX INFO: renamed from: b */
    public final int f15314b;

    /* JADX INFO: renamed from: c */
    public final int f15315c;

    /* JADX INFO: renamed from: d */
    public final int f15316d;

    /* JADX INFO: renamed from: f */
    public final int f15317f;

    /* JADX INFO: renamed from: g */
    public final int f15318g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public KeylineList(List list) {
        int iNextIndex;
        int iNextIndex2;
        this.f15313a = list;
        Iterator it = iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Keyline) it.next()).f15310f) {
                break;
            } else {
                i2++;
            }
        }
        this.f15314b = i2;
        Iterator it2 = iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else if (!((Keyline) it2.next()).f15309e) {
                break;
            } else {
                i3++;
            }
        }
        this.f15315c = i3;
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!listIterator.previous().f15309e) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.f15316d = iNextIndex2;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (((Keyline) it3.next()).f15308d) {
                break;
            } else {
                i++;
            }
        }
        this.f15317f = i;
        ListIterator<Keyline> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().f15308d) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.f15318g = iNextIndex;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public final Keyline m4111c(int i) {
        return (Keyline) this.f15313a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Keyline)) {
            return false;
        }
        return this.f15313a.contains((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f15313a.containsAll(collection);
    }

    /* JADX INFO: renamed from: e */
    public final Keyline m4112e() {
        Keyline keyline = (Keyline) CollectionsKt.m18406G(this.f15318g, this);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeylineList) {
            ?? r0 = this.f15313a;
            KeylineList keylineList = (KeylineList) obj;
            if (r0.size() == keylineList.f15313a.size()) {
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.m18594b(m4111c(i), keylineList.m4111c(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline get(int i) {
        return m4111c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += get(i).hashCode() * 31;
        }
        return iHashCode;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.f15313a.indexOf((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15313a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f15313a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.f15313a.lastIndexOf((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator<Keyline> listIterator() {
        return this.f15313a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline set(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15313a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final List<Keyline> subList(int i, int i2) {
        return this.f15313a.subList(i, i2);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator<Keyline> listIterator(int i) {
        return this.f15313a.listIterator(i);
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
