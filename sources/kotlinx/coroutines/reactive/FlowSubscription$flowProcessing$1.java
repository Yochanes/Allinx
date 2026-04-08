package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.reactive.FlowSubscription", m18559f = "ReactiveFlow.kt", m18560l = {205}, m18561m = "flowProcessing")
final class FlowSubscription$flowProcessing$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public FlowSubscription f56404a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FlowSubscription f56406c;

    /* JADX INFO: renamed from: d */
    public int f56407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowSubscription$flowProcessing$1(FlowSubscription flowSubscription, Continuation continuation) {
        super(continuation);
        this.f56406c = flowSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56405b = obj;
        this.f56407d |= Integer.MIN_VALUE;
        FlowSubscription.m20869T0(this.f56406c, this);
        return Unit.f51459a;
    }
}
