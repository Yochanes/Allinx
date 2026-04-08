package androidx.compose.p013ui.graphics.colorspace;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1225c implements DoubleFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17765a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferParameters f17766b;

    public /* synthetic */ C1225c(TransferParameters transferParameters, int i) {
        this.f17765a = i;
        this.f17766b = transferParameters;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
    /* JADX INFO: renamed from: d */
    public final double mo40d(double d) {
        TransferParameters transferParameters = this.f17766b;
        switch (this.f17765a) {
            case 0:
                float[] fArr = ColorSpaces.f17693a;
                return ColorSpaces.m5330a(transferParameters, d);
            case 1:
                float[] fArr2 = ColorSpaces.f17693a;
                return ColorSpaces.m5332c(transferParameters, d);
            case 2:
                return d >= transferParameters.f17756e ? Math.pow((transferParameters.f17753b * d) + transferParameters.f17754c, transferParameters.f17752a) : d * transferParameters.f17755d;
            case 3:
                double d2 = transferParameters.f17753b;
                if (d >= transferParameters.f17756e) {
                    return Math.pow((d2 * d) + transferParameters.f17754c, transferParameters.f17752a) + transferParameters.f17757f;
                }
                return transferParameters.f17758g + (transferParameters.f17755d * d);
            case 4:
                float[] fArr3 = ColorSpaces.f17693a;
                return ColorSpaces.m5331b(transferParameters, d);
            case 5:
                float[] fArr4 = ColorSpaces.f17693a;
                return ColorSpaces.m5333d(transferParameters, d);
            case 6:
                double d3 = transferParameters.f17756e;
                double d4 = transferParameters.f17755d;
                return d >= d3 * d4 ? (Math.pow(d, 1.0d / transferParameters.f17752a) - transferParameters.f17754c) / transferParameters.f17753b : d / d4;
            default:
                double d5 = transferParameters.f17753b;
                double d6 = transferParameters.f17756e;
                double d7 = transferParameters.f17755d;
                return d >= d6 * d7 ? (Math.pow(d - transferParameters.f17757f, 1.0d / transferParameters.f17752a) - transferParameters.f17754c) / d5 : (d - transferParameters.f17758g) / d7;
        }
    }
}
