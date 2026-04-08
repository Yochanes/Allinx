package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ToCharArray_androidKt {
    /* JADX INFO: renamed from: a */
    public static final void m3373a(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof TextFieldCharSequence) {
            m3373a(((TextFieldCharSequence) charSequence).f8798b, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }
}
