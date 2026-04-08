package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class NavigationItemKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f13906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f13907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13908c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Placeable f13909d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f13910f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13911g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Placeable f13912i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f13913j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13914n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeIcon$1(int i, int i2, int i3, int i4, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f13906a = placeable;
        this.f13907b = i;
        this.f13908c = i2;
        this.f13909d = placeable2;
        this.f13910f = i3;
        this.f13911g = i4;
        this.f13912i = placeable3;
        this.f13913j = i5;
        this.f13914n = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.m5677h(placementScope, this.f13906a, this.f13907b, this.f13908c);
        Placeable.PlacementScope.m5677h(placementScope, this.f13909d, this.f13910f, this.f13911g);
        Placeable.PlacementScope.m5677h(placementScope, this.f13912i, this.f13913j, this.f13914n);
        return Unit.f51459a;
    }
}
