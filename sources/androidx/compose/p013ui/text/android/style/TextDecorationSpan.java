package androidx.compose.p013ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/TextDecorationSpan;", "Landroid/text/style/CharacterStyle;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextDecorationSpan extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f20213a;

    /* JADX INFO: renamed from: b */
    public final boolean f20214b;

    public TextDecorationSpan(boolean z2, boolean z3) {
        this.f20213a = z2;
        this.f20214b = z3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f20213a);
        textPaint.setStrikeThruText(this.f20214b);
    }
}
