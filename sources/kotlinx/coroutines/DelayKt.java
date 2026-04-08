package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20573a(ContinuationImpl continuationImpl) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuationImpl instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuationImpl;
            int i = delayKt$awaitCancellation$1.f55291b;
            if ((i & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.f55291b = i - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
            }
        }
        Object obj = delayKt$awaitCancellation$1.f55290a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = delayKt$awaitCancellation$1.f55291b;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            delayKt$awaitCancellation$1.f55291b = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(delayKt$awaitCancellation$1));
            cancellableContinuationImpl.m20534p();
            if (cancellableContinuationImpl.m20533o() == coroutineSingletons) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public static final Object m20574b(long j, Continuation continuation) {
        Unit unit = Unit.f51459a;
        if (j > 0) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(continuation));
            cancellableContinuationImpl.m20534p();
            if (j < Long.MAX_VALUE) {
                m20575c(cancellableContinuationImpl.f55265f).mo20572b(j, cancellableContinuationImpl);
            }
            Object objM20533o = cancellableContinuationImpl.m20533o();
            if (objM20533o == CoroutineSingletons.f51584a) {
                return objM20533o;
            }
        }
        return unit;
    }

    /* JADX INFO: renamed from: c */
    public static final Delay m20575c(CoroutineContext coroutineContext) {
        CoroutineContext.Element elementMo2464u = coroutineContext.mo2464u(ContinuationInterceptor.Key.f51580a);
        Delay delay = elementMo2464u instanceof Delay ? (Delay) elementMo2464u : null;
        return delay == null ? DefaultExecutorKt.f55289a : delay;
    }
}
