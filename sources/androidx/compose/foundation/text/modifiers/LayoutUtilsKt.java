package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final long m3507a(float f, int i, long j, boolean z2) {
        int iM6617h = ((z2 || i == 2 || i == 4 || i == 5) && Constraints.m6613d(j)) ? Constraints.m6617h(j) : Integer.MAX_VALUE;
        if (Constraints.m6619j(j) != iM6617h) {
            iM6617h = RangesKt.m18656c(TextDelegateKt.m3246a(f), Constraints.m6619j(j), iM6617h);
        }
        return Constraints.Companion.m6623b(0, iM6617h, 0, Constraints.m6616g(j));
    }
}
