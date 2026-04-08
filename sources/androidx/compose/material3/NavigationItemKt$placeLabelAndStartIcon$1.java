package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationItemKt$placeLabelAndStartIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f13915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13917c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Placeable f13918d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f13919f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13920g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Placeable f13921i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13922j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13923n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Placeable f13924o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f13925p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f13926q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeLabelAndStartIcon$1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8) {
        super(1);
        this.f13915a = placeable;
        this.f13916b = i;
        this.f13917c = i2;
        this.f13918d = placeable2;
        this.f13919f = i3;
        this.f13920g = i4;
        this.f13921i = placeable3;
        this.f13922j = i5;
        this.f13923n = i6;
        this.f13924o = placeable4;
        this.f13925p = i7;
        this.f13926q = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.m5677h(placementScope, this.f13915a, this.f13916b, this.f13917c);
        Placeable.PlacementScope.m5677h(placementScope, this.f13918d, this.f13919f, this.f13920g);
        Placeable.PlacementScope.m5677h(placementScope, this.f13921i, this.f13922j, this.f13923n);
        Placeable.PlacementScope.m5677h(placementScope, this.f13924o, this.f13925p, this.f13926q);
        return Unit.f51459a;
    }
}
