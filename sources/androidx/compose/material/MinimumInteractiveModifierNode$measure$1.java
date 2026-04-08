package androidx.compose.material;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MinimumInteractiveModifierNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Placeable f10711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumInteractiveModifierNode$measure$1(int i, int i2, Placeable placeable) {
        super(1);
        this.f10710a = i;
        this.f10711b = placeable;
        this.f10712c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.m5675f((Placeable.PlacementScope) obj, this.f10711b, MathKt.m18640b((this.f10710a - r0.f18567a) / 2.0f), MathKt.m18640b((this.f10712c - r0.f18568b) / 2.0f));
        return Unit.f51459a;
    }
}
