package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class IntRectKt {
    /* JADX INFO: renamed from: a */
    public static final IntRect m6662a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new IntRect(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: b */
    public static final IntRect m6663b(Rect rect) {
        return new IntRect(Math.round(rect.f17526a), Math.round(rect.f17527b), Math.round(rect.f17528c), Math.round(rect.f17529d));
    }
}
