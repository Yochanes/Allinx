package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: renamed from: androidx.camera.core.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0243b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2408c;

    public /* synthetic */ RunnableC0243b(int i, Object obj, Object obj2) {
        this.f2406a = i;
        this.f2407b = obj;
        this.f2408c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f2408c;
        Object obj2 = this.f2407b;
        switch (this.f2406a) {
            case 0:
                AndroidImageReaderProxy androidImageReaderProxy = (AndroidImageReaderProxy) obj2;
                androidImageReaderProxy.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) obj).mo1168b(androidImageReaderProxy);
                break;
            case 1:
                ImageAnalysis.Defaults defaults = ImageAnalysis.f2267s;
                ((SafeCloseImageReaderProxy) obj2).m1301c();
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) obj;
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.m1301c();
                }
                break;
            case 2:
                MetadataImageReader metadataImageReader = (MetadataImageReader) obj2;
                metadataImageReader.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) obj).mo1168b(metadataImageReader);
                break;
            default:
                Preview.Defaults defaults2 = Preview.f2339t;
                ((Preview.SurfaceProvider) obj2).mo37a((SurfaceRequest) obj);
                break;
        }
    }
}
