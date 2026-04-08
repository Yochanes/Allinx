package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputNode;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f18415t;

    @Override // androidx.compose.p013ui.input.rotary.RotaryInputModifierNode
    /* JADX INFO: renamed from: w0 */
    public final boolean mo5594w0(RotaryScrollEvent rotaryScrollEvent) {
        Function1 function1 = this.f18415t;
        if (function1 != null) {
            return ((Boolean) function1.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p013ui.input.rotary.RotaryInputModifierNode
    /* JADX INFO: renamed from: y0 */
    public final boolean mo5595y0(RotaryScrollEvent rotaryScrollEvent) {
        return false;
    }
}
