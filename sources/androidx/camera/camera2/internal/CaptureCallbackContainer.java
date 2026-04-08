package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class CaptureCallbackContainer extends CameraCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback f1722a;

    public CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f1722a = captureCallback;
    }
}
