package com.exchange.allin.p024ui.dialog.trades.futures;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.futures.FuturesPositionMarginKt$showFuturesChangeMarginBottomSheetDialog$1$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.ui.dialog.trades.futures.FuturesPositionMarginKt$showFuturesChangeMarginBottomSheetDialog$1$1$1", m18559f = "FuturesPositionMargin.kt", m18560l = {}, m18561m = "invokeSuspend")
final class C2692xeeac01a6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f36452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2692xeeac01a6(MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f36452a = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2692xeeac01a6(this.f36452a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2692xeeac01a6 c2692xeeac01a6 = (C2692xeeac01a6) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        c2692xeeac01a6.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        this.f36452a.setValue("");
        return Unit.f51459a;
    }
}
