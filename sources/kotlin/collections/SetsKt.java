package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class SetsKt extends SetsKt___SetsKt {
    /* JADX INFO: renamed from: a */
    public static SetBuilder m18497a(SetBuilder setBuilder) {
        MapBuilder mapBuilder = setBuilder.f51569a;
        mapBuilder.m18531e();
        return mapBuilder.f51551n > 0 ? setBuilder : SetBuilder.f51568b;
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashSet m18498b(Object... elements) {
        Intrinsics.m18599g(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(elements.length));
        ArraysKt___ArraysKt.m18394c(elements, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashSet m18499c(Set set, Object obj) {
        Intrinsics.m18599g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(set.size()));
        boolean z2 = false;
        for (Object obj2 : set) {
            boolean z3 = true;
            if (!z2 && Intrinsics.m18594b(obj2, obj)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashSet m18500d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(objArr.length));
        ArraysKt___ArraysKt.m18394c(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashSet m18501e(Set set, Iterable elements) {
        Intrinsics.m18599g(set, "<this>");
        Intrinsics.m18599g(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt.m18434i(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: f */
    public static LinkedHashSet m18502f(Set set, Object obj) {
        Intrinsics.m18599g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: g */
    public static Set m18503g(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.m18598f(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
