package kotlin.collections;

import androidx.compose.animation.AbstractC0455a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "SubList", "IteratorImpl", "ListIteratorImpl", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "", "maxArraySize", "I", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m18319a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbM24u = AbstractC0000a.m24u("startIndex: ", ", endIndex: ", ", size: ", i, i2);
                sbM24u.append(i3);
                throw new IndexOutOfBoundsException(sbM24u.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m18320b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "index: ", ", size: "));
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m18321c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "index: ", ", size: "));
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m18322d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbM24u = AbstractC0000a.m24u("fromIndex: ", ", toIndex: ", ", size: ", i, i2);
                sbM24u.append(i3);
                throw new IndexOutOfBoundsException(sbM24u.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m18323e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public class IteratorImpl implements Iterator<E>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public int f51469a;

        public IteratorImpl() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f51469a < AbstractList.this.getF51474c();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f51469a;
            this.f51469a = i + 1;
            return AbstractList.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i) {
            super();
            Companion.m18321c(i, AbstractList.this.getF51474c());
            this.f51469a = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f51469a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f51469a;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.f51469a - 1;
            this.f51469a = i;
            return AbstractList.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f51469a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final AbstractList f51472a;

        /* JADX INFO: renamed from: b */
        public final int f51473b;

        /* JADX INFO: renamed from: c */
        public final int f51474c;

        public SubList(AbstractList abstractList, int i, int i2) {
            this.f51472a = abstractList;
            this.f51473b = i;
            Companion.m18322d(i, i2, abstractList.getF51474c());
            this.f51474c = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF51474c() {
            return this.f51474c;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final Object get(int i) {
            Companion.m18320b(i, this.f51474c);
            return this.f51472a.get(this.f51473b + i);
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Intrinsics.m18599g(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.m18594b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.m18594b(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.m18594b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new SubList(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new ListIteratorImpl(i);
    }
}
