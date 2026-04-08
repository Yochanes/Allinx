package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk {
    /* JADX INFO: renamed from: d */
    public static boolean m1876d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1877e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1878f() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a(CameraInfoInternal cameraInfoInternal, Quality quality) {
        if (m1876d() || m1877e()) {
            return quality == Quality.f3305d;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return quality == Quality.f3303b || quality == Quality.f3304c;
        }
        if (m1878f() && cameraInfoInternal.mo949h() == 0) {
            return quality == Quality.f3304c || quality == Quality.f3303b;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: c */
    public final boolean mo1879c() {
        return m1876d() || m1877e() || m1878f();
    }
}
