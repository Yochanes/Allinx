package androidx.compose.p013ui.graphics;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", "T", "", "Node", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public final class IntervalTree<T> {

    /* JADX INFO: renamed from: a */
    public final Node f17601a = new Node(1);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class Node extends Interval<T> {

        /* JADX INFO: renamed from: a */
        public final Node f17602a;

        /* JADX INFO: renamed from: b */
        public final Node f17603b;

        /* JADX INFO: renamed from: c */
        public final Node f17604c;

        public Node(int i) {
            Node node = IntervalTree.this.f17601a;
            this.f17602a = node;
            this.f17603b = node;
            this.f17604c = node;
        }
    }

    public IntervalTree() {
        new ArrayList();
    }
}
