package org.burnoutcrew.reorderable;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 7, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "org.burnoutcrew.reorderable.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$1$1", m18559f = "ReorderableLazyGridState.kt", m18560l = {48}, m18561m = "invokeSuspend")
final class ReorderableLazyGridStateKt$rememberReorderableLazyGridState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: org.burnoutcrew.reorderable.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$1$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 7, 1}, m18306xi = 48)
    final class C63751 implements FlowCollector<List<? extends LazyGridItemInfo>> {
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            throw null;
        }
    }

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
        ResultKt.m18313b(obj);
        throw null;
    }
}
