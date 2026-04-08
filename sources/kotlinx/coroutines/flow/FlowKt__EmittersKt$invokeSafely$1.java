package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m18559f = "Emitters.kt", m18560l = {212}, m18561m = "invokeSafely$FlowKt__EmittersKt")
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Throwable f55819a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55820b;

    /* JADX INFO: renamed from: c */
    public int f55821c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55820b = obj;
        this.f55821c |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.m20768a(null, null, null, this);
    }
}
