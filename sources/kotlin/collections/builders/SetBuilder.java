package kotlin.collections.builders;

import java.io.Serializable;
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
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SetBuilder<E> extends AbstractMutableSet<E> implements Set<E>, Serializable, KMutableSet {

    /* JADX INFO: renamed from: b */
    public static final SetBuilder f51568b;

    /* JADX INFO: renamed from: a */
    public final MapBuilder f51569a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/collections/builders/SetBuilder$Companion;", "", "Lkotlin/collections/builders/SetBuilder;", "", "Empty", "Lkotlin/collections/builders/SetBuilder;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        MapBuilder mapBuilder = MapBuilder.f51542s;
        f51568b = new SetBuilder(MapBuilder.f51542s);
    }

    public SetBuilder(MapBuilder backing) {
        Intrinsics.m18599g(backing, "backing");
        this.f51569a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f51569a.m18530c(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51569a.m18532f();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* JADX INFO: renamed from: c */
    public final int getF16832f() {
        return this.f51569a.f51551n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f51569a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f51569a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f51569a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f51569a;
        mapBuilder.getClass();
        return new MapBuilder.KeysItr(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.f51569a;
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
        this.f51569a.m18532f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        this.f51569a.m18532f();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }
}
