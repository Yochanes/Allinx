package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverterFactory;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/unit/FontScaling;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface FontScaling {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: S0 */
    float getF20557b();

    /* JADX INFO: renamed from: n */
    default long mo2555n(float f) {
        float[] fArr = FontScaleConverterFactory.f20579a;
        if (!(getF20557b() >= 1.03f)) {
            return TextUnitKt.m6681d(f / getF20557b(), 4294967296L);
        }
        FontScaleConverter fontScaleConverterM6692a = FontScaleConverterFactory.m6692a(getF20557b());
        return TextUnitKt.m6681d(fontScaleConverterM6692a != null ? fontScaleConverterM6692a.mo6671a(f) : f / getF20557b(), 4294967296L);
    }

    /* JADX INFO: renamed from: q */
    default float mo2557q(long j) {
        float fM6675c;
        float fMo2550S0;
        if (!TextUnitType.m6682a(TextUnit.m6674b(j), 4294967296L)) {
            InlineClassHelperKt.m6649b("Only Sp can convert to Px");
        }
        float[] fArr = FontScaleConverterFactory.f20579a;
        if (getF20557b() >= 1.03f) {
            FontScaleConverter fontScaleConverterM6692a = FontScaleConverterFactory.m6692a(getF20557b());
            fM6675c = TextUnit.m6675c(j);
            if (fontScaleConverterM6692a != null) {
                return fontScaleConverterM6692a.mo6672b(fM6675c);
            }
            fMo2550S0 = getF20557b();
        } else {
            fM6675c = TextUnit.m6675c(j);
            fMo2550S0 = getF20557b();
        }
        return fMo2550S0 * fM6675c;
    }
}
