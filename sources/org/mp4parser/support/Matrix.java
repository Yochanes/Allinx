package org.mp4parser.support;

import androidx.compose.animation.AbstractC0455a;
import java.nio.ByteBuffer;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Matrix {

    /* JADX INFO: renamed from: j */
    public static final Matrix f59266j = new Matrix(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k */
    public static final Matrix f59267k = new Matrix(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l */
    public static final Matrix f59268l = new Matrix(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m */
    public static final Matrix f59269m = new Matrix(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a */
    public final double f59270a;

    /* JADX INFO: renamed from: b */
    public final double f59271b;

    /* JADX INFO: renamed from: c */
    public final double f59272c;

    /* JADX INFO: renamed from: d */
    public final double f59273d;

    /* JADX INFO: renamed from: e */
    public final double f59274e;

    /* JADX INFO: renamed from: f */
    public final double f59275f;

    /* JADX INFO: renamed from: g */
    public final double f59276g;

    /* JADX INFO: renamed from: h */
    public final double f59277h;

    /* JADX INFO: renamed from: i */
    public final double f59278i;

    public Matrix(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f59270a = d5;
        this.f59271b = d6;
        this.f59272c = d7;
        this.f59273d = d;
        this.f59274e = d2;
        this.f59275f = d3;
        this.f59276g = d4;
        this.f59277h = d8;
        this.f59278i = d9;
    }

    /* JADX INFO: renamed from: a */
    public final void m21844a(ByteBuffer byteBuffer) {
        IsoTypeWriter.m21851b(byteBuffer, this.f59273d);
        IsoTypeWriter.m21851b(byteBuffer, this.f59274e);
        IsoTypeWriter.m21850a(byteBuffer, this.f59270a);
        IsoTypeWriter.m21851b(byteBuffer, this.f59275f);
        IsoTypeWriter.m21851b(byteBuffer, this.f59276g);
        IsoTypeWriter.m21850a(byteBuffer, this.f59271b);
        IsoTypeWriter.m21851b(byteBuffer, this.f59277h);
        IsoTypeWriter.m21851b(byteBuffer, this.f59278i);
        IsoTypeWriter.m21850a(byteBuffer, this.f59272c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) obj;
        return Double.compare(matrix.f59273d, this.f59273d) == 0 && Double.compare(matrix.f59274e, this.f59274e) == 0 && Double.compare(matrix.f59275f, this.f59275f) == 0 && Double.compare(matrix.f59276g, this.f59276g) == 0 && Double.compare(matrix.f59277h, this.f59277h) == 0 && Double.compare(matrix.f59278i, this.f59278i) == 0 && Double.compare(matrix.f59270a, this.f59270a) == 0 && Double.compare(matrix.f59271b, this.f59271b) == 0 && Double.compare(matrix.f59272c, this.f59272c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f59270a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f59271b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f59272c);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f59273d);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f59274e);
        int i4 = (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f59275f);
        int i5 = (i4 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f59276g);
        int i6 = (i5 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f59277h);
        int i7 = (i6 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f59278i);
        return (i7 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(f59266j)) {
            return "Rotate 0°";
        }
        if (equals(f59267k)) {
            return "Rotate 90°";
        }
        if (equals(f59268l)) {
            return "Rotate 180°";
        }
        if (equals(f59269m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder("Matrix{u=");
        sb.append(this.f59270a);
        sb.append(", v=");
        sb.append(this.f59271b);
        sb.append(", w=");
        sb.append(this.f59272c);
        sb.append(", a=");
        sb.append(this.f59273d);
        sb.append(", b=");
        sb.append(this.f59274e);
        sb.append(", c=");
        sb.append(this.f59275f);
        sb.append(", d=");
        sb.append(this.f59276g);
        sb.append(", tx=");
        sb.append(this.f59277h);
        sb.append(", ty=");
        return AbstractC0455a.m2239n(sb, this.f59278i, '}');
    }
}
