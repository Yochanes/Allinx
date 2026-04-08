package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    /* JADX INFO: renamed from: a */
    public static final Map m18493a(Map map) {
        Intrinsics.m18599g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.m18598f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
