package androidx.datastore.core;

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
@Metadata(m18301d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m18559f = "SingleProcessDataStore.kt", m18560l = {402}, m18561m = "invokeSuspend")
final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: a */
    public int f23787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SuspendLambda f23788b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f23788b = (SuspendLambda) function2;
        this.f23789c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f23788b, this.f23789c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f23787a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return obj;
        }
        ResultKt.m18313b(obj);
        this.f23787a = 1;
        Object objInvoke = this.f23788b.invoke(this.f23789c, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
