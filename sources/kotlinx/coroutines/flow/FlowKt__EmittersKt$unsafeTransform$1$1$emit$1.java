package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m18559f = "Emitters.kt", m18560l = {49}, m18561m = "emit")
public final class FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$1$1 f55851b;

    /* JADX INFO: renamed from: c */
    public int f55852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1, Continuation continuation) {
        super(continuation);
        this.f55851b = flowKt__EmittersKt$unsafeTransform$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55850a = obj;
        this.f55852c |= Integer.MIN_VALUE;
        this.f55851b.emit(null, this);
        return Unit.f51459a;
    }
}
