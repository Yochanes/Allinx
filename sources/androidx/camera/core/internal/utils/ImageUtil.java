package androidx.camera.core.internal.utils;

import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ImageUtil {

    /* JADX INFO: compiled from: Proguard */
    public static final class CodecFailedException extends Exception {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        public static final class FailureType {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ FailureType[] f3011a = {new FailureType("ENCODE_FAILED", 0), new FailureType("DECODE_FAILED", 1), new FailureType("UNKNOWN", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            FailureType EF5;

            public static FailureType valueOf(String str) {
                return (FailureType) Enum.valueOf(FailureType.class, str);
            }

            public static FailureType[] values() {
                return (FailureType[]) f3011a.clone();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1662a(ImageProxy imageProxy, Rect rect, int i, int i2) throws CodecFailedException {
        if (imageProxy.mo1178f() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.mo1178f());
        }
        ImageProxy.PlaneProxy planeProxy = imageProxy.mo1179m()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.mo1179m()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.mo1179m()[2];
        ByteBuffer byteBufferMo1181c = planeProxy.mo1181c();
        ByteBuffer byteBufferMo1181c2 = planeProxy2.mo1181c();
        ByteBuffer byteBufferMo1181c3 = planeProxy3.mo1181c();
        byteBufferMo1181c.rewind();
        byteBufferMo1181c2.rewind();
        byteBufferMo1181c3.rewind();
        int iRemaining = byteBufferMo1181c.remaining();
        byte[] bArr = new byte[((imageProxy.getHeight() * imageProxy.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < imageProxy.getHeight(); i3++) {
            byteBufferMo1181c.get(bArr, width, imageProxy.getWidth());
            width += imageProxy.getWidth();
            byteBufferMo1181c.position(Math.min(iRemaining, planeProxy.mo1182d() + (byteBufferMo1181c.position() - imageProxy.getWidth())));
        }
        int height = imageProxy.getHeight() / 2;
        int width2 = imageProxy.getWidth() / 2;
        int iMo1182d = planeProxy3.mo1182d();
        int iMo1182d2 = planeProxy2.mo1182d();
        int iMo1183e = planeProxy3.mo1183e();
        int iMo1183e2 = planeProxy2.mo1183e();
        byte[] bArr2 = new byte[iMo1182d];
        byte[] bArr3 = new byte[iMo1182d2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferMo1181c3.get(bArr2, 0, Math.min(iMo1182d, byteBufferMo1181c3.remaining()));
            byteBufferMo1181c2.get(bArr3, 0, Math.min(iMo1182d2, byteBufferMo1181c2.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width += 2;
                bArr[i8] = bArr3[i6];
                i5 += iMo1183e;
                i6 += iMo1183e2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight()) : rect, i, new ExifOutputStream(byteArrayOutputStream, ExifData.m1597a(imageProxy, i2)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.");
    }
}
