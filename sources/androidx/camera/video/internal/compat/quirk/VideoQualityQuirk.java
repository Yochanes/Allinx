package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;
import androidx.camera.video.Quality;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface VideoQualityQuirk extends Quirk {
    /* JADX INFO: renamed from: a */
    boolean mo1875a(CameraInfoInternal cameraInfoInternal, Quality quality);

    /* JADX INFO: renamed from: c */
    default boolean mo1879c() {
        return false;
    }
}
