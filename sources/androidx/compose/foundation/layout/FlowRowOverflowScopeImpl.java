package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {

    /* JADX INFO: renamed from: a */
    public final FlowLayoutOverflowState f6440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowRowScopeInstance f6441b = FlowRowScopeInstance.f6446a;

    /* JADX INFO: renamed from: c */
    public final Lazy f6442c = new LazyImpl(new FlowRowOverflowScopeImpl$totalItemCount$2(this), "Lazy item is not yet initialized");

    /* JADX INFO: renamed from: d */
    public final Lazy f6443d;

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f6440a = flowLayoutOverflowState;
        flowLayoutOverflowState.getClass();
        this.f6443d = new LazyImpl(new FlowRowOverflowScopeImpl$shownItemCount$2(this), "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    @Override // androidx.compose.foundation.layout.RowScope
    /* JADX INFO: renamed from: a */
    public final Modifier mo2761a(Modifier modifier, float f, boolean z2) {
        this.f6441b.getClass();
        return RowScopeInstance.f6554a.mo2761a(modifier, f, z2);
    }
}
