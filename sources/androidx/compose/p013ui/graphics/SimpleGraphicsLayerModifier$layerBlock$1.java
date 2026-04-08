package androidx.compose.p013ui.graphics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SimpleGraphicsLayerModifier$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SimpleGraphicsLayerModifier f17672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f17672a = simpleGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = this.f17672a;
        graphicsLayerScope.mo5219g(simpleGraphicsLayerModifier.f17665t);
        graphicsLayerScope.mo5218f(simpleGraphicsLayerModifier.f17666u);
        graphicsLayerScope.mo5213b(simpleGraphicsLayerModifier.f17667v);
        graphicsLayerScope.mo5221i(0.0f);
        graphicsLayerScope.mo5216e(0.0f);
        graphicsLayerScope.mo5224l(simpleGraphicsLayerModifier.f17668w);
        graphicsLayerScope.mo5223k(0.0f);
        graphicsLayerScope.mo5214c(0.0f);
        graphicsLayerScope.mo5215d(simpleGraphicsLayerModifier.f17669x);
        graphicsLayerScope.mo5222j(simpleGraphicsLayerModifier.f17670y);
        graphicsLayerScope.mo5225l1(simpleGraphicsLayerModifier.f17671z);
        graphicsLayerScope.mo5212R0(simpleGraphicsLayerModifier.f17660A);
        graphicsLayerScope.mo5210E(simpleGraphicsLayerModifier.f17661B);
        graphicsLayerScope.mo5217e1(null);
        graphicsLayerScope.mo5208B(simpleGraphicsLayerModifier.f17662C);
        graphicsLayerScope.mo5211F(simpleGraphicsLayerModifier.f17663D);
        graphicsLayerScope.mo5209D();
        return Unit.f51459a;
    }
}
