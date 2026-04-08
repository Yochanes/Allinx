package com.king.camera.scan.config;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import com.king.logx.LogX;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraConfigFactory {

    /* JADX INFO: renamed from: com.king.camera.scan.config.CameraConfigFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    class C49751 extends AdaptiveCameraConfig {
        @Override // com.king.camera.scan.config.AdaptiveCameraConfig, com.king.camera.scan.config.CameraConfig
        /* JADX INFO: renamed from: a */
        public final CameraSelector mo15336a(CameraSelector.Builder builder) {
            return builder.m1220a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static CameraConfig m15339a(Context context) {
        C49751 c49751 = new C49751();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        LogX.m15342d("displayMetrics: %dx%d", Integer.valueOf(i), Integer.valueOf(i2));
        AspectRatioStrategy aspectRatioStrategy = AspectRatioStrategy.f3176c;
        AspectRatioStrategy aspectRatioStrategy2 = AspectRatioStrategy.f3175b;
        if (i >= i2) {
            c49751.f42993b = Math.min(i2, 1080);
            float f = i / i2;
            if (Math.abs(f - 1.3333334f) < Math.abs(f - 1.7777778f)) {
                c49751.f42992a = aspectRatioStrategy2;
            } else {
                c49751.f42992a = aspectRatioStrategy;
            }
            c49751.f42995d = new Size(Math.round(c49751.f42993b * f), c49751.f42993b);
            if (i2 > 1080) {
                c49751.f42994c = 1080;
            } else {
                c49751.f42994c = Math.min(i2, 720);
            }
            c49751.f42996e = new Size(Math.round(c49751.f42994c * f), c49751.f42994c);
            return c49751;
        }
        float f2 = i2 / i;
        c49751.f42993b = Math.min(i, 1080);
        if (Math.abs(f2 - 1.3333334f) < Math.abs(f2 - 1.7777778f)) {
            c49751.f42992a = aspectRatioStrategy2;
        } else {
            c49751.f42992a = aspectRatioStrategy;
        }
        int i3 = c49751.f42993b;
        c49751.f42995d = new Size(i3, Math.round(i3 * f2));
        if (i > 1080) {
            c49751.f42994c = 1080;
        } else {
            c49751.f42994c = Math.min(i, 720);
        }
        int i4 = c49751.f42994c;
        c49751.f42996e = new Size(i4, Math.round(i4 * f2));
        return c49751;
    }
}
