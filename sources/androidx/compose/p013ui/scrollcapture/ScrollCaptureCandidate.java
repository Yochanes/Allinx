package androidx.compose.p013ui.scrollcapture;

import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.semantics.SemanticsNode;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: a */
    public final SemanticsNode f19710a;

    /* JADX INFO: renamed from: b */
    public final int f19711b;

    /* JADX INFO: renamed from: c */
    public final IntRect f19712c;

    /* JADX INFO: renamed from: d */
    public final NodeCoordinator f19713d;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, IntRect intRect, NodeCoordinator nodeCoordinator) {
        this.f19710a = semanticsNode;
        this.f19711b = i;
        this.f19712c = intRect;
        this.f19713d = nodeCoordinator;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f19710a + ", depth=" + this.f19711b + ", viewportBoundsInWindow=" + this.f19712c + ", coordinates=" + this.f19713d + ')';
    }
}
