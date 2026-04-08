package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m18559f = "Limit.kt", m18560l = {70}, m18561m = "emitAbort$FlowKt__LimitKt")
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f55903a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55904b;

    /* JADX INFO: renamed from: c */
    public int f55905c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55904b = obj;
        this.f55905c |= Integer.MIN_VALUE;
        FlowKt__LimitKt.m20769a(null, null, null, this);
        return CoroutineSingletons.f51584a;
    }
}
