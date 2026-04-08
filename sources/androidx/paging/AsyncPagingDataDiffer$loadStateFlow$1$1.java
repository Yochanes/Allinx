package androidx.paging;

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
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "", "isGettingItem"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", m18559f = "AsyncPagingDataDiffer.kt", m18560l = {}, m18561m = "invokeSuspend")
final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f30533a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new AsyncPagingDataDiffer$loadStateFlow$1$1(2, continuation);
        asyncPagingDataDiffer$loadStateFlow$1$1.f30533a = ((Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((AsyncPagingDataDiffer$loadStateFlow$1$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Boolean.valueOf(!this.f30533a);
    }
}
