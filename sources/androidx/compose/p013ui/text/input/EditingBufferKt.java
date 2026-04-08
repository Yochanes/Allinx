package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: a */
    public static final long m6545a(long j, long j2) {
        int iM6405d;
        int iM6407f = TextRange.m6407f(j);
        int iM6406e = TextRange.m6406e(j);
        if ((TextRange.m6407f(j2) < TextRange.m6406e(j)) && (TextRange.m6407f(j) < TextRange.m6406e(j2))) {
            if (TextRange.m6402a(j2, j)) {
                iM6407f = TextRange.m6407f(j2);
                iM6406e = iM6407f;
            } else {
                if (TextRange.m6402a(j, j2)) {
                    iM6405d = TextRange.m6405d(j2);
                } else {
                    int iM6407f2 = TextRange.m6407f(j2);
                    if (iM6407f >= TextRange.m6406e(j2) || iM6407f2 > iM6407f) {
                        iM6406e = TextRange.m6407f(j2);
                    } else {
                        iM6407f = TextRange.m6407f(j2);
                        iM6405d = TextRange.m6405d(j2);
                    }
                }
                iM6406e -= iM6405d;
            }
        } else if (iM6406e > TextRange.m6407f(j2)) {
            iM6407f -= TextRange.m6405d(j2);
            iM6405d = TextRange.m6405d(j2);
            iM6406e -= iM6405d;
        }
        return TextRangeKt.m6410a(iM6407f, iM6406e);
    }
}
