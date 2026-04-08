package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class FlowLayoutOverflowState {

    /* JADX INFO: renamed from: a */
    public int f6403a;

    /* JADX INFO: renamed from: b */
    public int f6404b;

    /* JADX INFO: renamed from: c */
    public Measurable f6405c;

    /* JADX INFO: renamed from: d */
    public Measurable f6406d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.f6400a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.f6400a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType3 = FlowLayoutOverflow.OverflowType.f6400a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2770a(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z2, long j) {
        long jM2787a = OrientationIndependentConstraints.m2787a(j, z2 ? LayoutOrientation.f6479a : LayoutOrientation.f6480b);
        if (intrinsicMeasurable != null) {
            int iM6616g = Constraints.m6616g(jM2787a);
            int iMo5609N = z2 ? intrinsicMeasurable.mo5609N(iM6616g) : intrinsicMeasurable.mo5612p0(iM6616g);
            new IntIntPair(IntIntPair.m1987a(iMo5609N, z2 ? intrinsicMeasurable.mo5612p0(iMo5609N) : intrinsicMeasurable.mo5609N(iMo5609N)));
            this.f6405c = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
        }
        if (intrinsicMeasurable2 != null) {
            int iM6616g2 = Constraints.m6616g(jM2787a);
            int iMo5609N2 = z2 ? intrinsicMeasurable2.mo5609N(iM6616g2) : intrinsicMeasurable2.mo5612p0(iM6616g2);
            new IntIntPair(IntIntPair.m1987a(iMo5609N2, z2 ? intrinsicMeasurable2.mo5612p0(iMo5609N2) : intrinsicMeasurable2.mo5609N(iMo5609N2)));
            this.f6406d = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        ((FlowLayoutOverflowState) obj).getClass();
        FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.f6400a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0455a.m2228c(0, FlowLayoutOverflow.OverflowType.f6400a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + FlowLayoutOverflow.OverflowType.f6400a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
