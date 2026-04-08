package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 176)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m18559f = "Emitters.kt", m18560l = {38}, m18561m = "emit")
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowKt__EmittersKt$transform$1.C62761 f55847b;

    /* JADX INFO: renamed from: c */
    public int f55848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1$1$emit$1(FlowKt__EmittersKt$transform$1.C62761 c62761, Continuation continuation) {
        super(continuation);
        this.f55847b = c62761;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55846a = obj;
        this.f55848c |= Integer.MIN_VALUE;
        this.f55847b.emit(null, this);
        return Unit.f51459a;
    }
}
