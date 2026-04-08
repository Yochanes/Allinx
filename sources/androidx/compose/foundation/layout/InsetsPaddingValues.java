package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class InsetsPaddingValues implements PaddingValues {

    /* JADX INFO: renamed from: a */
    public final WindowInsets f6460a;

    /* JADX INFO: renamed from: b */
    public final Density f6461b;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.f6460a = windowInsets;
        this.f6461b = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float getF6528d() {
        WindowInsets windowInsets = this.f6460a;
        Density density = this.f6461b;
        return density.mo2562v(windowInsets.mo2712c(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public final float mo21921calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f6460a;
        Density density = this.f6461b;
        return density.mo2562v(windowInsets.mo2713d(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public final float mo21922calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        WindowInsets windowInsets = this.f6460a;
        Density density = this.f6461b;
        return density.mo2562v(windowInsets.mo2711b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public final float getF6526b() {
        WindowInsets windowInsets = this.f6460a;
        Density density = this.f6461b;
        return density.mo2562v(windowInsets.mo2710a(density));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return Intrinsics.m18594b(this.f6460a, insetsPaddingValues.f6460a) && Intrinsics.m18594b(this.f6461b, insetsPaddingValues.f6461b);
    }

    public final int hashCode() {
        return this.f6461b.hashCode() + (this.f6460a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f6460a + ", density=" + this.f6461b + ')';
    }
}
