package androidx.media3.datasource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BitmapUtil {
    /* JADX INFO: renamed from: a */
    public static Bitmap m9676a(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw ParserException.m9344a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ExifInterface exifInterface = new ExifInterface(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (exifInterface.m8858e(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
            }
            if (i2 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i2);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }
}
