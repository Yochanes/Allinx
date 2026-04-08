package androidx.compose.p013ui.node;

import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/ComposeUiNode;", "it", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements Function2<ComposeUiNode, LayoutDirection, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 f18654a = new ComposeUiNode$Companion$SetLayoutDirection$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ComposeUiNode) obj).mo5729j((LayoutDirection) obj2);
        return Unit.f51459a;
    }
}
