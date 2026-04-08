package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", m18559f = "ModalBottomSheet.kt", m18560l = {}, m18561m = "invokeSuspend")
final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f13717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f13718b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.f13718b = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.f13718b, (Continuation) obj3);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.f13717a = fFloatValue;
        Unit unit = Unit.f51459a;
        modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        this.f13718b.invoke(new Float(this.f13717a));
        return Unit.f51459a;
    }
}
