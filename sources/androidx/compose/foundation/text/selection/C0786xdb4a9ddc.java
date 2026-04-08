package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "slop", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0786xdb4a9ddc extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.LongRef f9762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786xdb4a9ddc(Ref.LongRef longRef) {
        super(2);
        this.f9762a = longRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Offset) obj2).f17524a;
        ((PointerInputChange) obj).m5562a();
        this.f9762a.f51658a = j;
        return Unit.f51459a;
    }
}
