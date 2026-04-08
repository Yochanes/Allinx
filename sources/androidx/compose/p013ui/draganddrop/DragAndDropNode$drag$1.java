package androidx.compose.p013ui.draganddrop;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DragAndDropNode$drag$1 extends Lambda implements Function2<DragAndDropStartTransferScope, Offset, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Offset) obj2).f17524a;
        ((DragAndDropStartTransferScope) obj).mo4931a(null, 0L, null);
        return Unit.f51459a;
    }
}
