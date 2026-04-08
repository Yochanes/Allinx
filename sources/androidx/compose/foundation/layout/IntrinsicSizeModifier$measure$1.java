package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class IntrinsicSizeModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f6474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicSizeModifier$measure$1(Placeable placeable) {
        super(1);
        this.f6474a = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        LayoutDirection f18582c = placementScope.getF18582c();
        LayoutDirection layoutDirection = LayoutDirection.f20569a;
        Placeable placeable = this.f6474a;
        if (f18582c == layoutDirection || placementScope.getF18581b() == 0) {
            Placeable.PlacementScope.m5674a(placementScope, placeable);
            placeable.mo5616y0(IntOffset.m6653d(0L, placeable.f18571f), 0.0f, null);
        } else {
            int i = (int) 0;
            long f18581b = ((long) ((placementScope.getF18581b() - placeable.f18567a) - i)) << 32;
            Placeable.PlacementScope.m5674a(placementScope, placeable);
            placeable.mo5616y0(IntOffset.m6653d((((long) i) & 4294967295L) | f18581b, placeable.f18571f), 0.0f, null);
        }
        return Unit.f51459a;
    }
}
