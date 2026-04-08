package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/StackFrameContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class StackFrameContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* JADX INFO: renamed from: a */
    public final Continuation f56305a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f56306b;

    public StackFrameContinuation(Continuation continuation, CoroutineContext coroutineContext) {
        this.f56305a = continuation;
        this.f56306b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f56305a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getF56306b() {
        return this.f56306b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f56305a.resumeWith(obj);
    }
}
