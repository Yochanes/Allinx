package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SolidColor extends Brush {

    /* JADX INFO: renamed from: a */
    public final long f17675a;

    public SolidColor(long j) {
        this.f17675a = j;
    }

    @Override // androidx.compose.p013ui.graphics.Brush
    /* JADX INFO: renamed from: a */
    public final void mo5170a(float f, long j, Paint paint) {
        paint.mo5121b(1.0f);
        long jM5180b = this.f17675a;
        if (f != 1.0f) {
            jM5180b = Color.m5180b(Color.m5182d(jM5180b) * f, jM5180b);
        }
        paint.mo5127h(jM5180b);
        if (paint.getF17550c() != null) {
            paint.mo5124e(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolidColor) {
            return Color.m5181c(this.f17675a, ((SolidColor) obj).f17675a);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.f17584l;
        return Long.hashCode(this.f17675a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) Color.m5187i(this.f17675a)) + ')';
    }
}
