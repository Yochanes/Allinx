package kotlin.uuid;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    /* JADX INFO: renamed from: a */
    public static final void m20488a(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbM20q.append(str.charAt(i));
        sbM20q.append('\'');
        throw new IllegalArgumentException(sbM20q.toString().toString());
    }

    /* JADX INFO: renamed from: b */
    public static final void m20489b(long j, byte[] bArr, int i, int i2) {
        int i3 = (i2 * 2) + i;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = HexExtensionsKt.f55180a[(int) (255 & j)];
            bArr[i3 - 1] = (byte) i5;
            i3 -= 2;
            bArr[i3] = (byte) (i5 >> 8);
            j >>= 8;
        }
    }
}
