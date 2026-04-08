package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.exifinterface.media.ExifInterface;
import com.google.auto.value.AutoValue;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class Image2JpegBytes implements Operation<AbstractC0254In, Packet<byte[]>> {

    /* JADX INFO: renamed from: a */
    public final JpegMetadataCorrector f2465a;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.Image2JpegBytes$In */
    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class AbstractC0254In {
        /* JADX INFO: renamed from: a */
        public abstract int mo1345a();

        /* JADX INFO: renamed from: b */
        public abstract Packet mo1346b();
    }

    public Image2JpegBytes(Quirks quirks) {
        this.f2465a = new JpegMetadataCorrector(quirks);
    }

    /* JADX INFO: renamed from: c */
    public static Packet m1357c(AbstractC0254In abstractC0254In) throws ImageCaptureException {
        Packet packetMo1346b = abstractC0254In.mo1346b();
        ImageProxy imageProxy = (ImageProxy) packetMo1346b.mo1673c();
        Rect rectMo1672b = packetMo1346b.mo1672b();
        try {
            byte[] bArrM1662a = ImageUtil.m1662a(imageProxy, rectMo1672b, abstractC0254In.mo1345a(), packetMo1346b.mo1676f());
            try {
                Exif exif = new Exif(new ExifInterface(new ByteArrayInputStream(bArrM1662a)));
                Size size = new Size(rectMo1672b.width(), rectMo1672b.height());
                Rect rect = new Rect(0, 0, rectMo1672b.width(), rectMo1672b.height());
                int iMo1676f = packetMo1346b.mo1676f();
                Matrix matrixMo1677g = packetMo1346b.mo1677g();
                RectF rectF = TransformUtils.f2896a;
                Matrix matrix = new Matrix(matrixMo1677g);
                matrix.postTranslate(-rectMo1672b.left, -rectMo1672b.top);
                return Packet.m1715k(bArrM1662a, exif, size, rect, iMo1676f, matrix, packetMo1346b.mo1671a());
            } catch (IOException e) {
                throw new ImageCaptureException("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil.CodecFailedException e2) {
            throw new ImageCaptureException("Failed to encode the image to JPEG.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m1358a(Object obj) throws Exception {
        Packet packetM1357c;
        AbstractC0254In abstractC0254In = (AbstractC0254In) obj;
        try {
            int iMo1675e = abstractC0254In.mo1346b().mo1675e();
            if (iMo1675e == 35) {
                packetM1357c = m1357c(abstractC0254In);
            } else {
                if (iMo1675e != 256) {
                    throw new IllegalArgumentException("Unexpected format: " + iMo1675e);
                }
                packetM1357c = m1359b(abstractC0254In);
            }
            return packetM1357c;
        } finally {
            ((ImageProxy) abstractC0254In.mo1346b().mo1673c()).close();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Packet m1359b(AbstractC0254In abstractC0254In) {
        byte[] bArr;
        byte[] bArrCopyOfRange;
        byte b2;
        Packet packetMo1346b = abstractC0254In.mo1346b();
        ImageProxy imageProxy = (ImageProxy) packetMo1346b.mo1673c();
        int i = 0;
        if (this.f2465a.f3004a == null) {
            ByteBuffer byteBufferMo1181c = imageProxy.mo1179m()[0].mo1181c();
            bArrCopyOfRange = new byte[byteBufferMo1181c.capacity()];
            byteBufferMo1181c.rewind();
            byteBufferMo1181c.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferMo1181c2 = imageProxy.mo1179m()[0].mo1181c();
            int iCapacity = byteBufferMo1181c2.capacity();
            byte[] bArr2 = new byte[iCapacity];
            byteBufferMo1181c2.rewind();
            byteBufferMo1181c2.get(bArr2);
            int i2 = 2;
            for (int i3 = 2; i3 + 4 <= iCapacity && (b2 = bArr2[i3]) == -1; i3 += (((bArr2[i3 + 2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i3 + 3] & UnsignedBytes.MAX_VALUE)) + 2) {
                if (b2 == -1 && bArr2[i3 + 1] == -38) {
                    break;
                }
            }
            while (true) {
                int i4 = i2 + 1;
                if (i4 > iCapacity) {
                    i = -1;
                    break;
                }
                if (bArr2[i2] == -1 && bArr2[i4] == -40) {
                    i = i2;
                    break;
                }
                i2 = i4;
            }
            if (i == -1) {
                bArr = bArr2;
                Exif exifMo1674d = packetMo1346b.mo1674d();
                Objects.requireNonNull(exifMo1674d);
                return Packet.m1715k(bArr, exifMo1674d, packetMo1346b.mo1678h(), packetMo1346b.mo1672b(), packetMo1346b.mo1676f(), packetMo1346b.mo1677g(), packetMo1346b.mo1671a());
            }
            bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, byteBufferMo1181c2.limit());
        }
        bArr = bArrCopyOfRange;
        Exif exifMo1674d2 = packetMo1346b.mo1674d();
        Objects.requireNonNull(exifMo1674d2);
        return Packet.m1715k(bArr, exifMo1674d2, packetMo1346b.mo1678h(), packetMo1346b.mo1672b(), packetMo1346b.mo1676f(), packetMo1346b.mo1677g(), packetMo1346b.mo1671a());
    }
}
