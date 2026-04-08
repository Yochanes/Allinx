package androidx.compose.p013ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidUiFrameClock implements MonotonicFrameClock {

    /* JADX INFO: renamed from: a */
    public final Choreographer f19300a;

    /* JADX INFO: renamed from: b */
    public final AndroidUiDispatcher f19301b;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.f19300a = choreographer;
        this.f19301b = androidUiDispatcher;
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
        AndroidUiDispatcher androidUiDispatcher = this.f19301b;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element elementMo2464u = continuation.getF56402a().mo2464u(ContinuationInterceptor.Key.f51580a);
            androidUiDispatcher = elementMo2464u instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) elementMo2464u : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(continuation));
        cancellableContinuationImpl.m20534p();
        AndroidUiFrameClock$withFrameNanos$2$callback$1 androidUiFrameClock$withFrameNanos$2$callback$1 = new AndroidUiFrameClock$withFrameNanos$2$callback$1(cancellableContinuationImpl, this, function1);
        if (androidUiDispatcher == null || !Intrinsics.m18594b(androidUiDispatcher.f19288c, this.f19300a)) {
            this.f19300a.postFrameCallback(androidUiFrameClock$withFrameNanos$2$callback$1);
            cancellableContinuationImpl.m20536r(new AndroidUiFrameClock$withFrameNanos$2$2(this, androidUiFrameClock$withFrameNanos$2$callback$1));
        } else {
            synchronized (androidUiDispatcher.f19290f) {
                androidUiDispatcher.f19292i.add(androidUiFrameClock$withFrameNanos$2$callback$1);
                if (!androidUiDispatcher.f19295o) {
                    androidUiDispatcher.f19295o = true;
                    androidUiDispatcher.f19288c.postFrameCallback(androidUiDispatcher.f19296p);
                }
            }
            cancellableContinuationImpl.m20536r(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, androidUiFrameClock$withFrameNanos$2$callback$1));
        }
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
