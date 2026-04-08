package androidx.compose.p013ui.graphics.colorspace;

import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class WhitePoint {

    /* JADX INFO: renamed from: a */
    public final float f17759a;

    /* JADX INFO: renamed from: b */
    public final float f17760b;

    public WhitePoint(float f, float f2) {
        this.f17759a = f;
        this.f17760b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m5336a() {
        float f = this.f17759a;
        float f2 = this.f17760b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f17759a, whitePoint.f17759a) == 0 && Float.compare(this.f17760b, whitePoint.f17760b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17760b) + (Float.hashCode(this.f17759a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f17759a);
        sb.append(", y=");
        return AbstractC0000a.m16m(sb, this.f17760b, ')');
    }
}
