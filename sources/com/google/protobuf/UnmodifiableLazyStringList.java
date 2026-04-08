package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    /* JADX INFO: renamed from: com.google.protobuf.UnmodifiableLazyStringList$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C49321 implements ListIterator<String> {
        ListIterator<String> iter;
        final /* synthetic */ int val$index;

        public C49321(int i) {
            this.val$index = i;
            this.iter = UnmodifiableLazyStringList.access$000(UnmodifiableLazyStringList.this).listIterator(i);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
            add2(str);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.iter.nextIndex();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ String previous() {
            return previous2();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.iter.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
            set2(str);
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: previous, reason: avoid collision after fix types in other method */
        public String previous2() {
            return this.iter.previous();
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.UnmodifiableLazyStringList$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C49332 implements Iterator<String> {
        Iterator<String> iter;

        public C49332() {
            this.iter = UnmodifiableLazyStringList.access$000(UnmodifiableLazyStringList.this).iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ String next() {
            return next2();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public String next2() {
            return this.iter.next();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    public static /* synthetic */ LazyStringList access$000(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        return unmodifiableLazyStringList.list;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return get(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        return this.list.getByteArray(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public Object getRaw(int i) {
        return this.list.getRaw(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C49332();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C49321(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.list.get(i);
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }
}
