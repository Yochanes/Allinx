package androidx.compose.p013ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "event", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DragAndDropNodeKt$DragAndDropTargetModifierNode$1 extends Lambda implements Function1<DragAndDropEvent, DragAndDropTarget> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f17378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DragAndDropTarget f17379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNodeKt$DragAndDropTargetModifierNode$1(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.f17378a = (Lambda) function1;
        this.f17379b = dragAndDropTarget;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) this.f17378a.invoke((DragAndDropEvent) obj)).booleanValue()) {
            return this.f17379b;
        }
        return null;
    }
}
