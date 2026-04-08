package androidx.compose.p013ui.graphics.painter;

import android.graphics.Bitmap;
import androidx.compose.p013ui.graphics.AndroidImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BitmapPainterKt {
    /* JADX INFO: renamed from: a */
    public static BitmapPainter m5472a(AndroidImageBitmap androidImageBitmap, int i) {
        Bitmap bitmap = androidImageBitmap.f17547a;
        BitmapPainter bitmapPainter = new BitmapPainter(androidImageBitmap, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        bitmapPainter.f17926c = i;
        return bitmapPainter;
    }
}
