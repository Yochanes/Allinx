package androidx.compose.material3;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C1097xbc9fa278 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RangeSliderState f14572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f14573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097xbc9fa278(RangeSliderState rangeSliderState, Ref.BooleanRef booleanRef) {
        super(1);
        this.f14572a = rangeSliderState;
        this.f14573b = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Offset.m5055e(PointerEventKt.m5555e((PointerInputChange) obj, false));
        throw null;
    }
}
