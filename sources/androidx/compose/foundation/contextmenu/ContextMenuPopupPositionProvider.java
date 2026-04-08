package androidx.compose.foundation.contextmenu;

import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a */
    public final long f5239a;

    public ContextMenuPopupPositionProvider(long j) {
        this.f5239a = j;
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: a */
    public final long mo2537a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = intRect.f20564a;
        long j3 = this.f5239a;
        return (((long) ContextMenuPopupPositionProvider_androidKt.m2538a(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.f20569a)) << 32) | (((long) ContextMenuPopupPositionProvider_androidKt.m2538a(intRect.f20565b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L);
    }
}
