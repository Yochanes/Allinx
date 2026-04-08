package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/DecayAnimationSpecImpl;", "T", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final FloatDecayAnimationSpec f4400a;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f4400a = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    /* JADX INFO: renamed from: b */
    public final VectorizedDecayAnimationSpec mo2290b() {
        return new VectorizedFloatDecaySpec(this.f4400a);
    }
}
