package androidx.compose.p013ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p013ui.geometry.Offset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public final class AndroidCanvas implements Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f17539a = AndroidCanvas_androidKt.f17542a;

    /* JADX INFO: renamed from: b */
    public Rect f17540b;

    /* JADX INFO: renamed from: c */
    public Rect f17541c;

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: a */
    public final void mo5090a(ArrayList arrayList, Paint paint) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((Offset) arrayList.get(i)).f17524a;
            this.f17539a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), paint.getF17548a());
        }
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: b */
    public final void mo5091b(float f, float f2) {
        this.f17539a.scale(f, f2);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: c */
    public final void mo5092c(androidx.compose.p013ui.geometry.Rect rect, Paint paint) {
        Canvas canvas = this.f17539a;
        Paint f17548a = paint.getF17548a();
        canvas.saveLayer(rect.f17526a, rect.f17527b, rect.f17528c, rect.f17529d, f17548a, 31);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: d */
    public final void mo5093d(long j, long j2, Paint paint) {
        this.f17539a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: e */
    public final void mo5094e(float f) {
        this.f17539a.rotate(f);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: f */
    public final void mo5095f(float f, float f2, float f3, float f4, Paint paint) {
        this.f17539a.drawRect(f, f2, f3, f4, paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: g */
    public final void mo5096g(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint) {
        if (this.f17540b == null) {
            this.f17540b = new Rect();
            this.f17541c = new Rect();
        }
        Canvas canvas = this.f17539a;
        Bitmap bitmapM5116a = AndroidImageBitmap_androidKt.m5116a(imageBitmap);
        Rect rect = this.f17540b;
        Intrinsics.m18596d(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f17541c;
        Intrinsics.m18596d(rect2);
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapM5116a, rect, rect2, paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: h */
    public final void mo5097h(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.f17539a.drawArc(f, f2, f3, f4, f5, f6, false, paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: i */
    public final void mo5098i() {
        this.f17539a.save();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: j */
    public final void mo5099j() {
        CanvasUtils.m5178a(this.f17539a, false);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: k */
    public final void mo5100k(Path path) {
        Canvas canvas = this.f17539a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).f17555a, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: l */
    public final void mo5101l(float[] fArr) {
        if (MatrixKt.m5234a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AndroidMatrixConversions_androidKt.m5118a(matrix, fArr);
        this.f17539a.concat(matrix);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: m */
    public final void mo5102m(Path path, Paint paint) {
        Canvas canvas = this.f17539a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).f17555a, paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: n */
    public final void mo5103n(float f, float f2, float f3, float f4, int i) {
        this.f17539a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: o */
    public final void mo5104o(float f, float f2) {
        this.f17539a.translate(f, f2);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: q */
    public final void mo5105q(ImageBitmap imageBitmap, Paint paint) {
        this.f17539a.drawBitmap(AndroidImageBitmap_androidKt.m5116a(imageBitmap), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: r */
    public final void mo5106r() {
        this.f17539a.restore();
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: s */
    public final void mo5107s(float f, long j, Paint paint) {
        this.f17539a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, paint.getF17548a());
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: t */
    public final void mo5108t() {
        CanvasUtils.m5178a(this.f17539a, true);
    }

    @Override // androidx.compose.p013ui.graphics.Canvas
    /* JADX INFO: renamed from: u */
    public final void mo5109u(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.f17539a.drawRoundRect(f, f2, f3, f4, f5, f6, paint.getF17548a());
    }
}
