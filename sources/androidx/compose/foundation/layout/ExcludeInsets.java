package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/ExcludeInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ExcludeInsets implements WindowInsets {

    /* JADX INFO: renamed from: a */
    public final WindowInsets f6351a;

    /* JADX INFO: renamed from: b */
    public final WindowInsets f6352b;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f6351a = windowInsets;
        this.f6352b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: a */
    public final int mo2710a(Density density) {
        int iMo2710a = this.f6351a.mo2710a(density) - this.f6352b.mo2710a(density);
        if (iMo2710a < 0) {
            return 0;
        }
        return iMo2710a;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: b */
    public final int mo2711b(Density density, LayoutDirection layoutDirection) {
        int iMo2711b = this.f6351a.mo2711b(density, layoutDirection) - this.f6352b.mo2711b(density, layoutDirection);
        if (iMo2711b < 0) {
            return 0;
        }
        return iMo2711b;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: c */
    public final int mo2712c(Density density) {
        int iMo2712c = this.f6351a.mo2712c(density) - this.f6352b.mo2712c(density);
        if (iMo2712c < 0) {
            return 0;
        }
        return iMo2712c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: d */
    public final int mo2713d(Density density, LayoutDirection layoutDirection) {
        int iMo2713d = this.f6351a.mo2713d(density, layoutDirection) - this.f6352b.mo2713d(density, layoutDirection);
        if (iMo2713d < 0) {
            return 0;
        }
        return iMo2713d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return Intrinsics.m18594b(excludeInsets.f6351a, this.f6351a) && Intrinsics.m18594b(excludeInsets.f6352b, this.f6352b);
    }

    public final int hashCode() {
        return this.f6352b.hashCode() + (this.f6351a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f6351a + " - " + this.f6352b + ')';
    }
}
