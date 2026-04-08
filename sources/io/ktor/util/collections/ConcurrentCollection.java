package io.ktor.util.collections;

import io.ktor.util.InternalAPI;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/collections/ConcurrentCollection;", "E", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public class ConcurrentCollection<E> implements Collection<E>, KMutableCollection {
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
