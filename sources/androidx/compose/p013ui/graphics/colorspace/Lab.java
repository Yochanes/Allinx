package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Lab extends ColorSpace {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "", "A", "F", "B", "C", "D", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: a */
    public final float[] mo5315a(float[] fArr) {
        float f = fArr[0];
        float[] fArr2 = Illuminant.f17730e;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float fCbrt = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float f5 = (116.0f * fCbrt2) - 16.0f;
        float f6 = (fCbrt - fCbrt2) * 500.0f;
        float f7 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        fArr[0] = f5;
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        fArr[1] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        fArr[2] = f7 <= 128.0f ? f7 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: b */
    public final float mo5316b(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: c */
    public final float mo5317c(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: e */
    public final long mo5319e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f4 = (f + 16.0f) / 116.0f;
        float f5 = (f2 * 0.002f) + f4;
        float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float[] fArr = Illuminant.f17730e;
        return (((long) Float.floatToRawIntBits(f7 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f6 * fArr[0])) << 32);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: f */
    public final float[] mo5320f(float[] fArr) {
        float f = fArr[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        fArr[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f10 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f11 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = Illuminant.f17730e;
        fArr[0] = f9 * fArr2[0];
        fArr[1] = f10 * fArr2[1];
        fArr[2] = f11 * fArr2[2];
        return fArr;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: g */
    public final float mo5321g(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
        return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * Illuminant.f17730e[2];
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: h */
    public final long mo5322h(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = Illuminant.f17730e;
        float f5 = f / fArr[0];
        float f6 = f2 / fArr[1];
        float f7 = f3 / fArr[2];
        float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float f8 = (116.0f * fCbrt2) - 16.0f;
        float f9 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 > 100.0f) {
            f8 = 100.0f;
        }
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        if (f9 > 128.0f) {
            f9 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.m5192a(f8, f9, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f4, colorSpace);
    }
}
