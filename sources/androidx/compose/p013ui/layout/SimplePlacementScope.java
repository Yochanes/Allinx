package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/SimplePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SimplePlacementScope extends Placeable.PlacementScope {

    /* JADX INFO: renamed from: b */
    public final int f18581b;

    /* JADX INFO: renamed from: c */
    public final LayoutDirection f18582c;

    public SimplePlacementScope(int i, LayoutDirection layoutDirection) {
        this.f18581b = i;
        this.f18582c = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LayoutDirection getF18582c() {
        return this.f18582c;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF18581b() {
        return this.f18581b;
    }
}
