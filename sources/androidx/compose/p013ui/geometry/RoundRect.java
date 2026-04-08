package androidx.compose.p013ui.geometry;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "Companion", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class RoundRect {

    /* JADX INFO: renamed from: a */
    public final float f17530a;

    /* JADX INFO: renamed from: b */
    public final float f17531b;

    /* JADX INFO: renamed from: c */
    public final float f17532c;

    /* JADX INFO: renamed from: d */
    public final float f17533d;

    /* JADX INFO: renamed from: e */
    public final long f17534e;

    /* JADX INFO: renamed from: f */
    public final long f17535f;

    /* JADX INFO: renamed from: g */
    public final long f17536g;

    /* JADX INFO: renamed from: h */
    public final long f17537h;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        RoundRectKt.m5078b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f17530a = f;
        this.f17531b = f2;
        this.f17532c = f3;
        this.f17533d = f4;
        this.f17534e = j;
        this.f17535f = j2;
        this.f17536g = j3;
        this.f17537h = j4;
    }

    /* JADX INFO: renamed from: a */
    public final float m5075a() {
        return this.f17533d - this.f17531b;
    }

    /* JADX INFO: renamed from: b */
    public final float m5076b() {
        return this.f17532c - this.f17530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.f17530a, roundRect.f17530a) == 0 && Float.compare(this.f17531b, roundRect.f17531b) == 0 && Float.compare(this.f17532c, roundRect.f17532c) == 0 && Float.compare(this.f17533d, roundRect.f17533d) == 0 && CornerRadius.m5045a(this.f17534e, roundRect.f17534e) && CornerRadius.m5045a(this.f17535f, roundRect.f17535f) && CornerRadius.m5045a(this.f17536g, roundRect.f17536g) && CornerRadius.m5045a(this.f17537h, roundRect.f17537h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17537h) + AbstractC0455a.m2231f(this.f17536g, AbstractC0455a.m2231f(this.f17535f, AbstractC0455a.m2231f(this.f17534e, AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f17530a) * 31, this.f17531b, 31), this.f17532c, 31), this.f17533d, 31), 31), 31), 31);
    }

    public final String toString() {
        String str = GeometryUtilsKt.m5048a(this.f17530a) + ", " + GeometryUtilsKt.m5048a(this.f17531b) + ", " + GeometryUtilsKt.m5048a(this.f17532c) + ", " + GeometryUtilsKt.m5048a(this.f17533d);
        long j = this.f17534e;
        long j2 = this.f17535f;
        boolean zM5045a = CornerRadius.m5045a(j, j2);
        long j3 = this.f17536g;
        long j4 = this.f17537h;
        if (!zM5045a || !CornerRadius.m5045a(j2, j3) || !CornerRadius.m5045a(j3, j4)) {
            StringBuilder sbM23t = AbstractC0000a.m23t("RoundRect(rect=", str, ", topLeft=");
            sbM23t.append((Object) CornerRadius.m5046b(j));
            sbM23t.append(", topRight=");
            sbM23t.append((Object) CornerRadius.m5046b(j2));
            sbM23t.append(", bottomRight=");
            sbM23t.append((Object) CornerRadius.m5046b(j3));
            sbM23t.append(", bottomLeft=");
            sbM23t.append((Object) CornerRadius.m5046b(j4));
            sbM23t.append(')');
            return sbM23t.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM23t2 = AbstractC0000a.m23t("RoundRect(rect=", str, ", radius=");
            sbM23t2.append(GeometryUtilsKt.m5048a(Float.intBitsToFloat(i)));
            sbM23t2.append(')');
            return sbM23t2.toString();
        }
        StringBuilder sbM23t3 = AbstractC0000a.m23t("RoundRect(rect=", str, ", x=");
        sbM23t3.append(GeometryUtilsKt.m5048a(Float.intBitsToFloat(i)));
        sbM23t3.append(", y=");
        sbM23t3.append(GeometryUtilsKt.m5048a(Float.intBitsToFloat(i2)));
        sbM23t3.append(')');
        return sbM23t3.toString();
    }
}
