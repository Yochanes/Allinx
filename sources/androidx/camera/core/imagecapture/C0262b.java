package androidx.camera.core.imagecapture;

import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: androidx.camera.core.imagecapture.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0262b implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CaptureNode f2526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NoMetadataImageReader f2527b;

    public /* synthetic */ C0262b(CaptureNode captureNode, NoMetadataImageReader noMetadataImageReader) {
        this.f2526a = captureNode;
        this.f2527b = noMetadataImageReader;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        ProcessingRequest processingRequest = (ProcessingRequest) obj;
        this.f2526a.m1356c(processingRequest);
        NoMetadataImageReader noMetadataImageReader = this.f2527b;
        Preconditions.m7699f(noMetadataImageReader.f2473b == null, "Pending request should be null");
        noMetadataImageReader.f2473b = processingRequest;
    }
}
