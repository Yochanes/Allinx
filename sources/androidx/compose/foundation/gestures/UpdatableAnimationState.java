package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class UpdatableAnimationState {

    /* JADX INFO: renamed from: f */
    public static final AnimationVector1D f6125f = new AnimationVector1D(0.0f);

    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec f6126a;

    /* JADX INFO: renamed from: b */
    public long f6127b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public AnimationVector1D f6128c = f6125f;

    /* JADX INFO: renamed from: d */
    public boolean f6129d;

    /* JADX INFO: renamed from: e */
    public float f6130e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "", "VisibilityThreshold", "F", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public UpdatableAnimationState(SpringSpec springSpec) {
        this.f6126a = springSpec.mo2273a(VectorConvertersKt.f4686a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.m4385a(r2.getF56402a()).mo4202u0(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x00ed, PHI: r0 r2 r13 r14 r15
      0x0081: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r14v6 kotlin.jvm.functions.Function1) = (r14v3 kotlin.jvm.functions.Function1), (r14v7 kotlin.jvm.functions.Function1) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r15v17 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r15v8 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r15v18 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ed, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r0 r2 r14 r15
      0x008e: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v4 kotlin.jvm.functions.Function1) = (r14v6 kotlin.jvm.functions.Function1), (r14v7 kotlin.jvm.functions.Function1) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r15v11 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r15v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r15v18 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.Function] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ae -> B:59:0x00b1). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2679a(Function1 function1, Function0 function0, ContinuationImpl continuationImpl) throws Throwable {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        ?? r0;
        Function1 function12;
        float f;
        UpdatableAnimationState updatableAnimationState;
        ?? r02;
        ?? r03;
        ?? r14;
        ?? r13;
        if (continuationImpl instanceof UpdatableAnimationState$animateToZero$1) {
            updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuationImpl;
            int i = updatableAnimationState$animateToZero$1.f6137i;
            if ((i & Integer.MIN_VALUE) != 0) {
                updatableAnimationState$animateToZero$1.f6137i = i - Integer.MIN_VALUE;
            } else {
                updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuationImpl);
            }
        }
        Object obj = updatableAnimationState$animateToZero$1.f6135f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = updatableAnimationState$animateToZero$1.f6137i;
        AnimationVector1D animationVector1D = f6125f;
        try {
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                if (this.f6129d) {
                    InlineClassHelperKt.m2707c("animateToZero called while previous animation is running");
                }
                MotionDurationScale motionDurationScale = (MotionDurationScale) updatableAnimationState$animateToZero$1.getF56402a().mo2464u(MotionDurationScale.Key.f17196a);
                float fMo2462W = motionDurationScale != null ? motionDurationScale.mo2462W() : 1.0f;
                this.f6129d = true;
                updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                r0 = function0;
                function12 = function1;
                f = fMo2462W;
                updatableAnimationState = this;
                r02 = r0;
                if (Math.abs(updatableAnimationState.f6130e) < 0.01f) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function0 function02 = (Function0) updatableAnimationState$animateToZero$1.f6132b;
                UpdatableAnimationState updatableAnimationState2 = updatableAnimationState$animateToZero$1.f6131a;
                ResultKt.m18313b(obj);
                r13 = function02;
                function0 = updatableAnimationState2;
                r13.invoke();
                r14 = function0;
                r14.f6127b = Long.MIN_VALUE;
                r14.f6128c = animationVector1D;
                r14.f6129d = false;
                return Unit.f51459a;
            }
            f = updatableAnimationState$animateToZero$1.f6134d;
            Function0 function03 = updatableAnimationState$animateToZero$1.f6133c;
            Function1 function13 = (Function1) updatableAnimationState$animateToZero$1.f6132b;
            UpdatableAnimationState updatableAnimationState3 = updatableAnimationState$animateToZero$1.f6131a;
            try {
                ResultKt.m18313b(obj);
                UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$13 = updatableAnimationState$animateToZero$1;
                r03 = function03;
                function12 = function13;
                updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$13;
                updatableAnimationState = updatableAnimationState3;
            } catch (Throwable th) {
                th = th;
                function0 = updatableAnimationState3;
                function0.f6127b = Long.MIN_VALUE;
                function0.f6128c = animationVector1D;
                function0.f6129d = false;
                throw th;
            }
            try {
                r03.invoke();
                r0 = r03;
                r02 = r03;
                if (f == 0.0f) {
                    r02 = r0;
                    if (Math.abs(updatableAnimationState.f6130e) < 0.01f) {
                        UpdatableAnimationState$animateToZero$4 updatableAnimationState$animateToZero$4 = new UpdatableAnimationState$animateToZero$4(updatableAnimationState, f, function12);
                        updatableAnimationState$animateToZero$12.f6131a = updatableAnimationState;
                        updatableAnimationState$animateToZero$12.f6132b = function12;
                        updatableAnimationState$animateToZero$12.f6133c = r0;
                        updatableAnimationState$animateToZero$12.f6134d = f;
                        updatableAnimationState$animateToZero$12.f6137i = 1;
                        r03 = r0;
                        if (MonotonicFrameClockKt.m4385a(updatableAnimationState$animateToZero$12.getF56402a()).mo4202u0(updatableAnimationState$animateToZero$4, updatableAnimationState$animateToZero$12) == coroutineSingletons) {
                        }
                        r03.invoke();
                        r0 = r03;
                        r02 = r03;
                        if (f == 0.0f) {
                        }
                    }
                    return coroutineSingletons;
                }
                UpdatableAnimationState updatableAnimationState4 = updatableAnimationState;
                Function1 function14 = function12;
                UpdatableAnimationState updatableAnimationState5 = updatableAnimationState4;
                ?? r132 = r02;
                if (Math.abs(updatableAnimationState5.f6130e) == 0.0f) {
                    r14 = updatableAnimationState5;
                } else {
                    UpdatableAnimationState$animateToZero$5 updatableAnimationState$animateToZero$5 = new UpdatableAnimationState$animateToZero$5(updatableAnimationState5, function14);
                    updatableAnimationState$animateToZero$12.f6131a = updatableAnimationState5;
                    updatableAnimationState$animateToZero$12.f6132b = r132;
                    updatableAnimationState$animateToZero$12.f6133c = null;
                    updatableAnimationState$animateToZero$12.f6137i = 2;
                    r13 = r132;
                    function0 = updatableAnimationState5;
                }
                r14.f6127b = Long.MIN_VALUE;
                r14.f6128c = animationVector1D;
                r14.f6129d = false;
                return Unit.f51459a;
            } catch (Throwable th2) {
                th = th2;
                function0 = updatableAnimationState;
                function0.f6127b = Long.MIN_VALUE;
                function0.f6128c = animationVector1D;
                function0.f6129d = false;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
