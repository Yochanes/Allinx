package p019b;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2358a implements CameraFactory.Provider {
    @Override // androidx.camera.core.impl.CameraFactory.Provider
    /* JADX INFO: renamed from: a */
    public final Camera2CameraFactory mo1442a(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
        return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector);
    }
}
