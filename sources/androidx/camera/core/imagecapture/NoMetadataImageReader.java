package androidx.camera.core.imagecapture;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class NoMetadataImageReader implements ImageReaderProxy {

    /* JADX INFO: renamed from: a */
    public final ImageReaderProxy f2472a;

    /* JADX INFO: renamed from: b */
    public ProcessingRequest f2473b;

    public NoMetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.f2472a = imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: a */
    public final Surface mo1184a() {
        return this.f2472a.mo1184a();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: b */
    public final ImageProxy mo1185b() {
        return m1362c(this.f2472a.mo1185b());
    }

    /* JADX INFO: renamed from: c */
    public final SettableImageProxy m1362c(ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        Preconditions.m7699f(this.f2473b != null, "Pending request should not be null");
        ProcessingRequest processingRequest = this.f2473b;
        Pair pair = new Pair(processingRequest.f2491g, processingRequest.f2492h.get(0));
        TagBundle tagBundle = TagBundle.f2798b;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        TagBundle tagBundle2 = new TagBundle(arrayMap);
        this.f2473b = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(null, tagBundle2, imageProxy.mo1180s0().mo1196c())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        this.f2472a.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: d */
    public final int mo1186d() {
        return this.f2472a.mo1186d();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: e */
    public final void mo1187e() {
        this.f2472a.mo1187e();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: f */
    public final int mo1188f() {
        return this.f2472a.mo1188f();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: g */
    public final ImageProxy mo1189g() {
        return m1362c(this.f2472a.mo1189g());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        return this.f2472a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        return this.f2472a.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    /* JADX INFO: renamed from: h */
    public final void mo1190h(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        this.f2472a.mo1190h(new C0263c(this, onImageAvailableListener), executor);
    }
}
