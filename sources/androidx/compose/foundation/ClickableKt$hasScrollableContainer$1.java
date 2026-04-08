package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.p013ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "node", "Landroidx/compose/ui/node/TraversableNode;", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ClickableKt$hasScrollableContainer$1 extends Lambda implements Function1<TraversableNode, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f4922a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$hasScrollableContainer$1(Ref.BooleanRef booleanRef) {
        super(1);
        this.f4922a = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        TraversableNode traversableNode = (TraversableNode) obj;
        Ref.BooleanRef booleanRef = this.f4922a;
        if (!booleanRef.f51655a) {
            Intrinsics.m18597e(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            z2 = ((ScrollableContainerNode) traversableNode).f5865t;
        }
        booleanRef.f51655a = z2;
        return Boolean.valueOf(!z2);
    }
}
