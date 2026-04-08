package androidx.compose.p013ui.graphics;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.Connector;
import androidx.compose.p013ui.graphics.colorspace.ConnectorKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Companion", "value", "Lkotlin/ULong;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class Color {

    /* JADX INFO: renamed from: b */
    public static final long f17574b = ColorKt.m5195d(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f17575c;

    /* JADX INFO: renamed from: d */
    public static final long f17576d;

    /* JADX INFO: renamed from: e */
    public static final long f17577e;

    /* JADX INFO: renamed from: f */
    public static final long f17578f;

    /* JADX INFO: renamed from: g */
    public static final long f17579g;

    /* JADX INFO: renamed from: h */
    public static final long f17580h;

    /* JADX INFO: renamed from: i */
    public static final long f17581i;

    /* JADX INFO: renamed from: j */
    public static final long f17582j;

    /* JADX INFO: renamed from: k */
    public static final long f17583k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f17584l = 0;

    /* JADX INFO: renamed from: a */
    public final long f17585a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static long m5188a() {
            return Color.f17583k;
        }

        /* JADX INFO: renamed from: b */
        public static long m5189b() {
            return Color.f17577e;
        }
    }

    static {
        ColorKt.m5195d(4282664004L);
        f17575c = ColorKt.m5195d(4287137928L);
        f17576d = ColorKt.m5195d(4291611852L);
        f17577e = ColorKt.m5195d(4294967295L);
        f17578f = ColorKt.m5195d(4294901760L);
        f17579g = ColorKt.m5195d(4278255360L);
        f17580h = ColorKt.m5195d(4278190335L);
        f17581i = ColorKt.m5195d(4294967040L);
        ColorKt.m5195d(4278255615L);
        ColorKt.m5195d(4294902015L);
        f17582j = ColorKt.m5193b(0);
        float[] fArr = ColorSpaces.f17693a;
        f17583k = ColorKt.m5192a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f17713u);
    }

    public /* synthetic */ Color(long j) {
        this.f17585a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m5179a(long j, ColorSpace colorSpace) {
        Connector connectorM5326d;
        ColorSpace colorSpaceM5184f = m5184f(j);
        int i = colorSpaceM5184f.f17692c;
        int i2 = colorSpace.f17692c;
        if ((i | i2) < 0) {
            connectorM5326d = ColorSpaceKt.m5326d(colorSpaceM5184f, colorSpace);
        } else {
            MutableIntObjectMap mutableIntObjectMap = ConnectorKt.f17725a;
            int i3 = i | (i2 << 6);
            Object objM1992b = mutableIntObjectMap.m1992b(i3);
            if (objM1992b == null) {
                objM1992b = ColorSpaceKt.m5326d(colorSpaceM5184f, colorSpace);
                mutableIntObjectMap.m2028h(i3, objM1992b);
            }
            connectorM5326d = (Connector) objM1992b;
        }
        return connectorM5326d.mo5334a(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m5180b(float f, long j) {
        return ColorKt.m5192a(m5186h(j), m5185g(j), m5183e(j), f, m5184f(j));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5181c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final float m5182d(long j) {
        float fM18316a;
        float f;
        if ((63 & j) == 0) {
            fM18316a = (float) UnsignedKt.m18316a((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM18316a = (float) UnsignedKt.m18316a((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM18316a / f;
    }

    /* JADX INFO: renamed from: e */
    public static final float m5183e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) UnsignedKt.m18316a((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.f17588a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: f */
    public static final ColorSpace m5184f(long j) {
        float[] fArr = ColorSpaces.f17693a;
        return ColorSpaces.f17717y[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m5185g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) UnsignedKt.m18316a((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.f17588a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: h */
    public static final float m5186h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) UnsignedKt.m18316a((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.f17588a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: i */
    public static String m5187i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m5186h(j));
        sb.append(", ");
        sb.append(m5185g(j));
        sb.append(", ");
        sb.append(m5183e(j));
        sb.append(", ");
        sb.append(m5182d(j));
        sb.append(", ");
        return AbstractC0455a.m2241p(sb, m5184f(j).f17690a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Color) {
            return this.f17585a == ((Color) obj).f17585a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17585a);
    }

    public final String toString() {
        return m5187i(this.f17585a);
    }
}
