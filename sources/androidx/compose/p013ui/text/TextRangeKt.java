package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextRangeKt {
    /* JADX INFO: renamed from: a */
    public static final long m6410a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            InlineClassHelperKt.m6567a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = TextRange.f20116c;
        return j;
    }

    /* JADX INFO: renamed from: b */
    public static final long m6411b(int i, long j) {
        int i2 = TextRange.f20116c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m6410a(i4, i);
    }
}
