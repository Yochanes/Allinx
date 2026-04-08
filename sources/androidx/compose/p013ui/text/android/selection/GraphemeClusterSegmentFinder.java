package androidx.compose.p013ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: a */
    public final int mo6486a(int i) {
        int iMo6490e = mo6490e(i);
        if (iMo6490e == -1 || mo6490e(iMo6490e) == -1) {
            return -1;
        }
        return iMo6490e;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: b */
    public final int mo6487b(int i) {
        int iMo6491f = mo6491f(i);
        if (iMo6491f == -1 || mo6491f(iMo6491f) == -1) {
            return -1;
        }
        return iMo6491f;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: c */
    public final int mo6488c(int i) {
        return mo6491f(i);
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: d */
    public final int mo6489d(int i) {
        return mo6490e(i);
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo6490e(int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo6491f(int i);
}
