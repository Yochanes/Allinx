package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ImeEditCommand_androidKt {
    /* JADX INFO: renamed from: a */
    public static final void m3331a(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange textRange = textFieldBuffer.f8794f;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        textFieldBuffer.m3282b(iMin, iMax, "", 0, 0);
        if (textRange != null) {
            long jM3286a = TextFieldBufferKt.m3286a(iMin, iMax, 0, textRange.f20117a);
            if (TextRange.m6404c(jM3286a)) {
                textFieldBuffer.m3284d(null);
            } else {
                textFieldBuffer.m3283c(null, TextRange.m6407f(jM3286a), TextRange.m6406e(jM3286a));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3332b(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        TextFieldBuffer textFieldBuffer2;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.f8791b.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        int i5 = iMax;
        while (i5 > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.f8791b.charAt(i5 - 1)) {
            length--;
            i5--;
        }
        if (i4 == i5 && i3 == length) {
            textFieldBuffer.m3284d(null);
            textFieldBuffer2 = textFieldBuffer;
        } else {
            CharSequence charSequenceSubSequence = charSequence.subSequence(i3, length);
            textFieldBuffer.getClass();
            textFieldBuffer2 = textFieldBuffer;
            textFieldBuffer2.m3282b(i4, i5, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        int length2 = charSequence.length() + iMin;
        textFieldBuffer2.m3285e(TextRangeKt.m6410a(length2, length2));
    }
}
