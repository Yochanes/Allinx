package androidx.camera.camera2.internal.compat;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraCharacteristicsApi28Impl extends CameraCharacteristicsBaseImpl {
    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    /* JADX INFO: renamed from: a */
    public final Set mo1088a() {
        try {
            return this.f1954a.getPhysicalCameraIds();
        } catch (Exception e) {
            Logger.m1283d("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e);
            return Collections.EMPTY_SET;
        }
    }
}
