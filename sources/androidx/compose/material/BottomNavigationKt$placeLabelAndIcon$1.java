package androidx.compose.material;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BottomNavigationKt$placeLabelAndIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f10250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Placeable f10251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10252c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10253d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f10254f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Placeable f10255g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f10256i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f10257j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeLabelAndIcon$1(float f, Placeable placeable, int i, int i2, int i3, Placeable placeable2, int i4, int i5) {
        super(1);
        this.f10250a = f;
        this.f10251b = placeable;
        this.f10252c = i;
        this.f10253d = i2;
        this.f10254f = i3;
        this.f10255g = placeable2;
        this.f10256i = i4;
        this.f10257j = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        float f = this.f10250a;
        int i = this.f10254f;
        if (f != 0.0f) {
            Placeable.PlacementScope.m5677h(placementScope, this.f10251b, this.f10252c, this.f10253d + i);
        }
        Placeable.PlacementScope.m5677h(placementScope, this.f10255g, this.f10256i, this.f10257j + i);
        return Unit.f51459a;
    }
}
