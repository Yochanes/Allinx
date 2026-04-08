package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ScreenUtils {
    public static int dpToPx(float f, Context context) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static Point getScreenDimensions(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }
}
