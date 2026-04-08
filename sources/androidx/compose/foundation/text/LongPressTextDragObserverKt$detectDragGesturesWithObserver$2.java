package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$2 extends Lambda implements Function1<Offset, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextDragObserver f8540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(TextDragObserver textDragObserver) {
        super(1);
        this.f8540a = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f8540a.mo3247a(((Offset) obj).f17524a);
        return Unit.f51459a;
    }
}
