package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.HorizontalAlignmentLine;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.C1338Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HorizontalAlignmentLine f6237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f6238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6240d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f6241f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Placeable f6242g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(HorizontalAlignmentLine horizontalAlignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i4) {
        super(1);
        this.f6237a = horizontalAlignmentLine;
        this.f6238b = f;
        this.f6239c = i;
        this.f6240d = i2;
        this.f6241f = i3;
        this.f6242g = placeable;
        this.f6243i = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f6242g;
        HorizontalAlignmentLine horizontalAlignmentLine = this.f6237a;
        int i = this.f6241f;
        int i2 = this.f6239c;
        float f = this.f6238b;
        int i3 = horizontalAlignmentLine != null ? 0 : !C1338Dp.m6641a(f, Float.NaN) ? i2 : (this.f6240d - i) - placeable.f18567a;
        if (horizontalAlignmentLine == null) {
            i2 = 0;
        } else if (C1338Dp.m6641a(f, Float.NaN)) {
            i2 = (this.f6243i - i) - placeable.f18568b;
        }
        Placeable.PlacementScope.m5677h(placementScope, placeable, i3, i2);
        return Unit.f51459a;
    }
}
