package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {

    /* JADX INFO: renamed from: a */
    public final CameraDevice f1962a;

    /* JADX INFO: renamed from: b */
    public final Object f1963b;

    /* JADX INFO: compiled from: Proguard */
    public static class CameraDeviceCompatParamsApi21 {

        /* JADX INFO: renamed from: a */
        public final Handler f1964a;

        public CameraDeviceCompatParamsApi21(Handler handler) {
            this.f1964a = handler;
        }
    }

    public CameraDeviceCompatBaseImpl(CameraDevice cameraDevice, Object obj) {
        cameraDevice.getClass();
        this.f1962a = cameraDevice;
        this.f1963b = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    /* JADX INFO: renamed from: a */
    public void mo1093a(SessionConfigurationCompat sessionConfigurationCompat) {
        throw null;
    }
}
