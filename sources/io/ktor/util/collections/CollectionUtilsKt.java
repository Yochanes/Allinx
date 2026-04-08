package io.ktor.util.collections;

import io.ktor.util.PlatformUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CollectionUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m17183a(Object... values) {
        Intrinsics.m18599g(values, "values");
        boolean z2 = PlatformUtils.f46487a;
        ArrayList arrayList = new ArrayList(values.length);
        for (Object obj : values) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
