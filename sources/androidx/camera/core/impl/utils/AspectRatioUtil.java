package androidx.camera.core.impl.utils;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class AspectRatioUtil {

    /* JADX INFO: renamed from: a */
    public static final Rational f2841a = new Rational(4, 3);

    /* JADX INFO: renamed from: b */
    public static final Rational f2842b = new Rational(3, 4);

    /* JADX INFO: renamed from: c */
    public static final Rational f2843c = new Rational(16, 9);

    /* JADX INFO: renamed from: d */
    public static final Rational f2844d = new Rational(9, 16);

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace implements Comparator<Rational> {

        /* JADX INFO: renamed from: a */
        public final RectF f2845a;

        /* JADX INFO: renamed from: b */
        public final Rational f2846b;

        public CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(Rational rational, Rational rational2) {
            this.f2846b = rational2 == null ? new Rational(4, 3) : rational2;
            this.f2845a = m1582b(rational);
        }

        /* JADX INFO: renamed from: a */
        public static float m1581a(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        /* JADX INFO: renamed from: b */
        public final RectF m1582b(Rational rational) {
            float fFloatValue = rational.floatValue();
            Rational rational2 = this.f2846b;
            return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z2 = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF rectFM1582b = m1582b(rational3);
            RectF rectFM1582b2 = m1582b(rational4);
            RectF rectF = this.f2845a;
            boolean z3 = rectFM1582b.width() >= rectF.width() && rectFM1582b.height() >= rectF.height();
            if (rectFM1582b2.width() >= rectF.width() && rectFM1582b2.height() >= rectF.height()) {
                z2 = true;
            }
            if (z3 && z2) {
                return (int) Math.signum((rectFM1582b.height() * rectFM1582b.width()) - (rectFM1582b2.height() * rectFM1582b2.width()));
            }
            if (z3) {
                return -1;
            }
            if (z2) {
                return 1;
            }
            return -((int) Math.signum(m1581a(rectFM1582b, rectF) - m1581a(rectFM1582b2, rectF)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1579a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = SizeUtil.f3012a;
        if (size.getHeight() * size.getWidth() >= SizeUtil.m1663a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (m1580b(Math.max(0, height - 16), width, rational) || m1580b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return m1580b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return m1580b(width, height, rational2);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1580b(int i, int i2, Rational rational) {
        Preconditions.m7694a(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
