package androidx.compose.animation;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class EnterExitTransitionModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Placeable f4182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f4183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f4184c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f4185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j, long j2, Function1 function1) {
        super(1);
        this.f4182a = placeable;
        this.f4183b = j;
        this.f4184c = j2;
        this.f4185d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.f4183b;
        long j2 = this.f4184c;
        ((Placeable.PlacementScope) obj).m5684l(this.f4182a, ((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)), 0.0f, this.f4185d);
        return Unit.f51459a;
    }
}
