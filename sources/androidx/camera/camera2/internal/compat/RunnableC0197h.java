package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0197h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f2009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraDevice f2010c;

    public /* synthetic */ RunnableC0197h(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.f2008a = i;
        this.f2009b = stateCallbackExecutorWrapper;
        this.f2010c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2008a) {
            case 0:
                this.f2009b.f1960a.onClosed(this.f2010c);
                break;
            case 1:
                this.f2009b.f1960a.onDisconnected(this.f2010c);
                break;
            default:
                this.f2009b.f1960a.onOpened(this.f2010c);
                break;
        }
    }
}
