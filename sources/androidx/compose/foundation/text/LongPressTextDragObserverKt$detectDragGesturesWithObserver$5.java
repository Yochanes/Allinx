package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "offset", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextDragObserver f8543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.f8543a = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        this.f8543a.mo3250d(((Offset) obj2).f17524a);
        return Unit.f51459a;
    }
}
