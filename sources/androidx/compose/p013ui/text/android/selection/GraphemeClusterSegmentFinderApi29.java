package androidx.compose.p013ui.text.android.selection;

import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.snackbar.AbstractC3999a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinderApi29;", "Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {

    /* JADX INFO: renamed from: a */
    public final CharSequence f20171a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f20172b;

    public GraphemeClusterSegmentFinderApi29(TextPaint textPaint, CharSequence charSequence) {
        this.f20171a = charSequence;
        this.f20172b = textPaint;
    }

    @Override // androidx.compose.p013ui.text.android.selection.GraphemeClusterSegmentFinder
    /* JADX INFO: renamed from: e */
    public final int mo6490e(int i) {
        CharSequence charSequence = this.f20171a;
        return AbstractC3999a.m14731k(this.f20172b, charSequence, charSequence.length(), i);
    }

    @Override // androidx.compose.p013ui.text.android.selection.GraphemeClusterSegmentFinder
    /* JADX INFO: renamed from: f */
    public final int mo6491f(int i) {
        CharSequence charSequence = this.f20171a;
        return AbstractC3999a.m14721a(this.f20172b, charSequence, charSequence.length(), i);
    }
}
