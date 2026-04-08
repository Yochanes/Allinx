package androidx.compose.p013ui.text.android.selection;

import android.text.SegmentFinder;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/text/android/selection/Api34SegmentFinder$toAndroidSegmentFinder$1", "Landroid/text/SegmentFinder;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Api34SegmentFinder$toAndroidSegmentFinder$1 extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WordSegmentFinder f20170a;

    public Api34SegmentFinder$toAndroidSegmentFinder$1(WordSegmentFinder wordSegmentFinder) {
        this.f20170a = wordSegmentFinder;
    }

    public final int nextEndBoundary(int i) {
        return this.f20170a.mo6489d(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f20170a.mo6486a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f20170a.mo6487b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f20170a.mo6488c(i);
    }
}
