package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/StartDelayAnimationSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final FiniteAnimationSpec f4563a;

    /* JADX INFO: renamed from: b */
    public final long f4564b;

    public StartDelayAnimationSpec(FiniteAnimationSpec finiteAnimationSpec, long j) {
        this.f4563a = finiteAnimationSpec;
        this.f4564b = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.f4563a.mo2273a(twoWayConverter), this.f4564b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.f4564b == this.f4564b && Intrinsics.m18594b(startDelayAnimationSpec.f4563a, this.f4563a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4564b) + (this.f4563a.hashCode() * 31);
    }
}
