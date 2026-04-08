package androidx.compose.p013ui.node;

import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PointerInputModifierNode extends DelegatableNode {
    /* JADX INFO: renamed from: C0 */
    void mo2397C0();

    /* JADX INFO: renamed from: X */
    default long mo3277X() {
        int i = TouchBoundsExpansion.f19015b;
        return TouchBoundsExpansion.f19014a;
    }

    /* JADX INFO: renamed from: p1 */
    default boolean mo5721p1() {
        return false;
    }

    /* JADX INFO: renamed from: w1 */
    default void mo5582w1() {
        mo2397C0();
    }

    /* JADX INFO: renamed from: y */
    default void mo2578y() {
        mo2397C0();
    }

    /* JADX INFO: renamed from: z0 */
    void mo2411z0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    /* JADX INFO: renamed from: J0 */
    default void mo5716J0() {
    }
}
