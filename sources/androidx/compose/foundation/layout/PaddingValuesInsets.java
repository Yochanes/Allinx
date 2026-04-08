package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class PaddingValuesInsets implements WindowInsets {

    /* JADX INFO: renamed from: a */
    public final PaddingValues f6529a;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.f6529a = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: a */
    public final int mo2710a(Density density) {
        return density.mo2554k1(this.f6529a.getF6526b());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: b */
    public final int mo2711b(Density density, LayoutDirection layoutDirection) {
        return density.mo2554k1(this.f6529a.mo21922calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: c */
    public final int mo2712c(Density density) {
        return density.mo2554k1(this.f6529a.getF6528d());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: d */
    public final int mo2713d(Density density, LayoutDirection layoutDirection) {
        return density.mo2554k1(this.f6529a.mo21921calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return Intrinsics.m18594b(((PaddingValuesInsets) obj).f6529a, this.f6529a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6529a.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.f20569a;
        PaddingValues paddingValues = this.f6529a;
        return "PaddingValues(" + ((Object) C1338Dp.m6642b(paddingValues.mo21921calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C1338Dp.m6642b(paddingValues.getF6526b())) + ", " + ((Object) C1338Dp.m6642b(paddingValues.mo21922calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) C1338Dp.m6642b(paddingValues.getF6528d())) + ')';
    }
}
