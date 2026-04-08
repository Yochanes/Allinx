package androidx.compose.material3;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationBarKt$NavigationBarItemLayout$1$2$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f13796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f13797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItemLayout$1$2$1(boolean z2, Function0 function0) {
        super(1);
        this.f13796a = z2;
        this.f13797b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).mo5213b(this.f13796a ? 1.0f : ((Number) this.f13797b.invoke()).floatValue());
        return Unit.f51459a;
    }
}
