package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/LinearFontScaleConverter;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class LinearFontScaleConverter implements FontScaleConverter {

    /* JADX INFO: renamed from: a */
    public final float f20573a;

    public LinearFontScaleConverter(float f) {
        this.f20573a = f;
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    /* JADX INFO: renamed from: a */
    public final float mo6671a(float f) {
        return f / this.f20573a;
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    /* JADX INFO: renamed from: b */
    public final float mo6672b(float f) {
        return f * this.f20573a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.f20573a, ((LinearFontScaleConverter) obj).f20573a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20573a);
    }

    public final String toString() {
        return AbstractC0000a.m16m(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f20573a, ')');
    }
}
