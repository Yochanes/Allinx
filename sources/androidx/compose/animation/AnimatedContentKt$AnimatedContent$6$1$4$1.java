package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "S", "currentState", "Landroidx/compose/animation/EnterExitState;", "targetState", "invoke", "(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimatedContentKt$AnimatedContent$6$1$4$1 extends Lambda implements Function2<EnterExitState, EnterExitState, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExitTransition f3932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.f3932a = exitTransition;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnterExitState enterExitState = (EnterExitState) obj;
        EnterExitState enterExitState2 = (EnterExitState) obj2;
        EnterExitState enterExitState3 = EnterExitState.f4119c;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.f3932a.getF4200c().f4277e);
    }
}
