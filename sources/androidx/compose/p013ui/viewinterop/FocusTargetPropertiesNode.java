package androidx.compose.p013ui.viewinterop;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusProperties;
import androidx.compose.p013ui.focus.FocusPropertiesModifierNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.p013ui.focus.FocusPropertiesModifierNode
    /* JADX INFO: renamed from: m0 */
    public final void mo5000m0(FocusProperties focusProperties) {
        focusProperties.mo4998c(this.f17181a.f17194s && FocusGroupNode_androidKt.m6713c(this).hasFocusable());
    }
}
