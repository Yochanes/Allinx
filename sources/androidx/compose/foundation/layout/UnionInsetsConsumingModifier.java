package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {

    /* JADX INFO: renamed from: b */
    public final WindowInsets f6586b;

    public UnionInsetsConsumingModifier(WindowInsets windowInsets) {
        this.f6586b = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    /* JADX INFO: renamed from: a */
    public final WindowInsets mo2778a(WindowInsets windowInsets) {
        return new UnionInsets(this.f6586b, windowInsets);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnionInsetsConsumingModifier) {
            return Intrinsics.m18594b(((UnionInsetsConsumingModifier) obj).f6586b, this.f6586b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6586b.hashCode();
    }
}
