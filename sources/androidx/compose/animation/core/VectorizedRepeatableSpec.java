package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final VectorizedDurationBasedAnimationSpec f4747a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f4748b;

    public VectorizedRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f4747a = vectorizedDurationBasedAnimationSpec;
        this.f4748b = repeatMode;
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: b */
    public final long mo2329b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return (((long) 0) * 0) - 0;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4747a.mo2330d(m2391h(j), animationVector, animationVector2, m2392i(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4747a.mo2331g(m2391h(j), animationVector, animationVector2, m2392i(j, animationVector, animationVector3, animationVector2));
    }

    /* JADX INFO: renamed from: h */
    public final long m2391h(long j) {
        long j2 = j + 0;
        if (j2 <= 0) {
            return 0L;
        }
        long jMin = Math.min(j2 / 0, ((long) 0) - 1);
        return (this.f4748b == RepeatMode.f4477a || jMin % ((long) 2) == 0) ? j2 - (jMin * 0) : ((jMin + 1) * 0) - j2;
    }

    /* JADX INFO: renamed from: i */
    public final AnimationVector m2392i(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return j + 0 > 0 ? mo2330d(0 - 0, animationVector, animationVector2, animationVector3) : animationVector2;
    }
}
