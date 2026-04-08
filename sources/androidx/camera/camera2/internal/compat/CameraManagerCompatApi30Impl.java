package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: d */
    public final Set mo1099d() throws CameraAccessExceptionCompat {
        try {
            return this.f1971a.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
