package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", m18559f = "Draggable.kt", m18560l = {}, m18561m = "invokeSuspend")
public final class DraggableKt$NoOpOnDragStopped$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        DraggableKt$NoOpOnDragStopped$1 draggableKt$NoOpOnDragStopped$1 = new DraggableKt$NoOpOnDragStopped$1(3, (Continuation) obj3);
        Unit unit = Unit.f51459a;
        draggableKt$NoOpOnDragStopped$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
