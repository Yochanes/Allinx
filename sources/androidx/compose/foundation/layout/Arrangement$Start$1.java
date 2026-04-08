package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/layout/Arrangement$Start$1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Arrangement$Start$1 implements Arrangement.Horizontal {
    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    /* JADX INFO: renamed from: a */
    public final void mo2732a(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.f20569a) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f6257a;
            Arrangement.m2723c(iArr, iArr2, false);
        } else {
            Arrangement$Start$1 arrangement$Start$12 = Arrangement.f6257a;
            Arrangement.m2724d(i, iArr, iArr2, true);
        }
    }

    public final String toString() {
        return "Arrangement#Start";
    }
}
