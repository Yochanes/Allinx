package androidx.constraintlayout.compose;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TransitionHandler {

    /* JADX INFO: renamed from: a */
    public final MotionMeasurer f21036a;

    /* JADX INFO: renamed from: b */
    public final MutableFloatState f21037b;

    public TransitionHandler(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.f21036a = motionMeasurer;
        this.f21037b = mutableFloatState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6787a(ContinuationImpl continuationImpl) {
        TransitionHandler$updateProgressWhileTouchUp$1 transitionHandler$updateProgressWhileTouchUp$1;
        TransitionHandler transitionHandler;
        if (continuationImpl instanceof TransitionHandler$updateProgressWhileTouchUp$1) {
            transitionHandler$updateProgressWhileTouchUp$1 = (TransitionHandler$updateProgressWhileTouchUp$1) continuationImpl;
            int i = transitionHandler$updateProgressWhileTouchUp$1.f21043d;
            if ((i & Integer.MIN_VALUE) != 0) {
                transitionHandler$updateProgressWhileTouchUp$1.f21043d = i - Integer.MIN_VALUE;
            } else {
                transitionHandler$updateProgressWhileTouchUp$1 = new TransitionHandler$updateProgressWhileTouchUp$1(this, continuationImpl);
            }
        }
        Object objMo4202u0 = transitionHandler$updateProgressWhileTouchUp$1.f21041b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = transitionHandler$updateProgressWhileTouchUp$1.f21043d;
        if (i2 == 0) {
            ResultKt.m18313b(objMo4202u0);
            TransitionHandler$updateProgressWhileTouchUp$newProgress$1 transitionHandler$updateProgressWhileTouchUp$newProgress$1 = new TransitionHandler$updateProgressWhileTouchUp$newProgress$1(this);
            transitionHandler$updateProgressWhileTouchUp$1.f21040a = this;
            transitionHandler$updateProgressWhileTouchUp$1.f21043d = 1;
            objMo4202u0 = MonotonicFrameClockKt.m4385a(transitionHandler$updateProgressWhileTouchUp$1.getF56402a()).mo4202u0(transitionHandler$updateProgressWhileTouchUp$newProgress$1, transitionHandler$updateProgressWhileTouchUp$1);
            if (objMo4202u0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            transitionHandler = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionHandler = transitionHandler$updateProgressWhileTouchUp$1.f21040a;
            ResultKt.m18313b(objMo4202u0);
        }
        transitionHandler.f21037b.mo4391n(((Number) objMo4202u0).floatValue());
        return Unit.f51459a;
    }
}
