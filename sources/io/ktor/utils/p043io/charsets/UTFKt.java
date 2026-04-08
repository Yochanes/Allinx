package io.ktor.utils.p043io.charsets;

import com.google.common.primitives.UnsignedBytes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class UTFKt {
    /* JADX INFO: renamed from: a */
    public static final IndexOutOfBoundsException m17422a(int i, int i2) {
        return new IndexOutOfBoundsException("0 (offset) + " + i + " (length) > " + i2 + " (array.length)");
    }

    /* JADX INFO: renamed from: b */
    public static final void m17423b(int i) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i) + " found");
    }

    /* JADX INFO: renamed from: c */
    public static final void m17424c(byte b2) {
        StringBuilder sb = new StringBuilder("Unsupported byte code, first byte is 0x");
        int i = b2 & UnsignedBytes.MAX_VALUE;
        CharsKt.m20380b(16);
        String string = Integer.toString(i, 16);
        Intrinsics.m18598f(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        sb.append(StringsKt.m20404B(2, string));
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public static final long m17425d(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
