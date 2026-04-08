package androidx.compose.p013ui.text.android;

import android.text.Layout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutCompat_androidKt {
    /* JADX INFO: renamed from: a */
    public static final int m6420a(Layout layout, int i, boolean z2) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
