package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/SpacerMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SpacerMeasurePolicy implements MeasurePolicy {

    /* JADX INFO: renamed from: a */
    public static final SpacerMeasurePolicy f6581a = new SpacerMeasurePolicy();

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21912measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return MeasureScope.m5661V0(measureScope, Constraints.m6615f(j) ? Constraints.m6617h(j) : 0, Constraints.m6614e(j) ? Constraints.m6616g(j) : 0, SpacerMeasurePolicy$measure$1$1.f6582a);
    }
}
