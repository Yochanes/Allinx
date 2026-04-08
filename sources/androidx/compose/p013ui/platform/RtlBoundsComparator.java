package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/platform/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class RtlBoundsComparator implements Comparator<SemanticsNode> {

    /* JADX INFO: renamed from: a */
    public static final RtlBoundsComparator f19517a = new RtlBoundsComparator();

    @Override // java.util.Comparator
    public final int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        Rect rectM6278f = semanticsNode.m6278f();
        Rect rectM6278f2 = semanticsNode2.m6278f();
        int iCompare = Float.compare(rectM6278f2.f17528c, rectM6278f.f17528c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(rectM6278f.f17527b, rectM6278f2.f17527b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(rectM6278f.f17529d, rectM6278f2.f17529d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(rectM6278f2.f17526a, rectM6278f.f17526a);
    }
}
