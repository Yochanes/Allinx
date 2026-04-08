package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", "V", "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f51563a;

    public MapBuilderEntries(MapBuilder mapBuilder) {
        this.f51563a = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.m18599g(element, "element");
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
        return this.f51563a.f51551n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f51563a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        return this.f51563a.m18534j(elements);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    /* JADX INFO: renamed from: e */
    public final boolean mo18507e(Map.Entry element) {
        Intrinsics.m18599g(element, "element");
        return this.f51563a.m18535k(element);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    /* JADX INFO: renamed from: f */
    public final boolean mo18508f(Map.Entry element) {
        Intrinsics.m18599g(element, "element");
        MapBuilder mapBuilder = this.f51563a;
        mapBuilder.getClass();
        mapBuilder.m18532f();
        int iM18537m = mapBuilder.m18537m(element.getKey());
        if (iM18537m < 0) {
            return false;
        }
        Object[] objArr = mapBuilder.f51544b;
        Intrinsics.m18596d(objArr);
        if (!Intrinsics.m18594b(objArr[iM18537m], element.getValue())) {
            return false;
        }
        mapBuilder.m18541q(iM18537m);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f51563a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f51563a;
        mapBuilder.getClass();
        return new MapBuilder.EntriesItr(mapBuilder);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51563a.m18532f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51563a.m18532f();
        return super.retainAll(elements);
    }
}
