package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "value", "Landroidx/compose/ui/unit/Constraints;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class OrientationIndependentConstraints {
    /* JADX INFO: renamed from: a */
    public static long m2787a(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.f6479a;
        return ConstraintsKt.m6627a(layoutOrientation == layoutOrientation2 ? Constraints.m6619j(j) : Constraints.m6618i(j), layoutOrientation == layoutOrientation2 ? Constraints.m6617h(j) : Constraints.m6616g(j), layoutOrientation == layoutOrientation2 ? Constraints.m6618i(j) : Constraints.m6619j(j), layoutOrientation == layoutOrientation2 ? Constraints.m6616g(j) : Constraints.m6617h(j));
    }

    /* JADX INFO: renamed from: b */
    public static long m2788b(int i, long j) {
        return ConstraintsKt.m6627a(0, Constraints.m6617h(j), (i & 4) != 0 ? Constraints.m6618i(j) : 0, Constraints.m6616g(j));
    }

    /* JADX INFO: renamed from: c */
    public static final long m2789c(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.f6479a ? ConstraintsKt.m6627a(Constraints.m6619j(j), Constraints.m6617h(j), Constraints.m6618i(j), Constraints.m6616g(j)) : ConstraintsKt.m6627a(Constraints.m6618i(j), Constraints.m6616g(j), Constraints.m6619j(j), Constraints.m6617h(j));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OrientationIndependentConstraints)) {
            return false;
        }
        ((OrientationIndependentConstraints) obj).getClass();
        return Constraints.m6611b(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m6621l(0L)) + ')';
    }
}
