package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HandlePositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a */
    public final Alignment f9636a;

    /* JADX INFO: renamed from: b */
    public final OffsetProvider f9637b;

    /* JADX INFO: renamed from: c */
    public long f9638c = 0;

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.f9636a = alignment;
        this.f9637b = offsetProvider;
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: a */
    public final long mo2537a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long jMo3207a = this.f9637b.mo3207a();
        if ((9223372034707292159L & jMo3207a) == 9205357640488583168L) {
            jMo3207a = this.f9638c;
        }
        this.f9638c = jMo3207a;
        return IntOffset.m6653d(IntOffset.m6653d(intRect.m6660c(), IntOffsetKt.m6657c(jMo3207a)), this.f9636a.mo4857a(j2, 0L, layoutDirection));
    }
}
