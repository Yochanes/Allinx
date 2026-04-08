package androidx.compose.p013ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p013ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p013ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LayoutIntrinsics {

    /* JADX INFO: renamed from: a */
    public final CharSequence f20139a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f20140b;

    /* JADX INFO: renamed from: c */
    public final int f20141c;

    /* JADX INFO: renamed from: d */
    public float f20142d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f20143e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public BoringLayout.Metrics f20144f;

    /* JADX INFO: renamed from: g */
    public boolean f20145g;

    /* JADX INFO: renamed from: h */
    public CharSequence f20146h;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f20139a = charSequence;
        this.f20140b = textPaint;
        this.f20141c = i;
    }

    /* JADX INFO: renamed from: a */
    public final BoringLayout.Metrics m6427a() {
        if (!this.f20145g) {
            TextDirectionHeuristic textDirectionHeuristicM6446a = TextLayout_androidKt.m6446a(this.f20141c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f20139a;
            TextPaint textPaint = this.f20140b;
            this.f20144f = i >= 33 ? AbstractC0024a.m85g(charSequence, textPaint, textDirectionHeuristicM6446a) : !textDirectionHeuristicM6446a.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f20145g = true;
        }
        return this.f20144f;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m6428b() {
        CharSequence charSequence = this.f20146h;
        if (charSequence != null) {
            Intrinsics.m18596d(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f20139a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (SpannedExtensions_androidKt.m6431a(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f20146h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m6429c() {
        if (!Float.isNaN(this.f20142d)) {
            return this.f20142d;
        }
        BoringLayout.Metrics metricsM6427a = m6427a();
        float fCeil = metricsM6427a != null ? metricsM6427a.width : -1;
        TextPaint textPaint = this.f20140b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m6428b(), 0, m6428b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f20139a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (SpannedExtensions_androidKt.m6431a(spanned, LetterSpacingSpanPx.class) || SpannedExtensions_androidKt.m6431a(spanned, LetterSpacingSpanEm.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                }
            }
        }
        this.f20142d = fCeil;
        return fCeil;
    }
}
