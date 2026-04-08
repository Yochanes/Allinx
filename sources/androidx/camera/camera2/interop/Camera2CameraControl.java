package androidx.camera.camera2.interop;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.RunnableC0205f;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import p020c.C2364c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@ExperimentalCamera2Interop
public final class Camera2CameraControl {

    /* JADX INFO: renamed from: c */
    public final Camera2CameraControlImpl f2160c;

    /* JADX INFO: renamed from: d */
    public final Executor f2161d;

    /* JADX INFO: renamed from: g */
    public CallbackToFutureAdapter.Completer f2164g;

    /* JADX INFO: renamed from: a */
    public boolean f2158a = false;

    /* JADX INFO: renamed from: b */
    public boolean f2159b = false;

    /* JADX INFO: renamed from: e */
    public final Object f2162e = new Object();

    /* JADX INFO: renamed from: f */
    public Camera2ImplConfig.Builder f2163f = new Camera2ImplConfig.Builder();

    /* JADX INFO: renamed from: h */
    public final C2364c f2165h = new C2364c(this);

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.f2160c = camera2CameraControlImpl;
        this.f2161d = executor;
    }

    /* JADX INFO: renamed from: a */
    public final Camera2ImplConfig m1171a() {
        Camera2ImplConfig camera2ImplConfigM815c;
        synchronized (this.f2162e) {
            try {
                CallbackToFutureAdapter.Completer completer = this.f2164g;
                if (completer != null) {
                    this.f2163f.f1528a.mo1506u(Camera2ImplConfig.f1526M, Integer.valueOf(completer.hashCode()));
                }
                camera2ImplConfigM815c = this.f2163f.m815c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return camera2ImplConfigM815c;
    }

    /* JADX INFO: renamed from: b */
    public final void m1172b(CallbackToFutureAdapter.Completer completer) {
        this.f2159b = true;
        CallbackToFutureAdapter.Completer completer2 = this.f2164g;
        if (completer2 == null) {
            completer2 = null;
        }
        this.f2164g = completer;
        if (this.f2158a) {
            Camera2CameraControlImpl camera2CameraControlImpl = this.f2160c;
            camera2CameraControlImpl.getClass();
            camera2CameraControlImpl.f1549c.execute(new RunnableC0205f(camera2CameraControlImpl, 0));
            this.f2159b = false;
        }
        if (completer2 != null) {
            completer2.m6744d(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
