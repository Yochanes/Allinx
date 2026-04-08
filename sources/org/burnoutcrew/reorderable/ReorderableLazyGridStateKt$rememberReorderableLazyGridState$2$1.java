package org.burnoutcrew.reorderable;

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
@Metadata(m18303k = 3, m18304mv = {1, 7, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "org.burnoutcrew.reorderable.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$2$1", m18559f = "ReorderableLazyGridState.kt", m18560l = {53, 54}, m18561m = "invokeSuspend")
final class ReorderableLazyGridStateKt$rememberReorderableLazyGridState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f58092a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f58092a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m18313b(obj);
                ((Number) obj).floatValue();
                this.f58092a = 2;
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.m18313b(obj);
        throw null;
    }
}
