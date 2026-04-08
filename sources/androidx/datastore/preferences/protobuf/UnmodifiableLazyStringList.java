package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final LazyStringArrayList f24149a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$1 */
    /* JADX INFO: compiled from: Proguard */
    class C15981 implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator f24150a;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f24150a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f24150a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.f24150a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f24150a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return (String) this.f24150a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f24150a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$2 */
    /* JADX INFO: compiled from: Proguard */
    class C15992 implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator f24151a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24151a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return (String) this.f24151a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringArrayList lazyStringArrayList) {
        this.f24149a = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f24149a.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object getRaw(int i) {
        return this.f24149a.f24023b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f24149a.f24023b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C15992 c15992 = new C15992();
        c15992.f24151a = this.f24149a.iterator();
        return c15992;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C15981 c15981 = new C15981();
        c15981.f24150a = this.f24149a.listIterator(i);
        return c15981;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24149a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    /* JADX INFO: renamed from: u */
    public final void mo8527u(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final LazyStringList getUnmodifiableView() {
        return this;
    }
}
