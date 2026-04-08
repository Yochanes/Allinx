package androidx.compose.p013ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/key/KeyInputNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f18211t;

    /* JADX INFO: renamed from: u */
    public Function1 f18212u;

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: N */
    public final boolean mo2399N(KeyEvent keyEvent) {
        Function1 function1 = this.f18212u;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: r0 */
    public final boolean mo2409r0(KeyEvent keyEvent) {
        Function1 function1 = this.f18211t;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }
}
