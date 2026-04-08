package androidx.compose.p013ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextUnitKt {
    /* JADX INFO: renamed from: a */
    public static final void m6678a(long j) {
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.m6648a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m6679b(double d) {
        return m6681d((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: c */
    public static final long m6680c(int i) {
        return m6681d(i, 4294967296L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m6681d(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        return jFloatToRawIntBits;
    }
}
