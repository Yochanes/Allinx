package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/layout/ContentScale$Companion$Crop$1", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContentScale$Companion$Crop$1 implements ContentScale {
    @Override // androidx.compose.p013ui.layout.ContentScale
    /* JADX INFO: renamed from: a */
    public final long mo5607a(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = ScaleFactor.f18580a;
        return jFloatToRawIntBits;
    }
}
