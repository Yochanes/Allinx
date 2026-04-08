package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FloatSpringSpec implements FloatAnimationSpec {

    /* JADX INFO: renamed from: a */
    public final float f4408a;

    /* JADX INFO: renamed from: b */
    public final SpringSimulation f4409b;

    public FloatSpringSpec(float f, float f2, float f3) {
        this.f4408a = f3;
        SpringSimulation springSimulation = new SpringSimulation();
        springSimulation.f4557a = 1.0f;
        springSimulation.f4558b = Math.sqrt(50.0d);
        springSimulation.f4559c = 1.0f;
        if (f < 0.0f) {
            PreconditionsKt.m2313a("Damping ratio must be non-negative");
        }
        springSimulation.f4559c = f;
        double d = springSimulation.f4558b;
        if (((float) (d * d)) <= 0.0f) {
            PreconditionsKt.m2313a("Spring stiffness constant must be positive.");
        }
        springSimulation.f4558b = Math.sqrt(f2);
        this.f4409b = springSimulation;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo2295c(float f, float f2, float f3) {
        double dLog;
        int i;
        long j;
        SpringSimulation springSimulation = this.f4409b;
        double d = springSimulation.f4558b;
        float f4 = (float) (d * d);
        float f5 = springSimulation.f4559c;
        float f6 = this.f4408a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d2 = f4;
            double d3 = f5;
            double d4 = f8;
            double d5 = f7;
            double d6 = 1.0f;
            double dSqrt = d3 * 2.0d * Math.sqrt(d2);
            double d7 = (dSqrt * dSqrt) - (d2 * 4.0d);
            double dSqrt2 = d7 < 0.0d ? 0.0d : Math.sqrt(d7);
            double d8 = -dSqrt;
            double d9 = (d8 + dSqrt2) * 0.5d;
            double dSqrt3 = (d7 < 0.0d ? Math.sqrt(Math.abs(d7)) : 0.0d) * 0.5d;
            double d10 = (d8 - dSqrt2) * 0.5d;
            if (d5 == 0.0d && d4 == 0.0d) {
                j = 0;
            } else {
                if (d5 < 0.0d) {
                    d4 = -d4;
                }
                double dAbs = Math.abs(d5);
                double dAbs2 = Double.MAX_VALUE;
                if (d3 > 1.0d) {
                    double d11 = (d9 * dAbs) - d4;
                    double d12 = d9 - d10;
                    double d13 = d11 / d12;
                    double d14 = dAbs - d13;
                    dLog = Math.log(Math.abs(d6 / d14)) / d9;
                    double dLog2 = Math.log(Math.abs(d6 / d13)) / d10;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d15 = d14 * d9;
                    double dLog3 = Math.log(d15 / ((-d13) * d10)) / (d10 - d9);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d6 = -d6;
                    } else if (dLog3 > 0.0d) {
                        if ((-((Math.exp(dLog3 * d10) * d13) + (Math.exp(d9 * dLog3) * d14))) < d6) {
                            d6 = -d6;
                            dLog = (d13 <= 0.0d || d14 >= 0.0d) ? dLog : 0.0d;
                        } else {
                            dLog = Math.log((-((d13 * d10) * d10)) / (d15 * d9)) / d12;
                        }
                    }
                    double d16 = d13 * d10;
                    if (Math.abs((Math.exp(d10 * dLog) * d16) + (Math.exp(d9 * dLog) * d15)) >= 1.0E-4d) {
                        int i2 = 0;
                        while (dAbs2 > 0.001d && i2 < 100) {
                            i2++;
                            double d17 = d9 * dLog;
                            double d18 = d10 * dLog;
                            double dExp = dLog - ((((Math.exp(d18) * d13) + (Math.exp(d17) * d14)) + d6) / ((Math.exp(d18) * d16) + (Math.exp(d17) * d15)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d3 < 1.0d) {
                    double d19 = (d4 - (d9 * dAbs)) / dSqrt3;
                    dLog = Math.log(d6 / Math.sqrt((d19 * d19) + (dAbs * dAbs))) / d9;
                } else {
                    double d20 = d9 * dAbs;
                    double d21 = d4 - d20;
                    double dLog4 = Math.log(Math.abs(d6 / dAbs)) / d9;
                    double dLog5 = Math.log(Math.abs(d6 / d21));
                    double dLog6 = dLog5;
                    for (int i3 = 0; i3 < 6; i3++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d9));
                    }
                    double d22 = dLog6 / d9;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d22;
                    } else if ((Double.doubleToRawLongBits(d22) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d22);
                    }
                    double d23 = (-(d20 + d21)) / (d9 * d21);
                    double d24 = d9 * d23;
                    double dExp2 = (Math.exp(d24) * d21 * d23) + (Math.exp(d24) * dAbs);
                    if (Double.isNaN(d23) || d23 <= 0.0d) {
                        d6 = -d6;
                        dLog = dLog4;
                        i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            i++;
                            double d25 = d9 * dLog;
                            double dExp3 = dLog - (((Math.exp(d25) * ((d21 * dLog) + dAbs)) + d6) / (Math.exp(d25) * (((((double) 1) + d25) * d21) + d20)));
                            dAbs2 = Math.abs(dLog - dExp3);
                            dLog = dExp3;
                        }
                        break;
                    }
                    if (d23 <= 0.0d || (-dExp2) >= d6) {
                        dLog4 = (-(2.0d / d9)) - (dAbs / d21);
                        dLog = dLog4;
                        i = 0;
                        while (dAbs2 > 0.001d) {
                            i++;
                            double d252 = d9 * dLog;
                            double dExp32 = dLog - (((Math.exp(d252) * ((d21 * dLog) + dAbs)) + d6) / (Math.exp(d252) * (((((double) 1) + d252) * d21) + d20)));
                            dAbs2 = Math.abs(dLog - dExp32);
                            dLog = dExp32;
                        }
                    } else {
                        if (d21 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d6 = -d6;
                        dLog = dLog4;
                        i = 0;
                        while (dAbs2 > 0.001d) {
                        }
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: d */
    public final float mo2296d(float f, float f2, float f3, long j) {
        SpringSimulation springSimulation = this.f4409b;
        springSimulation.f4557a = f2;
        return Float.intBitsToFloat((int) (springSimulation.m2327a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: e */
    public final float mo2297e(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    /* JADX INFO: renamed from: f */
    public final float mo2298f(float f, float f2, float f3, long j) {
        SpringSimulation springSimulation = this.f4409b;
        springSimulation.f4557a = f2;
        return Float.intBitsToFloat((int) (springSimulation.m2327a(f, f3, j / 1000000) >> 32));
    }
}
