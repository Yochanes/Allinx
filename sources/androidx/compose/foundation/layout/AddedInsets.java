package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/AddedInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AddedInsets implements WindowInsets {

    /* JADX INFO: renamed from: a */
    public final WindowInsets f6235a;

    /* JADX INFO: renamed from: b */
    public final WindowInsets f6236b;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f6235a = windowInsets;
        this.f6236b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: a */
    public final int mo2710a(Density density) {
        return this.f6236b.mo2710a(density) + ((PaddingValuesInsets) this.f6235a).mo2710a(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: b */
    public final int mo2711b(Density density, LayoutDirection layoutDirection) {
        return this.f6236b.mo2711b(density, layoutDirection) + ((PaddingValuesInsets) this.f6235a).mo2711b(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: c */
    public final int mo2712c(Density density) {
        return this.f6236b.mo2712c(density) + ((PaddingValuesInsets) this.f6235a).mo2712c(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    /* JADX INFO: renamed from: d */
    public final int mo2713d(Density density, LayoutDirection layoutDirection) {
        return this.f6236b.mo2713d(density, layoutDirection) + ((PaddingValuesInsets) this.f6235a).mo2713d(density, layoutDirection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return Intrinsics.m18594b(addedInsets.f6235a, this.f6235a) && Intrinsics.m18594b(addedInsets.f6236b, this.f6236b);
    }

    public final int hashCode() {
        return (this.f6236b.hashCode() * 31) + this.f6235a.hashCode();
    }

    public final String toString() {
        return "(" + this.f6235a + " + " + this.f6236b + ')';
    }
}
