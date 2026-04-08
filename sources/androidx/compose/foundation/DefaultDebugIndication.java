package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.LayoutNodeDrawScope;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "DefaultDebugIndicationInstance", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DefaultDebugIndication implements IndicationNodeFactory {

    /* JADX INFO: renamed from: a */
    public static final DefaultDebugIndication f4952a = new DefaultDebugIndication();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {

        /* JADX INFO: renamed from: t */
        public final InteractionSource f4953t;

        /* JADX INFO: renamed from: u */
        public boolean f4954u;

        /* JADX INFO: renamed from: v */
        public boolean f4955v;

        /* JADX INFO: renamed from: w */
        public boolean f4956w;

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.f4953t = interactionSource;
        }

        @Override // androidx.compose.ui.Modifier.Node
        /* JADX INFO: renamed from: P1 */
        public final void mo2174P1() {
            BuildersKt.m20507c(m4865L1(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
        }

        @Override // androidx.compose.p013ui.node.DrawModifierNode
        /* JADX INFO: renamed from: z */
        public final void mo2209z(LayoutNodeDrawScope layoutNodeDrawScope) {
            layoutNodeDrawScope.mo5369C1();
            boolean z2 = this.f4954u;
            CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.f18771a;
            if (z2) {
                DrawScope.m5371J(layoutNodeDrawScope, Color.m5180b(0.3f, Color.f17574b), 0L, canvasDrawScope.mo5383h(), 0.0f, null, null, ModuleDescriptor.MODULE_VERSION);
            } else if (this.f4955v || this.f4956w) {
                DrawScope.m5371J(layoutNodeDrawScope, Color.m5180b(0.1f, Color.f17574b), 0L, canvasDrawScope.mo5383h(), 0.0f, null, null, ModuleDescriptor.MODULE_VERSION);
            }
        }
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    /* JADX INFO: renamed from: b */
    public final DelegatableNode mo2446b(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        return -1;
    }
}
