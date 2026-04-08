package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraCaptureSessionCompatApi28Impl extends CameraCaptureSessionCompatBaseImpl {
    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    /* JADX INFO: renamed from: a */
    public final int mo1086a(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1951a.captureBurstRequests(arrayList, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    /* JADX INFO: renamed from: b */
    public final int mo1087b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1951a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
