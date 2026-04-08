package p020c;

import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: c.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2363b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Camera2CameraControl f33257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f33258c;

    public /* synthetic */ RunnableC2363b(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer, int i) {
        this.f33256a = i;
        this.f33257b = camera2CameraControl;
        this.f33258c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33256a) {
            case 0:
                this.f33257b.m1172b(this.f33258c);
                break;
            default:
                this.f33257b.m1172b(this.f33258c);
                break;
        }
    }
}
