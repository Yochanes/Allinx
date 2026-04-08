package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec f4592a;

    /* JADX INFO: renamed from: b */
    public final TwoWayConverter f4593b;

    /* JADX INFO: renamed from: c */
    public Object f4594c;

    /* JADX INFO: renamed from: d */
    public Object f4595d;

    /* JADX INFO: renamed from: e */
    public AnimationVector f4596e;

    /* JADX INFO: renamed from: f */
    public AnimationVector f4597f;

    /* JADX INFO: renamed from: g */
    public final AnimationVector f4598g;

    /* JADX INFO: renamed from: h */
    public long f4599h;

    /* JADX INFO: renamed from: i */
    public AnimationVector f4600i;

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        this.f4592a = animationSpec.mo2273a(twoWayConverter);
        this.f4593b = twoWayConverter;
        this.f4594c = obj2;
        this.f4595d = obj;
        this.f4596e = (AnimationVector) twoWayConverter.mo2376a().invoke(obj);
        this.f4597f = (AnimationVector) twoWayConverter.mo2376a().invoke(obj2);
        this.f4598g = animationVector != null ? AnimationVectorsKt.m2286a(animationVector) : ((AnimationVector) twoWayConverter.mo2376a().invoke(obj)).mo2283c();
        this.f4599h = -1L;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: a */
    public final boolean mo2264a() {
        return this.f4592a.mo2328a();
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: b */
    public final long mo2265b() {
        if (this.f4599h < 0) {
            this.f4599h = this.f4592a.mo2329b(this.f4596e, this.f4597f, this.f4598g);
        }
        return this.f4599h;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TwoWayConverter getF4593b() {
        return this.f4593b;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: d */
    public final AnimationVector mo2267d(long j) {
        if (!m2268e(j)) {
            return this.f4592a.mo2330d(j, this.f4596e, this.f4597f, this.f4598g);
        }
        AnimationVector animationVector = this.f4600i;
        if (animationVector != null) {
            return animationVector;
        }
        AnimationVector animationVectorMo2379f = this.f4592a.mo2379f(this.f4596e, this.f4597f, this.f4598g);
        this.f4600i = animationVectorMo2379f;
        return animationVectorMo2379f;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: f */
    public final Object mo2269f(long j) {
        if (m2268e(j)) {
            return this.f4594c;
        }
        AnimationVector animationVectorMo2331g = this.f4592a.mo2331g(j, this.f4596e, this.f4597f, this.f4598g);
        int iMo2282b = animationVectorMo2331g.mo2282b();
        for (int i = 0; i < iMo2282b; i++) {
            if (Float.isNaN(animationVectorMo2331g.mo2281a(i))) {
                PreconditionsKt.m2314b("AnimationVector cannot contain a NaN. " + animationVectorMo2331g + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f4593b.mo2377b().invoke(animationVectorMo2331g);
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getF4594c() {
        return this.f4594c;
    }

    /* JADX INFO: renamed from: h */
    public final void m2342h(Object obj) {
        if (Intrinsics.m18594b(obj, this.f4595d)) {
            return;
        }
        this.f4595d = obj;
        this.f4596e = (AnimationVector) this.f4593b.mo2376a().invoke(obj);
        this.f4600i = null;
        this.f4599h = -1L;
    }

    /* JADX INFO: renamed from: i */
    public final void m2343i(Object obj) {
        if (Intrinsics.m18594b(this.f4594c, obj)) {
            return;
        }
        this.f4594c = obj;
        this.f4597f = (AnimationVector) this.f4593b.mo2376a().invoke(obj);
        this.f4600i = null;
        this.f4599h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f4595d + " -> " + this.f4594c + ",initial velocity: " + this.f4598g + ", duration: " + (mo2265b() / 1000000) + " ms,animationSpec: " + this.f4592a;
    }
}
