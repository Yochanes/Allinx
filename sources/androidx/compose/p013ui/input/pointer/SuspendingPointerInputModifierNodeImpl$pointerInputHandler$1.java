package androidx.compose.p013ui.input.pointer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1", m18559f = "SuspendingPointerInputFilter.kt", m18560l = {}, m18561m = "invokeSuspend")
final class SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1 suspendingPointerInputModifierNodeImpl$pointerInputHandler$1 = (SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1) create((PointerInputScope) obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        suspendingPointerInputModifierNodeImpl$pointerInputHandler$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
