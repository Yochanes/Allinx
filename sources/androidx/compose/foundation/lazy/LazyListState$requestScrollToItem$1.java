package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", m18559f = "LazyListState.kt", m18560l = {320}, m18561m = "invokeSuspend")
final class LazyListState$requestScrollToItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f6922a;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", m18559f = "LazyListState.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C06101 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06101(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            C06101 c06101 = (C06101) create((ScrollScope) obj, (Continuation) obj2);
            Unit unit = Unit.f51459a;
            c06101.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            return Unit.f51459a;
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
        int i = this.f6922a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return Unit.f51459a;
        }
        ResultKt.m18313b(obj);
        new C06101(2, null);
        this.f6922a = 1;
        throw null;
    }
}
