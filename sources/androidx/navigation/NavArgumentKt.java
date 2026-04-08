package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"navigation-common_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NavArgumentKt {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m11196a(Map map, Function1 function1) {
        Intrinsics.m18599g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            NavArgument navArgument = (NavArgument) entry.getValue();
            Boolean boolValueOf = navArgument != null ? Boolean.valueOf(navArgument.f30166b) : null;
            Intrinsics.m18596d(boolValueOf);
            if (!boolValueOf.booleanValue() && !navArgument.f30167c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
