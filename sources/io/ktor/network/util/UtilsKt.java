package io.ktor.network.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static Timeout m17153a(CoroutineScope createTimeout, String str, long j, Function1 function1) {
        UtilsKt$createTimeout$1 utilsKt$createTimeout$1 = UtilsKt$createTimeout$1.f46400a;
        Intrinsics.m18599g(createTimeout, "$this$createTimeout");
        return new Timeout(str, j, utilsKt$createTimeout$1, createTimeout, function1);
    }
}
