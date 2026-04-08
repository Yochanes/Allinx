package androidx.camera.core.concurrent;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public interface CameraCoordinator {

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CameraOperatingMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ConcurrentCameraModeListener {
        /* JADX INFO: renamed from: a */
        void mo1331a(int i, int i2);
    }

    /* JADX INFO: renamed from: a */
    int mo1164a();
}
