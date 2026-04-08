package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ReversedList<T> extends AbstractMutableList<T> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f51504a;

    /* JADX INFO: renamed from: kotlin.collections.ReversedList$listIterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010+\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C59811 implements ListIterator<Object>, KMutableListIterator {

        /* JADX INFO: renamed from: a */
        public final ListIterator f51505a;

        public C59811(int i) {
            this.f51505a = ReversedList.this.f51504a.listIterator(CollectionsKt__ReversedViewsKt.m18474e(i, ReversedList.this));
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            ListIterator listIterator = this.f51505a;
            listIterator.add(obj);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f51505a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f51505a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f51505a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return CollectionsKt.m18405F(ReversedList.this) - this.f51505a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return this.f51505a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return CollectionsKt.m18405F(ReversedList.this) - this.f51505a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f51505a.remove();
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.f51505a.set(obj);
        }
    }

    public ReversedList(ArrayList arrayList) {
        this.f51504a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f51504a.add(CollectionsKt__ReversedViewsKt.m18474e(i, this), obj);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: c */
    public final int getF16774j() {
        return this.f51504a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f51504a.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: e */
    public final Object mo4621e(int i) {
        return this.f51504a.remove(CollectionsKt__ReversedViewsKt.m18473d(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f51504a.get(CollectionsKt__ReversedViewsKt.m18473d(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C59811(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C59811(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f51504a.set(CollectionsKt__ReversedViewsKt.m18473d(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C59811(i);
    }
}
