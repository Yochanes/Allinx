package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SpringSimulation {

    /* JADX INFO: renamed from: a */
    public float f4557a;

    /* JADX INFO: renamed from: b */
    public double f4558b;

    /* JADX INFO: renamed from: c */
    public float f4559c;

    /* JADX INFO: renamed from: a */
    public final long m2327a(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.f4557a;
        double d = j / 1000.0d;
        float f4 = this.f4559c;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.f4558b;
        double d4 = ((double) (-f4)) * d3;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d2 - ((double) 1)) * d3;
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - ((double) f2)) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            dExp = Math.exp(d10) * d9 * d6;
            dExp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double d12 = 1;
                double dSqrt2 = Math.sqrt(d12 - d2) * d3;
                double d13 = f3;
                double d14 = (((-d4) * d13) + ((double) f2)) * (d12 / dSqrt2);
                double d15 = dSqrt2 * d;
                double d16 = d * d4;
                dSin = ((Math.sin(d15) * d14) + (Math.cos(d15) * d13)) * Math.exp(d16);
                dCos = (((Math.cos(d15) * dSqrt2 * d14) + (Math.sin(d15) * (-dSqrt2) * d13)) * Math.exp(d16)) + (d4 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f4557a))) << 32);
            }
            double d17 = f3;
            double d18 = (d3 * d17) + ((double) f2);
            double d19 = (-d3) * d;
            double d20 = (d * d18) + d17;
            dSin = Math.exp(d19) * d20;
            dExp = Math.exp(d19) * d20 * (-this.f4558b);
            dExp2 = Math.exp(d19) * d18;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f4557a))) << 32);
    }
}
