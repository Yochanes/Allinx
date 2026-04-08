package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface Density extends FontScaling {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: G */
    default long mo2549G(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo2551X0 = mo2551X0(DpSize.m6647b(j));
        return (((long) Float.floatToRawIntBits(mo2551X0(DpSize.m6646a(j)))) & 4294967295L) | (Float.floatToRawIntBits(fMo2551X0) << 32);
    }

    /* JADX INFO: renamed from: X0 */
    default float mo2551X0(float f) {
        return getDensity() * f;
    }

    /* JADX INFO: renamed from: d1 */
    default int mo2553d1(long j) {
        return Math.round(mo2565x1(j));
    }

    float getDensity();

    /* JADX INFO: renamed from: k1 */
    default int mo2554k1(float f) {
        float fMo2551X0 = mo2551X0(f);
        if (Float.isInfinite(fMo2551X0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo2551X0);
    }

    /* JADX INFO: renamed from: o */
    default long mo2556o(long j) {
        if (j != 9205357640488583168L) {
            return DpKt.m6644b(mo2563w(Float.intBitsToFloat((int) (j >> 32))), mo2563w(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: t */
    default long mo2559t(int i) {
        return mo2555n(mo2562v(i));
    }

    /* JADX INFO: renamed from: u */
    default long mo2561u(float f) {
        return mo2555n(mo2563w(f));
    }

    /* JADX INFO: renamed from: v */
    default float mo2562v(int i) {
        return i / getDensity();
    }

    /* JADX INFO: renamed from: w */
    default float mo2563w(float f) {
        return f / getDensity();
    }

    /* JADX INFO: renamed from: x1 */
    default float mo2565x1(long j) {
        if (!TextUnitType.m6682a(TextUnit.m6674b(j), 4294967296L)) {
            InlineClassHelperKt.m6649b("Only Sp can convert to Px");
        }
        return mo2551X0(mo2557q(j));
    }
}
