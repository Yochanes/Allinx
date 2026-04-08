package androidx.compose.p013ui.text.font;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidFontUtils_androidKt {
    /* JADX INFO: renamed from: a */
    public static final int m6509a(FontWeight fontWeight, int i) {
        boolean z2 = fontWeight.m6523a(FontWeight.f20295d) >= 0;
        boolean z3 = i == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }
}
