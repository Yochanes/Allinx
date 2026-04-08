package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0191b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f1985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraCaptureSession f1986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CaptureRequest f1987d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1988f;

    public /* synthetic */ RunnableC0191b(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Object obj, int i) {
        this.f1984a = i;
        this.f1985b = captureCallbackExecutorWrapper;
        this.f1986c = cameraCaptureSession;
        this.f1987d = captureRequest;
        this.f1988f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1984a) {
            case 0:
                this.f1985b.f1947a.onCaptureCompleted(this.f1986c, this.f1987d, (TotalCaptureResult) this.f1988f);
                break;
            case 1:
                this.f1985b.f1947a.onCaptureProgressed(this.f1986c, this.f1987d, (CaptureResult) this.f1988f);
                break;
            default:
                this.f1985b.f1947a.onCaptureFailed(this.f1986c, this.f1987d, (CaptureFailure) this.f1988f);
                break;
        }
    }
}
