package io.ktor.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/CaseInsensitiveSet;", "", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CaseInsensitiveSet implements Set<String>, KMutableSet {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        String element = (String) obj;
        Intrinsics.m18599g(element, "element");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator it = elements.iterator();
        if (!it.hasNext()) {
            return false;
        }
        String element = (String) it.next();
        Intrinsics.m18599g(element, "element");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String element = (String) obj;
        Intrinsics.m18599g(element, "element");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String element = (String) obj;
        Intrinsics.m18599g(element, "element");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
