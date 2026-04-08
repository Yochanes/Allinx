package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SliderKt$CorrectValueSideEffect$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClosedFloatingPointRange f11028a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f11029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f11030c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MutableFloatState f11031d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ClosedFloatingPointRange f11032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, float f, MutableFloatState mutableFloatState, ClosedFloatingPointRange closedFloatingPointRange2) {
        super(0);
        this.f11028a = closedFloatingPointRange;
        this.f11029b = function1;
        this.f11030c = f;
        this.f11031d = mutableFloatState;
        this.f11032f = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClosedFloatingPointRange closedFloatingPointRange = this.f11028a;
        float fFloatValue = (((Number) closedFloatingPointRange.mo7701f()).floatValue() - ((Number) closedFloatingPointRange.mo7700e()).floatValue()) / 1000;
        float fFloatValue2 = ((Number) this.f11029b.invoke(Float.valueOf(this.f11030c))).floatValue();
        MutableFloatState mutableFloatState = this.f11031d;
        if (Math.abs(fFloatValue2 - ((Number) mutableFloatState.getF20325a()).floatValue()) > fFloatValue) {
            if (this.f11032f.contains((Comparable) mutableFloatState.getF20325a())) {
                mutableFloatState.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return Unit.f51459a;
    }
}
