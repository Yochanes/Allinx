package androidx.compose.p013ui.node;

import android.view.View;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DelegatableNode_androidKt {
    /* JADX INFO: renamed from: a */
    public static final View m5745a(DelegatableNode delegatableNode) {
        if (!delegatableNode.getF17181a().f17194s) {
            InlineClassHelperKt.m5597b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) LayoutNodeKt.m5833a(DelegatableNodeKt.m5743g(delegatableNode));
    }
}
