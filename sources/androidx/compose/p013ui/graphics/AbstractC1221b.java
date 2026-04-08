package androidx.compose.p013ui.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RenderNode;
import androidx.compose.p013ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1221b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m5283A(RenderNode renderNode, float f) {
        renderNode.setPivotY(f);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m5284B(RenderNode renderNode, float f) {
        renderNode.setCameraDistance(f);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m5285C(RenderNode renderNode, float f) {
        renderNode.setTranslationX(f);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m5286D(RenderNode renderNode, float f) {
        renderNode.setRotationY(f);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ long m5287a(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BlendModeColorFilter m5288b(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ RenderNode m5289c() {
        return new RenderNode("graphicsLayer");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5290d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m5291e(Canvas canvas) {
        canvas.enableZ();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m5292f(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m5293g(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m5294h(RenderNode renderNode, float f) {
        renderNode.setScaleY(f);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m5295i(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m5296j(RenderNode renderNode, Matrix matrix) {
        renderNode.getMatrix(matrix);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m5297k(RenderNode renderNode, Outline outline) {
        renderNode.setOutline(outline);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m5298l(RenderNode renderNode, boolean z2) {
        renderNode.setClipToOutline(z2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m5299m(RenderNode renderNode) {
        return renderNode.hasDisplayList();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m5300n(Canvas canvas) {
        canvas.disableZ();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m5301o(RenderNode renderNode) {
        renderNode.setUseCompositingLayer(true, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m5302p(RenderNode renderNode, float f) {
        renderNode.setAlpha(f);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m5303q(RenderNode renderNode, float f) {
        renderNode.setRotationZ(f);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m5304r(RenderNode renderNode) {
        renderNode.setHasOverlappingRendering(true);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m5305s(RenderNode renderNode, float f) {
        renderNode.setScaleX(f);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m5306t(RenderNode renderNode) {
        renderNode.setUseCompositingLayer(false, null);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m5307u(RenderNode renderNode, float f) {
        renderNode.setElevation(f);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m5308v(RenderNode renderNode) {
        renderNode.setHasOverlappingRendering(false);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m5309w(RenderNode renderNode, float f) {
        renderNode.setRotationX(f);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m5310x(RenderNode renderNode) {
        renderNode.resetPivot();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m5311y(RenderNode renderNode, float f) {
        renderNode.setPivotX(f);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m5312z(RenderNode renderNode) {
        renderNode.setClipToBounds(false);
    }
}
