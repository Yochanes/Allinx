package androidx.compose.p013ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m18302d2 = {"<anonymous>", "R"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m18559f = "InfiniteAnimationPolicy.kt", m18560l = {66}, m18561m = "invokeSuspend")
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements Function1<Continuation<Object>, Object> {

    /* JADX INFO: renamed from: a */
    public int f19444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f19445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f19445b = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f19445b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create((Continuation) obj)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f19444a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return obj;
        }
        ResultKt.m18313b(obj);
        this.f19444a = 1;
        Object objMo4202u0 = MonotonicFrameClockKt.m4385a(getF55239c()).mo4202u0(this.f19445b, this);
        return objMo4202u0 == coroutineSingletons ? coroutineSingletons : objMo4202u0;
    }
}
