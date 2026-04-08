package androidx.compose.foundation.shape;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* JADX INFO: renamed from: a */
    public final CornerBasedShape mo3185a(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* JADX INFO: renamed from: c */
    public final Outline mo3186c(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new Outline.Rectangle(RectKt.m5074a(0L, j));
        }
        Rect rectM5074a = RectKt.m5074a(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.f20569a;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline.Rounded(RoundRectKt.m5077a(rectM5074a, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        if (!Intrinsics.m18594b(this.f7981a, roundedCornerShape.f7981a)) {
            return false;
        }
        if (!Intrinsics.m18594b(this.f7982b, roundedCornerShape.f7982b)) {
            return false;
        }
        if (Intrinsics.m18594b(this.f7983c, roundedCornerShape.f7983c)) {
            return Intrinsics.m18594b(this.f7984d, roundedCornerShape.f7984d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7984d.hashCode() + ((this.f7983c.hashCode() + ((this.f7982b.hashCode() + (this.f7981a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f7981a + ", topEnd = " + this.f7982b + ", bottomEnd = " + this.f7983c + ", bottomStart = " + this.f7984d + ')';
    }
}
