package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraSelectionOptimizer {
    /* JADX INFO: renamed from: a */
    public static String m989a(CameraManagerCompat cameraManagerCompat, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) cameraManagerCompat.m1095b("0").m1089a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) cameraManagerCompat.m1095b("1").m1089a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }
}
