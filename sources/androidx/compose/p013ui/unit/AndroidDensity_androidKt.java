package androidx.compose.p013ui.unit;

import android.content.Context;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidDensity_androidKt {
    /* JADX INFO: renamed from: a */
    public static final Density m6609a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverterM6692a = FontScaleConverterFactory.m6692a(f);
        if (fontScaleConverterM6692a == null) {
            fontScaleConverterM6692a = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, fontScaleConverterM6692a);
    }
}
