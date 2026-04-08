package androidx.camera.camera2.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class CaptureCallbackConverter {
    /* JADX INFO: renamed from: a */
    public static void m990a(CameraCaptureCallback cameraCaptureCallback, ArrayList arrayList) {
        if (cameraCaptureCallback instanceof CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            ((CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getClass();
            throw null;
        }
        if (cameraCaptureCallback instanceof CaptureCallbackContainer) {
            arrayList.add(((CaptureCallbackContainer) cameraCaptureCallback).f1722a);
        } else {
            arrayList.add(new CaptureCallbackAdapter(cameraCaptureCallback));
        }
    }
}
