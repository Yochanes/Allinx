package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraInfoInternal extends CameraInfo {
    /* JADX INFO: renamed from: a */
    Set mo943a();

    /* JADX INFO: renamed from: c */
    String mo945c();

    /* JADX INFO: renamed from: g */
    void mo948g(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    /* JADX INFO: renamed from: i */
    Timebase mo950i();

    /* JADX INFO: renamed from: m */
    EncoderProfilesProvider mo954m();

    /* JADX INFO: renamed from: n */
    Quirks mo955n();

    /* JADX INFO: renamed from: o */
    List mo956o(int i);

    /* JADX INFO: renamed from: q */
    void mo958q(CameraCaptureCallback cameraCaptureCallback);

    /* JADX INFO: renamed from: f */
    default CameraInfoInternal mo1443f() {
        return this;
    }
}
