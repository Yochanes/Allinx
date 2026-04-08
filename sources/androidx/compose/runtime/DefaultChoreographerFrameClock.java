package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    /* JADX INFO: renamed from: a */
    public static final DefaultChoreographerFrameClock f16337a = new DefaultChoreographerFrameClock();

    /* JADX INFO: renamed from: b */
    public static final Choreographer f16338b;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        f16338b = (Choreographer) BuildersKt.m20508d(MainDispatcherLoader.f56350a.mo20642a1(), new DefaultChoreographerFrameClock$choreographer$1(2, null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    public final CoroutineContext mo2463b0(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18552b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public final CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.m18551a(this, key);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    /* JADX INFO: renamed from: u0 */
    public final Object mo4202u0(Function1 function1, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(continuation));
        cancellableContinuationImpl.m20534p();
        DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 defaultChoreographerFrameClock$withFrameNanos$2$callback$1 = new DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(function1, cancellableContinuationImpl);
        f16338b.postFrameCallback(defaultChoreographerFrameClock$withFrameNanos$2$callback$1);
        cancellableContinuationImpl.m20536r(new DefaultChoreographerFrameClock$withFrameNanos$2$1(defaultChoreographerFrameClock$withFrameNanos$2$callback$1));
        Object objM20533o = cancellableContinuationImpl.m20533o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        return objM20533o;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m18553c(this, coroutineContext);
    }
}
