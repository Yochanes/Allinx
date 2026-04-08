package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public interface ImageReaderProxyProvider {
    ImageReaderProxy newInstance();
}
