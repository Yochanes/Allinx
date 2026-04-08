package androidx.compose.p013ui.graphics.colorspace;

import kotlin.Metadata;
import p006H.C0014a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ColorSpaces {

    /* JADX INFO: renamed from: a */
    public static final float[] f17693a;

    /* JADX INFO: renamed from: b */
    public static final float[] f17694b;

    /* JADX INFO: renamed from: c */
    public static final TransferParameters f17695c;

    /* JADX INFO: renamed from: d */
    public static final TransferParameters f17696d;

    /* JADX INFO: renamed from: e */
    public static final Rgb f17697e;

    /* JADX INFO: renamed from: f */
    public static final Rgb f17698f;

    /* JADX INFO: renamed from: g */
    public static final Rgb f17699g;

    /* JADX INFO: renamed from: h */
    public static final Rgb f17700h;

    /* JADX INFO: renamed from: i */
    public static final Rgb f17701i;

    /* JADX INFO: renamed from: j */
    public static final Rgb f17702j;

    /* JADX INFO: renamed from: k */
    public static final Rgb f17703k;

    /* JADX INFO: renamed from: l */
    public static final Rgb f17704l;

    /* JADX INFO: renamed from: m */
    public static final Rgb f17705m;

    /* JADX INFO: renamed from: n */
    public static final Rgb f17706n;

    /* JADX INFO: renamed from: o */
    public static final Rgb f17707o;

    /* JADX INFO: renamed from: p */
    public static final Rgb f17708p;

    /* JADX INFO: renamed from: q */
    public static final Rgb f17709q;

    /* JADX INFO: renamed from: r */
    public static final Rgb f17710r;

    /* JADX INFO: renamed from: s */
    public static final Xyz f17711s;

    /* JADX INFO: renamed from: t */
    public static final Lab f17712t;

    /* JADX INFO: renamed from: u */
    public static final Rgb f17713u;

    /* JADX INFO: renamed from: v */
    public static final Rgb f17714v;

    /* JADX INFO: renamed from: w */
    public static final Rgb f17715w;

    /* JADX INFO: renamed from: x */
    public static final Oklab f17716x;

    /* JADX INFO: renamed from: y */
    public static final ColorSpace[] f17717y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f17693a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f17694b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f17695c = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f17696d = transferParameters4;
        WhitePoint whitePoint = Illuminant.f17729d;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, whitePoint, transferParameters, 0);
        f17697e = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, whitePoint, 1.0d, 0.0f, 1.0f, 1);
        f17698f = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, whitePoint, null, new C0014a(5), new C0014a(6), -0.799f, 2.399f, transferParameters, 2);
        f17699g = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, whitePoint, 1.0d, -0.5f, 7.499f, 3);
        f17700h = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f17701i = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f17702j = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f17703k = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint, transferParameters, 7);
        f17704l = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, Illuminant.f17726a, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f17705m = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, whitePoint, new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f17706n = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, whitePoint, 2.2d, 0.0f, 1.0f, 10);
        f17707o = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.f17727b, new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f17708p = rgb12;
        WhitePoint whitePoint2 = Illuminant.f17728c;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, whitePoint2, 1.0d, -65504.0f, 65504.0f, 12);
        f17709q = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, whitePoint2, 1.0d, -65504.0f, 65504.0f, 13);
        f17710r = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", ColorModel.f17686b, 14);
        f17711s = xyz;
        long j = ColorModel.f17687c;
        Lab lab = new Lab("Generic L*a*b*", j, 15);
        f17712t = lab;
        Rgb rgb15 = new Rgb("None", fArr, whitePoint, transferParameters2, 16);
        f17713u = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, whitePoint, null, new C0014a(7), new C0014a(8), 0.0f, 1.0f, transferParameters3, 17);
        f17714v = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, whitePoint, null, new C0014a(9), new C0014a(10), 0.0f, 1.0f, transferParameters4, 18);
        f17715w = rgb17;
        Oklab oklab = new Oklab("Oklab", j, 19);
        f17716x = oklab;
        f17717y = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
    }

    /* JADX INFO: renamed from: a */
    public static double m5330a(TransferParameters transferParameters, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = transferParameters.f17753b;
        double d5 = d4 * d3;
        return (transferParameters.f17758g + 1.0d) * d2 * (d5 <= 1.0d ? Math.pow(d5, transferParameters.f17754c) : Math.exp((d3 - transferParameters.f17757f) * transferParameters.f17755d) + transferParameters.f17756e);
    }

    /* JADX INFO: renamed from: b */
    public static double m5331b(TransferParameters transferParameters, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / transferParameters.f17753b;
        double d4 = 1.0d / transferParameters.f17754c;
        double d5 = 1.0d / transferParameters.f17755d;
        double d6 = (d * d2) / (transferParameters.f17758g + 1.0d);
        return d2 * (d6 <= 1.0d ? Math.pow(d6, d4) * d3 : (Math.log(d6 - transferParameters.f17756e) * d5) + transferParameters.f17757f);
    }

    /* JADX INFO: renamed from: c */
    public static double m5332c(TransferParameters transferParameters, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = transferParameters.f17753b;
        double d5 = transferParameters.f17755d;
        double dPow = (Math.pow(d3, d5) * transferParameters.f17754c) + d4;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d3, d5) * transferParameters.f17757f) + transferParameters.f17756e), transferParameters.f17758g) * d2;
    }

    /* JADX INFO: renamed from: d */
    public static double m5333d(TransferParameters transferParameters, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -transferParameters.f17753b;
        double d5 = 1.0d / transferParameters.f17758g;
        return Math.pow(Math.max((Math.pow(d3, d5) * transferParameters.f17756e) + d4, 0.0d) / ((Math.pow(d3, d5) * (-transferParameters.f17757f)) + transferParameters.f17754c), 1.0d / transferParameters.f17755d) * d2;
    }
}
