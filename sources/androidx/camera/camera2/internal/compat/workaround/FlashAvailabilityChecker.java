package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.core.Logger;
import java.nio.BufferUnderflowException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class FlashAvailabilityChecker {
    /* JADX INFO: renamed from: a */
    public static boolean m1158a(CameraCharacteristicsProvider cameraCharacteristicsProvider) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            bool = (Boolean) cameraCharacteristicsProvider.get();
        } catch (BufferUnderflowException e) {
            if (DeviceQuirks.f2048a.m1514b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                Logger.m1280a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                Logger.m1283d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            Logger.m1288i("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
