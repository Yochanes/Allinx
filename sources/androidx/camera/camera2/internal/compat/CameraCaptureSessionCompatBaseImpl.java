package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession f1951a;

    /* JADX INFO: renamed from: b */
    public final Object f1952b;

    /* JADX INFO: compiled from: Proguard */
    public static class CameraCaptureSessionCompatParamsApi21 {

        /* JADX INFO: renamed from: a */
        public final Handler f1953a;

        public CameraCaptureSessionCompatParamsApi21(Handler handler) {
            this.f1953a = handler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(CameraCaptureSession cameraCaptureSession, Object obj) {
        cameraCaptureSession.getClass();
        this.f1951a = cameraCaptureSession;
        this.f1952b = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    /* JADX INFO: renamed from: a */
    public int mo1086a(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1951a.captureBurst(arrayList, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.f1952b).f1953a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    /* JADX INFO: renamed from: b */
    public int mo1087b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1951a.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.f1952b).f1953a);
    }
}
