package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    /* JADX INFO: renamed from: d */
    public static boolean m1873d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1874e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a(CameraInfoInternal cameraInfoInternal, Quality quality) {
        return !("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) ? !((m1874e() || m1873d()) && quality == Quality.f3304c) : !(quality == Quality.f3304c || quality == Quality.f3305d);
    }
}
