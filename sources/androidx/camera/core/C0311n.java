package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* JADX INFO: renamed from: androidx.camera.core.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0311n implements ForwardingImageProxy.OnImageCloseListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageProxy f3031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageProxy f3032c;

    public /* synthetic */ C0311n(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f3030a = i;
        this.f3031b = imageProxy;
        this.f3032c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    /* JADX INFO: renamed from: c */
    public final void mo1234c(ForwardingImageProxy forwardingImageProxy) throws Exception {
        ImageProxy imageProxy = this.f3032c;
        switch (this.f3030a) {
            case 0:
                int i = ImageProcessingUtil.f2313a;
                imageProxy.close();
                break;
            default:
                int i2 = ImageProcessingUtil.f2313a;
                imageProxy.close();
                break;
        }
    }
}
