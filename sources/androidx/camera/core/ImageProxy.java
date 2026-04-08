package androidx.camera.core;

import android.media.Image;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageProxy extends AutoCloseable {

    /* JADX INFO: compiled from: Proguard */
    public interface PlaneProxy {
        /* JADX INFO: renamed from: c */
        ByteBuffer mo1181c();

        /* JADX INFO: renamed from: d */
        int mo1182d();

        /* JADX INFO: renamed from: e */
        int mo1183e();
    }

    /* JADX INFO: renamed from: E0 */
    Image mo1177E0();

    /* JADX INFO: renamed from: f */
    int mo1178f();

    int getHeight();

    int getWidth();

    /* JADX INFO: renamed from: m */
    PlaneProxy[] mo1179m();

    /* JADX INFO: renamed from: s0 */
    ImageInfo mo1180s0();
}
