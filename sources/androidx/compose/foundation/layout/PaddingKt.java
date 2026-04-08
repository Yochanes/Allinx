package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation-layout_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PaddingKt {
    /* JADX INFO: renamed from: a */
    public static PaddingValuesImpl m2790a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new PaddingValuesImpl(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static PaddingValuesImpl m2791b(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new PaddingValuesImpl(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: c */
    public static final float m2792c(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f20569a ? paddingValues.mo21922calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo21921calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* JADX INFO: renamed from: d */
    public static final float m2793d(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f20569a ? paddingValues.mo21921calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo21922calculateRightPaddingu2uoSUM(layoutDirection);
    }

    /* JADX INFO: renamed from: e */
    public static final Modifier m2794e(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    /* JADX INFO: renamed from: f */
    public static final Modifier m2795f(Modifier modifier, float f) {
        return modifier.then(new PaddingElement(f, f, f, f, new PaddingKt$padding$3(1)));
    }

    /* JADX INFO: renamed from: g */
    public static final Modifier m2796g(float f, float f2, Modifier modifier) {
        return modifier.then(new PaddingElement(f, f2, f, f2, new PaddingKt$padding$2(1)));
    }

    /* JADX INFO: renamed from: h */
    public static Modifier m2797h(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return m2796g(f, f2, modifier);
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m2798i(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, new PaddingKt$padding$1(1)));
    }

    /* JADX INFO: renamed from: j */
    public static Modifier m2799j(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return m2798i(modifier, f, f2, f3, f4);
    }
}
