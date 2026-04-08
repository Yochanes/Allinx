package androidx.compose.material;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", m18559f = "Swipeable.kt", m18560l = {}, m18561m = "invokeSuspend")
final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", m18559f = "Swipeable.kt", m18560l = {611}, m18561m = "invokeSuspend")
    final class C09291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        public int f11337a;

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
            int i = this.f11337a;
            if (i == 0) {
                ResultKt.m18313b(obj);
                this.f11337a = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return Unit.f51459a;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
