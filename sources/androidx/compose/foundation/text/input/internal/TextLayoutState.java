package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextLayoutState {
    /* JADX INFO: renamed from: a */
    public final long m3368a(long j) {
        LayoutCoordinates layoutCoordinatesM3370c = m3370c();
        Rect rect = Rect.f17525e;
        if (layoutCoordinatesM3370c == null || !layoutCoordinatesM3370c.mo5626m()) {
            return TextLayoutStateKt.m3371a(j, rect);
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final TextLayoutResult m3369b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final LayoutCoordinates m3370c() {
        throw null;
    }
}
