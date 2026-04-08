package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraSelector;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraFactory {

    /* JADX INFO: compiled from: Proguard */
    public interface Provider {
        /* JADX INFO: renamed from: a */
        Camera2CameraFactory mo1442a(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector);
    }

    /* JADX INFO: renamed from: a */
    LinkedHashSet mo898a();

    /* JADX INFO: renamed from: b */
    CameraManagerCompat mo899b();

    /* JADX INFO: renamed from: c */
    CameraInternal mo900c(String str);

    /* JADX INFO: renamed from: d */
    Camera2CameraCoordinator mo901d();
}
