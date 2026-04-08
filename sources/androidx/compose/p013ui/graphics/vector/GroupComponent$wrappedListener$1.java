package androidx.compose.p013ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "node", "Landroidx/compose/ui/graphics/vector/VNode;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class GroupComponent$wrappedListener$1 extends Lambda implements Function1<VNode, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GroupComponent f17963a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.f17963a = groupComponent;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VNode vNode = (VNode) obj;
        GroupComponent groupComponent = this.f17963a;
        groupComponent.m5478g(vNode);
        ?? r0 = groupComponent.f17952i;
        if (r0 != 0) {
            r0.invoke(vNode);
        }
        return Unit.f51459a;
    }
}
