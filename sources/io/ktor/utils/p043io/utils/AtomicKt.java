package io.ktor.utils.p043io.utils;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class AtomicKt {
    /* JADX INFO: renamed from: a */
    public static final int m17577a(int i, String str) {
        String property;
        Integer numM20428Z;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numM20428Z = StringsKt.m20428Z(property)) == null) ? i : numM20428Z.intValue();
    }
}
