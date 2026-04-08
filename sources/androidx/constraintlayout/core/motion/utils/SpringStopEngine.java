package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {

    /* JADX INFO: renamed from: b */
    public double f21475b;

    /* JADX INFO: renamed from: c */
    public double f21476c;

    /* JADX INFO: renamed from: d */
    public float f21477d;

    /* JADX INFO: renamed from: e */
    public float f21478e;

    /* JADX INFO: renamed from: f */
    public float f21479f;

    /* JADX INFO: renamed from: g */
    public float f21480g;

    /* JADX INFO: renamed from: h */
    public float f21481h;

    /* JADX INFO: renamed from: a */
    public double f21474a = 0.5d;

    /* JADX INFO: renamed from: i */
    public int f21482i = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    /* JADX INFO: renamed from: a */
    public final boolean mo6924a() {
        double d = ((double) this.f21478e) - this.f21476c;
        double d2 = this.f21475b;
        double d3 = this.f21479f;
        return Math.sqrt((((d2 * d) * d) + ((d3 * d3) * ((double) this.f21480g))) / d2) <= ((double) this.f21481h);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    /* JADX INFO: renamed from: b */
    public final float mo6925b() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f) {
        double d = f - this.f21477d;
        if (d > 0.0d) {
            double d2 = this.f21475b;
            double d3 = this.f21474a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f21480g)) * d) * 4.0d)) + 1.0d);
            double d4 = d / ((double) iSqrt);
            int i = 0;
            while (i < iSqrt) {
                float f2 = this.f21478e;
                double d5 = f2;
                double d6 = this.f21476c;
                double d7 = d4;
                float f3 = this.f21479f;
                double d8 = f3;
                double d9 = ((-d2) * (d5 - d6)) - (d3 * d8);
                double d10 = this.f21480g;
                double d11 = (((d9 / d10) * d7) / 2.0d) + d8;
                double d12 = ((((-((((d7 * d11) / 2.0d) + d5) - d6)) * d2) - (d11 * d3)) / d10) * d7;
                float f4 = f3 + ((float) d12);
                this.f21479f = f4;
                float f5 = f2 + ((float) (((d12 / 2.0d) + d8) * d7));
                this.f21478e = f5;
                int i2 = this.f21482i;
                if (i2 > 0) {
                    if (f5 < 0.0f && (i2 & 1) == 1) {
                        this.f21478e = -f5;
                        this.f21479f = -f4;
                    }
                    float f6 = this.f21478e;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.f21478e = 2.0f - f6;
                        this.f21479f = -this.f21479f;
                    }
                }
                i++;
                d4 = d7;
            }
        }
        this.f21477d = f;
        if (mo6924a()) {
            this.f21478e = (float) this.f21476c;
        }
        return this.f21478e;
    }
}
