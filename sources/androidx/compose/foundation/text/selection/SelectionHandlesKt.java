package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SelectionHandlesKt {

    /* JADX INFO: renamed from: a */
    public static final float f9777a;

    /* JADX INFO: renamed from: b */
    public static final float f9778b;

    /* JADX INFO: renamed from: c */
    public static final SemanticsPropertyKey f9779c = new SemanticsPropertyKey("SelectionHandleInfo");

    static {
        float f = 25;
        f9777a = f;
        f9778b = f;
    }

    /* JADX INFO: renamed from: a */
    public static final long m3607a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
