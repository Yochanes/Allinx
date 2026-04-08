package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Companion", "RgbConnector", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class Connector {

    /* JADX INFO: renamed from: a */
    public final ColorSpace f17718a;

    /* JADX INFO: renamed from: b */
    public final ColorSpace f17719b;

    /* JADX INFO: renamed from: c */
    public final ColorSpace f17720c;

    /* JADX INFO: renamed from: d */
    public final float[] f17721d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RgbConnector extends Connector {

        /* JADX INFO: renamed from: e */
        public final Rgb f17722e;

        /* JADX INFO: renamed from: f */
        public final Rgb f17723f;

        /* JADX INFO: renamed from: g */
        public final float[] f17724g;

        public RgbConnector(Rgb rgb, Rgb rgb2) {
            float[] fArrM5328f;
            super(rgb2, rgb, rgb2, null);
            this.f17722e = rgb;
            this.f17723f = rgb2;
            WhitePoint whitePoint = rgb2.f17736d;
            WhitePoint whitePoint2 = rgb.f17736d;
            boolean zM5325c = ColorSpaceKt.m5325c(whitePoint2, whitePoint);
            float[] fArr = rgb.f17741i;
            float[] fArr2 = rgb2.f17742j;
            if (zM5325c) {
                fArrM5328f = ColorSpaceKt.m5328f(fArr2, fArr);
            } else {
                float[] fArrM5336a = whitePoint2.m5336a();
                WhitePoint whitePoint3 = rgb2.f17736d;
                float[] fArrM5336a2 = whitePoint3.m5336a();
                WhitePoint whitePoint4 = Illuminant.f17727b;
                boolean zM5325c2 = ColorSpaceKt.m5325c(whitePoint2, whitePoint4);
                float[] fArr3 = Adaptation.f17683b.f17684a;
                fArrM5328f = ColorSpaceKt.m5328f(ColorSpaceKt.m5325c(whitePoint3, whitePoint4) ? fArr2 : ColorSpaceKt.m5327e(ColorSpaceKt.m5328f(ColorSpaceKt.m5324b(fArr3, fArrM5336a2, new float[]{0.964212f, 1.0f, 0.825188f}), rgb2.f17741i)), zM5325c2 ? fArr : ColorSpaceKt.m5328f(ColorSpaceKt.m5324b(fArr3, fArrM5336a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
            }
            this.f17724g = fArrM5328f;
        }

        @Override // androidx.compose.p013ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: a */
        public final long mo5334a(long j) {
            float fM5186h = Color.m5186h(j);
            float fM5185g = Color.m5185g(j);
            float fM5183e = Color.m5183e(j);
            float fM5182d = Color.m5182d(j);
            C1223a c1223a = this.f17722e.f17748p;
            float fMo40d = (float) c1223a.mo40d(fM5186h);
            float fMo40d2 = (float) c1223a.mo40d(fM5185g);
            float fMo40d3 = (float) c1223a.mo40d(fM5183e);
            float[] fArr = this.f17724g;
            float f = (fArr[6] * fMo40d3) + (fArr[3] * fMo40d2) + (fArr[0] * fMo40d);
            float f2 = (fArr[7] * fMo40d3) + (fArr[4] * fMo40d2) + (fArr[1] * fMo40d);
            float f3 = (fArr[8] * fMo40d3) + (fArr[5] * fMo40d2) + (fArr[2] * fMo40d);
            Rgb rgb = this.f17723f;
            float fMo40d4 = (float) rgb.f17745m.mo40d(f);
            double d = f2;
            C1223a c1223a2 = rgb.f17745m;
            return ColorKt.m5192a(fMo40d4, (float) c1223a2.mo40d(d), (float) c1223a2.mo40d(f3), fM5182d, rgb);
        }
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, float[] fArr) {
        this.f17718a = colorSpace;
        this.f17719b = colorSpace2;
        this.f17720c = colorSpace3;
        this.f17721d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo5334a(long j) {
        float fM5186h = Color.m5186h(j);
        float fM5185g = Color.m5185g(j);
        float fM5183e = Color.m5183e(j);
        float fM5182d = Color.m5182d(j);
        ColorSpace colorSpace = this.f17719b;
        long jMo5319e = colorSpace.mo5319e(fM5186h, fM5185g, fM5183e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5319e >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5319e & 4294967295L));
        float fMo5321g = colorSpace.mo5321g(fM5186h, fM5185g, fM5183e);
        float[] fArr = this.f17721d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo5321g *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f17720c.mo5322h(f, f2, fMo5321g, fM5182d, this.f17718a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        float[] fArr;
        long j = colorSpace.f17691b;
        long j2 = ColorModel.f17685a;
        ColorSpace colorSpaceM5323a = ColorModel.m5313a(j, j2) ? ColorSpaceKt.m5323a(colorSpace) : colorSpace;
        ColorSpace colorSpaceM5323a2 = ColorModel.m5313a(colorSpace2.f17691b, j2) ? ColorSpaceKt.m5323a(colorSpace2) : colorSpace2;
        if (i == 3) {
            boolean zM5313a = ColorModel.m5313a(colorSpace.f17691b, j2);
            boolean zM5313a2 = ColorModel.m5313a(colorSpace2.f17691b, j2);
            if (!(zM5313a && zM5313a2) && (zM5313a || zM5313a2)) {
                colorSpace = zM5313a ? colorSpace : colorSpace2;
                float[] fArrM5336a = Illuminant.f17730e;
                WhitePoint whitePoint = ((Rgb) colorSpace).f17736d;
                float[] fArrM5336a2 = zM5313a ? whitePoint.m5336a() : fArrM5336a;
                fArrM5336a = zM5313a2 ? whitePoint.m5336a() : fArrM5336a;
                fArr = new float[]{fArrM5336a2[0] / fArrM5336a[0], fArrM5336a2[1] / fArrM5336a[1], fArrM5336a2[2] / fArrM5336a[2]};
            } else {
                fArr = null;
            }
        }
        this(colorSpace2, colorSpaceM5323a, colorSpaceM5323a2, fArr);
    }
}
