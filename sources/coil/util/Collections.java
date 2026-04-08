package coil.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.util.-Collections, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class Collections {
    /* JADX INFO: renamed from: a */
    public static final List m12525a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? java.util.Collections.unmodifiableList(new ArrayList(list)) : java.util.Collections.singletonList(CollectionsKt.m18398B(list)) : EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m12526b(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.m18481d();
        }
        if (size != 1) {
            return java.util.Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.m18396A(map.entrySet());
        return java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
