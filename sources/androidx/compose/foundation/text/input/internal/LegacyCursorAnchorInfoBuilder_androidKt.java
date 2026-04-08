package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LegacyCursorAnchorInfoBuilder_androidKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m3337a(Rect rect, float f, float f2) {
        return f <= rect.f17528c && rect.f17526a <= f && f2 <= rect.f17529d && rect.f17527b <= f2;
    }
}
