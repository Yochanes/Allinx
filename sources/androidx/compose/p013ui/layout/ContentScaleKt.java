package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContentScaleKt {
    /* JADX INFO: renamed from: a */
    public static final float m5608a(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
