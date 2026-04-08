package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/selection/ToggleableNode;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ToggleableNode extends ClickableNode {

    /* JADX INFO: renamed from: M */
    public boolean f7968M;

    /* JADX INFO: renamed from: N */
    public Function1 f7969N;

    /* JADX INFO: renamed from: O */
    public final Function0 f7970O;

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.ToggleableNode$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C06591 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1 f7971a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f7972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06591(Function1 function1, boolean z2) {
            super(0);
            this.f7971a = function1;
            this.f7972b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.f7971a.invoke(Boolean.valueOf(!this.f7972b));
            return Unit.f51459a;
        }
    }

    public ToggleableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1) {
        super(mutableInteractionSource, indicationNodeFactory, z3, null, role, new C06591(function1, z2));
        this.f7968M = z2;
        this.f7969N = function1;
        this.f7970O = new ToggleableNode$_onClick$1(this);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: a2 */
    public final void mo2401a2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToggleableState toggleableState = this.f7968M ? ToggleableState.f19878a : ToggleableState.f19879b;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f19838a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19791H;
        KProperty kProperty = SemanticsPropertiesKt.f19838a[23];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, toggleableState);
    }
}
