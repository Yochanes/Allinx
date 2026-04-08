package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* JADX INFO: renamed from: a */
    public final Animations f4718a;

    /* JADX INFO: renamed from: b */
    public AnimationVector f4719b;

    /* JADX INFO: renamed from: c */
    public AnimationVector f4720c;

    /* JADX INFO: renamed from: d */
    public AnimationVector f4721d;

    /* JADX INFO: renamed from: androidx.compose.animation.core.VectorizedFloatAnimationSpec$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/animation/core/VectorizedFloatAnimationSpec$1", "Landroidx/compose/animation/core/Animations;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class C04721 implements Animations {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FloatAnimationSpec f4722a;

        public C04721(FloatAnimationSpec floatAnimationSpec) {
            this.f4722a = floatAnimationSpec;
        }

        @Override // androidx.compose.animation.core.Animations
        public final FloatAnimationSpec get(int i) {
            return this.f4722a;
        }
    }

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.f4718a = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: b */
    public final long mo2329b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int iMo2282b = animationVector.mo2282b();
        long jMax = 0;
        for (int i = 0; i < iMo2282b; i++) {
            jMax = Math.max(jMax, this.f4718a.get(i).mo2295c(animationVector.mo2281a(i), animationVector2.mo2281a(i), animationVector3.mo2281a(i)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2330d(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f4720c == null) {
            this.f4720c = animationVector3.mo2283c();
        }
        AnimationVector animationVector4 = this.f4720c;
        if (animationVector4 == null) {
            Intrinsics.m18606n("velocityVector");
            throw null;
        }
        int iMo2282b = animationVector4.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector5 = this.f4720c;
            if (animationVector5 == null) {
                Intrinsics.m18606n("velocityVector");
                throw null;
            }
            animationVector5.mo2285e(this.f4718a.get(i).mo2296d(animationVector.mo2281a(i), animationVector2.mo2281a(i), animationVector3.mo2281a(i), j), i);
        }
        AnimationVector animationVector6 = this.f4720c;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.m18606n("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: f */
    public final AnimationVector mo2379f(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f4721d == null) {
            this.f4721d = animationVector3.mo2283c();
        }
        AnimationVector animationVector4 = this.f4721d;
        if (animationVector4 == null) {
            Intrinsics.m18606n("endVelocityVector");
            throw null;
        }
        int iMo2282b = animationVector4.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector5 = this.f4721d;
            if (animationVector5 == null) {
                Intrinsics.m18606n("endVelocityVector");
                throw null;
            }
            animationVector5.mo2285e(this.f4718a.get(i).mo2297e(animationVector.mo2281a(i), animationVector2.mo2281a(i), animationVector3.mo2281a(i)), i);
        }
        AnimationVector animationVector6 = this.f4721d;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.m18606n("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    /* JADX INFO: renamed from: g */
    public final AnimationVector mo2331g(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f4719b == null) {
            this.f4719b = animationVector.mo2283c();
        }
        AnimationVector animationVector4 = this.f4719b;
        if (animationVector4 == null) {
            Intrinsics.m18606n("valueVector");
            throw null;
        }
        int iMo2282b = animationVector4.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            AnimationVector animationVector5 = this.f4719b;
            if (animationVector5 == null) {
                Intrinsics.m18606n("valueVector");
                throw null;
            }
            animationVector5.mo2285e(this.f4718a.get(i).mo2298f(animationVector.mo2281a(i), animationVector2.mo2281a(i), animationVector3.mo2281a(i), j), i);
        }
        AnimationVector animationVector6 = this.f4719b;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.m18606n("valueVector");
        throw null;
    }

    public VectorizedFloatAnimationSpec(FloatAnimationSpec floatAnimationSpec) {
        this(new C04721(floatAnimationSpec));
    }
}
