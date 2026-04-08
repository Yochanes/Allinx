package androidx.compose.p013ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    @Override // androidx.compose.p013ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: W0 */
    public final boolean mo5513W0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.p013ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: Y */
    public final boolean mo5514Y(KeyEvent keyEvent) {
        return false;
    }
}
