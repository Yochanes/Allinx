package androidx.compose.material3;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationBarKt$NavigationBarItem$2$indicator$1$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ State f13795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$2$indicator$1$1$1(State state) {
        super(1);
        this.f13795a = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).mo5213b(((Number) this.f13795a.getF20325a()).floatValue());
        return Unit.f51459a;
    }
}
