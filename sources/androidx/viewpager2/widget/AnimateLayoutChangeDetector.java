package androidx.viewpager2.widget;

import android.view.ViewGroup;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AnimateLayoutChangeDetector {

    /* JADX INFO: renamed from: androidx.viewpager2.widget.AnimateLayoutChangeDetector$1 */
    /* JADX INFO: compiled from: Proguard */
    class C22561 implements Comparator<int[]> {
        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        new ViewGroup.MarginLayoutParams(-1, -1).setMargins(0, 0, 0, 0);
    }
}
