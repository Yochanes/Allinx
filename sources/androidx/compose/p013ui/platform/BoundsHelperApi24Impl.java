package androidx.compose.p013ui.platform;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi24Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BoundsHelperApi24Impl implements BoundsHelper {

    /* JADX INFO: renamed from: a */
    public static final BoundsHelperApi24Impl f19312a = new BoundsHelperApi24Impl();

    @Override // androidx.compose.p013ui.platform.BoundsHelper
    /* JADX INFO: renamed from: a */
    public final Rect mo6101a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }
}
