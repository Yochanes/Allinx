package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationRailKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f13958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Placeable f13959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13960c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f13961d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Placeable f13962f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13963g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f13964i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13965j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13966n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(int i, int i2, int i3, int i4, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f13958a = placeable;
        this.f13959b = placeable2;
        this.f13960c = i;
        this.f13961d = i2;
        this.f13962f = placeable3;
        this.f13963g = i3;
        this.f13964i = i4;
        this.f13965j = i5;
        this.f13966n = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f13958a;
        if (placeable != null) {
            Placeable.PlacementScope.m5677h(placementScope, placeable, (this.f13965j - placeable.f18567a) / 2, (this.f13966n - placeable.f18568b) / 2);
        }
        Placeable.PlacementScope.m5677h(placementScope, this.f13959b, this.f13960c, this.f13961d);
        Placeable.PlacementScope.m5677h(placementScope, this.f13962f, this.f13963g, this.f13964i);
        return Unit.f51459a;
    }
}
