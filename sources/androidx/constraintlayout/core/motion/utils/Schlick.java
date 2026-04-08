package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Schlick extends Easing {

    /* JADX INFO: renamed from: d */
    public double f21464d;

    /* JADX INFO: renamed from: e */
    public double f21465e;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    /* JADX INFO: renamed from: a */
    public final double mo6900a(double d) {
        double d2 = this.f21465e;
        double d3 = this.f21464d;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    /* JADX INFO: renamed from: b */
    public final double mo6901b(double d) {
        double d2 = this.f21465e;
        double d3 = this.f21464d;
        if (d < d2) {
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d2 - 1.0d;
        double d7 = (((d2 - d) * (-d3)) - d) + 1.0d;
        return ((d6 * d3) * d6) / (d7 * d7);
    }
}
