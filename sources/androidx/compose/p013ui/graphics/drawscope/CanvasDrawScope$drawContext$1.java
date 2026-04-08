package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScope$drawContext$1", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CanvasDrawScope$drawContext$1 implements DrawContext {

    /* JADX INFO: renamed from: a */
    public final CanvasDrawScopeKt$asDrawTransform$1 f17775a = new CanvasDrawScopeKt$asDrawTransform$1(this);

    /* JADX INFO: renamed from: b */
    public GraphicsLayer f17776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CanvasDrawScope f17777c;

    public CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.f17777c = canvasDrawScope;
    }

    /* JADX INFO: renamed from: a */
    public final Canvas m5355a() {
        return this.f17777c.f17767a.f17773c;
    }

    /* JADX INFO: renamed from: b */
    public final Density m5356b() {
        return this.f17777c.f17767a.f17771a;
    }

    /* JADX INFO: renamed from: c */
    public final LayoutDirection m5357c() {
        return this.f17777c.f17767a.f17772b;
    }

    /* JADX INFO: renamed from: d */
    public final long m5358d() {
        return this.f17777c.f17767a.f17774d;
    }

    /* JADX INFO: renamed from: e */
    public final void m5359e(Canvas canvas) {
        this.f17777c.f17767a.f17773c = canvas;
    }

    /* JADX INFO: renamed from: f */
    public final void m5360f(Density density) {
        this.f17777c.f17767a.f17771a = density;
    }

    /* JADX INFO: renamed from: g */
    public final void m5361g(LayoutDirection layoutDirection) {
        this.f17777c.f17767a.f17772b = layoutDirection;
    }

    /* JADX INFO: renamed from: h */
    public final void m5362h(long j) {
        this.f17777c.f17767a.f17774d = j;
    }
}
