package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: a */
    public final float f4406a = Math.max(1.0E-7f, Math.abs(0.1f));

    /* JADX INFO: renamed from: b */
    public final float f4407b = Math.max(1.0E-4f, 1.0f) * (-4.2f);

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF4406a() {
        return this.f4406a;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: b */
    public final float mo2216b(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f4407b));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: c */
    public final float mo2217c(float f, float f2, long j) {
        float f3 = this.f4407b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: d */
    public final long mo2218d(float f) {
        return ((long) ((((float) Math.log(this.f4406a / Math.abs(f))) * 1000.0f) / this.f4407b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: e */
    public final float mo2219e(float f, float f2) {
        if (Math.abs(f2) <= this.f4406a) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.f4407b;
        return ((f2 / f3) * ((float) Math.exp((((double) f3) * ((dLog / ((double) f3)) * ((double) 1000))) / ((double) 1000.0f)))) + (f - (f2 / f3));
    }
}
