package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class StreamConfigurationMapCompatBaseImpl implements StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {

    /* JADX INFO: renamed from: a */
    public final StreamConfigurationMap f1978a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Size[] m1105a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public StreamConfigurationMapCompatBaseImpl(StreamConfigurationMap streamConfigurationMap) {
        this.f1978a = streamConfigurationMap;
    }
}
