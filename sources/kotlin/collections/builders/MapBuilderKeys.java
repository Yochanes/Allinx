package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MapBuilderKeys<E> extends AbstractMutableSet<E> implements Set<E>, KMutableSet {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f51564a;

    public MapBuilderKeys(MapBuilder mapBuilder) {
        this.f51564a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* JADX INFO: renamed from: c */
    public final int getF16832f() {
        return this.f51564a.f51551n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f51564a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f51564a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f51564a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f51564a;
        mapBuilder.getClass();
        return new MapBuilder.KeysItr(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.f51564a;
        mapBuilder.m18532f();
        int iM18537m = mapBuilder.m18537m(obj);
        if (iM18537m < 0) {
            return false;
        }
        mapBuilder.m18541q(iM18537m);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51564a.m18532f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51564a.m18532f();
        return super.retainAll(elements);
    }
}
