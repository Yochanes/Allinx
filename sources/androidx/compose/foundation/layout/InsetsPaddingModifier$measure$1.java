package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class InsetsPaddingModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f6457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier$measure$1(int i, int i2, Placeable placeable) {
        super(1);
        this.f6457a = placeable;
        this.f6458b = i;
        this.f6459c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.m5675f((Placeable.PlacementScope) obj, this.f6457a, this.f6458b, this.f6459c);
        return Unit.f51459a;
    }
}
