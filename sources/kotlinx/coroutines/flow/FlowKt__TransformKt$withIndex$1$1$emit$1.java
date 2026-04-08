package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", m18559f = "Transform.kt", m18560l = {67}, m18561m = "emit")
final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__TransformKt$withIndex$1$1 f56086b;

    /* JADX INFO: renamed from: c */
    public int f56087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1 flowKt__TransformKt$withIndex$1$1, Continuation continuation) {
        super(continuation);
        this.f56086b = flowKt__TransformKt$withIndex$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56085a = obj;
        this.f56087c |= Integer.MIN_VALUE;
        return this.f56086b.emit(null, this);
    }
}
