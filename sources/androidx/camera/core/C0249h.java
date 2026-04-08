package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: renamed from: androidx.camera.core.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0249h implements ImageAnalysis.Analyzer, ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f2426a;

    public /* synthetic */ C0249h(Object obj) {
        this.f2426a = obj;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* JADX INFO: renamed from: a */
    public void mo1247a(SettableImageProxy settableImageProxy) {
        ImageAnalysis.Defaults defaults = ImageAnalysis.f2267s;
        ((ImageAnalysis.Analyzer) this.f2426a).mo1247a(settableImageProxy);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    /* JADX INFO: renamed from: b */
    public void mo1168b(ImageReaderProxy imageReaderProxy) {
        MetadataImageReader metadataImageReader = (MetadataImageReader) this.f2426a;
        synchronized (metadataImageReader.f2322a) {
            metadataImageReader.f2324c++;
        }
        metadataImageReader.m1292k(imageReaderProxy);
    }
}
