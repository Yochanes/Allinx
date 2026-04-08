package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class StillCaptureFlow {

    /* JADX INFO: renamed from: a */
    public final boolean f2088a;

    public StillCaptureFlow() {
        this.f2088a = ((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.f2048a.m1514b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1160a(ArrayList arrayList, boolean z2) {
        if (!this.f2088a || !z2) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }
}
