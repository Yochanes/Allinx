package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ColorInfo {

    /* JADX INFO: renamed from: h */
    public static final ColorInfo f25104h;

    /* JADX INFO: renamed from: a */
    public final int f25105a;

    /* JADX INFO: renamed from: b */
    public final int f25106b;

    /* JADX INFO: renamed from: c */
    public final int f25107c;

    /* JADX INFO: renamed from: d */
    public final byte[] f25108d;

    /* JADX INFO: renamed from: e */
    public final int f25109e;

    /* JADX INFO: renamed from: f */
    public final int f25110f;

    /* JADX INFO: renamed from: g */
    public int f25111g;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: d */
        public byte[] f25115d;

        /* JADX INFO: renamed from: a */
        public int f25112a = -1;

        /* JADX INFO: renamed from: b */
        public int f25113b = -1;

        /* JADX INFO: renamed from: c */
        public int f25114c = -1;

        /* JADX INFO: renamed from: e */
        public int f25116e = -1;

        /* JADX INFO: renamed from: f */
        public int f25117f = -1;

        /* JADX INFO: renamed from: a */
        public final ColorInfo m9239a() {
            return new ColorInfo(this.f25112a, this.f25113b, this.f25114c, this.f25116e, this.f25117f, this.f25115d);
        }
    }

    static {
        Builder builder = new Builder();
        builder.f25112a = 1;
        builder.f25113b = 2;
        builder.f25114c = 3;
        f25104h = builder.m9239a();
        Builder builder2 = new Builder();
        builder2.f25112a = 1;
        builder2.f25113b = 1;
        builder2.f25114c = 2;
        builder2.m9239a();
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(2);
        Util.m9594D(3);
        Util.m9594D(4);
        Util.m9594D(5);
    }

    public ColorInfo(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f25105a = i;
        this.f25106b = i2;
        this.f25107c = i3;
        this.f25108d = bArr;
        this.f25109e = i4;
        this.f25110f = i5;
    }

    /* JADX INFO: renamed from: a */
    public static String m9232a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC0000a.m9f(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    /* JADX INFO: renamed from: b */
    public static String m9233b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC0000a.m9f(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    /* JADX INFO: renamed from: c */
    public static String m9234c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC0000a.m9f(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9235e(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i = colorInfo.f25105a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = colorInfo.f25106b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.f25107c;
        if ((i3 != -1 && i3 != 3) || colorInfo.f25108d != null) {
            return false;
        }
        int i4 = colorInfo.f25110f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = colorInfo.f25109e;
        return i5 == -1 || i5 == 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m9236f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m9237g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9238d() {
        return (this.f25105a == -1 || this.f25106b == -1 || this.f25107c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f25105a == colorInfo.f25105a && this.f25106b == colorInfo.f25106b && this.f25107c == colorInfo.f25107c && Arrays.equals(this.f25108d, colorInfo.f25108d) && this.f25109e == colorInfo.f25109e && this.f25110f == colorInfo.f25110f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25111g == 0) {
            this.f25111g = ((((Arrays.hashCode(this.f25108d) + ((((((527 + this.f25105a) * 31) + this.f25106b) * 31) + this.f25107c) * 31)) * 31) + this.f25109e) * 31) + this.f25110f;
        }
        return this.f25111g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m9233b(this.f25105a));
        sb.append(", ");
        sb.append(m9232a(this.f25106b));
        sb.append(", ");
        sb.append(m9234c(this.f25107c));
        sb.append(", ");
        sb.append(this.f25108d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f25109e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f25110f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC0000a.m19p(sb, str2, ")");
    }
}
