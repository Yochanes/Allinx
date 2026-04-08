package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0190a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f1979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSession f1980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CaptureRequest f1981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f1982d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1983f;

    public /* synthetic */ RunnableC0190a(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f1979a = captureCallbackExecutorWrapper;
        this.f1980b = cameraCaptureSession;
        this.f1981c = captureRequest;
        this.f1982d = j;
        this.f1983f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1979a.f1947a.onCaptureStarted(this.f1980b, this.f1981c, this.f1982d, this.f1983f);
    }
}
