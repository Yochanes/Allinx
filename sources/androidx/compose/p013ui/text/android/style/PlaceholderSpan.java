package androidx.compose.p013ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PlaceholderSpan extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final float f20198a;

    /* JADX INFO: renamed from: b */
    public final int f20199b;

    /* JADX INFO: renamed from: c */
    public final float f20200c;

    /* JADX INFO: renamed from: d */
    public final int f20201d;

    /* JADX INFO: renamed from: e */
    public final float f20202e;

    /* JADX INFO: renamed from: f */
    public final int f20203f;

    /* JADX INFO: renamed from: g */
    public Paint.FontMetricsInt f20204g;

    /* JADX INFO: renamed from: h */
    public int f20205h;

    /* JADX INFO: renamed from: i */
    public int f20206i;

    /* JADX INFO: renamed from: j */
    public boolean f20207j;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion;", "", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "Unit", "VerticalAlign", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$Unit;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface Unit {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$VerticalAlign;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface VerticalAlign {
        }
    }

    public PlaceholderSpan(float f, int i, float f2, float f3, int i2, int i3) {
        this.f20198a = f;
        this.f20199b = i;
        this.f20200c = f2;
        this.f20201d = i2;
        this.f20202e = f3;
        this.f20203f = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m6504a() {
        Paint.FontMetricsInt fontMetricsInt = this.f20204g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.m18606n("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m6505b() {
        if (!this.f20207j) {
            InlineClassHelperKt.m6569c("PlaceholderSpan is not laid out yet.");
        }
        return this.f20206i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        double dCeil;
        this.f20207j = true;
        float textSize = paint.getTextSize();
        this.f20204g = paint.getFontMetricsInt();
        if (m6504a().descent <= m6504a().ascent) {
            InlineClassHelperKt.m6567a("Invalid fontMetrics: line height can not be negative.");
        }
        float f2 = this.f20202e;
        float f3 = this.f20198a;
        int i3 = this.f20199b;
        if (i3 == 0) {
            f = f3 * f2;
        } else {
            if (i3 != 1) {
                InlineClassHelperKt.m6568b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f = f3 * textSize;
        }
        this.f20205h = (int) Math.ceil(f);
        float f4 = this.f20200c;
        int i4 = this.f20201d;
        if (i4 == 0) {
            dCeil = Math.ceil(f4 * f2);
        } else {
            if (i4 != 1) {
                InlineClassHelperKt.m6568b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            dCeil = Math.ceil(f4 * textSize);
        }
        this.f20206i = (int) dCeil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m6504a().ascent;
            fontMetricsInt.descent = m6504a().descent;
            fontMetricsInt.leading = m6504a().leading;
            switch (this.f20203f) {
                case 0:
                    if (fontMetricsInt.ascent > (-m6505b())) {
                        fontMetricsInt.ascent = -m6505b();
                    }
                    break;
                case 1:
                case 4:
                    if (m6505b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = m6505b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - m6505b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - m6505b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < m6505b()) {
                        int iM6505b = fontMetricsInt.ascent - ((m6505b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iM6505b;
                        fontMetricsInt.descent = m6505b() + iM6505b;
                    }
                    break;
                default:
                    InlineClassHelperKt.m6567a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(m6504a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m6504a().bottom, fontMetricsInt.descent);
        }
        if (!this.f20207j) {
            InlineClassHelperKt.m6569c("PlaceholderSpan is not laid out yet.");
        }
        return this.f20205h;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
