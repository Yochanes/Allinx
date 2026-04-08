package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ColorSpace {

    /* JADX INFO: renamed from: a */
    public final String f17690a;

    /* JADX INFO: renamed from: b */
    public final long f17691b;

    /* JADX INFO: renamed from: c */
    public final int f17692c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "", "MaxId", "I", "MinId", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ColorSpace(String str, long j, int i) {
        this.f17690a = str;
        this.f17691b = j;
        this.f17692c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float[] mo5315a(float[] fArr);

    /* JADX INFO: renamed from: b */
    public abstract float mo5316b(int i);

    /* JADX INFO: renamed from: c */
    public abstract float mo5317c(int i);

    /* JADX INFO: renamed from: d */
    public boolean getF17749q() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public long mo5319e(float f, float f2, float f3) {
        float[] fArrMo5320f = mo5320f(new float[]{f, f2, f3});
        return (((long) Float.floatToRawIntBits(fArrMo5320f[0])) << 32) | (((long) Float.floatToRawIntBits(fArrMo5320f[1])) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f17692c == colorSpace.f17692c && Intrinsics.m18594b(this.f17690a, colorSpace.f17690a)) {
            return ColorModel.m5313a(this.f17691b, colorSpace.f17691b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract float[] mo5320f(float[] fArr);

    /* JADX INFO: renamed from: g */
    public float mo5321g(float f, float f2, float f3) {
        return mo5320f(new float[]{f, f2, f3})[2];
    }

    /* JADX INFO: renamed from: h */
    public long mo5322h(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i = ColorModel.f17689e;
        float[] fArr = new float[(int) (this.f17691b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrMo5315a = mo5315a(fArr);
        return ColorKt.m5192a(fArrMo5315a[0], fArrMo5315a[1], fArrMo5315a[2], f4, colorSpace);
    }

    public int hashCode() {
        int iHashCode = this.f17690a.hashCode() * 31;
        int i = ColorModel.f17689e;
        return AbstractC0455a.m2231f(this.f17691b, iHashCode, 31) + this.f17692c;
    }

    public final String toString() {
        return this.f17690a + " (id=" + this.f17692c + ", model=" + ((Object) ColorModel.m5314b(this.f17691b)) + ')';
    }
}
