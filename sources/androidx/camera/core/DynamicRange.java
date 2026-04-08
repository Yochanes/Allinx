package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class DynamicRange {

    /* JADX INFO: renamed from: c */
    public static final DynamicRange f2246c = new DynamicRange(0, 0);

    /* JADX INFO: renamed from: d */
    public static final DynamicRange f2247d = new DynamicRange(1, 8);

    /* JADX INFO: renamed from: e */
    public static final DynamicRange f2248e = new DynamicRange(3, 10);

    /* JADX INFO: renamed from: f */
    public static final DynamicRange f2249f = new DynamicRange(4, 10);

    /* JADX INFO: renamed from: g */
    public static final DynamicRange f2250g = new DynamicRange(5, 10);

    /* JADX INFO: renamed from: h */
    public static final DynamicRange f2251h = new DynamicRange(6, 10);

    /* JADX INFO: renamed from: i */
    public static final DynamicRange f2252i = new DynamicRange(6, 8);

    /* JADX INFO: renamed from: a */
    public final int f2253a;

    /* JADX INFO: renamed from: b */
    public final int f2254b;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface BitDepth {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i, int i2) {
        this.f2253a = i;
        this.f2254b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1230a() {
        return m1231b() && this.f2253a != 1 && this.f2254b == 10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1231b() {
        int i = this.f2253a;
        return (i == 0 || i == 2 || this.f2254b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicRange)) {
            return false;
        }
        DynamicRange dynamicRange = (DynamicRange) obj;
        return this.f2253a == dynamicRange.f2253a && this.f2254b == dynamicRange.f2254b;
    }

    public final int hashCode() {
        return this.f2254b ^ ((this.f2253a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f2253a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return AbstractC0000a.m11h(this.f2254b, "}", sb);
    }
}
