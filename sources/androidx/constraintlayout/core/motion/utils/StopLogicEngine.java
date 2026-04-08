package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {

    /* JADX INFO: renamed from: a */
    public float f21484a;

    /* JADX INFO: renamed from: b */
    public float f21485b;

    /* JADX INFO: renamed from: c */
    public float f21486c;

    /* JADX INFO: renamed from: d */
    public float f21487d;

    /* JADX INFO: renamed from: e */
    public float f21488e;

    /* JADX INFO: renamed from: f */
    public float f21489f;

    /* JADX INFO: renamed from: g */
    public float f21490g;

    /* JADX INFO: renamed from: h */
    public float f21491h;

    /* JADX INFO: renamed from: i */
    public float f21492i;

    /* JADX INFO: renamed from: j */
    public int f21493j;

    /* JADX INFO: renamed from: k */
    public boolean f21494k = false;

    /* JADX INFO: renamed from: l */
    public float f21495l;

    /* JADX INFO: renamed from: m */
    public float f21496m;

    /* JADX INFO: renamed from: n */
    public float f21497n;

    /* JADX INFO: compiled from: Proguard */
    public static class Decelerate implements StopEngine {

        /* JADX INFO: renamed from: a */
        public float f21498a;

        /* JADX INFO: renamed from: b */
        public float f21499b;

        /* JADX INFO: renamed from: c */
        public float f21500c;

        /* JADX INFO: renamed from: d */
        public float f21501d;

        /* JADX INFO: renamed from: e */
        public float f21502e;

        /* JADX INFO: renamed from: f */
        public float f21503f;

        /* JADX INFO: renamed from: g */
        public boolean f21504g;

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        /* JADX INFO: renamed from: a */
        public final boolean mo6924a() {
            return this.f21504g;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        /* JADX INFO: renamed from: b */
        public final float mo6925b() {
            return this.f21501d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public final float getInterpolation(float f) {
            float f2 = this.f21502e;
            if (f > f2) {
                this.f21504g = true;
                return this.f21498a;
            }
            if (f <= f2) {
                this.f21501d = (this.f21500c * f) + this.f21499b;
            }
            return ((((this.f21500c * f) / 2.0f) + this.f21499b) * f) + this.f21503f;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    /* JADX INFO: renamed from: a */
    public final boolean mo6924a() {
        return mo6925b() < 1.0E-5f && Math.abs(this.f21492i - this.f21496m) < 1.0E-5f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    /* JADX INFO: renamed from: b */
    public final float mo6925b() {
        return this.f21494k ? -m6926c(this.f21497n) : m6926c(this.f21497n);
    }

    /* JADX INFO: renamed from: c */
    public final float m6926c(float f) {
        float f2;
        float f3;
        float f4 = this.f21487d;
        if (f <= f4) {
            f2 = this.f21484a;
            f3 = this.f21485b;
        } else {
            int i = this.f21493j;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f21488e;
            if (f >= f4) {
                if (i == 2) {
                    return 0.0f;
                }
                float f5 = f - f4;
                float f6 = this.f21489f;
                if (f5 >= f6) {
                    return 0.0f;
                }
                float f7 = this.f21486c;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.f21485b;
            f3 = this.f21486c;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m6927d(float f, float f2, float f3, float f4, float f5) {
        this.f21492i = f2;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f21493j = 2;
                this.f21484a = f;
                this.f21485b = fSqrt;
                this.f21486c = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f21487d = f8;
                this.f21488e = fSqrt / f3;
                this.f21490g = ((f + fSqrt) * f8) / 2.0f;
                this.f21491h = f2;
                this.f21492i = f2;
                return;
            }
            this.f21493j = 3;
            this.f21484a = f;
            this.f21485b = f4;
            this.f21486c = f4;
            float f9 = (f4 - f) / f3;
            this.f21487d = f9;
            float f10 = f4 / f3;
            this.f21489f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f21488e = ((f2 - f11) - f12) / f4;
            this.f21490g = f11;
            this.f21491h = f2 - f12;
            this.f21492i = f2;
            return;
        }
        if (f7 >= f2) {
            this.f21493j = 1;
            this.f21484a = f;
            this.f21485b = 0.0f;
            this.f21490g = f2;
            this.f21487d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f21493j = 2;
            this.f21484a = f;
            this.f21485b = f;
            this.f21486c = 0.0f;
            this.f21490g = f13;
            this.f21491h = f2;
            this.f21487d = f14;
            this.f21488e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f21487d = f15;
        float f16 = fSqrt2 / f3;
        this.f21488e = f16;
        if (fSqrt2 < f4) {
            this.f21493j = 2;
            this.f21484a = f;
            this.f21485b = fSqrt2;
            this.f21486c = 0.0f;
            this.f21487d = f15;
            this.f21488e = f16;
            this.f21490g = ((f + fSqrt2) * f15) / 2.0f;
            this.f21491h = f2;
            return;
        }
        this.f21493j = 3;
        this.f21484a = f;
        this.f21485b = f4;
        this.f21486c = f4;
        float f17 = (f4 - f) / f3;
        this.f21487d = f17;
        float f18 = f4 / f3;
        this.f21489f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f21488e = ((f2 - f19) - f20) / f4;
        this.f21490g = f19;
        this.f21491h = f2 - f20;
        this.f21492i = f2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f21487d;
        if (f <= f3) {
            float f4 = this.f21484a;
            f2 = ((((this.f21485b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f21493j;
            if (i == 1) {
                f2 = this.f21490g;
            } else {
                float f5 = f - f3;
                float f6 = this.f21488e;
                if (f5 < f6) {
                    float f7 = this.f21490g;
                    float f8 = this.f21485b;
                    f2 = ((((this.f21486c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f21491h;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f21489f;
                    if (f9 <= f10) {
                        float f11 = this.f21491h;
                        float f12 = this.f21486c * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f21492i;
                    }
                }
            }
        }
        this.f21496m = f2;
        this.f21497n = f;
        return this.f21494k ? this.f21495l - f2 : this.f21495l + f2;
    }
}
