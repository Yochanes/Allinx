package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/CharsKt__CharKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class CharsKt extends CharsKt__CharKt {
    /* JADX INFO: renamed from: b */
    public static void m20380b(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "radix ", " was not in valid range ");
            sbM20q.append(new IntRange(2, 36, 1));
            throw new IllegalArgumentException(sbM20q.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m20381c(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }
}
