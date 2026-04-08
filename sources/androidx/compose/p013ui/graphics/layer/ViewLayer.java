package androidx.compose.p013ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.p013ui.graphics.AndroidCanvas;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.p013ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p013ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/CanvasHolder;", "b", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "", "d", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "value", "g", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: p */
    public static final ViewLayer$Companion$LayerOutlineProvider$1 f17912p = new ViewLayer$Companion$LayerOutlineProvider$1();

    /* JADX INFO: renamed from: a */
    public final DrawChildContainer f17913a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: c */
    public final CanvasDrawScope f17915c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: f */
    public Outline f17917f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: i */
    public Density f17919i;

    /* JADX INFO: renamed from: j */
    public LayoutDirection f17920j;

    /* JADX INFO: renamed from: n */
    public Lambda f17921n;

    /* JADX INFO: renamed from: o */
    public GraphicsLayer f17922o;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ViewLayer(DrawChildContainer drawChildContainer, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(drawChildContainer.getContext());
        this.f17913a = drawChildContainer;
        this.canvasHolder = canvasHolder;
        this.f17915c = canvasDrawScope;
        setOutlineProvider(f17912p);
        this.canUseCompositingLayer = true;
        this.f17919i = DrawContextKt.f17779a;
        this.f17920j = LayoutDirection.f20569a;
        GraphicsLayerImpl.f17823a.getClass();
        this.f17921n = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.f17826a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        AndroidCanvas androidCanvas = canvasHolder.f17570a;
        Canvas canvas2 = androidCanvas.f17539a;
        androidCanvas.f17539a = canvas;
        Density density = this.f17919i;
        LayoutDirection layoutDirection = this.f17920j;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        GraphicsLayer graphicsLayer = this.f17922o;
        ?? r9 = this.f17921n;
        CanvasDrawScope canvasDrawScope = this.f17915c;
        Density densityM5356b = canvasDrawScope.f17768b.m5356b();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f17768b;
        LayoutDirection layoutDirectionM5357c = canvasDrawScope$drawContext$1.m5357c();
        androidx.compose.p013ui.graphics.Canvas canvasM5355a = canvasDrawScope$drawContext$1.m5355a();
        long jM5358d = canvasDrawScope$drawContext$1.m5358d();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.f17776b;
        canvasDrawScope$drawContext$1.m5360f(density);
        canvasDrawScope$drawContext$1.m5361g(layoutDirection);
        canvasDrawScope$drawContext$1.m5359e(androidCanvas);
        canvasDrawScope$drawContext$1.m5362h(jFloatToRawIntBits);
        canvasDrawScope$drawContext$1.f17776b = graphicsLayer;
        androidCanvas.mo5098i();
        try {
            r9.invoke(canvasDrawScope);
            androidCanvas.mo5106r();
            canvasDrawScope$drawContext$1.m5360f(densityM5356b);
            canvasDrawScope$drawContext$1.m5361g(layoutDirectionM5357c);
            canvasDrawScope$drawContext$1.m5359e(canvasM5355a);
            canvasDrawScope$drawContext$1.m5362h(jM5358d);
            canvasDrawScope$drawContext$1.f17776b = graphicsLayer2;
            canvasHolder.f17570a.f17539a = canvas2;
            this.isInvalidated = false;
        } catch (Throwable th) {
            androidCanvas.mo5106r();
            canvasDrawScope$drawContext$1.m5360f(densityM5356b);
            canvasDrawScope$drawContext$1.m5361g(layoutDirectionM5357c);
            canvasDrawScope$drawContext$1.m5359e(canvasM5355a);
            canvasDrawScope$drawContext$1.m5362h(jM5358d);
            canvasDrawScope$drawContext$1.f17776b = graphicsLayer2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @NotNull
    public final View getOwnerView() {
        return this.f17913a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.canUseCompositingLayer != z2) {
            this.canUseCompositingLayer = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.isInvalidated = z2;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
