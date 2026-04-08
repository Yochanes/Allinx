package androidx.camera.core.imagecapture;

import androidx.annotation.RequiresApi;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class Bitmap2JpegBytes implements Operation<AbstractC0251In, Packet<byte[]>> {

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes$In */
    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class AbstractC0251In {
        /* JADX INFO: renamed from: a */
        public abstract int mo1332a();

        /* JADX INFO: renamed from: b */
        public abstract Packet mo1333b();
    }
}
