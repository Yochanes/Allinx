package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$1", "Landroidx/compose/animation/core/Animations;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedAnimationSpecKt$createSpringAnimations$1 implements Animations {

    /* JADX INFO: renamed from: a */
    public final FloatSpringSpec[] f4716a;

    public VectorizedAnimationSpecKt$createSpringAnimations$1(float f, float f2, AnimationVector animationVector) {
        int iMo2282b = animationVector.mo2282b();
        FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[iMo2282b];
        for (int i = 0; i < iMo2282b; i++) {
            floatSpringSpecArr[i] = new FloatSpringSpec(f, f2, animationVector.mo2281a(i));
        }
        this.f4716a = floatSpringSpecArr;
    }

    @Override // androidx.compose.animation.core.Animations
    public final FloatAnimationSpec get(int i) {
        return this.f4716a[i];
    }
}
