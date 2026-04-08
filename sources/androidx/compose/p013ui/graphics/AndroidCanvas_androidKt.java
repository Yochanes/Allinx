package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Landroid/graphics/Canvas;", "NativeCanvas", "ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidCanvas_androidKt {

    /* JADX INFO: renamed from: a */
    public static final Canvas f17542a = new Canvas();

    /* JADX INFO: renamed from: a */
    public static final AndroidCanvas m5110a(Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f17539a = canvas;
        return androidCanvas;
    }

    /* JADX INFO: renamed from: b */
    public static final Canvas m5111b(Canvas canvas) {
        Intrinsics.m18597e(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).f17539a;
    }
}
