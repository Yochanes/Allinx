package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "T", "Landroidx/compose/ui/node/TraversableNode;", "it", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class NestedScrollNodeKt$findNearestAttachedAncestor$1 extends Lambda implements Function1<TraversableNode, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f18242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNodeKt$findNearestAttachedAncestor$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f18242a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        TraversableNode traversableNode = (TraversableNode) obj;
        if (traversableNode.getF17181a().f17194s) {
            this.f18242a.f51659a = traversableNode;
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
