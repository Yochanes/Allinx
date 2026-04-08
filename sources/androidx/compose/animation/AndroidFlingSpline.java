package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.common.observer.MTObservable;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "FlingResult", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidFlingSpline {

    /* JADX INFO: renamed from: a */
    public static final float[] f3909a;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class FlingResult {

        /* JADX INFO: renamed from: a */
        public final float f3910a;

        /* JADX INFO: renamed from: b */
        public final float f3911b;

        public FlingResult(float f, float f2) {
            this.f3910a = f;
            this.f3911b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.f3910a, flingResult.f3910a) == 0 && Float.compare(this.f3911b, flingResult.f3911b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f3911b) + (Float.hashCode(this.f3910a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f3910a);
            sb.append(", velocityCoefficient=");
            return AbstractC0000a.m16m(sb, this.f3911b, ')');
        }
    }

    static {
        float f;
        float fM1B;
        float f2;
        float f3;
        float f4;
        float f5;
        float fM1B2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[MTObservable.WHAT_OBSERVER];
        f3909a = fArr;
        float[] fArr2 = new float[MTObservable.WHAT_OBSERVER];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                fM1B = AbstractC0000a.m1B(f13, f9, 2.0f, f9);
                f2 = f11 - fM1B;
                f3 = fM1B * 3.0f * f2;
                f4 = fM1B * fM1B * fM1B;
                float f14 = (((fM1B * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f11;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = fM1B;
                } else {
                    f9 = fM1B;
                }
                f11 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + fM1B) * f3) + f4;
            float f16 = f5;
            while (true) {
                fM1B2 = AbstractC0000a.m1B(f16, f10, f, f10);
                f6 = f5 - fM1B2;
                f7 = fM1B2 * 3.0f * f6;
                f8 = fM1B2 * fM1B2 * fM1B2;
                float f17 = (((f6 * f15) + fM1B2) * f7) + f8;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = fM1B2;
                    } else {
                        f10 = fM1B2;
                    }
                    f15 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((fM1B2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FlingResult m2146a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fM18655b = RangesKt.m18655b(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * fM18655b);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f3909a;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float fM4a = AbstractC0000a.m4a(fM18655b, f5, f8, f7);
            f2 = f8;
            f3 = fM4a;
        }
        return new FlingResult(f3, f2);
    }
}
