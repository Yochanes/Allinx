package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.AbstractC0050i;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        /* JADX INFO: compiled from: Proguard */
        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            @Override // java.util.concurrent.Callable
            public final PrecomputedTextCompat call() {
                throw null;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        AbstractC0050i.m220y(null, i, i2, cls);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        AbstractC0050i.m211p(null, obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        AbstractC0050i.m212q(null, obj, i, i2, i3);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Params {

        /* JADX INFO: renamed from: a */
        public final TextPaint f23324a;

        /* JADX INFO: renamed from: b */
        public final TextDirectionHeuristic f23325b;

        /* JADX INFO: renamed from: c */
        public final int f23326c;

        /* JADX INFO: renamed from: d */
        public final int f23327d;

        /* JADX INFO: compiled from: Proguard */
        public static class Builder {

            /* JADX INFO: renamed from: a */
            public int f23328a;

            /* JADX INFO: renamed from: b */
            public int f23329b;
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0050i.m202g(AbstractC0050i.m200e(AbstractC0050i.m192A(AbstractC0050i.m199d(AbstractC0050i.m201f(textPaint), i), i2), textDirectionHeuristic));
            }
            this.f23324a = textPaint;
            this.f23325b = textDirectionHeuristic;
            this.f23326c = i;
            this.f23327d = i2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7673a(Params params) {
            if (this.f23326c != params.f23326c || this.f23327d != params.f23327d) {
                return false;
            }
            TextPaint textPaint = this.f23324a;
            if (textPaint.getTextSize() != params.f23324a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = params.f23324a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return m7673a(params) && this.f23325b == params.f23325b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f23324a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f23325b, Integer.valueOf(this.f23326c), Integer.valueOf(this.f23327d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f23324a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + AbstractC1329b.m6464n(textPaint));
            }
            sb.append(", textDir=" + this.f23325b);
            sb.append(", breakStrategy=" + this.f23326c);
            sb.append(", hyphenationFrequency=" + this.f23327d);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f23324a = AbstractC0050i.m205j(params);
            this.f23325b = AbstractC0050i.m204i(params);
            this.f23326c = AbstractC0050i.m196a(params);
            this.f23327d = AbstractC0050i.m221z(params);
        }
    }
}
