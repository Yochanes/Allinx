package androidx.compose.animation;

import androidx.compose.animation.FlingCalculator;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: a */
    public final FlingCalculator f4271a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f4271a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.f4272a, density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: a */
    public final float getF4406a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: b */
    public final float mo2216b(float f, long j) {
        long j2 = j / 1000000;
        FlingCalculator.FlingInfo flingInfoM2202a = this.f4271a.m2202a(f);
        long j3 = flingInfoM2202a.f4208c;
        return (((Math.signum(flingInfoM2202a.f4206a) * AndroidFlingSpline.m2146a(j3 > 0 ? j2 / j3 : 1.0f).f3911b) * flingInfoM2202a.f4207b) / j3) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: c */
    public final float mo2217c(float f, float f2, long j) {
        long j2 = j / 1000000;
        FlingCalculator.FlingInfo flingInfoM2202a = this.f4271a.m2202a(f2);
        long j3 = flingInfoM2202a.f4208c;
        return (Math.signum(flingInfoM2202a.f4206a) * flingInfoM2202a.f4207b * AndroidFlingSpline.m2146a(j3 > 0 ? j2 / j3 : 1.0f).f3910a) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: d */
    public final long mo2218d(float f) {
        return ((long) (Math.exp(this.f4271a.m2203b(f) / (((double) FlingCalculatorKt.f4209a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: e */
    public final float mo2219e(float f, float f2) {
        FlingCalculator flingCalculator = this.f4271a;
        double dM2203b = flingCalculator.m2203b(f2);
        double d = FlingCalculatorKt.f4209a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM2203b) * ((double) (flingCalculator.f4203a * flingCalculator.f4205c))))) + f;
    }
}
