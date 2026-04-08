package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraValidator {

    /* JADX INFO: compiled from: Proguard */
    public static class CameraIdListIncorrectException extends Exception {
    }

    /* JADX INFO: renamed from: a */
    public static void m1456a(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer numM1219c;
        if (cameraSelector != null) {
            try {
                numM1219c = cameraSelector.m1219c();
                if (numM1219c == null) {
                    Logger.m1288i("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                Logger.m1283d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numM1219c = null;
        }
        Logger.m1280a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numM1219c);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || numM1219c.intValue() == 1)) {
                Iterator it = CameraSelector.f2206c.m1217a(cameraRepository.m1446a()).iterator();
                if (!it.hasNext()) {
                    throw new IllegalArgumentException("No available camera can be found");
                }
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (cameraSelector == null || numM1219c.intValue() == 0) {
                    Iterator it2 = CameraSelector.f2205b.m1217a(cameraRepository.m1446a()).iterator();
                    if (!it2.hasNext()) {
                        throw new IllegalArgumentException("No available camera can be found");
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            Logger.m1282c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + cameraRepository.m1446a());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }
}
