package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/SnapSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final int f4556a;

    public SnapSpec(int i) {
        this.f4556a = i;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return mo2273a(twoWayConverter);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).f4556a == this.f4556a;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF4556a() {
        return this.f4556a;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedDurationBasedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return new VectorizedSnapSpec(this.f4556a);
    }
}
