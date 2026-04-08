package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "over", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.FloatRef f5613a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1(Ref.FloatRef floatRef) {
        super(2);
        this.f5613a = floatRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float fFloatValue = ((Number) obj2).floatValue();
        ((PointerInputChange) obj).m5562a();
        this.f5613a.f51656a = fFloatValue;
        return Unit.f51459a;
    }
}
