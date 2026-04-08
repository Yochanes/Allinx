package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HexExtensionsKt {

    /* JADX INFO: renamed from: a */
    public static final int[] f55180a;

    /* JADX INFO: renamed from: b */
    public static final long[] f55181b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f55180a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f55181b = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m20384a(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            Intrinsics.m18597e(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i, i2);
            Intrinsics.m18598f(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + i3);
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbM20q = AbstractC0000a.m20q(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM20q.append(str.charAt(i));
                    sbM20q.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM20q.toString());
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m20385b(int i, int i2, String str) {
        HexFormat format = HexFormat.f55182d;
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(format, "format");
        AbstractList.Companion.m18319a(i, i2, str.length());
        if (format.f55185c.f55188a) {
            m20384a(i, i2, str);
            return m20386c(i, i2, str);
        }
        if (i2 - i > 0) {
            m20384a(i, i2, str);
            return m20386c(i, i2, str);
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    /* JADX INFO: renamed from: c */
    public static final long m20386c(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f55181b[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbM20q.append(str.charAt(i));
            throw new NumberFormatException(sbM20q.toString());
        }
        return j;
    }
}
