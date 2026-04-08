package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/UnionInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class UnionInsets implements WindowInsets {

    /* JADX INFO: renamed from: a */
    public final WindowInsets f6584a;

    /* JADX INFO: renamed from: b */
    public final WindowInsets f6585b;

    public UnionInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f6584a = windowInsets;
        this.f6585b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: a */
    public final int mo2710a(Density density) {
        return Math.max(this.f6584a.mo2710a(density), this.f6585b.mo2710a(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: b */
    public final int mo2711b(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f6584a.mo2711b(density, layoutDirection), this.f6585b.mo2711b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: c */
    public final int mo2712c(Density density) {
        return Math.max(this.f6584a.mo2712c(density), this.f6585b.mo2712c(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: d */
    public final int mo2713d(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f6584a.mo2713d(density, layoutDirection), this.f6585b.mo2713d(density, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return Intrinsics.m18594b(unionInsets.f6584a, this.f6584a) && Intrinsics.m18594b(unionInsets.f6585b, this.f6585b);
    }

    public final int hashCode() {
        return (this.f6585b.hashCode() * 31) + this.f6584a.hashCode();
    }

    public final String toString() {
        return "(" + this.f6584a + " ∪ " + this.f6585b + ')';
    }
}
