package androidx.compose.p013ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderUnderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {

    /* JADX INFO: renamed from: a */
    public final BreakIterator f20173a;

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f20173a = characterInstance;
    }

    @Override // androidx.compose.p013ui.text.android.selection.GraphemeClusterSegmentFinder
    /* JADX INFO: renamed from: e */
    public final int mo6490e(int i) {
        return this.f20173a.following(i);
    }

    @Override // androidx.compose.p013ui.text.android.selection.GraphemeClusterSegmentFinder
    /* JADX INFO: renamed from: f */
    public final int mo6491f(int i) {
        return this.f20173a.preceding(i);
    }
}
