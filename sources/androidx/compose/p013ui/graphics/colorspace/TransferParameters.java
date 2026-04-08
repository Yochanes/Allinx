package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class TransferParameters {

    /* JADX INFO: renamed from: a */
    public final double f17752a;

    /* JADX INFO: renamed from: b */
    public final double f17753b;

    /* JADX INFO: renamed from: c */
    public final double f17754c;

    /* JADX INFO: renamed from: d */
    public final double f17755d;

    /* JADX INFO: renamed from: e */
    public final double f17756e;

    /* JADX INFO: renamed from: f */
    public final double f17757f;

    /* JADX INFO: renamed from: g */
    public final double f17758g;

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.f17752a, transferParameters.f17752a) == 0 && Double.compare(this.f17753b, transferParameters.f17753b) == 0 && Double.compare(this.f17754c, transferParameters.f17754c) == 0 && Double.compare(this.f17755d, transferParameters.f17755d) == 0 && Double.compare(this.f17756e, transferParameters.f17756e) == 0 && Double.compare(this.f17757f, transferParameters.f17757f) == 0 && Double.compare(this.f17758g, transferParameters.f17758g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17758g) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Double.hashCode(this.f17752a) * 31, 31, this.f17753b), 31, this.f17754c), 31, this.f17755d), 31, this.f17756e), 31, this.f17757f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferParameters(gamma=");
        sb.append(this.f17752a);
        sb.append(", a=");
        sb.append(this.f17753b);
        sb.append(", b=");
        sb.append(this.f17754c);
        sb.append(", c=");
        sb.append(this.f17755d);
        sb.append(", d=");
        sb.append(this.f17756e);
        sb.append(", e=");
        sb.append(this.f17757f);
        sb.append(", f=");
        return AbstractC0455a.m2239n(sb, this.f17758g, ')');
    }

    public TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f17752a = d;
        this.f17753b = d2;
        this.f17754c = d3;
        this.f17755d = d4;
        this.f17756e = d5;
        this.f17757f = d6;
        this.f17758g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
