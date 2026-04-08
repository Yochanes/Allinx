package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/animation/core/VectorizedAnimationSpecKt$createSpringAnimations$2", "Landroidx/compose/animation/core/Animations;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedAnimationSpecKt$createSpringAnimations$2 implements Animations {

    /* JADX INFO: renamed from: a */
    public final FloatSpringSpec f4717a;

    public VectorizedAnimationSpecKt$createSpringAnimations$2(float f, float f2) {
        this.f4717a = new FloatSpringSpec(f, f2, 0.01f);
    }

    @Override // androidx.compose.animation.core.Animations
    public final FloatAnimationSpec get(int i) {
        return this.f4717a;
    }
}
