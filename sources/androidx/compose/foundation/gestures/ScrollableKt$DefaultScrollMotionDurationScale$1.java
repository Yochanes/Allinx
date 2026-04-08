package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/gestures/ScrollableKt$DefaultScrollMotionDurationScale$1", "Landroidx/compose/ui/MotionDurationScale;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScrollableKt$DefaultScrollMotionDurationScale$1 implements MotionDurationScale {
    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // androidx.compose.p013ui.MotionDurationScale
    /* JADX INFO: renamed from: W */
    public final float mo2462W() {
        return 1.0f;
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

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m18553c(this, coroutineContext);
    }
}
