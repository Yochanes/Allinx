package androidx.compose.p013ui;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ZIndexNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f17207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ZIndexNode f17208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZIndexNode$measure$1(Placeable placeable, ZIndexNode zIndexNode) {
        super(1);
        this.f17207a = placeable;
        this.f17208b = zIndexNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).m5683e(this.f17207a, 0, 0, this.f17208b.f17206t);
        return Unit.f51459a;
    }
}
