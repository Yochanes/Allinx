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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", m18559f = "CachedPageEventFlow.kt", m18560l = {102}, m18561m = "invokeSuspend")
final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f30545a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30546b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CachedPageEventFlow f30547c;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", m18559f = "CachedPageEventFlow.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C20421 extends SuspendLambda implements Function2<IndexedValue<? extends PageEvent<Object>>, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30548a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20421 c20421 = new C20421(2, continuation);
            c20421.f30548a = obj;
            return c20421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C20421) create((IndexedValue) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            return Boolean.valueOf(((IndexedValue) this.f30548a) != null);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "T", "", "indexedValue", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C20432<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.IntRef f30549a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FlowCollector f30550b;

        public C20432(Ref.IntRef intRef, FlowCollector flowCollector) {
            this.f30549a = intRef;
            this.f30550b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m11322a(IndexedValue indexedValue, Continuation continuation) {
            CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            C20432<T> c20432;
            if (continuation instanceof CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (CachedPageEventFlow$downstreamFlow$1$2$emit$1) continuation;
                int i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30555f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30555f = i - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
                }
            }
            Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30553c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30555f;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                Intrinsics.m18596d(indexedValue);
                if (indexedValue.f51499a > this.f30549a.f51657a) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30551a = this;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30552b = indexedValue;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30555f = 1;
                    if (this.f30550b.emit(indexedValue.f51500b, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c20432 = this;
                }
                return Unit.f51459a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            indexedValue = cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30552b;
            c20432 = (C20432) cachedPageEventFlow$downstreamFlow$1$2$emit$1.f30551a;
            ResultKt.m18313b(obj);
            c20432.f30549a.f51657a = indexedValue.f51499a;
            return Unit.f51459a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m11322a((IndexedValue) obj, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.f30547c = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.f30547c, continuation);
        cachedPageEventFlow$downstreamFlow$1.f30546b = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$downstreamFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f30545a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f30546b;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.f51657a = Integer.MIN_VALUE;
            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new C20421(2, null), this.f30547c.f30542c);
            C20432 c20432 = new C20432(intRef, flowCollector);
            this.f30545a = 1;
            if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(c20432, this) == coroutineSingletons) {
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
