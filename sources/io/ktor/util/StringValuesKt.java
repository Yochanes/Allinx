package io.ktor.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class StringValuesKt {
    /* JADX INFO: renamed from: a */
    public static final void m17180a(StringValuesBuilder appendAll, StringValuesBuilder builder) {
        Intrinsics.m18599g(appendAll, "$this$appendAll");
        Intrinsics.m18599g(builder, "builder");
        Set unmodifiable = builder.f46488a.entrySet();
        Intrinsics.m18599g(unmodifiable, "$this$unmodifiable");
        Set<Map.Entry> setUnmodifiableSet = Collections.unmodifiableSet(unmodifiable);
        Intrinsics.m18598f(setUnmodifiableSet, "Collections.unmodifiableSet(this)");
        for (Map.Entry entry : setUnmodifiableSet) {
            appendAll.m17177c((List) entry.getValue(), (String) entry.getKey());
        }
    }
}
