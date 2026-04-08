package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.p013ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p006H.C0014a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: r */
    public static final C0014a f17735r = new C0014a(11);

    /* JADX INFO: renamed from: d */
    public final WhitePoint f17736d;

    /* JADX INFO: renamed from: e */
    public final float f17737e;

    /* JADX INFO: renamed from: f */
    public final float f17738f;

    /* JADX INFO: renamed from: g */
    public final TransferParameters f17739g;

    /* JADX INFO: renamed from: h */
    public final float[] f17740h;

    /* JADX INFO: renamed from: i */
    public final float[] f17741i;

    /* JADX INFO: renamed from: j */
    public final float[] f17742j;

    /* JADX INFO: renamed from: k */
    public final DoubleFunction f17743k;

    /* JADX INFO: renamed from: l */
    public final Function1 f17744l;

    /* JADX INFO: renamed from: m */
    public final C1223a f17745m;

    /* JADX INFO: renamed from: n */
    public final DoubleFunction f17746n;

    /* JADX INFO: renamed from: o */
    public final Function1 f17747o;

    /* JADX INFO: renamed from: p */
    public final C1223a f17748p;

    /* JADX INFO: renamed from: q */
    public final boolean f17749q;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static float m5335a(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        double d = transferParameters.f17752a;
        boolean z2 = d == -3.0d;
        double d2 = transferParameters.f17758g;
        double d3 = transferParameters.f17757f;
        this(str, fArr, whitePoint, null, z2 ? new C1225c(transferParameters, 4) : d == -2.0d ? new C1225c(transferParameters, 5) : (d3 == 0.0d && d2 == 0.0d) ? new C1225c(transferParameters, 6) : new C1225c(transferParameters, 7), d == -3.0d ? new C1225c(transferParameters, 0) : d == -2.0d ? new C1225c(transferParameters, 1) : (d3 == 0.0d && d2 == 0.0d) ? new C1225c(transferParameters, 2) : new C1225c(transferParameters, 3), 0.0f, 1.0f, transferParameters, i);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: a */
    public final float[] mo5315a(float[] fArr) {
        ColorSpaceKt.m5329g(this.f17742j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        C1223a c1223a = this.f17745m;
        fArr[0] = (float) c1223a.mo40d(d);
        fArr[1] = (float) c1223a.mo40d(fArr[1]);
        fArr[2] = (float) c1223a.mo40d(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: b */
    public final float mo5316b(int i) {
        return this.f17738f;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: c */
    public final float mo5317c(int i) {
        return this.f17737e;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF17749q() {
        return this.f17749q;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: e */
    public final long mo5319e(float f, float f2, float f3) {
        double d = f;
        C1223a c1223a = this.f17748p;
        float fMo40d = (float) c1223a.mo40d(d);
        float fMo40d2 = (float) c1223a.mo40d(f2);
        float fMo40d3 = (float) c1223a.mo40d(f3);
        float[] fArr = this.f17741i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fMo40d3) + (fArr[3] * fMo40d2) + (fArr[0] * fMo40d);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo40d3) + (fArr[4] * fMo40d2) + (fArr[1] * fMo40d))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f17737e, this.f17737e) != 0 || Float.compare(rgb.f17738f, this.f17738f) != 0 || !Intrinsics.m18594b(this.f17736d, rgb.f17736d) || !Arrays.equals(this.f17740h, rgb.f17740h)) {
            return false;
        }
        TransferParameters transferParameters = rgb.f17739g;
        TransferParameters transferParameters2 = this.f17739g;
        if (transferParameters2 != null) {
            return Intrinsics.m18594b(transferParameters2, transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (Intrinsics.m18594b(this.f17743k, rgb.f17743k)) {
            return Intrinsics.m18594b(this.f17746n, rgb.f17746n);
        }
        return false;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: f */
    public final float[] mo5320f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        C1223a c1223a = this.f17748p;
        fArr[0] = (float) c1223a.mo40d(d);
        fArr[1] = (float) c1223a.mo40d(fArr[1]);
        fArr[2] = (float) c1223a.mo40d(fArr[2]);
        ColorSpaceKt.m5329g(this.f17741i, fArr);
        return fArr;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: g */
    public final float mo5321g(float f, float f2, float f3) {
        double d = f;
        C1223a c1223a = this.f17748p;
        float fMo40d = (float) c1223a.mo40d(d);
        float fMo40d2 = (float) c1223a.mo40d(f2);
        float fMo40d3 = (float) c1223a.mo40d(f3);
        float[] fArr = this.f17741i;
        return (fArr[8] * fMo40d3) + (fArr[5] * fMo40d2) + (fArr[2] * fMo40d);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: h */
    public final long mo5322h(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = this.f17742j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C1223a c1223a = this.f17745m;
        return ColorKt.m5192a((float) c1223a.mo40d(f5), (float) c1223a.mo40d(f6), (float) c1223a.mo40d(f7), f4, colorSpace);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f17740h) + ((this.f17736d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f17737e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f17738f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        TransferParameters transferParameters = this.f17739g;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (transferParameters == null) {
            return this.f17746n.hashCode() + ((this.f17743k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        int i2;
        char c2;
        float f3;
        float f4;
        boolean z2;
        double d;
        super(str, ColorModel.f17685a, i);
        this.f17736d = whitePoint;
        this.f17737e = f;
        this.f17738f = f2;
        this.f17739g = transferParameters;
        this.f17743k = doubleFunction;
        this.f17744l = new Rgb$oetf$1(this);
        this.f17745m = new C1223a(this, 0);
        this.f17746n = doubleFunction2;
        this.f17747o = new Rgb$eotf$1(this);
        this.f17748p = new C1223a(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr3[0] = f5 / f7;
                fArr3[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr3[2] = f8 / f10;
                fArr3[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr3[4] = f11 / f13;
                fArr3[5] = f12 / f13;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f17740h = fArr3;
            if (fArr2 == null) {
                float f14 = fArr3[0];
                float f15 = fArr3[1];
                float f16 = fArr3[2];
                float f17 = fArr3[3];
                float f18 = fArr3[4];
                float f19 = fArr3[5];
                f3 = 1.0f;
                float f20 = 1;
                float f21 = (f20 - f14) / f15;
                float f22 = (f20 - f16) / f17;
                float f23 = (f20 - f18) / f19;
                i2 = 0;
                float f24 = whitePoint.f17759a;
                c2 = 1;
                float f25 = whitePoint.f17760b;
                float f26 = (f20 - f24) / f25;
                float f27 = f14 / f15;
                float f28 = (f16 / f17) - f27;
                float f29 = (f24 / f25) - f27;
                float f30 = f22 - f21;
                float f31 = (f18 / f19) - f27;
                float f32 = (((f26 - f21) * f28) - (f29 * f30)) / (((f23 - f21) * f28) - (f30 * f31));
                float f33 = (f29 - (f31 * f32)) / f28;
                float f34 = (1.0f - f33) - f32;
                float f35 = f34 / f15;
                float f36 = f33 / f17;
                float f37 = f32 / f19;
                this.f17741i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
            } else {
                i2 = 0;
                c2 = 1;
                f3 = 1.0f;
                if (fArr2.length == 9) {
                    this.f17741i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f17742j = ColorSpaceKt.m5327e(this.f17741i);
            float fM5335a = Companion.m5335a(fArr3);
            float[] fArr4 = ColorSpaces.f17693a;
            if (fM5335a / Companion.m5335a(ColorSpaces.f17694b) > 0.9f) {
                float[] fArr5 = ColorSpaces.f17693a;
                float f38 = fArr3[i2];
                float f39 = fArr5[i2];
                float f40 = fArr3[c2];
                float f41 = fArr5[c2];
                float f42 = fArr3[2];
                float f43 = fArr5[2];
                float f44 = fArr3[3];
                float f45 = fArr5[3];
                float f46 = fArr3[4];
                float f47 = fArr5[4];
                float f48 = fArr3[5];
                float f49 = fArr5[5];
                f4 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[i2] = f38 - f39;
                fArr6[c2] = f40 - f41;
                fArr6[2] = f42 - f43;
                fArr6[3] = f44 - f45;
                fArr6[4] = f46 - f47;
                fArr6[5] = f48 - f49;
                float f50 = fArr6[i2];
                float f51 = fArr6[c2];
                if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                    float f52 = fArr6[2];
                    float f53 = fArr6[3];
                    if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                        float f54 = fArr6[4];
                        float f55 = fArr6[5];
                        if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                        }
                    }
                }
                if (i != 0) {
                    float[] fArr7 = ColorSpaces.f17693a;
                    if (fArr3 == fArr7) {
                        if (ColorSpaceKt.m5325c(whitePoint, Illuminant.f17729d) && f == f4 && f2 == f3) {
                            float[] fArr8 = ColorSpaces.f17693a;
                            Rgb rgb = ColorSpaces.f17697e;
                            for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                                if (Math.abs(doubleFunction.mo40d(d) - rgb.f17743k.mo40d(d)) <= 0.001d && Math.abs(doubleFunction2.mo40d(d) - rgb.f17746n.mo40d(d)) <= 0.001d) {
                                }
                            }
                            z2 = c2;
                        }
                        z2 = i2;
                        break;
                    }
                    for (int i3 = i2; i3 < 6; i3++) {
                        if (Float.compare(fArr3[i3], fArr7[i3]) != 0 && Math.abs(fArr3[i3] - fArr7[i3]) > 0.001f) {
                            break;
                        }
                    }
                    if (ColorSpaceKt.m5325c(whitePoint, Illuminant.f17729d)) {
                        float[] fArr82 = ColorSpaces.f17693a;
                        Rgb rgb2 = ColorSpaces.f17697e;
                        while (d <= 1.0d) {
                        }
                        z2 = c2;
                    }
                    z2 = i2;
                    break;
                }
                z2 = c2;
                this.f17749q = z2;
                return;
            }
            f4 = 0.0f;
            int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
            }
            this.f17749q = z2;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d, float f, float f2, int i) {
        DoubleFunction doubleFunction = f17735r;
        this(str, fArr, whitePoint, null, d == 1.0d ? doubleFunction : new C1224b(d, 0), d != 1.0d ? new C1224b(d, 1) : doubleFunction, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
