package androidx.compose.p013ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LineHeightStyleSpan implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f20186a;

    /* JADX INFO: renamed from: b */
    public final int f20187b;

    /* JADX INFO: renamed from: c */
    public final boolean f20188c;

    /* JADX INFO: renamed from: d */
    public final boolean f20189d;

    /* JADX INFO: renamed from: e */
    public final float f20190e;

    /* JADX INFO: renamed from: f */
    public final boolean f20191f;

    /* JADX INFO: renamed from: g */
    public int f20192g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public int f20193h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public int f20194i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public int f20195j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    public int f20196k;

    /* JADX INFO: renamed from: l */
    public int f20197l;

    public LineHeightStyleSpan(float f, int i, boolean z2, boolean z3, float f2, boolean z4) {
        this.f20186a = f;
        this.f20187b = i;
        this.f20188c = z2;
        this.f20189d = z3;
        this.f20190e = f2;
        this.f20191f = z4;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            InlineClassHelperKt.m6569c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z2 = i == 0;
        boolean z3 = i2 == this.f20187b;
        boolean z4 = this.f20189d;
        boolean z5 = this.f20188c;
        if (z2 && z3 && z5 && z4) {
            return;
        }
        if (this.f20192g == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f20186a);
            int i8 = iCeil - i7;
            if (!this.f20191f || i8 > 0) {
                float fAbs = this.f20190e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i8 <= 0 ? Math.ceil(i8 * fAbs) : Math.ceil((1.0f - fAbs) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = iCeil2 + i9;
                this.f20194i = i10;
                int i11 = i10 - iCeil;
                this.f20193h = i11;
                if (z5) {
                    i11 = fontMetricsInt.ascent;
                }
                this.f20192g = i11;
                if (z4) {
                    i10 = i9;
                }
                this.f20195j = i10;
                this.f20196k = fontMetricsInt.ascent - i11;
                this.f20197l = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.f20193h = i12;
                int i13 = fontMetricsInt.descent;
                this.f20194i = i13;
                this.f20192g = i12;
                this.f20195j = i13;
                this.f20196k = 0;
                this.f20197l = 0;
            }
        }
        fontMetricsInt.ascent = z2 ? this.f20192g : this.f20193h;
        fontMetricsInt.descent = z3 ? this.f20195j : this.f20194i;
    }
}
