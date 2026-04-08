package coil.util;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: coil.util.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2383b {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m12545a(Typeface typeface) {
        return typeface.getWeight();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ long m12546b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ long m12547c(MediaExtractor mediaExtractor) {
        return mediaExtractor.getSampleSize();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Bitmap m12548d(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ String m12549e() {
        return Application.getProcessName();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m12550f(MediaMetadataRetriever.BitmapParams bitmapParams, Bitmap.Config config) {
        bitmapParams.setPreferredConfig(config);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m12551g(BottomAppBar bottomAppBar) {
        bottomAppBar.setOutlineAmbientShadowColor(0);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m12552h(BottomAppBar bottomAppBar) {
        bottomAppBar.setOutlineSpotShadowColor(0);
    }
}
