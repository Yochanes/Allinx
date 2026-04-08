package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraDeviceCompat {

    /* JADX INFO: renamed from: a */
    public final CameraDeviceCompatApi24Impl f1959a;

    /* JADX INFO: compiled from: Proguard */
    public interface CameraDeviceCompatImpl {
        /* JADX INFO: renamed from: a */
        void mo1093a(SessionConfigurationCompat sessionConfigurationCompat);
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class StateCallbackExecutorWrapper extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraDevice.StateCallback f1960a;

        /* JADX INFO: renamed from: b */
        public final Executor f1961b;

        public StateCallbackExecutorWrapper(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f1961b = executor;
            this.f1960a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.f1961b.execute(new RunnableC0197h(this, cameraDevice, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f1961b.execute(new RunnableC0197h(this, cameraDevice, 1));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            this.f1961b.execute(new RunnableC0194e(this, cameraDevice, i, 1));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.f1961b.execute(new RunnableC0197h(this, cameraDevice, 2));
        }
    }

    public CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f1959a = new CameraDeviceCompatApi24Impl(cameraDevice, new CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(handler));
        } else {
            cameraDevice.getClass();
            this.f1959a = new CameraDeviceCompatApi28Impl(cameraDevice, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1092a(SessionConfigurationCompat sessionConfigurationCompat) {
        this.f1959a.mo1093a(sessionConfigurationCompat);
    }
}
