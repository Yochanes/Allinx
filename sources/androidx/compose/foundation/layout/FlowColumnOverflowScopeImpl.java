package androidx.compose.foundation.layout;

import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowColumnOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnOverflowScope;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {

    /* JADX INFO: renamed from: a */
    public final FlowLayoutOverflowState f6365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowColumnScopeInstance f6366b = FlowColumnScopeInstance.f6371a;

    /* JADX INFO: renamed from: c */
    public final Lazy f6367c = new LazyImpl(new FlowColumnOverflowScopeImpl$totalItemCount$2(this), "Lazy item is not yet initialized");

    /* JADX INFO: renamed from: d */
    public final Lazy f6368d;

    public FlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f6365a = flowLayoutOverflowState;
        flowLayoutOverflowState.getClass();
        this.f6368d = new LazyImpl(new FlowColumnOverflowScopeImpl$shownItemCount$2(this), "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    /* JADX INFO: renamed from: b */
    public final Modifier mo2757b(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        this.f6366b.getClass();
        return ColumnScopeInstance.f6330a.mo2757b(modifier, horizontal);
    }
}
