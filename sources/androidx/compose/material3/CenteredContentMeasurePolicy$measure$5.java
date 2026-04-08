package androidx.compose.material3;

import androidx.compose.p013ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class CenteredContentMeasurePolicy$measure$5 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.IntRef f12394a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f12395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredContentMeasurePolicy$measure$5(Ref.IntRef intRef, ArrayList arrayList) {
        super(1);
        this.f12394a = intRef;
        this.f12395b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        int i = this.f12394a.f51657a;
        ArrayList arrayList = this.f12395b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) arrayList.get(i2);
            Placeable.PlacementScope.m5677h(placementScope, placeable, i, 0);
            i += placeable.f18567a;
        }
        return Unit.f51459a;
    }
}
