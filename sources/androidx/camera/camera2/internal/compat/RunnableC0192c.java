package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0192c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper f1989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSession f1990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1991c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f1992d;

    public /* synthetic */ RunnableC0192c(CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper captureCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.f1989a = captureCallbackExecutorWrapper;
        this.f1990b = cameraCaptureSession;
        this.f1991c = i;
        this.f1992d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1989a.f1947a.onCaptureSequenceCompleted(this.f1990b, this.f1991c, this.f1992d);
    }
}
