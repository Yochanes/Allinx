package androidx.compose.p013ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi16Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BoundsHelperApi16Impl implements BoundsHelper {
    @Override // androidx.compose.p013ui.platform.BoundsHelper
    /* JADX INFO: renamed from: a */
    public final Rect mo6101a(Activity activity) {
        int i;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i2 = point.x;
        if (i2 == 0 || (i = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i2;
        rect.bottom = i;
        return rect;
    }
}
