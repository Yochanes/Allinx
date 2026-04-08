package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.DistinctFlowImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m18559f = "Distinct.kt", m18560l = {73}, m18561m = "emit")
final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DistinctFlowImpl.C62602 f55685b;

    /* JADX INFO: renamed from: c */
    public int f55686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl.C62602 c62602, Continuation continuation) {
        super(continuation);
        this.f55685b = c62602;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55684a = obj;
        this.f55686c |= Integer.MIN_VALUE;
        return this.f55685b.emit(null, this);
    }
}
