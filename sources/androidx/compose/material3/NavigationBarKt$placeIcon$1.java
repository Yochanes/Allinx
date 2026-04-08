package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationBarKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f13808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Placeable f13809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13810c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f13811d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Placeable f13812f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13813g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f13814i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13815j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13816n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeIcon$1(int i, int i2, int i3, int i4, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f13808a = placeable;
        this.f13809b = placeable2;
        this.f13810c = i;
        this.f13811d = i2;
        this.f13812f = placeable3;
        this.f13813g = i3;
        this.f13814i = i4;
        this.f13815j = i5;
        this.f13816n = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f13808a;
        if (placeable != null) {
            Placeable.PlacementScope.m5677h(placementScope, placeable, (this.f13815j - placeable.f18567a) / 2, (this.f13816n - placeable.f18568b) / 2);
        }
        Placeable.PlacementScope.m5677h(placementScope, this.f13809b, this.f13810c, this.f13811d);
        Placeable.PlacementScope.m5677h(placementScope, this.f13812f, this.f13813g, this.f13814i);
        return Unit.f51459a;
    }
}
