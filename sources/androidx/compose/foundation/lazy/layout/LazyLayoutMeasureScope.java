package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.unit.DpKt;
import androidx.compose.p013ui.unit.DpSize;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension
public interface LazyLayoutMeasureScope extends MeasureScope {
    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: G */
    default long mo2549G(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo2551X0 = mo2551X0(DpSize.m6647b(j));
        return (((long) Float.floatToRawIntBits(mo2551X0(DpSize.m6646a(j)))) & 4294967295L) | (Float.floatToRawIntBits(fMo2551X0) << 32);
    }

    /* JADX INFO: renamed from: N0 */
    List mo3062N0(int i, long j);

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: n */
    default long mo2555n(float f) {
        return TextUnitKt.m6681d(f / getF20555b(), 4294967296L);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: o */
    default long mo2556o(long j) {
        if (j != 9205357640488583168L) {
            return DpKt.m6644b(mo2563w(Float.intBitsToFloat((int) (j >> 32))), mo2563w(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: q */
    default float mo2557q(long j) {
        if (!TextUnitType.m6682a(TextUnit.m6674b(j), 4294967296L)) {
            InlineClassHelperKt.m2707c("Only Sp can convert to Px");
        }
        return getF20555b() * TextUnit.m6675c(j);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: t */
    default long mo2559t(int i) {
        return TextUnitKt.m6681d(i / (getF20554a() * getF20555b()), 4294967296L);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: u */
    default long mo2561u(float f) {
        return TextUnitKt.m6681d(f / (getF20554a() * getF20555b()), 4294967296L);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: v */
    default float mo2562v(int i) {
        return i / getF20554a();
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: w */
    default float mo2563w(float f) {
        return f / getF20554a();
    }
}
