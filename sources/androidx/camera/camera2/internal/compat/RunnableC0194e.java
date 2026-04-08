package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0194e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2000c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AutoCloseable f2001d;

    public /* synthetic */ RunnableC0194e(Object obj, AutoCloseable autoCloseable, int i, int i2) {
        this.f1998a = i2;
        this.f2000c = obj;
        this.f2001d = autoCloseable;
        this.f1999b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1998a) {
            case 0:
                ((CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper) this.f2000c).f1947a.onCaptureSequenceAborted((CameraCaptureSession) this.f2001d, this.f1999b);
                break;
            default:
                ((CameraDeviceCompat.StateCallbackExecutorWrapper) this.f2000c).f1960a.onError((CameraDevice) this.f2001d, this.f1999b);
                break;
        }
    }
}
