package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedTweenSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final int f4751a;

    /* JADX INFO: renamed from: b */
    public final int f4752b;

    /* JADX INFO: renamed from: c */
    public final Easing f4753c;

    /* JADX INFO: renamed from: d */
    public final VectorizedFloatAnimationSpec f4754d;

    public VectorizedTweenSpec(int i, int i2, Easing easing) {
        this.f4751a = i;
        this.f4752b = i2;
        this.f4753c = easing;
        this.f4754d = new VectorizedFloatAnimationSpec(new FloatTweenSpec(i, i2, easing));
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF4751a() {
        return this.f4751a;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4754d.mo2330d(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF4752b() {
        return this.f4752b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4754d.mo2331g(j, animationVector, animationVector2, animationVector3);
    }
}
