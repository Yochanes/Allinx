package androidx.compose.foundation.shape;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CornerSizeKt {
    /* JADX INFO: renamed from: a */
    public static final CornerSize m3189a(int i) {
        return new PercentCornerSize(i);
    }

    /* JADX INFO: renamed from: b */
    public static final CornerSize m3190b(float f) {
        return new DpCornerSize(f);
    }
}
