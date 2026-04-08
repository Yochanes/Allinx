package androidx.compose.p013ui.geometry;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "Companion", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class Rect {

    /* JADX INFO: renamed from: e */
    public static final Rect f17525e = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f17526a;

    /* JADX INFO: renamed from: b */
    public final float f17527b;

    /* JADX INFO: renamed from: c */
    public final float f17528c;

    /* JADX INFO: renamed from: d */
    public final float f17529d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.f17526a = f;
        this.f17527b = f2;
        this.f17528c = f3;
        this.f17529d = f4;
    }

    /* JADX INFO: renamed from: b */
    public static Rect m5063b(Rect rect, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = rect.f17526a;
        }
        if ((i & 4) != 0) {
            f2 = rect.f17528c;
        }
        if ((i & 8) != 0) {
            f3 = rect.f17529d;
        }
        return new Rect(f, rect.f17527b, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5064a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f17526a) & (fIntBitsToFloat < this.f17528c) & (fIntBitsToFloat2 >= this.f17527b) & (fIntBitsToFloat2 < this.f17529d);
    }

    /* JADX INFO: renamed from: c */
    public final long m5065c() {
        float f = this.f17528c;
        float f2 = this.f17526a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.f17529d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final long m5066d() {
        float f = this.f17528c;
        float f2 = this.f17526a;
        float fM1B = AbstractC0000a.m1B(f, f2, 2.0f, f2);
        float f3 = this.f17529d;
        float f4 = this.f17527b;
        return (((long) Float.floatToRawIntBits(AbstractC0000a.m1B(f3, f4, 2.0f, f4))) & 4294967295L) | (Float.floatToRawIntBits(fM1B) << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m5067e() {
        float f = this.f17528c - this.f17526a;
        return (((long) Float.floatToRawIntBits(this.f17529d - this.f17527b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.f17526a, rect.f17526a) == 0 && Float.compare(this.f17527b, rect.f17527b) == 0 && Float.compare(this.f17528c, rect.f17528c) == 0 && Float.compare(this.f17529d, rect.f17529d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m5068f() {
        return (((long) Float.floatToRawIntBits(this.f17526a)) << 32) | (((long) Float.floatToRawIntBits(this.f17527b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public final Rect m5069g(Rect rect) {
        return new Rect(Math.max(this.f17526a, rect.f17526a), Math.max(this.f17527b, rect.f17527b), Math.min(this.f17528c, rect.f17528c), Math.min(this.f17529d, rect.f17529d));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5070h() {
        return (this.f17526a >= this.f17528c) | (this.f17527b >= this.f17529d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f17529d) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f17526a) * 31, this.f17527b, 31), this.f17528c, 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5071i(Rect rect) {
        return (this.f17526a < rect.f17528c) & (rect.f17526a < this.f17528c) & (this.f17527b < rect.f17529d) & (rect.f17527b < this.f17529d);
    }

    /* JADX INFO: renamed from: j */
    public final Rect m5072j(float f, float f2) {
        return new Rect(this.f17526a + f, this.f17527b + f2, this.f17528c + f, this.f17529d + f2);
    }

    /* JADX INFO: renamed from: k */
    public final Rect m5073k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new Rect(Float.intBitsToFloat(i) + this.f17526a, Float.intBitsToFloat(i2) + this.f17527b, Float.intBitsToFloat(i) + this.f17528c, Float.intBitsToFloat(i2) + this.f17529d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.m5048a(this.f17526a) + ", " + GeometryUtilsKt.m5048a(this.f17527b) + ", " + GeometryUtilsKt.m5048a(this.f17528c) + ", " + GeometryUtilsKt.m5048a(this.f17529d) + ')';
    }
}
