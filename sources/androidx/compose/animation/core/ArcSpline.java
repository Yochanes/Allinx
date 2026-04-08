package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.common.observer.MTObservable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "Arc", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ArcSpline {

    /* JADX INFO: renamed from: a */
    public final Arc[][] f4366a;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Arc {

        /* JADX INFO: renamed from: a */
        public final float f4367a;

        /* JADX INFO: renamed from: b */
        public final float f4368b;

        /* JADX INFO: renamed from: c */
        public final float f4369c;

        /* JADX INFO: renamed from: d */
        public final float f4370d;

        /* JADX INFO: renamed from: e */
        public final float f4371e;

        /* JADX INFO: renamed from: f */
        public final float f4372f;

        /* JADX INFO: renamed from: g */
        public final float f4373g;

        /* JADX INFO: renamed from: h */
        public float f4374h;

        /* JADX INFO: renamed from: i */
        public float f4375i;

        /* JADX INFO: renamed from: j */
        public final float[] f4376j;

        /* JADX INFO: renamed from: k */
        public final float f4377k;

        /* JADX INFO: renamed from: l */
        public final float f4378l;

        /* JADX INFO: renamed from: m */
        public final float f4379m;

        /* JADX INFO: renamed from: n */
        public final float f4380n;

        /* JADX INFO: renamed from: o */
        public final float f4381o;

        /* JADX INFO: renamed from: p */
        public final boolean f4382p;

        /* JADX INFO: renamed from: q */
        public final float f4383q;

        /* JADX INFO: renamed from: r */
        public final float f4384r;

        public Arc(float f, float f2, float f3, int i, float f4, float f5, float f6) {
            boolean z2;
            int i2;
            float f7;
            this.f4367a = f;
            this.f4368b = f2;
            this.f4369c = f3;
            this.f4370d = f4;
            this.f4371e = f5;
            this.f4372f = f6;
            float f8 = f5 - f3;
            float f9 = f6 - f4;
            float f10 = 0.0f;
            int i3 = 1;
            boolean z3 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
            float f11 = z3 ? -1.0f : 1.0f;
            this.f4379m = f11;
            float f12 = 1 / (f2 - f);
            this.f4377k = f12;
            this.f4376j = new float[MTObservable.WHAT_OBSERVER];
            boolean z4 = i == 3;
            if (z4 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
                float fHypot = (float) Math.hypot(f9, f8);
                this.f4373g = fHypot;
                this.f4378l = fHypot * f12;
                this.f4383q = f8 * f12;
                this.f4384r = f9 * f12;
                this.f4380n = Float.NaN;
                this.f4381o = Float.NaN;
                z2 = true;
            } else {
                this.f4380n = f8 * f11;
                this.f4381o = f9 * (-f11);
                this.f4383q = z3 ? f5 : f3;
                this.f4384r = z3 ? f4 : f6;
                float f13 = f5 - f3;
                float f14 = f4 - f6;
                float[] fArr = ArcSplineKt.f4385a;
                float f15 = 90;
                float f16 = f14;
                float fHypot2 = 0.0f;
                float f17 = 0.0f;
                int i4 = 1;
                while (true) {
                    i2 = i3;
                    float f18 = f16;
                    double radians = (float) Math.toRadians((((double) i4) * 90.0d) / ((double) 90));
                    float fSin = ((float) Math.sin(radians)) * f13;
                    float fCos = ((float) Math.cos(radians)) * f14;
                    f7 = f10;
                    fHypot2 += (float) Math.hypot(fSin - f17, fCos - f18);
                    fArr[i4] = fHypot2;
                    if (i4 == 90) {
                        break;
                    }
                    i4++;
                    f17 = fSin;
                    f10 = f7;
                    f16 = fCos;
                    i3 = i2;
                }
                this.f4373g = fHypot2;
                int i5 = i2;
                while (true) {
                    fArr[i5] = fArr[i5] / fHypot2;
                    if (i5 == 90) {
                        break;
                    } else {
                        i5++;
                    }
                }
                float[] fArr2 = this.f4376j;
                int length = fArr2.length;
                for (int i6 = 0; i6 < length; i6++) {
                    float f19 = i6 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f19);
                    if (iBinarySearch >= 0) {
                        fArr2[i6] = iBinarySearch / f15;
                    } else if (iBinarySearch == -1) {
                        fArr2[i6] = f7;
                    } else {
                        int i7 = -iBinarySearch;
                        int i8 = i7 - 2;
                        float f20 = i8;
                        float f21 = fArr[i8];
                        fArr2[i6] = (((f19 - f21) / (fArr[i7 - 1] - f21)) + f20) / f15;
                    }
                }
                this.f4378l = this.f4373g * this.f4377k;
                z2 = z4;
            }
            this.f4382p = z2;
        }

        /* JADX INFO: renamed from: a */
        public final float m2287a() {
            float f = this.f4380n * this.f4375i;
            return f * this.f4379m * (this.f4378l / ((float) Math.hypot(f, (-this.f4381o) * this.f4374h)));
        }

        /* JADX INFO: renamed from: b */
        public final float m2288b() {
            float f = this.f4380n * this.f4375i;
            float f2 = (-this.f4381o) * this.f4374h;
            return f2 * this.f4379m * (this.f4378l / ((float) Math.hypot(f, f2)));
        }

        /* JADX INFO: renamed from: c */
        public final void m2289c(float f) {
            float f2 = (this.f4379m == -1.0f ? this.f4368b - f : f - this.f4367a) * this.f4377k;
            float fM4a = 0.0f;
            if (f2 > 0.0f) {
                fM4a = 1.0f;
                if (f2 < 1.0f) {
                    float f3 = f2 * 100;
                    int i = (int) f3;
                    float[] fArr = this.f4376j;
                    float f4 = fArr[i];
                    fM4a = AbstractC0000a.m4a(fArr[i + 1], f4, f3 - i, f4);
                }
            }
            double d = fM4a * 1.5707964f;
            this.f4374h = (float) Math.sin(d);
            this.f4375i = (float) Math.cos(d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r10
      0x0024: PHI (r10v1 int) = (r10v0 int), (r10v8 int), (r10v9 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcSpline(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        Arc[][] arcArr = new Arc[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            }
                        }
                    } else {
                        if (i2 == 1) {
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            Arc[] arcArr2 = new Arc[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                Arc[] arcArr3 = arcArr2;
                int i10 = i8;
                int i11 = i9 + 1;
                arcArr3[i10] = new Arc(f, f2, fArr3[i9], i, fArr3[i11], fArr4[i9], fArr4[i11]);
                i8 = i10 + 1;
                arcArr2 = arcArr3;
            }
            arcArr[i4] = arcArr2;
            i4 = i7;
            i3 = i;
        }
        this.f4366a = arcArr;
    }
}
