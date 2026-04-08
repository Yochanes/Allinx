package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.semantics.SemanticsNode;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/platform/TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TopBottomBoundsComparator implements Comparator<Pair<? extends Rect, ? extends List<SemanticsNode>>> {

    /* JADX INFO: renamed from: a */
    public static final TopBottomBoundsComparator f19535a = new TopBottomBoundsComparator();

    @Override // java.util.Comparator
    public final int compare(Pair<? extends Rect, ? extends List<SemanticsNode>> pair, Pair<? extends Rect, ? extends List<SemanticsNode>> pair2) {
        Pair<? extends Rect, ? extends List<SemanticsNode>> pair3 = pair;
        Pair<? extends Rect, ? extends List<SemanticsNode>> pair4 = pair2;
        int iCompare = Float.compare(((Rect) pair3.f51426a).f17527b, ((Rect) pair4.f51426a).f17527b);
        return iCompare != 0 ? iCompare : Float.compare(((Rect) pair3.f51426a).f17529d, ((Rect) pair4.f51426a).f17529d);
    }
}
