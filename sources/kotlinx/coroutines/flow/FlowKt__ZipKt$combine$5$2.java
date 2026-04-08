package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n"}, m18302d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", m18559f = "Zip.kt", m18560l = {234, 234}, m18561m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$5$2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f56106a;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Intrinsics.m18605m();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f56106a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f56106a = 1;
            throw null;
        }
        if (i == 1) {
            ResultKt.m18313b(obj);
            this.f56106a = 2;
            throw null;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
