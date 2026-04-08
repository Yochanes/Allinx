package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1311g {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m6224a(RenderNode renderNode) {
        return renderNode.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m6225b(RenderNode renderNode) {
        return renderNode.getTop();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ long m6226c(View view) {
        return view.getUniqueDrawingId();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ RenderNode m6227d() {
        return new RenderNode("Compose");
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m6228e(RenderNode renderNode, int i) {
        renderNode.offsetTopAndBottom(i);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m6229f(View view) {
        view.setForceDarkAllowed(false);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m6230g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ boolean m6231h(RenderNode renderNode) {
        return renderNode.setHasOverlappingRendering(true);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m6232i(RenderNode renderNode, int i, int i2, int i3, int i4) {
        return renderNode.setPosition(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ float m6233j(RenderNode renderNode) {
        return renderNode.getElevation();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ int m6234k(RenderNode renderNode) {
        return renderNode.getRight();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m6235l(RenderNode renderNode, int i) {
        renderNode.offsetLeftAndRight(i);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m6236m(RenderNode renderNode) {
        return renderNode.getClipToBounds();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ int m6237n(RenderNode renderNode) {
        return renderNode.getBottom();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ boolean m6238o(RenderNode renderNode) {
        return renderNode.getClipToOutline();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ int m6239p(RenderNode renderNode) {
        return renderNode.getWidth();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ int m6240q(RenderNode renderNode) {
        return renderNode.getHeight();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ int m6241r(RenderNode renderNode) {
        return renderNode.getLeft();
    }
}
