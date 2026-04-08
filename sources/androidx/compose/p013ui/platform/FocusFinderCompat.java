package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "Companion", "UserSpecifiedFocusComparator", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FocusFinderCompat {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "FocusFinderThreadLocal", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "NextFocusGetter", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class UserSpecifiedFocusComparator implements Comparator<View> {

        /* JADX INFO: renamed from: a */
        public final MutableScatterMap f19410a;

        /* JADX INFO: renamed from: b */
        public final MutableScatterMap f19411b;

        /* JADX INFO: renamed from: c */
        public final MutableObjectIntMap f19412c;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public interface NextFocusGetter {
        }

        public UserSpecifiedFocusComparator(C1318n c1318n) {
            long[] jArr = ScatterMapKt.f3844a;
            this.f19410a = new MutableScatterMap();
            int i = ScatterSetKt.f3851a;
            new MutableScatterSet();
            this.f19411b = new MutableScatterMap();
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f3817a;
            this.f19412c = new MutableObjectIntMap();
        }

        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            if (view3 == view4) {
                return 0;
            }
            if (view3 == null) {
                return -1;
            }
            if (view4 == null) {
                return 1;
            }
            MutableScatterMap mutableScatterMap = this.f19411b;
            View view5 = (View) mutableScatterMap.m2109e(view3);
            View view6 = (View) mutableScatterMap.m2109e(view4);
            if (view5 == view6 && view5 != null) {
                if (view3 == view5) {
                    return -1;
                }
                return (view4 == view5 || this.f19410a.m2109e(view3) == null) ? 1 : -1;
            }
            if (view5 != null) {
                view3 = view5;
            }
            if (view6 != null) {
                view4 = view6;
            }
            if (view5 == null && view6 == null) {
                return 0;
            }
            MutableObjectIntMap mutableObjectIntMap = this.f19412c;
            return mutableObjectIntMap.m2095b(view3) < mutableObjectIntMap.m2095b(view4) ? -1 : 1;
        }
    }

    static {
        new FocusFinderCompat$Companion$FocusFinderThreadLocal$1();
    }
}
