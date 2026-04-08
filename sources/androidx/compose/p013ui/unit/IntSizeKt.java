package androidx.compose.p013ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class IntSizeKt {
    /* JADX INFO: renamed from: a */
    public static final long m6667a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final long m6668b(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final long m6669c(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: d */
    public static final long m6670d(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }
}
