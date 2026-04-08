package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.InlineClassHelperKt;
import androidx.compose.p013ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CanvasDrawScope$drawContext$1 f17778a;

    public CanvasDrawScopeKt$asDrawTransform$1(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1) {
        this.f17778a = canvasDrawScope$drawContext$1;
    }

    /* JADX INFO: renamed from: a */
    public final void m5363a(Path path) {
        this.f17778a.m5355a().mo5100k(path);
    }

    /* JADX INFO: renamed from: b */
    public final void m5364b(float f, float f2, float f3, float f4, int i) {
        this.f17778a.m5355a().mo5103n(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: c */
    public final void m5365c(float f, float f2, float f3, float f4) {
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = this.f17778a;
        Canvas canvasM5355a = canvasDrawScope$drawContext$1.m5355a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope$drawContext$1.m5358d() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (canvasDrawScope$drawContext$1.m5358d() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            InlineClassHelperKt.m5227a("Width and height must be greater than or equal to zero");
        }
        canvasDrawScope$drawContext$1.m5362h(jFloatToRawIntBits);
        canvasM5355a.mo5104o(f, f2);
    }

    /* JADX INFO: renamed from: d */
    public final void m5366d(float f, long j) {
        Canvas canvasM5355a = this.f17778a.m5355a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        canvasM5355a.mo5104o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        canvasM5355a.mo5094e(f);
        canvasM5355a.mo5104o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: e */
    public final void m5367e(float f, float f2, long j) {
        Canvas canvasM5355a = this.f17778a.m5355a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        canvasM5355a.mo5104o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        canvasM5355a.mo5091b(f, f2);
        canvasM5355a.mo5104o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: f */
    public final void m5368f(float f, float f2) {
        this.f17778a.m5355a().mo5104o(f, f2);
    }
}
