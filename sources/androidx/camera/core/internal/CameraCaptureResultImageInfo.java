package androidx.camera.core.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraCaptureResultImageInfo implements ImageInfo {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureResult f2961a;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.f2961a = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: a */
    public final TagBundle mo1195a() {
        return this.f2961a.mo864a();
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: b */
    public final void mo1269b(ExifData.Builder builder) {
        this.f2961a.mo865b(builder);
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: c */
    public final long mo1196c() {
        return this.f2961a.mo866c();
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: d */
    public final int mo1197d() {
        return 0;
    }
}
