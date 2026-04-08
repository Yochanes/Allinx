package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation-layout_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AspectRatioKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m2733a(long j, int i, int i2) {
        int iM6619j = Constraints.m6619j(j);
        if (i > Constraints.m6617h(j) || iM6619j > i) {
            return false;
        }
        return i2 <= Constraints.m6616g(j) && Constraints.m6618i(j) <= i2;
    }
}
