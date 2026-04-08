package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextSelectionColorsKt {

    /* JADX INFO: renamed from: a */
    public static final DynamicProvidableCompositionLocal f9982a = new DynamicProvidableCompositionLocal(TextSelectionColorsKt$LocalTextSelectionColors$1.f9984a);

    /* JADX INFO: renamed from: b */
    public static final TextSelectionColors f9983b;

    static {
        long jM5195d = ColorKt.m5195d(4282550004L);
        f9983b = new TextSelectionColors(jM5195d, Color.m5180b(0.4f, jM5195d));
    }
}
