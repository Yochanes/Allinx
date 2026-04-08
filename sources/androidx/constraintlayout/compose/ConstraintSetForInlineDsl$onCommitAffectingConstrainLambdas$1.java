package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "<anonymous parameter 0>", "invoke", "(Lkotlin/Unit;)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1 extends Lambda implements Function1<Unit, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConstraintSetForInlineDsl f20899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.f20899a = constraintSetForInlineDsl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f20899a.f20892d = true;
        return Unit.f51459a;
    }
}
