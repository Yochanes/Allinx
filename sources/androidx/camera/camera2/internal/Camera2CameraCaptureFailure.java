package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureFailure;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureFailure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Camera2CameraCaptureFailure extends CameraCaptureFailure {

    /* JADX INFO: renamed from: a */
    public final CaptureFailure f1545a;

    public Camera2CameraCaptureFailure(CaptureFailure captureFailure) {
        this.f1545a = captureFailure;
    }
}
