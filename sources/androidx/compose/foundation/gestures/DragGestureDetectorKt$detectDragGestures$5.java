package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "slopTriggerChange", "<anonymous parameter 2>", "Landroidx/compose/ui/geometry/Offset;", "invoke-0AR0LA0", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DragGestureDetectorKt$detectDragGestures$5 extends Lambda implements Function3<PointerInputChange, PointerInputChange, Offset, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f5591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(Function1 function1) {
        super(3);
        this.f5591a = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj3).f17524a;
        this.f5591a.invoke(new Offset(((PointerInputChange) obj2).f18299c));
        return Unit.f51459a;
    }
}
