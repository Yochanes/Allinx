package androidx.compose.foundation.text.handwriting;

import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {

    /* JADX INFO: renamed from: v */
    public final Object f8770v = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, new HandwritingDetectorNode$composeImm$2(this));

    /* JADX INFO: renamed from: w */
    public final StylusHandwritingNode f8771w;

    public HandwritingDetectorNode() {
        StylusHandwritingNode stylusHandwritingNode = new StylusHandwritingNode(new HandwritingDetectorNode$pointerInputNode$1(this));
        m5746X1(stylusHandwritingNode);
        this.f8771w = stylusHandwritingNode;
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: C0 */
    public final void mo2397C0() {
        this.f8771w.mo2397C0();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: X */
    public final long mo3277X() {
        return this.f8771w.mo3277X();
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: z0 */
    public final void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.f8771w.mo2411z0(pointerEvent, pointerEventPass, j);
    }
}
