package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/util/pipeline/StackWalkingFailedFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lio/ktor/util/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class StackWalkingFailedFrame implements CoroutineStackFrame, Continuation<?> {

    /* JADX INFO: renamed from: a */
    public static final StackWalkingFailedFrame f46641a = new StackWalkingFailedFrame();

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF56306b() {
        return EmptyCoroutineContext.f51581a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
