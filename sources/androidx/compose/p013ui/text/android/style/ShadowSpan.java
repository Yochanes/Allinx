package androidx.compose.p013ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/ShadowSpan;", "Landroid/text/style/CharacterStyle;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ShadowSpan extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f20208a;

    /* JADX INFO: renamed from: b */
    public final float f20209b;

    /* JADX INFO: renamed from: c */
    public final float f20210c;

    /* JADX INFO: renamed from: d */
    public final float f20211d;

    public ShadowSpan(float f, float f2, float f3, int i) {
        this.f20208a = i;
        this.f20209b = f;
        this.f20210c = f2;
        this.f20211d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f20211d, this.f20209b, this.f20210c, this.f20208a);
    }
}
