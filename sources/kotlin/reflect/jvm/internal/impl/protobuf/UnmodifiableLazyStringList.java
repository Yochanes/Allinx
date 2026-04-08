package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: a */
    public final LazyStringArrayList f54167a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$1 */
    /* JADX INFO: compiled from: Proguard */
    class C61631 implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator f54168a;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f54168a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f54168a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.f54168a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f54168a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return (String) this.f54168a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f54168a.previousIndex();
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

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$2 */
    /* JADX INFO: compiled from: Proguard */
    class C61642 implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator f54169a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54169a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return (String) this.f54169a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringArrayList lazyStringArrayList) {
        this.f54167a = lazyStringArrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: L */
    public final void mo19712L(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f54167a.get(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString getByteString(int i) {
        return this.f54167a.getByteString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f54167a.f54126a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C61642 c61642 = new C61642();
        c61642.f54169a = this.f54167a.iterator();
        return c61642;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C61631 c61631 = new C61631();
        c61631.f54168a = this.f54167a.listIterator(i);
        return c61631;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54167a.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList getUnmodifiableView() {
        return this;
    }
}
