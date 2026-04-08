package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a(CameraInfoInternal cameraInfoInternal, Quality quality) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && cameraInfoInternal.mo949h() == 0 && quality == Quality.f3302a;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* JADX INFO: renamed from: c */
    public final boolean mo1879c() {
        return false;
    }
}
