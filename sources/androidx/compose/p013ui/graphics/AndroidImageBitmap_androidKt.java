package androidx.compose.p013ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidImageBitmap_androidKt {
    /* JADX INFO: renamed from: a */
    public static final Bitmap m5116a(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).f17547a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config m5117b(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i != 3) ? (i2 < 26 || i != 4) ? Bitmap.Config.ARGB_8888 : AbstractC1212a.m4911x() : AbstractC1212a.m4888a();
    }
}
