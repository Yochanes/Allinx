package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.node.OwnerScope;
import androidx.compose.p013ui.semantics.ScrollAxisRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScrollObservationScope implements OwnerScope {

    /* JADX INFO: renamed from: a */
    public final int f19518a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f19519b;

    /* JADX INFO: renamed from: c */
    public Float f19520c = null;

    /* JADX INFO: renamed from: d */
    public Float f19521d = null;

    /* JADX INFO: renamed from: f */
    public ScrollAxisRange f19522f = null;

    /* JADX INFO: renamed from: g */
    public ScrollAxisRange f19523g = null;

    public ScrollObservationScope(int i, ArrayList arrayList) {
        this.f19518a = i;
        this.f19519b = arrayList;
    }

    @Override // androidx.compose.p013ui.node.OwnerScope
    /* JADX INFO: renamed from: b0 */
    public final boolean mo5720b0() {
        return this.f19519b.contains(this);
    }
}
