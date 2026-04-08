package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CanvasKt {
    /* JADX INFO: renamed from: a */
    public static final AndroidCanvas m5177a(AndroidImageBitmap androidImageBitmap) {
        Canvas canvas = AndroidCanvas_androidKt.f17542a;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f17539a = new Canvas(AndroidImageBitmap_androidKt.m5116a(androidImageBitmap));
        return androidCanvas;
    }
}
