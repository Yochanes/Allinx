package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m18559f = "Combine.kt", m18560l = {86}, m18561m = "invokeSuspend")
final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f56280a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    final class C63321<T> implements FlowCollector {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            if (continuation instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) continuation;
                int i = combineKt$zipImpl$1$1$second$1$1$emit$1.f56283c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.f56283c = i - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, continuation);
                }
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.f56281a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = combineKt$zipImpl$1$1$second$1$1$emit$1.f56283c;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj2);
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
        int i = this.f56280a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f56280a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        return Unit.f51459a;
    }
}
