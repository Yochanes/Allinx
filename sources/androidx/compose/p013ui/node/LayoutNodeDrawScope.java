package androidx.compose.p013ui.node;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.BlendModeColorFilter;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    /* JADX INFO: renamed from: a */
    public final CanvasDrawScope f18771a = new CanvasDrawScope();

    /* JADX INFO: renamed from: b */
    public DrawModifierNode f18772b;

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: B0 */
    public final void mo5382B0(long j, GraphicsLayer graphicsLayer, Function1 function1) {
        graphicsLayer.m5389e(this, getLayoutDirection(), j, new LayoutNodeDrawScope$record$1(this, this.f18772b, function1));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.ContentDrawScope
    /* JADX INFO: renamed from: C1 */
    public final void mo5369C1() {
        CanvasDrawScope canvasDrawScope = this.f18771a;
        Canvas canvasM5355a = canvasDrawScope.f17768b.m5355a();
        DrawModifierNode drawModifierNode = this.f18772b;
        if (drawModifierNode == null) {
            throw AbstractC0455a.m2246u("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        Modifier.Node nodeM5738b = drawModifierNode.getF17181a().f17186g;
        if (nodeM5738b == null || (nodeM5738b.f17184d & 4) == 0) {
            nodeM5738b = null;
        } else {
            while (nodeM5738b != null) {
                int i = nodeM5738b.f17183c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    nodeM5738b = nodeM5738b.f17186g;
                }
            }
            nodeM5738b = null;
        }
        if (nodeM5738b == null) {
            NodeCoordinator nodeCoordinatorM5741e = DelegatableNodeKt.m5741e(drawModifierNode, 4);
            if (nodeCoordinatorM5741e.mo5764F1() == drawModifierNode.getF17181a()) {
                nodeCoordinatorM5741e = nodeCoordinatorM5741e.f18946u;
                Intrinsics.m18596d(nodeCoordinatorM5741e);
            }
            nodeCoordinatorM5741e.mo5766U1(canvasM5355a, canvasDrawScope.f17768b.f17776b);
            return;
        }
        MutableVector mutableVector = null;
        while (nodeM5738b != null) {
            if (nodeM5738b instanceof DrawModifierNode) {
                DrawModifierNode drawModifierNode2 = (DrawModifierNode) nodeM5738b;
                GraphicsLayer graphicsLayer = canvasDrawScope.f17768b.f17776b;
                NodeCoordinator nodeCoordinatorM5741e2 = DelegatableNodeKt.m5741e(drawModifierNode2, 4);
                long jM6670d = IntSizeKt.m6670d(nodeCoordinatorM5741e2.f18569c);
                LayoutNode layoutNode = nodeCoordinatorM5741e2.f18943r;
                layoutNode.getClass();
                LayoutNodeKt.m5833a(layoutNode).getSharedDrawScope().m5832m(canvasM5355a, jM6670d, nodeCoordinatorM5741e2, drawModifierNode2, graphicsLayer);
            } else if ((nodeM5738b.f17183c & 4) != 0 && (nodeM5738b instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node node = ((DelegatingNode) nodeM5738b).f18661u; node != null; node = node.f17186g) {
                    if ((node.f17183c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            nodeM5738b = node;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nodeM5738b != null) {
                                mutableVector.m4568b(nodeM5738b);
                                nodeM5738b = null;
                            }
                            mutableVector.m4568b(node);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            nodeM5738b = DelegatableNodeKt.m5738b(mutableVector);
        }
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: D1 */
    public final void mo5339D1(ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter) {
        this.f18771a.mo5339D1(imageBitmap, blendModeColorFilter);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: E1 */
    public final void mo5340E1(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        this.f18771a.mo5340E1(brush, j, j2, j3, f, drawStyle);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: G */
    public final long mo2549G(long j) {
        return this.f18771a.mo2549G(j);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: S0 */
    public final float getF20557b() {
        return this.f18771a.getF20557b();
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: X0 */
    public final float mo2551X0(float f) {
        return this.f18771a.getF20556a() * f;
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: a1 */
    public final CanvasDrawScope$drawContext$1 getF17768b() {
        return this.f18771a.f17768b;
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: b1 */
    public final void mo5342b1(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke) {
        this.f18771a.mo5342b1(j, f, f2, j2, j3, f3, stroke);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: c0 */
    public final void mo5343c0(long j, float f, long j2, DrawStyle drawStyle, int i) {
        this.f18771a.mo5343c0(j, f, j2, drawStyle, i);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: d1 */
    public final int mo2553d1(long j) {
        return this.f18771a.mo2553d1(j);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getF20556a() {
        return this.f18771a.getF20556a();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.f18771a.f17767a.f17772b;
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: h */
    public final long mo5383h() {
        return this.f18771a.mo5383h();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: i0 */
    public final void mo5344i0(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        this.f18771a.mo5344i0(j, j2, j3, j4, drawStyle);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: i1 */
    public final void mo5345i1(Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.f18771a.mo5345i1(path, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: j1 */
    public final void mo5346j1(ArrayList arrayList, long j, float f) {
        this.f18771a.mo5346j1(arrayList, j, f);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: k0 */
    public final void mo5347k0(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        this.f18771a.mo5347k0(path, j, f, drawStyle, colorFilter);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: k1 */
    public final int mo2554k1(float f) {
        return this.f18771a.mo2554k1(f);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: l0 */
    public final void mo5348l0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.f18771a.mo5348l0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m5832m(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.f18772b;
        this.f18772b = drawModifierNode;
        LayoutDirection layoutDirection = nodeCoordinator.f18943r.f18715G;
        CanvasDrawScope canvasDrawScope = this.f18771a;
        Density densityM5356b = canvasDrawScope.f17768b.m5356b();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f17768b;
        LayoutDirection layoutDirectionM5357c = canvasDrawScope$drawContext$1.m5357c();
        Canvas canvasM5355a = canvasDrawScope$drawContext$1.m5355a();
        long jM5358d = canvasDrawScope$drawContext$1.m5358d();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.f17776b;
        canvasDrawScope$drawContext$1.m5360f(nodeCoordinator);
        canvasDrawScope$drawContext$1.m5361g(layoutDirection);
        canvasDrawScope$drawContext$1.m5359e(canvas);
        canvasDrawScope$drawContext$1.m5362h(j);
        canvasDrawScope$drawContext$1.f17776b = graphicsLayer;
        canvas.mo5098i();
        try {
            drawModifierNode.mo2209z(this);
            canvas.mo5106r();
            canvasDrawScope$drawContext$1.m5360f(densityM5356b);
            canvasDrawScope$drawContext$1.m5361g(layoutDirectionM5357c);
            canvasDrawScope$drawContext$1.m5359e(canvasM5355a);
            canvasDrawScope$drawContext$1.m5362h(jM5358d);
            canvasDrawScope$drawContext$1.f17776b = graphicsLayer2;
            this.f18772b = drawModifierNode2;
        } catch (Throwable th) {
            canvas.mo5106r();
            canvasDrawScope$drawContext$1.m5360f(densityM5356b);
            canvasDrawScope$drawContext$1.m5361g(layoutDirectionM5357c);
            canvasDrawScope$drawContext$1.m5359e(canvasM5355a);
            canvasDrawScope$drawContext$1.m5362h(jM5358d);
            canvasDrawScope$drawContext$1.f17776b = graphicsLayer2;
            throw th;
        }
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: m1 */
    public final void mo5349m1(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        this.f18771a.mo5349m1(brush, j, j2, f, drawStyle, colorFilter);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: n */
    public final long mo2555n(float f) {
        return this.f18771a.mo2555n(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: o */
    public final long mo2556o(long j) {
        return this.f18771a.mo2556o(j);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: o1 */
    public final long mo5384o1() {
        return this.f18771a.mo5384o1();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: q */
    public final float mo2557q(long j) {
        return this.f18771a.mo2557q(j);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: r1 */
    public final void mo5351r1(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        this.f18771a.mo5351r1(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: s0 */
    public final void mo5352s0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, int i2) {
        this.f18771a.mo5352s0(j, j2, j3, f, i, pathEffect, i2);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: t */
    public final long mo2559t(int i) {
        return this.f18771a.mo2559t(i);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: u */
    public final long mo2561u(float f) {
        return this.f18771a.mo2561u(f);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: v */
    public final float mo2562v(int i) {
        return this.f18771a.mo2562v(i);
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: w */
    public final float mo2563w(float f) {
        return f / this.f18771a.getF20556a();
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: x1 */
    public final float mo2565x1(long j) {
        return this.f18771a.mo2565x1(j);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: y1 */
    public final void mo5354y1(Brush brush, long j, long j2, float f, float f2) {
        this.f18771a.mo5354y1(brush, j, j2, f, f2);
    }
}
