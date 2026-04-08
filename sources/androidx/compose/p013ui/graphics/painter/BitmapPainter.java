package androidx.compose.p013ui.graphics.painter;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BitmapPainter extends Painter {

    /* JADX INFO: renamed from: a */
    public final ImageBitmap f17924a;

    /* JADX INFO: renamed from: b */
    public final long f17925b;

    /* JADX INFO: renamed from: c */
    public int f17926c = 1;

    /* JADX INFO: renamed from: d */
    public final long f17927d;

    /* JADX INFO: renamed from: f */
    public float f17928f;

    /* JADX INFO: renamed from: g */
    public ColorFilter f17929g;

    public BitmapPainter(ImageBitmap imageBitmap, long j) {
        int i;
        int i2;
        this.f17924a = imageBitmap;
        this.f17925b = j;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > imageBitmap.getWidth() || i2 > imageBitmap.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f17927d = j;
        this.f17928f = 1.0f;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f17928f = f;
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f17929g = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.m18594b(this.f17924a, bitmapPainter.f17924a) && IntOffset.m6651b(0L, 0L) && IntSize.m6665b(this.f17925b, bitmapPainter.f17925b) && this.f17926c == bitmapPainter.f17926c;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long mo21926getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m6670d(this.f17927d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17926c) + AbstractC0455a.m2231f(this.f17925b, AbstractC0455a.m2231f(0L, this.f17924a.hashCode() * 31, 31), 31);
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.m5378j0(drawScope, this.f17924a, 0L, this.f17925b, 0L, (((long) Math.round(Float.intBitsToFloat((int) (drawScope.mo5383h() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (drawScope.mo5383h() & 4294967295L)))) & 4294967295L), this.f17928f, null, this.f17929g, 0, this.f17926c, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f17924a);
        sb.append(", srcOffset=");
        sb.append((Object) IntOffset.m6654e(0L));
        sb.append(", srcSize=");
        sb.append((Object) IntSize.m6666c(this.f17925b));
        sb.append(", filterQuality=");
        int i = this.f17926c;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
