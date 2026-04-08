package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NodeCoordinatorKt {
    /* JADX INFO: renamed from: a */
    public static final Modifier.Node m5940a(DelegatableNode delegatableNode, int i) {
        Modifier.Node node = delegatableNode.getF17181a().f17186g;
        if (node == null || (node.f17184d & i) == 0) {
            return null;
        }
        while (node != null) {
            int i2 = node.f17183c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return node;
            }
            node = node.f17186g;
        }
        return null;
    }
}
