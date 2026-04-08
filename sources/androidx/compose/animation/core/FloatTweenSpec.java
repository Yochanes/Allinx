package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FloatTweenSpec implements FloatAnimationSpec {

    /* JADX INFO: renamed from: a */
    public final int f4410a;

    /* JADX INFO: renamed from: b */
    public final Easing f4411b;

    /* JADX INFO: renamed from: c */
    public final long f4412c;

    /* JADX INFO: renamed from: d */
    public final long f4413d;

    public FloatTweenSpec(int i, int i2, Easing easing) {
        this.f4410a = i;
        this.f4411b = easing;
        this.f4412c = ((long) i) * 1000000;
        this.f4413d = ((long) i2) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: c */
    public final long mo2295c(float f, float f2, float f3) {
        return this.f4413d + this.f4412c;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: d */
    public final float mo2296d(float f, float f2, float f3, long j) {
        long j2 = j - this.f4413d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f4412c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo2298f(f, f2, f3, j4) - mo2298f(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: f */
    public final float mo2298f(float f, float f2, float f3, long j) {
        long j2 = j - this.f4413d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.f4412c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo39c = this.f4411b.mo39c(this.f4410a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo39c) + ((1 - fMo39c) * f);
    }
}
