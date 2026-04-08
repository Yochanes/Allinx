package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraCharacteristicsBaseImpl implements CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristics f1954a;

    public CameraCharacteristicsBaseImpl(CameraCharacteristics cameraCharacteristics) {
        this.f1954a = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    /* JADX INFO: renamed from: a */
    public Set mo1088a() {
        return Collections.EMPTY_SET;
    }
}
