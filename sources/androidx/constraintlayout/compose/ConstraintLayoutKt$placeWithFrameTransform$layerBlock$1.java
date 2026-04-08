package androidx.constraintlayout.compose;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOriginKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetFrame f20879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1(WidgetFrame widgetFrame) {
        super(1);
        this.f20879a = widgetFrame;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        WidgetFrame widgetFrame = this.f20879a;
        if (!Float.isNaN(widgetFrame.f21738f) || !Float.isNaN(widgetFrame.f21739g)) {
            graphicsLayerScope.mo5225l1(TransformOriginKt.m5252a(Float.isNaN(widgetFrame.f21738f) ? 0.5f : widgetFrame.f21738f, Float.isNaN(widgetFrame.f21739g) ? 0.5f : widgetFrame.f21739g));
        }
        if (!Float.isNaN(widgetFrame.f21740h)) {
            graphicsLayerScope.mo5223k(widgetFrame.f21740h);
        }
        if (!Float.isNaN(widgetFrame.f21741i)) {
            graphicsLayerScope.mo5214c(widgetFrame.f21741i);
        }
        if (!Float.isNaN(widgetFrame.f21742j)) {
            graphicsLayerScope.mo5215d(widgetFrame.f21742j);
        }
        if (!Float.isNaN(widgetFrame.f21743k)) {
            graphicsLayerScope.mo5221i(widgetFrame.f21743k);
        }
        if (!Float.isNaN(widgetFrame.f21744l)) {
            graphicsLayerScope.mo5216e(widgetFrame.f21744l);
        }
        if (!Float.isNaN(widgetFrame.f21745m)) {
            graphicsLayerScope.mo5224l(widgetFrame.f21745m);
        }
        if (!Float.isNaN(widgetFrame.f21746n) || !Float.isNaN(widgetFrame.f21747o)) {
            graphicsLayerScope.mo5219g(Float.isNaN(widgetFrame.f21746n) ? 1.0f : widgetFrame.f21746n);
            graphicsLayerScope.mo5218f(Float.isNaN(widgetFrame.f21747o) ? 1.0f : widgetFrame.f21747o);
        }
        if (!Float.isNaN(widgetFrame.f21748p)) {
            graphicsLayerScope.mo5213b(widgetFrame.f21748p);
        }
        return Unit.f51459a;
    }
}
