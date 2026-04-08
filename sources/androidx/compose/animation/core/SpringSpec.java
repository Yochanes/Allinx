package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final float f4560a;

    /* JADX INFO: renamed from: b */
    public final float f4561b;

    /* JADX INFO: renamed from: c */
    public final Object f4562c;

    public SpringSpec(float f, float f2, Object obj) {
        this.f4560a = f;
        this.f4561b = f2;
        this.f4562c = obj;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        Object obj = this.f4562c;
        return new VectorizedSpringSpec(this.f4560a, this.f4561b, obj == null ? null : (AnimationVector) twoWayConverter.mo2376a().invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.f4560a == this.f4560a && springSpec.f4561b == this.f4561b && Intrinsics.m18594b(springSpec.f4562c, this.f4562c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4562c;
        return Float.hashCode(this.f4561b) + AbstractC0455a.m2226a((obj != null ? obj.hashCode() : 0) * 31, this.f4560a, 31);
    }

    public /* synthetic */ SpringSpec(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }
}
