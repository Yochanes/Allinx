package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraManagerCompatApi29Impl extends CameraManagerCompatApi28Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: c */
    public final CameraCharacteristics mo1098c(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f1971a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl, androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: e */
    public final void mo1100e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f1971a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
