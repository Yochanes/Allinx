package androidx.compose.material3;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOriginKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationDrawerKt$predictiveBackDrawerContainer$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DrawerPredictiveBackState f13885a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f13886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$predictiveBackDrawerContainer$1(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        super(1);
        this.f13885a = drawerPredictiveBackState;
        this.f13886b = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        DrawerPredictiveBackState drawerPredictiveBackState = this.f13885a;
        graphicsLayerScope.mo5219g(NavigationDrawerKt.m3989a(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.mo5218f(NavigationDrawerKt.m3990b(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.mo5225l1(TransformOriginKt.m5252a(this.f13886b ? 1.0f : 0.0f, 0.5f));
        return Unit.f51459a;
    }
}
