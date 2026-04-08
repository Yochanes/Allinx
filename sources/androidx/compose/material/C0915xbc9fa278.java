package androidx.compose.material;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0915xbc9fa278 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f11166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f11167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f11168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915xbc9fa278(MutableState mutableState, Ref.BooleanRef booleanRef, boolean z2) {
        super(1);
        this.f11166a = mutableState;
        this.f11167b = booleanRef;
        this.f11168c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fM5055e = Offset.m5055e(PointerEventKt.m5555e((PointerInputChange) obj, false));
        Function2 function2 = (Function2) this.f11166a.getF20325a();
        Boolean boolValueOf = Boolean.valueOf(this.f11167b.f51655a);
        if (this.f11168c) {
            fM5055e = -fM5055e;
        }
        function2.invoke(boolValueOf, Float.valueOf(fM5055e));
        return Unit.f51459a;
    }
}
