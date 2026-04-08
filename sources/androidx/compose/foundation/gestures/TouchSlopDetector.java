package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TouchSlopDetector {

    /* JADX INFO: renamed from: a */
    public final Orientation f6063a;

    /* JADX INFO: renamed from: b */
    public long f6064b;

    public TouchSlopDetector(long j, Orientation orientation) {
        this.f6063a = orientation;
        this.f6064b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m2670a(PointerInputChange pointerInputChange, float f) {
        long jM5058h = Offset.m5058h(this.f6064b, Offset.m5057g(pointerInputChange.f18299c, pointerInputChange.f18303g));
        this.f6064b = jM5058h;
        Orientation orientation = this.f6063a;
        if ((orientation == null ? Offset.m5054d(jM5058h) : Math.abs(m2671b(jM5058h))) < f) {
            return 9205357640488583168L;
        }
        if (orientation == null) {
            long j = this.f6064b;
            return Offset.m5057g(this.f6064b, Offset.m5059i(f, Offset.m5052b(Offset.m5054d(j), j)));
        }
        float fM2671b = m2671b(this.f6064b) - (Math.signum(m2671b(this.f6064b)) * f);
        long j2 = this.f6064b;
        Orientation orientation2 = Orientation.f5830b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j2 & 4294967295L : j2 >> 32));
        if (orientation == orientation2) {
            return (((long) Float.floatToRawIntBits(fM2671b)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM2671b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final float m2671b(long j) {
        return Float.intBitsToFloat((int) (this.f6063a == Orientation.f5830b ? j >> 32 : j & 4294967295L));
    }
}
