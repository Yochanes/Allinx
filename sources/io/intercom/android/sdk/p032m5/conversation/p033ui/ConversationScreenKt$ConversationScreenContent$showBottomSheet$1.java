package io.intercom.android.sdk.p032m5.conversation.p033ui;

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

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$showBottomSheet$1", m18559f = "ConversationScreen.kt", m18560l = {}, m18561m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$showBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $openBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$showBottomSheet$1(MutableState<Boolean> mutableState, Continuation<? super ConversationScreenKt$ConversationScreenContent$showBottomSheet$1> continuation) {
        super(2, continuation);
        this.$openBottomSheet = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$showBottomSheet$1(this.$openBottomSheet, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CoroutineScope) obj, (Continuation<? super Unit>) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        this.$openBottomSheet.setValue(Boolean.TRUE);
        return Unit.f51459a;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$showBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f51459a);
    }
}
