package androidx.compose.p013ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "mask", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class NodeKind<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeKind)) {
            return false;
        }
        ((NodeKind) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "NodeKind(mask=0)";
    }
}
