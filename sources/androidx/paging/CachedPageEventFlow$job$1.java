package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.CachedPageEventFlow$job$1", m18559f = "CachedPageEventFlow.kt", m18560l = {76}, m18561m = "invokeSuspend")
final class CachedPageEventFlow$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f30556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Flow f30557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CachedPageEventFlow f30558c;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$job$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "T", "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C20441<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CachedPageEventFlow f30559a;

        public C20441(CachedPageEventFlow cachedPageEventFlow) {
            this.f30559a = cachedPageEventFlow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r7.m11331b(r6, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m11323a(IndexedValue indexedValue, Continuation continuation) {
            CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
            C20441<T> c20441;
            if (continuation instanceof CachedPageEventFlow$job$1$1$emit$1) {
                cachedPageEventFlow$job$1$1$emit$1 = (CachedPageEventFlow$job$1$1$emit$1) continuation;
                int i = cachedPageEventFlow$job$1$1$emit$1.f30564f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$job$1$1$emit$1.f30564f = i - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
                }
            }
            Object obj = cachedPageEventFlow$job$1$1$emit$1.f30562c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = cachedPageEventFlow$job$1$1$emit$1.f30564f;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                SharedFlowImpl sharedFlowImpl = this.f30559a.f30541b;
                cachedPageEventFlow$job$1$1$emit$1.f30560a = this;
                cachedPageEventFlow$job$1$1$emit$1.f30561b = indexedValue;
                cachedPageEventFlow$job$1$1$emit$1.f30564f = 1;
                if (sharedFlowImpl.emit(indexedValue, cachedPageEventFlow$job$1$1$emit$1) != coroutineSingletons) {
                    c20441 = this;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                return Unit.f51459a;
            }
            indexedValue = cachedPageEventFlow$job$1$1$emit$1.f30561b;
            c20441 = (C20441) cachedPageEventFlow$job$1$1$emit$1.f30560a;
            ResultKt.m18313b(obj);
            FlattenedPageController flattenedPageController = c20441.f30559a.f30540a;
            cachedPageEventFlow$job$1$1$emit$1.f30560a = null;
            cachedPageEventFlow$job$1$1$emit$1.f30561b = null;
            cachedPageEventFlow$job$1$1$emit$1.f30564f = 2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m11323a((IndexedValue) obj, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1(Flow flow, CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.f30557b = flow;
        this.f30558c = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CachedPageEventFlow$job$1(this.f30557b, this.f30558c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f30556a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1 flowKt__TransformKt$withIndex$$inlined$unsafeFlow$1 = new FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1(this.f30557b);
            C20441 c20441 = new C20441(this.f30558c);
            this.f30556a = 1;
            if (flowKt__TransformKt$withIndex$$inlined$unsafeFlow$1.collect(c20441, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
