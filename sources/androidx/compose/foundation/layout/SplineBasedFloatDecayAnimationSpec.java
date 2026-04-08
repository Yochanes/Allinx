package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: a */
    public final float f6583a;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.f6583a = density.getF20554a() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: a */
    public final float getF4406a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: b */
    public final float mo2216b(float f, long j) {
        long jMo2218d = mo2218d(f);
        return ((Float.intBitsToFloat((int) (AndroidFlingSpline.m2718a(jMo2218d > 0 ? j / jMo2218d : 1.0f) & 4294967295L)) * m2837f(f)) / jMo2218d) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: c */
    public final float mo2217c(float f, float f2, long j) {
        long jMo2218d = mo2218d(f2);
        return (Float.intBitsToFloat((int) (AndroidFlingSpline.m2718a(jMo2218d > 0 ? j / jMo2218d : 1.0f) >> 32)) * m2837f(f2)) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: d */
    public final long mo2218d(float f) {
        float[] fArr = AndroidFlingSpline.f6251a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (WindowInsetsConnection_androidKt.f6596a * this.f6583a))) / WindowInsetsConnection_androidKt.f6598c) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    /* JADX INFO: renamed from: e */
    public final float mo2219e(float f, float f2) {
        return f + m2837f(f2);
    }

    /* JADX INFO: renamed from: f */
    public final float m2837f(float f) {
        float[] fArr = AndroidFlingSpline.f6251a;
        float f2 = WindowInsetsConnection_androidKt.f6596a;
        float f3 = this.f6583a;
        double dExp = Math.exp((WindowInsetsConnection_androidKt.f6597b / WindowInsetsConnection_androidKt.f6598c) * Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (f2 * f3))));
        return Math.signum(f) * ((float) (dExp * ((double) (f2 * f3))));
    }
}
