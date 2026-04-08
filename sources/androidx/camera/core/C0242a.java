package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0242a implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidImageReaderProxy f2403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Executor f2404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f2405c;

    public /* synthetic */ C0242a(AndroidImageReaderProxy androidImageReaderProxy, Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f2403a = androidImageReaderProxy;
        this.f2404b = executor;
        this.f2405c = onImageAvailableListener;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        AndroidImageReaderProxy androidImageReaderProxy = this.f2403a;
        Executor executor = this.f2404b;
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener = this.f2405c;
        synchronized (androidImageReaderProxy.f2174b) {
            try {
                if (!androidImageReaderProxy.f2175c) {
                    executor.execute(new RunnableC0243b(0, androidImageReaderProxy, onImageAvailableListener));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
