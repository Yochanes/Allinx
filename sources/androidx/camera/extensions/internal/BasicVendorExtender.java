package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class BasicVendorExtender implements VendorExtender {
    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(AbstractC0025b.m115g());
        }
    }
}
