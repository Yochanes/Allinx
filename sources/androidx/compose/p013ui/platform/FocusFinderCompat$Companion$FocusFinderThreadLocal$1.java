package androidx.compose.p013ui.platform;

import android.graphics.Rect;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.platform.FocusFinderCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "Ljava/lang/ThreadLocal;", "Landroidx/compose/ui/platform/FocusFinderCompat;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusFinderCompat$Companion$FocusFinderThreadLocal$1 extends ThreadLocal<FocusFinderCompat> {
    @Override // java.lang.ThreadLocal
    public final FocusFinderCompat initialValue() {
        FocusFinderCompat focusFinderCompat = new FocusFinderCompat();
        new Rect();
        new FocusFinderCompat.UserSpecifiedFocusComparator(new C1318n());
        new MutableObjectList();
        return focusFinderCompat;
    }
}
