package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: renamed from: androidx.camera.core.imagecapture.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0263c implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NoMetadataImageReader f2528a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f2529b;

    public /* synthetic */ C0263c(NoMetadataImageReader noMetadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f2528a = noMetadataImageReader;
        this.f2529b = onImageAvailableListener;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    /* JADX INFO: renamed from: b */
    public final void mo1168b(ImageReaderProxy imageReaderProxy) {
        NoMetadataImageReader noMetadataImageReader = this.f2528a;
        noMetadataImageReader.getClass();
        this.f2529b.mo1168b(noMetadataImageReader);
    }
}
