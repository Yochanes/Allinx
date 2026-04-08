package androidx.compose.p013ui.graphics.colorspace;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1224b implements DoubleFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f17764b;

    public /* synthetic */ C1224b(double d, int i) {
        this.f17763a = i;
        this.f17764b = d;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
    /* JADX INFO: renamed from: d */
    public final double mo40d(double d) {
        switch (this.f17763a) {
            case 0:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, 1.0d / this.f17764b);
            default:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, this.f17764b);
        }
    }
}
