package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.CancellableFlowImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m18559f = "Context.kt", m18560l = {271}, m18561m = "emit")
final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CancellableFlowImpl.C62592 f55673b;

    /* JADX INFO: renamed from: c */
    public int f55674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl.C62592 c62592, Continuation continuation) {
        super(continuation);
        this.f55673b = c62592;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55672a = obj;
        this.f55674c |= Integer.MIN_VALUE;
        return this.f55673b.emit(null, this);
    }
}
