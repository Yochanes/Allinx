package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m18559f = "Builders.kt", m18560l = {330}, m18561m = "collectTo")
final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProducerScope f55667a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CallbackFlowBuilder f55669c;

    /* JADX INFO: renamed from: d */
    public int f55670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f55669c = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55668b = obj;
        this.f55670d |= Integer.MIN_VALUE;
        return this.f55669c.mo20734f(null, this);
    }
}
