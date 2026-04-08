package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.colorspace.C1223a;
import androidx.compose.p013ui.graphics.colorspace.ColorModel;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.Oklab;
import androidx.compose.p013ui.graphics.colorspace.Rgb;
import androidx.compose.p013ui.util.MathHelpersKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m5192a(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float fMo5317c;
        float fMo5316b;
        int i4;
        int i5;
        int i6;
        int i7;
        float fMo5317c2;
        float fMo5316b2;
        int i8;
        int i9;
        int i10;
        float f5;
        int i11 = 31;
        if (colorSpace.getF17749q()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i14 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i15 = Color.f17584l;
            return j;
        }
        int i16 = ColorModel.f17689e;
        if (((int) (colorSpace.f17691b >> 32)) != 3) {
            InlineClassHelperKt.m5227a("Color only works with ColorSpaces with 3 components");
        }
        int i17 = colorSpace.f17692c;
        if (i17 == -1) {
            InlineClassHelperKt.m5227a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo5317c3 = colorSpace.mo5317c(0);
        float fMo5316b3 = colorSpace.mo5316b(0);
        if (f >= fMo5317c3) {
            fMo5317c3 = f;
        }
        if (fMo5317c3 <= fMo5316b3) {
            fMo5316b3 = fMo5317c3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo5316b3);
        int i18 = iFloatToRawIntBits >>> 31;
        int i19 = (iFloatToRawIntBits >>> 23) & 255;
        int i20 = iFloatToRawIntBits & 8388607;
        if (i19 == 255) {
            i2 = i20 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i19 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i21 = (i20 | 8388608) >> (1 - i);
                    if ((i21 & 4096) != 0) {
                        i21 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i2 = i21 >> 13;
                } else {
                    i2 = 0;
                }
                i = 0;
            } else {
                int i22 = i20 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i22) + 1) | (i18 << 15);
                    short s = (short) i3;
                    fMo5317c = colorSpace.mo5317c(1);
                    fMo5316b = colorSpace.mo5316b(1);
                    if (f2 >= fMo5317c) {
                        fMo5317c = f2;
                    }
                    if (fMo5317c <= fMo5316b) {
                        fMo5316b = fMo5317c;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo5316b);
                    int i23 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i24 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i24 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 <= 0) {
                            if (i5 >= -10) {
                                int i25 = (i24 | 8388608) >> (1 - i5);
                                if ((i25 & 4096) != 0) {
                                    i25 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i6 = i25 >> 13;
                            } else {
                                i6 = 0;
                            }
                            i5 = 0;
                        } else {
                            int i26 = i24 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i26) + 1) | (i23 << 15);
                                short s2 = (short) i7;
                                fMo5317c2 = colorSpace.mo5317c(2);
                                fMo5316b2 = colorSpace.mo5316b(2);
                                if (f3 >= fMo5317c2) {
                                    fMo5317c2 = f3;
                                }
                                if (fMo5317c2 <= fMo5316b2) {
                                    fMo5316b2 = fMo5317c2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo5316b2);
                                int i27 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i28 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i28 != 0 ? 512 : 0;
                                    i10 = (i27 << 15) | (i11 << 10) | i9;
                                } else {
                                    int i29 = i8 - 112;
                                    if (i29 >= 31) {
                                        i11 = 49;
                                    } else {
                                        if (i29 > 0) {
                                            i9 = i28 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i29 << 10) | i9) + 1) | (i27 << 15);
                                            } else {
                                                i11 = i29;
                                            }
                                        } else if (i29 >= -10) {
                                            int i30 = (i28 | 8388608) >> (1 - i29);
                                            if ((i30 & 4096) != 0) {
                                                i30 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                            }
                                            i9 = i30 >> 13;
                                            i11 = 0;
                                        } else {
                                            i11 = 0;
                                        }
                                        i10 = (i27 << 15) | (i11 << 10) | i9;
                                    }
                                    i10 = (i27 << 15) | (i11 << 10) | i9;
                                }
                                short s3 = (short) i10;
                                f5 = f4 >= 0.0f ? f4 : 0.0f;
                                long j2 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | (((long) i17) & 63);
                                int i31 = Color.f17584l;
                                return j2;
                            }
                            i6 = i26;
                        }
                    }
                    i7 = i6 | (i23 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fMo5317c2 = colorSpace.mo5317c(2);
                    fMo5316b2 = colorSpace.mo5316b(2);
                    if (f3 >= fMo5317c2) {
                    }
                    if (fMo5317c2 <= fMo5316b2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo5316b2);
                    int i272 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i282 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    short s32 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j22 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) s32) & 65535) << 16) | (((long) i17) & 63);
                    int i312 = Color.f17584l;
                    return j22;
                }
                i2 = i22;
            }
        }
        i3 = i2 | (i18 << 15) | (i << 10);
        short s4 = (short) i3;
        fMo5317c = colorSpace.mo5317c(1);
        fMo5316b = colorSpace.mo5316b(1);
        if (f2 >= fMo5317c) {
        }
        if (fMo5317c <= fMo5316b) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo5316b);
        int i232 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i242 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i232 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fMo5317c2 = colorSpace.mo5317c(2);
        fMo5316b2 = colorSpace.mo5316b(2);
        if (f3 >= fMo5317c2) {
        }
        if (fMo5317c2 <= fMo5316b2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo5316b2);
        int i2722 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2822 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        short s322 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j222 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) s322) & 65535) << 16) | (((long) i17) & 63);
        int i3122 = Color.f17584l;
        return j222;
    }

    /* JADX INFO: renamed from: b */
    public static final long m5193b(int i) {
        long j = ((long) i) << 32;
        int i2 = Color.f17584l;
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static final long m5194c(int i, int i2, int i3, int i4) {
        return m5193b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX INFO: renamed from: d */
    public static final long m5195d(long j) {
        long j2 = j << 32;
        int i = Color.f17584l;
        return j2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m5196e(int i, int i2, int i3) {
        return m5194c(i, i2, i3, 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m5197f(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 31;
        if (colorSpace.getF17749q()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i11 = Color.f17584l;
            return j;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i12 = iFloatToRawIntBits >>> 31;
        int i13 = (iFloatToRawIntBits >>> 23) & 255;
        int i14 = iFloatToRawIntBits & 8388607;
        int i15 = 0;
        if (i13 == 255) {
            i2 = i14 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i13 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i14 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i12 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i18 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i15 = i21 == 0 ? 0 : 512;
                                } else {
                                    int i22 = i8 - 112;
                                    if (i22 >= 31) {
                                        i10 = 49;
                                    } else if (i22 > 0) {
                                        i15 = i21 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                            long jMax = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((short) i9)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.f17692c) & 63);
                                            int i23 = Color.f17584l;
                                            return jMax;
                                        }
                                        i10 = i22;
                                    } else if (i22 >= -10) {
                                        int i24 = (i21 | 8388608) >> (1 - i22);
                                        if ((i24 & 4096) != 0) {
                                            i24 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        }
                                        i15 = i24 >> 13;
                                        i10 = 0;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i9 = (i10 << 10) | (i20 << 15) | i15;
                                long jMax2 = ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((short) i9)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.f17692c) & 63);
                                int i232 = Color.f17584l;
                                return jMax2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i10 << 10) | (i202 << 15) | i15;
                    long jMax22 = ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((short) i9)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.f17692c) & 63);
                    int i2322 = Color.f17584l;
                    return jMax22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i14 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i12 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i182 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i10 << 10) | (i2022 << 15) | i15;
        long jMax222 = ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((short) i9)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.f17692c) & 63);
        int i23222 = Color.f17584l;
        return jMax222;
    }

    /* JADX INFO: renamed from: g */
    public static final long m5198g(long j, long j2) {
        float f;
        float f2;
        long jM5179a = Color.m5179a(j, Color.m5184f(j2));
        float fM5182d = Color.m5182d(j2);
        float fM5182d2 = Color.m5182d(jM5179a);
        float f3 = 1.0f - fM5182d2;
        float f4 = (fM5182d * f3) + fM5182d2;
        float fM5186h = Color.m5186h(jM5179a);
        float fM5186h2 = Color.m5186h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM5186h2 * fM5182d) * f3) + (fM5186h * fM5182d2)) / f4;
        }
        float fM5185g = Color.m5185g(jM5179a);
        float fM5185g2 = Color.m5185g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM5185g2 * fM5182d) * f3) + (fM5185g * fM5182d2)) / f4;
        }
        float fM5183e = Color.m5183e(jM5179a);
        float fM5183e2 = Color.m5183e(j2);
        if (f4 != 0.0f) {
            f5 = (((fM5183e2 * fM5182d) * f3) + (fM5183e * fM5182d2)) / f4;
        }
        return m5197f(f, f2, f5, f4, Color.m5184f(j2));
    }

    /* JADX INFO: renamed from: h */
    public static final long m5199h(float f, long j, long j2) {
        Oklab oklab = ColorSpaces.f17716x;
        long jM5179a = Color.m5179a(j, oklab);
        long jM5179a2 = Color.m5179a(j2, oklab);
        float fM5182d = Color.m5182d(jM5179a);
        float fM5186h = Color.m5186h(jM5179a);
        float fM5185g = Color.m5185g(jM5179a);
        float fM5183e = Color.m5183e(jM5179a);
        float fM5182d2 = Color.m5182d(jM5179a2);
        float fM5186h2 = Color.m5186h(jM5179a2);
        float fM5185g2 = Color.m5185g(jM5179a2);
        float fM5183e2 = Color.m5183e(jM5179a2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m5179a(m5197f(MathHelpersKt.m6699b(fM5186h, fM5186h2, f), MathHelpersKt.m6699b(fM5185g, fM5185g2, f), MathHelpersKt.m6699b(fM5183e, fM5183e2, f), MathHelpersKt.m6699b(fM5182d, fM5182d2, f), oklab), Color.m5184f(j2));
    }

    /* JADX INFO: renamed from: i */
    public static final float m5200i(long j) {
        ColorSpace colorSpaceM5184f = Color.m5184f(j);
        if (!ColorModel.m5313a(colorSpaceM5184f.f17691b, ColorModel.f17685a)) {
            InlineClassHelperKt.m5227a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m5314b(colorSpaceM5184f.f17691b)));
        }
        double dM5186h = Color.m5186h(j);
        C1223a c1223a = ((Rgb) colorSpaceM5184f).f17748p;
        double dMo40d = c1223a.mo40d(dM5186h);
        float fMo40d = (float) ((c1223a.mo40d(Color.m5183e(j)) * 0.0722d) + (c1223a.mo40d(Color.m5185g(j)) * 0.7152d) + (dMo40d * 0.2126d));
        if (fMo40d < 0.0f) {
            fMo40d = 0.0f;
        }
        if (fMo40d > 1.0f) {
            return 1.0f;
        }
        return fMo40d;
    }

    /* JADX INFO: renamed from: j */
    public static final int m5201j(long j) {
        float[] fArr = ColorSpaces.f17693a;
        return (int) (Color.m5179a(j, ColorSpaces.f17697e) >>> 32);
    }
}
