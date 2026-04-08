package io.reactivex.rxjava3.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
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
    public final boolean containsAll(Collection collection) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof VolatileSizeArrayList)) {
            throw null;
        }
        ((VolatileSizeArrayList) obj).getClass();
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
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw null;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw null;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        throw null;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw null;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw null;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        throw null;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw null;
    }
}
