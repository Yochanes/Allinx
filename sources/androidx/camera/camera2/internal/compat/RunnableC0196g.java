package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0196g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f2005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSession f2006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Surface f2007c;

    public /* synthetic */ RunnableC0196g(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f2005a = stateCallbackExecutorWrapper;
        this.f2006b = cameraCaptureSession;
        this.f2007c = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApiCompat.Api23Impl.m1078a(this.f2005a.f1949a, this.f2006b, this.f2007c);
    }
}
