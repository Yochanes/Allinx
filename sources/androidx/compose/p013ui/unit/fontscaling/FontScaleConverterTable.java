package androidx.compose.p013ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "Companion", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RestrictTo
public final class FontScaleConverterTable implements FontScaleConverter {

    /* JADX INFO: renamed from: a */
    public final float[] f20582a;

    /* JADX INFO: renamed from: b */
    public final float[] f20583b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final float m6694a(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float f5;
            float fAbs = Math.abs(f);
            float fSignum = Math.signum(f);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                return fSignum * fArr2[iBinarySearch];
            }
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            if (i2 >= fArr.length - 1) {
                float f6 = fArr[fArr.length - 1];
                float f7 = fArr2[fArr.length - 1];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return (f7 / f6) * f;
            }
            if (i2 == -1) {
                float f8 = fArr[0];
                f4 = fArr2[0];
                f5 = f8;
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                float f9 = fArr[i2];
                float f10 = fArr[i];
                f2 = fArr2[i2];
                f3 = f9;
                f4 = fArr2[i];
                f5 = f10;
            }
            return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
        }
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f20582a = fArr;
        this.f20583b = fArr2;
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    /* JADX INFO: renamed from: a */
    public final float mo6671a(float f) {
        return Companion.m6694a(f, this.f20583b, this.f20582a);
    }

    @Override // androidx.compose.p013ui.unit.fontscaling.FontScaleConverter
    /* JADX INFO: renamed from: b */
    public final float mo6672b(float f) {
        return Companion.m6694a(f, this.f20582a, this.f20583b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.f20582a, fontScaleConverterTable.f20582a) && Arrays.equals(this.f20583b, fontScaleConverterTable.f20583b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20583b) + (Arrays.hashCode(this.f20582a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f20582a);
        Intrinsics.m18598f(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f20583b);
        Intrinsics.m18598f(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
