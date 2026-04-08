package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DpTouchBoundsExpansion;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.node.TouchBoundsExpansion;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.node.TraversableNodeKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: t */
    public DpTouchBoundsExpansion f18258t;

    /* JADX INFO: renamed from: u */
    public AndroidPointerIconType f18259u;

    /* JADX INFO: renamed from: v */
    public boolean f18260v;

    public HoverIconModifierNode(AndroidPointerIconType androidPointerIconType, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.f18258t = dpTouchBoundsExpansion;
        this.f18259u = androidPointerIconType;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: C0 */
    public final void mo2397C0() {
        m5540b2();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        m5540b2();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: X */
    public final long mo3277X() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.f18258t;
        if (dpTouchBoundsExpansion == null) {
            return TouchBoundsExpansion.f19014a;
        }
        Density density = DelegatableNodeKt.m5743g(this).f18714F;
        int i = TouchBoundsExpansion.f19015b;
        return TouchBoundsExpansion.Companion.m5975b(density.mo2554k1(dpTouchBoundsExpansion.f18666a), density.mo2554k1(dpTouchBoundsExpansion.f18667b), density.mo2554k1(dpTouchBoundsExpansion.f18668c), density.mo2554k1(dpTouchBoundsExpansion.f18669d));
    }

    /* JADX INFO: renamed from: X1 */
    public final void m5536X1() {
        AndroidPointerIconType androidPointerIconType;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.m5977b(this, new HoverIconModifierNode$findOverridingAncestorNode$1(1));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.f51659a;
        if (hoverIconModifierNode == null || (androidPointerIconType = hoverIconModifierNode.f18259u) == null) {
            androidPointerIconType = this.f18259u;
        }
        mo5537Y1(androidPointerIconType);
    }

    /* JADX INFO: renamed from: Y1 */
    public abstract void mo5537Y1(PointerIcon pointerIcon);

    /* JADX INFO: renamed from: Z1 */
    public final void m5538Z1() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f51655a = true;
        TraversableNodeKt.m5978c(this, new C1231x9d6f9d4d(booleanRef));
        if (booleanRef.f51655a) {
            m5536X1();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public abstract boolean mo5539a2(int i);

    /* JADX INFO: renamed from: b2 */
    public final void m5540b2() {
        Unit unit;
        if (this.f18260v) {
            this.f18260v = false;
            if (this.f17194s) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.m5977b(this, new C1230x9932a8ca(objectRef));
                HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.f51659a;
                if (hoverIconModifierNode != null) {
                    hoverIconModifierNode.m5536X1();
                    unit = Unit.f51459a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    mo5537Y1(null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: z0 */
    public final void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.f18288b) {
            ?? r3 = pointerEvent.f18282a;
            int size = ((Collection) r3).size();
            for (int i = 0; i < size; i++) {
                if (mo5539a2(((PointerInputChange) r3.get(i)).f18305i)) {
                    int i2 = pointerEvent.f18286e;
                    if (i2 == 4) {
                        this.f18260v = true;
                        m5538Z1();
                        return;
                    } else {
                        if (i2 == 5) {
                            m5540b2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
