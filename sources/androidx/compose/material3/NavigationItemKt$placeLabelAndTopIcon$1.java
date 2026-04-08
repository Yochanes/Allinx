package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationItemKt$placeLabelAndTopIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f13927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Placeable f13930d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f13931f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13932g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Placeable f13933i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13934j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13935n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Placeable f13936o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f13937p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f13938q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeLabelAndTopIcon$1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8) {
        super(1);
        this.f13927a = placeable;
        this.f13928b = i;
        this.f13929c = i2;
        this.f13930d = placeable2;
        this.f13931f = i3;
        this.f13932g = i4;
        this.f13933i = placeable3;
        this.f13934j = i5;
        this.f13935n = i6;
        this.f13936o = placeable4;
        this.f13937p = i7;
        this.f13938q = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.m5677h(placementScope, this.f13927a, this.f13928b, this.f13929c);
        Placeable.PlacementScope.m5677h(placementScope, this.f13930d, this.f13931f, this.f13932g);
        Placeable.PlacementScope.m5677h(placementScope, this.f13933i, this.f13934j, this.f13935n);
        Placeable.PlacementScope.m5677h(placementScope, this.f13936o, this.f13937p, this.f13938q);
        return Unit.f51459a;
    }
}
