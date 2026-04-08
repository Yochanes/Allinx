package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a */
    public static int f2313a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Result {

        /* JADX INFO: renamed from: a */
        public static final Result f2314a;

        /* JADX INFO: renamed from: b */
        public static final Result f2315b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ Result[] f2316c;

        /* JADX INFO: Fake field, exist only in values array */
        Result EF0;

        static {
            Result result = new Result("UNKNOWN", 0);
            Result result2 = new Result("SUCCESS", 1);
            f2314a = result2;
            Result result3 = new Result("ERROR_CONVERSION", 2);
            f2315b = result3;
            f2316c = new Result[]{result, result2, result3};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f2316c.clone();
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static void m1270a(ImageProxy imageProxy) {
        if (!m1275f(imageProxy)) {
            Logger.m1282c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iMo1182d = imageProxy.mo1179m()[0].mo1182d();
        int iMo1182d2 = imageProxy.mo1179m()[1].mo1182d();
        int iMo1182d3 = imageProxy.mo1179m()[2].mo1182d();
        int iMo1183e = imageProxy.mo1179m()[0].mo1183e();
        int iMo1183e2 = imageProxy.mo1179m()[1].mo1183e();
        int iNativeShiftPixel = nativeShiftPixel(imageProxy.mo1179m()[0].mo1181c(), iMo1182d, imageProxy.mo1179m()[1].mo1181c(), iMo1182d2, imageProxy.mo1179m()[2].mo1181c(), iMo1182d3, iMo1183e, iMo1183e2, width, height, iMo1183e, iMo1183e2, iMo1183e2);
        Result result = Result.f2315b;
        if ((iNativeShiftPixel != 0 ? result : Result.f2314a) == result) {
            Logger.m1282c("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageProxy m1271b(SafeCloseImageReaderProxy safeCloseImageReaderProxy, byte[] bArr) {
        Preconditions.m7694a(safeCloseImageReaderProxy.mo1186d() == 256);
        bArr.getClass();
        Surface surfaceMo1184a = safeCloseImageReaderProxy.mo1184a();
        surfaceMo1184a.getClass();
        if (nativeWriteJpegToSurface(bArr, surfaceMo1184a) != 0) {
            Logger.m1282c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy imageProxyMo1185b = safeCloseImageReaderProxy.mo1185b();
        if (imageProxyMo1185b == null) {
            Logger.m1282c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return imageProxyMo1185b;
    }

    /* JADX INFO: renamed from: c */
    public static ImageProxy m1272c(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, int i, boolean z2) {
        if (!m1275f(imageProxy)) {
            Logger.m1282c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            Logger.m1282c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surfaceMo1184a = imageReaderProxy.mo1184a();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int iMo1182d = imageProxy.mo1179m()[0].mo1182d();
        int iMo1182d2 = imageProxy.mo1179m()[1].mo1182d();
        int iMo1182d3 = imageProxy.mo1179m()[2].mo1182d();
        int iMo1183e = imageProxy.mo1179m()[0].mo1183e();
        int iMo1183e2 = imageProxy.mo1179m()[1].mo1183e();
        int iNativeConvertAndroid420ToABGR = nativeConvertAndroid420ToABGR(imageProxy.mo1179m()[0].mo1181c(), iMo1182d, imageProxy.mo1179m()[1].mo1181c(), iMo1182d2, imageProxy.mo1179m()[2].mo1181c(), iMo1182d3, iMo1183e, iMo1183e2, surfaceMo1184a, byteBuffer, width, height, z2 ? iMo1183e : 0, z2 ? iMo1183e2 : 0, z2 ? iMo1183e2 : 0, i);
        Result result = Result.f2315b;
        if ((iNativeConvertAndroid420ToABGR != 0 ? result : Result.f2314a) == result) {
            Logger.m1282c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            Logger.m1280a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + f2313a);
            f2313a = f2313a + 1;
        }
        ImageProxy imageProxyMo1185b = imageReaderProxy.mo1185b();
        if (imageProxyMo1185b == null) {
            Logger.m1282c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyMo1185b);
        singleCloseImageProxy.m1233a(new C0311n(imageProxyMo1185b, imageProxy, 0));
        return singleCloseImageProxy;
    }

    /* JADX INFO: renamed from: d */
    public static void m1273d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* JADX INFO: renamed from: e */
    public static void m1274e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1275f(ImageProxy imageProxy) {
        return imageProxy.mo1178f() == 35 && imageProxy.mo1179m().length == 3;
    }

    /* JADX INFO: renamed from: g */
    public static ImageProxy m1276g(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        String str;
        Result result;
        Result result2;
        if (!m1275f(imageProxy)) {
            Logger.m1282c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            Logger.m1282c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        Result result3 = Result.f2315b;
        if (i > 0) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int iMo1182d = imageProxy.mo1179m()[0].mo1182d();
            int iMo1182d2 = imageProxy.mo1179m()[1].mo1182d();
            int iMo1182d3 = imageProxy.mo1179m()[2].mo1182d();
            int iMo1183e = imageProxy.mo1179m()[1].mo1183e();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                result2 = result3;
                str = "ImageProcessingUtil";
            } else {
                result2 = result3;
                str = "ImageProcessingUtil";
                if (nativeRotateYUV(imageProxy.mo1179m()[0].mo1181c(), iMo1182d, imageProxy.mo1179m()[1].mo1181c(), iMo1182d2, imageProxy.mo1179m()[2].mo1181c(), iMo1182d3, iMo1183e, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
                    result3 = result2;
                } else {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    result3 = Result.f2314a;
                }
            }
            result = result2;
        } else {
            str = "ImageProcessingUtil";
            result = result3;
            result3 = result;
        }
        if (result3 == result) {
            Logger.m1282c(str, "rotate YUV failure");
            return null;
        }
        String str2 = str;
        ImageProxy imageProxyMo1185b = imageReaderProxy.mo1185b();
        if (imageProxyMo1185b == null) {
            Logger.m1282c(str2, "YUV rotation acquireLatestImage failure");
            return null;
        }
        SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxyMo1185b);
        singleCloseImageProxy.m1233a(new C0311n(imageProxyMo1185b, imageProxy, 1));
        return singleCloseImageProxy;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1277h(byte[] bArr, Surface surface) {
        bArr.getClass();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        Logger.m1282c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, int i5, @Nullable Surface surface, @Nullable ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z2);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, @NonNull ByteBuffer byteBuffer4, int i5, int i6, @NonNull ByteBuffer byteBuffer5, int i7, int i8, @NonNull ByteBuffer byteBuffer6, int i9, int i10, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i, @NonNull ByteBuffer byteBuffer2, int i2, @NonNull ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
