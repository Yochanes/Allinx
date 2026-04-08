package androidx.compose.p013ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.p013ui.graphics.AndroidCanvas;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final Density f17356a;

    /* JADX INFO: renamed from: b */
    public final long f17357b;

    /* JADX INFO: renamed from: c */
    public final Function1 f17358c;

    public ComposeDragShadowBuilder(Density density, long j, Function1 function1) {
        this.f17356a = density;
        this.f17357b = j;
        this.f17358c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        LayoutDirection layoutDirection = LayoutDirection.f20569a;
        AndroidCanvas androidCanvasM5110a = AndroidCanvas_androidKt.m5110a(canvas);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.f17767a;
        Density density = drawParams.f17771a;
        LayoutDirection layoutDirection2 = drawParams.f17772b;
        androidx.compose.p013ui.graphics.Canvas canvas2 = drawParams.f17773c;
        long j = drawParams.f17774d;
        drawParams.f17771a = this.f17356a;
        drawParams.f17772b = layoutDirection;
        drawParams.f17773c = androidCanvasM5110a;
        drawParams.f17774d = this.f17357b;
        androidCanvasM5110a.mo5098i();
        this.f17358c.invoke(canvasDrawScope);
        androidCanvasM5110a.mo5106r();
        drawParams.f17771a = density;
        drawParams.f17772b = layoutDirection2;
        drawParams.f17773c = canvas2;
        drawParams.f17774d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f17357b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        Density density = this.f17356a;
        point.set(density.mo2554k1(density.mo2563w(fIntBitsToFloat)), density.mo2554k1(density.mo2563w(Float.intBitsToFloat((int) (j & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }
}
