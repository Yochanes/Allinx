package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0193d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f1993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSession f1994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CaptureRequest f1995c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Surface f1996d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1997f;

    public /* synthetic */ RunnableC0193d(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.f1993a = captureCallbackExecutorWrapper;
        this.f1994b = cameraCaptureSession;
        this.f1995c = captureRequest;
        this.f1996d = surface;
        this.f1997f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApiCompat.Api24Impl.m1079a(this.f1993a.f1947a, this.f1994b, this.f1995c, this.f1996d, this.f1997f);
    }
}
