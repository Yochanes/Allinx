package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ VectorizedFloatAnimationSpec f4750a;

    public VectorizedSpringSpec(float f, float f2, AnimationVector animationVector) {
        int[] iArr = VectorizedAnimationSpecKt.f4713a;
        this.f4750a = new VectorizedFloatAnimationSpec(animationVector != null ? new VectorizedAnimationSpecKt$createSpringAnimations$1(f, f2, animationVector) : new VectorizedAnimationSpecKt$createSpringAnimations$2(f, f2));
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: a */
    public final boolean mo2328a() {
        this.f4750a.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: b */
    public final long mo2329b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4750a.mo2329b(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4750a.mo2330d(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: f */
    public final AnimationVector mo2379f(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4750a.mo2379f(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f4750a.mo2331g(j, animationVector, animationVector2, animationVector3);
    }
}
