package androidx.compose.material3;

import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/TooltipDefaults$rememberPlainTooltipPositionProvider$1$1", "Landroidx/compose/ui/window/PopupPositionProvider;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 implements PopupPositionProvider {
    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: a */
    public final long mo2537a(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int iM6661d = ((intRect.m6661d() - ((int) (j2 >> 32))) / 2) + intRect.f20564a;
        int i = (intRect.f20565b - ((int) (j2 & 4294967295L))) + 0;
        if (i < 0) {
            i = intRect.f20567d + 0;
        }
        return IntOffsetKt.m6655a(iM6661d, i);
    }
}
