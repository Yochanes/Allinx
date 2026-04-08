package androidx.compose.p013ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class HitTestResultKt {
    /* JADX INFO: renamed from: a */
    public static final long m5761a(float f, boolean z2, boolean z3) {
        return (((z2 ? 1L : 0L) | (z3 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }
}
