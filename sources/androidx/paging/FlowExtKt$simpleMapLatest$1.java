package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "androidx.paging.FlowExtKt$simpleMapLatest$1", m18559f = "FlowExt.kt", m18560l = {105, 105}, m18561m = "invokeSuspend")
@SourceDebugExtension
public final class FlowExtKt$simpleMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<Object>, Object, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f30664a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ FlowCollector f30665b;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f30664a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f30665b = this.f30665b;
            this.f30664a = 1;
            throw null;
        }
        if (i == 1) {
            FlowCollector flowCollector = this.f30665b;
            ResultKt.m18313b(obj);
            this.f30665b = null;
            this.f30664a = 2;
            if (flowCollector.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
