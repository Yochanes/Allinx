package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final VectorizedDurationBasedAnimationSpec f4728a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f4729b;

    /* JADX INFO: renamed from: c */
    public final long f4730c;

    /* JADX INFO: renamed from: d */
    public final long f4731d;

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f4728a = vectorizedDurationBasedAnimationSpec;
        this.f4729b = repeatMode;
        this.f4730c = ((long) (vectorizedDurationBasedAnimationSpec.mo2384c() + vectorizedDurationBasedAnimationSpec.getF4749a())) * 1000000;
        this.f4731d = j * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: a */
    public final boolean mo2328a() {
        return true;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: b */
    public final long mo2329b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4728a.mo2330d(m2387h(j), animationVector, animationVector2, m2388i(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4728a.mo2331g(m2387h(j), animationVector, animationVector2, m2388i(j, animationVector, animationVector3, animationVector2));
    }

    /* JADX INFO: renamed from: h */
    public final long m2387h(long j) {
        long j2 = this.f4731d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f4730c;
        long j5 = j3 / j4;
        return (this.f4729b == RepeatMode.f4477a || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    /* JADX INFO: renamed from: i */
    public final AnimationVector m2388i(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.f4731d;
        long j3 = j + j2;
        long j4 = this.f4730c;
        return j3 > j4 ? this.f4728a.mo2330d(j4 - j2, animationVector, animationVector3, animationVector2) : animationVector2;
    }
}
