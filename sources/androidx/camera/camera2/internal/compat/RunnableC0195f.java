package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0195f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraCaptureSessionCompat.StateCallbackExecutorWrapper f2003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraCaptureSession f2004c;

    public /* synthetic */ RunnableC0195f(CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraCaptureSession cameraCaptureSession, int i) {
        this.f2002a = i;
        this.f2003b = stateCallbackExecutorWrapper;
        this.f2004c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2002a) {
            case 0:
                this.f2003b.f1949a.onActive(this.f2004c);
                break;
            case 1:
                this.f2003b.f1949a.onClosed(this.f2004c);
                break;
            case 2:
                ApiCompat.Api26Impl.m1081b(this.f2003b.f1949a, this.f2004c);
                break;
            case 3:
                this.f2003b.f1949a.onConfigured(this.f2004c);
                break;
            case 4:
                this.f2003b.f1949a.onReady(this.f2004c);
                break;
            default:
                this.f2003b.f1949a.onConfigureFailed(this.f2004c);
                break;
        }
    }
}
