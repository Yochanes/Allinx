package androidx.compose.material;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class NavigationRailKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f10766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(int i, int i2, Placeable placeable) {
        super(1);
        this.f10766a = placeable;
        this.f10767b = i;
        this.f10768c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.m5677h((Placeable.PlacementScope) obj, this.f10766a, this.f10767b, this.f10768c);
        return Unit.f51459a;
    }
}
