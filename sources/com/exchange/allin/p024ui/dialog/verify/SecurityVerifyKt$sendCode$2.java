package com.exchange.allin.p024ui.dialog.verify;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.ui.dialog.verify.SecurityVerifyKt$sendCode$2", m18559f = "SecurityVerify.kt", m18560l = {}, m18561m = "invokeSuspend")
final class SecurityVerifyKt$sendCode$2 extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f36806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityVerifyKt$sendCode$2(Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.f36806a = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SecurityVerifyKt$sendCode$2 securityVerifyKt$sendCode$2 = new SecurityVerifyKt$sendCode$2(this.f36806a, (Continuation) obj3);
        Unit unit = Unit.f51459a;
        securityVerifyKt$sendCode$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        this.f36806a.invoke("");
        return Unit.f51459a;
    }
}
