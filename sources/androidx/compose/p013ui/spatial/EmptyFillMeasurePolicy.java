package androidx.compose.p013ui.spatial;

import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/spatial/EmptyFillMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class EmptyFillMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21912measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return MeasureScope.m5661V0(measureScope, Constraints.m6617h(j), Constraints.m6616g(j), EmptyFillMeasurePolicy$measure$1.f19846a);
    }
}
