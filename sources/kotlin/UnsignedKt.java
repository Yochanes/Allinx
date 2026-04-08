package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmName
public final class UnsignedKt {
    /* JADX INFO: renamed from: a */
    public static final double m18316a(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    /* JADX INFO: renamed from: b */
    public static final String m18317b(int i, long j) {
        if (j >= 0) {
            CharsKt.m20380b(i);
            String string = Long.toString(j, i);
            Intrinsics.m18598f(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        CharsKt.m20380b(i);
        String string2 = Long.toString(j3, i);
        Intrinsics.m18598f(string2, "toString(...)");
        CharsKt.m20380b(i);
        String string3 = Long.toString(j4, i);
        Intrinsics.m18598f(string3, "toString(...)");
        return string2.concat(string3);
    }
}
