package androidx.compose.p013ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class WordSegmentFinder implements SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final CharSequence f20178a;

    /* JADX INFO: renamed from: b */
    public final WordIterator f20179b;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.f20178a = charSequence;
        this.f20179b = wordIterator;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: a */
    public final int mo6486a(int i) {
        CharSequence charSequence;
        do {
            i = this.f20179b.m6499h(i);
            if (i != -1) {
                charSequence = this.f20178a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: b */
    public final int mo6487b(int i) {
        do {
            i = this.f20179b.m6500i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20178a.charAt(i - 1)));
        return i;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: c */
    public final int mo6488c(int i) {
        do {
            i = this.f20179b.m6500i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20178a.charAt(i)));
        return i;
    }

    @Override // androidx.compose.p013ui.text.android.selection.SegmentFinder
    /* JADX INFO: renamed from: d */
    public final int mo6489d(int i) {
        do {
            i = this.f20179b.m6499h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f20178a.charAt(i - 1)));
        return i;
    }
}
