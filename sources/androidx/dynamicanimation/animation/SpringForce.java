package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class SpringForce implements Force {

    /* JADX INFO: renamed from: a */
    public double f24265a;

    /* JADX INFO: renamed from: b */
    public double f24266b;

    /* JADX INFO: renamed from: c */
    public boolean f24267c;

    /* JADX INFO: renamed from: d */
    public double f24268d;

    /* JADX INFO: renamed from: e */
    public double f24269e;

    /* JADX INFO: renamed from: f */
    public double f24270f;

    /* JADX INFO: renamed from: g */
    public double f24271g;

    /* JADX INFO: renamed from: h */
    public double f24272h;

    /* JADX INFO: renamed from: i */
    public double f24273i;

    /* JADX INFO: renamed from: j */
    public final DynamicAnimation.MassState f24274j;

    public SpringForce() {
        this.f24265a = Math.sqrt(1500.0d);
        this.f24266b = 0.5d;
        this.f24267c = false;
        this.f24273i = Double.MAX_VALUE;
        this.f24274j = new DynamicAnimation.MassState();
    }

    /* JADX INFO: renamed from: a */
    public final void m8774a() {
        this.f24266b = 1.0f;
        this.f24267c = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m8775b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f24265a = Math.sqrt(f);
        this.f24267c = false;
    }

    /* JADX INFO: renamed from: c */
    public final DynamicAnimation.MassState m8776c(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f24267c) {
            if (this.f24273i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f24266b;
            if (d3 > 1.0d) {
                double d4 = this.f24265a;
                this.f24270f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f24266b;
                double d6 = this.f24265a;
                this.f24271g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f24272h = Math.sqrt(1.0d - (d3 * d3)) * this.f24265a;
            }
            this.f24267c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f24273i;
        double d9 = this.f24266b;
        if (d9 > 1.0d) {
            double d10 = this.f24271g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f24270f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f24270f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f24271g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f24270f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f24265a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f24265a) * d7) * d17;
            double d18 = -this.f24265a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f24272h;
            double d20 = this.f24265a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f24272h * d7) * d21) + (Math.cos(this.f24272h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f24265a;
            double d23 = this.f24266b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f24272h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f24272h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f24273i);
        DynamicAnimation.MassState massState = this.f24274j;
        massState.f24256a = f;
        massState.f24257b = (float) dCos;
        return massState;
    }

    public SpringForce(float f) {
        this.f24265a = Math.sqrt(1500.0d);
        this.f24266b = 0.5d;
        this.f24267c = false;
        this.f24274j = new DynamicAnimation.MassState();
        this.f24273i = f;
    }
}
