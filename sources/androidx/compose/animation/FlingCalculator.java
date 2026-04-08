package androidx.compose.animation;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "FlingInfo", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FlingCalculator {

    /* JADX INFO: renamed from: a */
    public final float f4203a;

    /* JADX INFO: renamed from: b */
    public final Density f4204b;

    /* JADX INFO: renamed from: c */
    public final float f4205c;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class FlingInfo {

        /* JADX INFO: renamed from: a */
        public final float f4206a;

        /* JADX INFO: renamed from: b */
        public final float f4207b;

        /* JADX INFO: renamed from: c */
        public final long f4208c;

        public FlingInfo(float f, float f2, long j) {
            this.f4206a = f;
            this.f4207b = f2;
            this.f4208c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.f4206a, flingInfo.f4206a) == 0 && Float.compare(this.f4207b, flingInfo.f4207b) == 0 && this.f4208c == flingInfo.f4208c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f4208c) + AbstractC0455a.m2226a(Float.hashCode(this.f4206a) * 31, this.f4207b, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.f4206a);
            sb.append(", distance=");
            sb.append(this.f4207b);
            sb.append(", duration=");
            return AbstractC0455a.m2240o(sb, this.f4208c, ')');
        }
    }

    public FlingCalculator(float f, Density density) {
        this.f4203a = f;
        this.f4204b = density;
        float f20556a = density.getF20556a();
        float f2 = FlingCalculatorKt.f4209a;
        this.f4205c = f20556a * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX INFO: renamed from: a */
    public final FlingInfo m2202a(float f) {
        double dM2203b = m2203b(f);
        double d = FlingCalculatorKt.f4209a;
        double d2 = d - 1.0d;
        return new FlingInfo(f, (float) (Math.exp((d / d2) * dM2203b) * ((double) (this.f4203a * this.f4205c))), (long) (Math.exp(dM2203b / d2) * 1000.0d));
    }

    /* JADX INFO: renamed from: b */
    public final double m2203b(float f) {
        float[] fArr = AndroidFlingSpline.f3909a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f4203a * this.f4205c)));
    }
}
