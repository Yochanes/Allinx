package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final FloatDecayAnimationSpec f4723a;

    /* JADX INFO: renamed from: b */
    public AnimationVector f4724b;

    /* JADX INFO: renamed from: c */
    public AnimationVector f4725c;

    /* JADX INFO: renamed from: d */
    public AnimationVector f4726d;

    /* JADX INFO: renamed from: e */
    public final float f4727e;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f4723a = floatDecayAnimationSpec;
        this.f4727e = floatDecayAnimationSpec.getF4406a();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF4727e() {
        return this.f4727e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* JADX INFO: renamed from: b */
    public final AnimationVector mo2382b(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f4725c == null) {
            this.f4725c = animationVector.mo2283c();
        }
        AnimationVector animationVector3 = this.f4725c;
        if (animationVector3 == null) {
            Intrinsics.m18606n("velocityVector");
            throw null;
        }
        int iMo2282b = animationVector3.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector4 = this.f4725c;
            if (animationVector4 == null) {
                Intrinsics.m18606n("velocityVector");
                throw null;
            }
            animationVector.getClass();
            animationVector4.mo2285e(this.f4723a.mo2216b(animationVector2.mo2281a(i), j), i);
        }
        AnimationVector animationVector5 = this.f4725c;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.m18606n("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* JADX INFO: renamed from: c */
    public final AnimationVector mo2383c(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f4724b == null) {
            this.f4724b = animationVector.mo2283c();
        }
        AnimationVector animationVector3 = this.f4724b;
        if (animationVector3 == null) {
            Intrinsics.m18606n("valueVector");
            throw null;
        }
        int iMo2282b = animationVector3.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector4 = this.f4724b;
            if (animationVector4 == null) {
                Intrinsics.m18606n("valueVector");
                throw null;
            }
            animationVector4.mo2285e(this.f4723a.mo2217c(animationVector.mo2281a(i), animationVector2.mo2281a(i), j), i);
        }
        AnimationVector animationVector5 = this.f4724b;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.m18606n("valueVector");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final AnimationVector m2386d(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f4726d == null) {
            this.f4726d = animationVector.mo2283c();
        }
        AnimationVector animationVector3 = this.f4726d;
        if (animationVector3 == null) {
            Intrinsics.m18606n("targetVector");
            throw null;
        }
        int iMo2282b = animationVector3.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector4 = this.f4726d;
            if (animationVector4 == null) {
                Intrinsics.m18606n("targetVector");
                throw null;
            }
            animationVector4.mo2285e(this.f4723a.mo2219e(animationVector.mo2281a(i), animationVector2.mo2281a(i)), i);
        }
        AnimationVector animationVector5 = this.f4726d;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.m18606n("targetVector");
        throw null;
    }
}
