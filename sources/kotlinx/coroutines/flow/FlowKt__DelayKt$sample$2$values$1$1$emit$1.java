package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m18559f = "Delay.kt", m18560l = {273}, m18561m = "emit")
final class FlowKt__DelayKt$sample$2$values$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__DelayKt$sample$2$values$1.C62721 f55807b;

    /* JADX INFO: renamed from: c */
    public int f55808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$values$1$1$emit$1(FlowKt__DelayKt$sample$2$values$1.C62721 c62721, Continuation continuation) {
        super(continuation);
        this.f55807b = c62721;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55806a = obj;
        this.f55808c |= Integer.MIN_VALUE;
        return this.f55807b.emit(null, this);
    }
}
