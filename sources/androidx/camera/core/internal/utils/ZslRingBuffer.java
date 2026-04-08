package androidx.camera.core.internal.utils;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.C0216q;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ZslRingBuffer extends ArrayRingBuffer<ImageProxy> {
    /* JADX INFO: renamed from: b */
    public final void m1664b(ImageProxy imageProxy) {
        Object objM1661a;
        ImageInfo imageInfoMo1180s0 = imageProxy.mo1180s0();
        CameraCaptureResult cameraCaptureResult = imageInfoMo1180s0 instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageInfoMo1180s0).f2961a : null;
        if ((cameraCaptureResult.mo871h() != CameraCaptureMetaData.AfState.f2620g && cameraCaptureResult.mo871h() != CameraCaptureMetaData.AfState.f2618d) || cameraCaptureResult.mo869f() != CameraCaptureMetaData.AeState.f2607f || cameraCaptureResult.mo867d() != CameraCaptureMetaData.AwbState.f2626d) {
            this.f3010c.getClass();
            imageProxy.close();
            return;
        }
        synchronized (this.f3009b) {
            try {
                objM1661a = this.f3008a.size() >= 3 ? m1661a() : null;
                this.f3008a.addFirst(imageProxy);
            } catch (Throwable th) {
                throw th;
            }
        }
        C0216q c0216q = this.f3010c;
        if (c0216q == null || objM1661a == null) {
            return;
        }
        c0216q.getClass();
        ((ImageProxy) objM1661a).close();
    }
}
