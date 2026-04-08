package androidx.compose.foundation.text.input;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldBufferKt {
    /* JADX INFO: renamed from: a */
    public static final long m3286a(int i, int i2, int i3, long j) {
        int i4;
        int iM6407f = TextRange.m6407f(j);
        int iM6406e = TextRange.m6406e(j);
        if (iM6406e < i) {
            return j;
        }
        if (iM6407f <= i && i2 <= iM6406e) {
            i4 = i3 - (i2 - i);
            if (iM6407f == iM6406e) {
            }
            i = iM6406e + i4;
            return TextRangeKt.m6410a(iM6407f, i);
        }
        if (iM6407f > i && iM6406e < i2) {
            i += i3;
            iM6407f = i;
        } else if (iM6407f >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iM6407f) {
            iM6407f = i + i3;
            i = (i3 - (i2 - i)) + iM6406e;
        }
        return TextRangeKt.m6410a(iM6407f, i);
        iM6407f += i4;
        i = iM6406e + i4;
        return TextRangeKt.m6410a(iM6407f, i);
    }
}
