package androidx.compose.p013ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, m18302d2 = {"androidx/compose/ui/node/DepthSortedSetKt$DepthComparator$1", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DepthSortedSetKt$DepthComparator$1 implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        int iM18601i = Intrinsics.m18601i(layoutNode3.f18749w, layoutNode4.f18749w);
        return iM18601i != 0 ? iM18601i : Intrinsics.m18601i(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
