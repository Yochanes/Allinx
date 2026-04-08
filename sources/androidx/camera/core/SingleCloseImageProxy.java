package androidx.camera.core;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class SingleCloseImageProxy extends ForwardingImageProxy {

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2361d;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.f2361d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f2361d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
