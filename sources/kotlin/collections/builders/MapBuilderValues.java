package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilderValues;", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MapBuilderValues<V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f51565a;

    public MapBuilderValues(MapBuilder mapBuilder) {
        this.f51565a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableCollection
    /* JADX INFO: renamed from: c */
    public final int mo4661c() {
        return this.f51565a.f51551n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f51565a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f51565a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f51565a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f51565a;
        mapBuilder.getClass();
        return new MapBuilder.ValuesItr(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.f51565a;
        mapBuilder.m18532f();
        int iM18538n = mapBuilder.m18538n(obj);
        if (iM18538n < 0) {
            return false;
        }
        mapBuilder.m18541q(iM18538n);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51565a.m18532f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51565a.m18532f();
        return super.retainAll(elements);
    }
}
