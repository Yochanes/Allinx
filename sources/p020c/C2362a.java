package p020c;

import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2362a implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Camera2CameraControl f33255b;

    public /* synthetic */ C2362a(Camera2CameraControl camera2CameraControl, int i) {
        this.f33254a = i;
        this.f33255b = camera2CameraControl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        switch (this.f33254a) {
            case 0:
                Camera2CameraControl camera2CameraControl = this.f33255b;
                camera2CameraControl.getClass();
                camera2CameraControl.f2161d.execute(new RunnableC2363b(camera2CameraControl, completer, 0));
                return "addCaptureRequestOptions";
            default:
                Camera2CameraControl camera2CameraControl2 = this.f33255b;
                camera2CameraControl2.getClass();
                camera2CameraControl2.f2161d.execute(new RunnableC2363b(camera2CameraControl2, completer, 1));
                return "clearCaptureRequestOptions";
        }
    }
}
