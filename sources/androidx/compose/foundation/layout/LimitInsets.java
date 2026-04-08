package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LimitInsets implements WindowInsets {

    /* JADX INFO: renamed from: a */
    public final WindowInsets f6490a;

    /* JADX INFO: renamed from: b */
    public final int f6491b;

    public LimitInsets(WindowInsets windowInsets, int i) {
        this.f6490a = windowInsets;
        this.f6491b = i;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: a */
    public final int mo2710a(Density density) {
        if ((this.f6491b & 16) != 0) {
            return this.f6490a.mo2710a(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: b */
    public final int mo2711b(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f20569a ? 4 : 1) & this.f6491b) != 0) {
            return this.f6490a.mo2711b(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: c */
    public final int mo2712c(Density density) {
        if ((this.f6491b & 32) != 0) {
            return this.f6490a.mo2712c(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: d */
    public final int mo2713d(Density density, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.f20569a ? 8 : 2) & this.f6491b) != 0) {
            return this.f6490a.mo2713d(density, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        if (Intrinsics.m18594b(this.f6490a, limitInsets.f6490a)) {
            if (this.f6491b == limitInsets.f6491b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6491b) + (this.f6490a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f6490a + " only " + ((Object) WindowInsetsSides.m2862a(this.f6491b)) + ')';
    }
}
