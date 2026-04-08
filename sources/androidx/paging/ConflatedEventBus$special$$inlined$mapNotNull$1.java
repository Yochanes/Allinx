package androidx.paging;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, m18302d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConflatedEventBus$special$$inlined$mapNotNull$1 implements Flow<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Flow f30604a;

    /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18302d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class C20482<T> implements FlowCollector {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FlowCollector f30605a;

        /* JADX INFO: renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
        @DebugMetadata(m18558c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", m18559f = "ConflatedEventBus.kt", m18560l = {225}, m18561m = "emit")
        @SourceDebugExtension
        public final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f30606a;

            /* JADX INFO: renamed from: b */
            public int f30607b;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f30606a = obj;
                this.f30607b |= Integer.MIN_VALUE;
                return C20482.this.emit(null, this);
            }
        }

        public C20482(FlowCollector flowCollector) {
            this.f30605a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.f30607b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f30607b = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj2 = anonymousClass1.f30606a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = anonymousClass1.f30607b;
            if (i2 == 0) {
                ResultKt.m18313b(obj2);
                Object obj3 = ((Pair) obj).f51427b;
                if (obj3 != null) {
                    anonymousClass1.f30607b = 1;
                    if (this.f30605a.emit(obj3, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj2);
            }
            return Unit.f51459a;
        }
    }

    public ConflatedEventBus$special$$inlined$mapNotNull$1(Flow flow) {
        this.f30604a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f30604a.collect(new C20482(flowCollector), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        return objCollect;
    }
}
