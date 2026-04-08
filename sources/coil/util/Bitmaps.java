package coil.util;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.util.-Bitmaps, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class Bitmaps {
    /* JADX INFO: renamed from: a */
    public static final int m12522a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != AbstractC1212a.m4888a()) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12523b(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == AbstractC1212a.m4911x();
    }
}
