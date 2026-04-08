package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {

    /* JADX INFO: renamed from: a */
    public final MonotonicFrameClock f16420a;

    /* JADX INFO: renamed from: b */
    public final Latch f16421b = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.f16420a = monotonicFrameClock;
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /* JADX INFO: renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4202u0(Function1 function1, Continuation continuation) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z2;
        Object objM20533o;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.f16426f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.f16426f = i - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
            }
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.f16424c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.f16426f;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Latch latch = this.f16421b;
            pausableMonotonicFrameClock$withFrameNanos$1.f16422a = this;
            pausableMonotonicFrameClock$withFrameNanos$1.f16423b = function1;
            pausableMonotonicFrameClock$withFrameNanos$1.f16426f = 1;
            synchronized (latch.f16388a) {
                z2 = latch.f16391d;
            }
            if (z2) {
                objM20533o = Unit.f51459a;
            } else {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(pausableMonotonicFrameClock$withFrameNanos$1));
                cancellableContinuationImpl.m20534p();
                synchronized (latch.f16388a) {
                    latch.f16389b.add(cancellableContinuationImpl);
                }
                cancellableContinuationImpl.m20536r(new Latch$await$2$2(latch, cancellableContinuationImpl));
                objM20533o = cancellableContinuationImpl.m20533o();
                if (objM20533o != coroutineSingletons) {
                    objM20533o = Unit.f51459a;
                }
            }
            if (objM20533o != coroutineSingletons) {
                pausableMonotonicFrameClock = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return obj;
        }
        function1 = pausableMonotonicFrameClock$withFrameNanos$1.f16423b;
        pausableMonotonicFrameClock = pausableMonotonicFrameClock$withFrameNanos$1.f16422a;
        ResultKt.m18313b(obj);
        MonotonicFrameClock monotonicFrameClock = pausableMonotonicFrameClock.f16420a;
        pausableMonotonicFrameClock$withFrameNanos$1.f16422a = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f16423b = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f16426f = 2;
        Object objMo4202u0 = monotonicFrameClock.mo4202u0(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        return objMo4202u0 == coroutineSingletons ? coroutineSingletons : objMo4202u0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m18553c(this, coroutineContext);
    }
}
