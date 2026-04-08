package androidx.compose.p013ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "invoke", "(Landroidx/compose/ui/input/pointer/HoverIconModifierNode;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C1230x9932a8ca extends Lambda implements Function1<HoverIconModifierNode, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f18261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230x9932a8ca(Ref.ObjectRef objectRef) {
        super(1);
        this.f18261a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) obj;
        Ref.ObjectRef objectRef = this.f18261a;
        Object obj2 = objectRef.f51659a;
        if (obj2 == null && hoverIconModifierNode.f18260v) {
            objectRef.f51659a = hoverIconModifierNode;
        } else if (obj2 != null) {
            hoverIconModifierNode.getClass();
        }
        return Boolean.TRUE;
    }
}
