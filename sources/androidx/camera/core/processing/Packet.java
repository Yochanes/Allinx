package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class Packet<T> {
    /* JADX INFO: renamed from: i */
    public static Packet m1713i(Bitmap bitmap, Exif exif, Rect rect, int i, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, cameraCaptureResult);
    }

    /* JADX INFO: renamed from: j */
    public static Packet m1714j(ImageProxy imageProxy, Exif exif, Size size, Rect rect, int i, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (imageProxy.mo1178f() == 256) {
            Preconditions.m7698e(exif, "JPEG image must have Exif.");
        }
        return new AutoValue_Packet(imageProxy, exif, imageProxy.mo1178f(), size, rect, i, matrix, cameraCaptureResult);
    }

    /* JADX INFO: renamed from: k */
    public static Packet m1715k(byte[] bArr, Exif exif, Size size, Rect rect, int i, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bArr, exif, 256, size, rect, i, matrix, cameraCaptureResult);
    }

    /* JADX INFO: renamed from: a */
    public abstract CameraCaptureResult mo1671a();

    /* JADX INFO: renamed from: b */
    public abstract Rect mo1672b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo1673c();

    /* JADX INFO: renamed from: d */
    public abstract Exif mo1674d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1675e();

    /* JADX INFO: renamed from: f */
    public abstract int mo1676f();

    /* JADX INFO: renamed from: g */
    public abstract Matrix mo1677g();

    /* JADX INFO: renamed from: h */
    public abstract Size mo1678h();
}
