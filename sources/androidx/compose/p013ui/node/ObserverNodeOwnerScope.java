package androidx.compose.p013ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ObserverNodeOwnerScope implements OwnerScope {

    /* JADX INFO: renamed from: b */
    public static final Function1 f18988b = null;

    /* JADX INFO: renamed from: a */
    public final ObserverModifierNode f18989a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.f18989a = observerModifierNode;
    }

    @Override // androidx.compose.p013ui.node.OwnerScope
    /* JADX INFO: renamed from: b0 */
    public final boolean mo5720b0() {
        return this.f18989a.getF17181a().f17194s;
    }
}
