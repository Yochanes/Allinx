package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraDeviceCompatApi28Impl extends CameraDeviceCompatApi24Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    /* JADX INFO: renamed from: a */
    public final void mo1093a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.m1143i();
        sessionConfiguration.getClass();
        try {
            this.f1962a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
