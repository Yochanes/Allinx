package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class ImageReaderProxys {
    /* JADX INFO: renamed from: a */
    public static ImageReaderProxy m1278a(int i, int i2, int i3, int i4) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }
}
