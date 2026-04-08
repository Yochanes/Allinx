package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/StartDelayVectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec f4565a;

    /* JADX INFO: renamed from: b */
    public final long f4566b;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec vectorizedAnimationSpec, long j) {
        this.f4565a = vectorizedAnimationSpec;
        this.f4566b = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: a */
    public final boolean mo2328a() {
        return this.f4565a.mo2328a();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: b */
    public final long mo2329b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4565a.mo2329b(animationVector, animationVector2, animationVector3) + this.f4566b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.f4566b;
        return j < j2 ? animationVector3 : this.f4565a.mo2330d(j - j2, animationVector, animationVector2, animationVector3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.f4566b == this.f4566b && Intrinsics.m18594b(startDelayVectorizedAnimationSpec.f4565a, this.f4565a);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.f4566b;
        return j < j2 ? animationVector : this.f4565a.mo2331g(j - j2, animationVector, animationVector2, animationVector3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4566b) + (this.f4565a.hashCode() * 31);
    }
}
