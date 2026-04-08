package kotlin.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    /* JADX INFO: renamed from: b */
    public static final void m18494b(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.f51426a, pair.f51427b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18495c(List list, LinkedHashMap linkedHashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f51426a, pair.f51427b);
        }
    }
}
