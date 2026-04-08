package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MonotonicFrameClockKt {
    /* JADX INFO: renamed from: a */
    public static final MonotonicFrameClock m4385a(CoroutineContext coroutineContext) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.mo2464u(MonotonicFrameClock.Key.f16398a);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m4386b(Function1 function1, SuspendLambda suspendLambda) {
        return m4385a(suspendLambda.getF56402a()).mo4202u0(new MonotonicFrameClockKt$withFrameMillis$2(function1), suspendLambda);
    }
}
