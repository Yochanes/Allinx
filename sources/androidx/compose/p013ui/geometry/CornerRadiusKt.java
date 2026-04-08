package androidx.compose.p013ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-geometry_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CornerRadiusKt {
    /* JADX INFO: renamed from: a */
    public static long m5047a(float f) {
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }
}
