package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C6283xdf1aa1b6 implements FlowCollector<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m18559f = "Limit.kt", m18560l = {131}, m18561m = "emit")
    public final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: a */
        public C6283xdf1aa1b6 f55930a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f55931b;

        /* JADX INFO: renamed from: c */
        public int f55932c;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f55931b = obj;
            this.f55932c |= Integer.MIN_VALUE;
            C6283xdf1aa1b6.this.emit(null, this);
            return Unit.f51459a;
        }
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
            int i = anonymousClass1.f55932c;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f55932c = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj2 = anonymousClass1.f55931b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = anonymousClass1.f55932c;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            anonymousClass1.f55930a = this;
            anonymousClass1.f55932c = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C6283xdf1aa1b6 c6283xdf1aa1b6 = anonymousClass1.f55930a;
        ResultKt.m18313b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return Unit.f51459a;
        }
        throw new AbortFlowException(c6283xdf1aa1b6);
    }
}
