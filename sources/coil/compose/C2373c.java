package coil.compose;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: coil.compose.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2373c implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Placeable f33430b;

    public /* synthetic */ C2373c(Placeable placeable, int i) {
        this.f33429a = i;
        this.f33430b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f51459a;
        Placeable placeable = this.f33430b;
        Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
        switch (this.f33429a) {
            case 0:
                Placeable.PlacementScope.m5675f(layout, placeable, 0, 0);
                break;
            case 1:
                Placeable.PlacementScope.m5677h(layout, placeable, 0, 0);
                break;
            default:
                Intrinsics.m18599g(layout, "$this$layout");
                Placeable.PlacementScope.m5677h(layout, placeable, 0, 0);
                break;
        }
        return unit;
    }
}
