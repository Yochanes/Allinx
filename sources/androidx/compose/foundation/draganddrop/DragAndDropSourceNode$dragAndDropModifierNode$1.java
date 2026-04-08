package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "offset", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DragAndDropSourceNode$dragAndDropModifierNode$1 extends Lambda implements Function2<DragAndDropStartTransferScope, Offset, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DragAndDropSourceNode f5292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropSourceNode$dragAndDropModifierNode$1(DragAndDropSourceNode dragAndDropSourceNode) {
        super(2);
        this.f5292a = dragAndDropSourceNode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Offset) obj2).f17524a;
        this.f5292a.getClass();
        throw null;
    }
}
