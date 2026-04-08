package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class MapsKt extends MapsKt___MapsKt {
    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Map m18481d() {
        return EmptyMap.f51497a;
    }

    /* JADX INFO: renamed from: e */
    public static Object m18482e(Object obj, Map map) {
        Intrinsics.m18599g(map, "<this>");
        if (map instanceof MapWithDefault) {
            ((MapWithDefault) map).mo18480d();
            throw null;
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m18483f(Pair... pairArr) {
        HashMap map = new HashMap(m18484g(pairArr.length));
        MapsKt__MapsKt.m18494b(map, pairArr);
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static int m18484g(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public static Map m18485h(Pair pair) {
        Intrinsics.m18599g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f51426a, pair.f51427b);
        Intrinsics.m18598f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: i */
    public static Map m18486i(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.f51497a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m18484g(pairArr.length));
        MapsKt__MapsKt.m18494b(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    public static LinkedHashMap m18487j(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m18484g(pairArr.length));
        MapsKt__MapsKt.m18494b(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k */
    public static LinkedHashMap m18488k(Map map, Map map2) {
        Intrinsics.m18599g(map, "<this>");
        Intrinsics.m18599g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l */
    public static Map m18489l(List list) {
        boolean z2 = list instanceof Collection;
        EmptyMap emptyMap = EmptyMap.f51497a;
        if (!z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MapsKt__MapsKt.m18495c(list, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : MapsKt__MapsJVMKt.m18493a(linkedHashMap) : emptyMap;
        }
        List list2 = list;
        int size2 = list2.size();
        if (size2 == 0) {
            return emptyMap;
        }
        if (size2 == 1) {
            return m18485h((Pair) (list instanceof List ? list.get(0) : list2.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m18484g(list2.size()));
        MapsKt__MapsKt.m18495c(list, linkedHashMap2);
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: m */
    public static Map m18490m(Map map) {
        Intrinsics.m18599g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m18492o(map) : MapsKt__MapsJVMKt.m18493a(map) : EmptyMap.f51497a;
    }

    /* JADX INFO: renamed from: n */
    public static Map m18491n(TransformingSequence transformingSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TransformingSequence.C62481 c62481 = new TransformingSequence.C62481();
        while (c62481.f55159a.hasNext()) {
            Pair pair = (Pair) c62481.next();
            linkedHashMap.put(pair.f51426a, pair.f51427b);
        }
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : MapsKt__MapsJVMKt.m18493a(linkedHashMap) : EmptyMap.f51497a;
    }

    /* JADX INFO: renamed from: o */
    public static LinkedHashMap m18492o(Map map) {
        Intrinsics.m18599g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
