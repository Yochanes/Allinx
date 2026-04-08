package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/layout/ContentScale$Companion$Inside$1", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContentScale$Companion$Inside$1 implements ContentScale {
    @Override // androidx.compose.p013ui.layout.ContentScale
    /* JADX INFO: renamed from: a */
    public final long mo5607a(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = ScaleFactor.f18580a;
            return jFloatToRawIntBits;
        }
        float fM5608a = ContentScaleKt.m5608a(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM5608a)) << 32) | (((long) Float.floatToRawIntBits(fM5608a)) & 4294967295L);
        int i2 = ScaleFactor.f18580a;
        return jFloatToRawIntBits2;
    }
}
