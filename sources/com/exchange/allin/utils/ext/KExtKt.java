package com.exchange.allin.utils.ext;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KExtKt {
    /* JADX INFO: renamed from: a */
    public static final String m14199a(Map map) {
        Intrinsics.m18599g(map, "<this>");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((String) entry.getValue()).length() == 0) {
                return str;
            }
        }
        return "";
    }
}
