package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class YuvToJpegConverter {

    /* JADX INFO: renamed from: a */
    public final Surface f3238a;

    /* JADX INFO: renamed from: c */
    public volatile int f3240c = 0;

    /* JADX INFO: renamed from: b */
    public volatile int f3239b = 100;

    /* JADX INFO: compiled from: Proguard */
    public static class ConversionFailedException extends Exception {
    }

    public YuvToJpegConverter(Surface surface) {
        this.f3238a = surface;
    }

    /* JADX INFO: renamed from: a */
    public final void m1772a(ImageProxy imageProxy) throws Exception {
        boolean zM1277h = false;
        Preconditions.m7699f(imageProxy.mo1178f() == 35, "Input image is not expected YUV_420_888 image format");
        try {
            try {
                int i = this.f3239b;
                int i2 = this.f3240c;
                Surface surface = this.f3238a;
                int i3 = ImageProcessingUtil.f2313a;
                try {
                    zM1277h = ImageProcessingUtil.m1277h(ImageUtil.m1662a(imageProxy, null, i, i2), surface);
                } catch (ImageUtil.CodecFailedException e) {
                    Logger.m1283d("ImageProcessingUtil", "Failed to encode YUV to JPEG", e);
                }
                if (zM1277h) {
                    return;
                } else {
                    throw new ConversionFailedException("Failed to process YUV -> JPEG");
                }
            } catch (Exception e2) {
                Logger.m1283d("YuvToJpegConverter", "Failed to process YUV -> JPEG", e2);
                throw new ConversionFailedException("Failed to process YUV -> JPEG", e2);
            }
        } finally {
            imageProxy.close();
        }
        imageProxy.close();
    }
}
