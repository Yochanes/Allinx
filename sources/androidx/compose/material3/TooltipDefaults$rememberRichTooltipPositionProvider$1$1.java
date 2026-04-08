package androidx.compose.material3;

import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/TooltipDefaults$rememberRichTooltipPositionProvider$1$1", "Landroidx/compose/ui/window/PopupPositionProvider;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TooltipDefaults$rememberRichTooltipPositionProvider$1$1 implements PopupPositionProvider {
    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: a */
    public final long mo2537a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int iM6661d = intRect.f20564a;
        int i = (int) (j2 >> 32);
        if (iM6661d + i > ((int) (j >> 32))) {
            int i2 = intRect.f20566c - i;
            iM6661d = i2 < 0 ? iM6661d + ((intRect.m6661d() - i) / 2) : i2;
        }
        int i3 = intRect.f20565b - ((int) (4294967295L & j2));
        if (i3 < 0) {
            i3 = intRect.f20567d;
        }
        return IntOffsetKt.m6655a(iM6661d, i3);
    }
}
