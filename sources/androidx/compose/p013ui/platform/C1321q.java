package androidx.compose.p013ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.p013ui.MotionDurationScale;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1321q implements WindowRecomposerFactory {
    @Override // androidx.compose.p013ui.platform.WindowRecomposerFactory
    /* JADX INFO: renamed from: a */
    public final Recomposer mo6194a(View view) {
        CoroutineContext coroutineContext;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.f19587a;
        CoroutineContext coroutineContext2 = EmptyCoroutineContext.f51581a;
        Lazy lazy = AndroidUiDispatcher.f19286r;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            coroutineContext = (CoroutineContext) AndroidUiDispatcher.f19286r.getValue();
        } else {
            coroutineContext = AndroidUiDispatcher.f19287s.get();
            if (coroutineContext == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        CoroutineContext coroutineContextMo2465z = coroutineContext.mo2465z(coroutineContext2);
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContextMo2465z.mo2464u(MonotonicFrameClock.Key.f16398a);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            Latch latch = pausableMonotonicFrameClock2.f16421b;
            synchronized (latch.f16388a) {
                latch.f16391d = false;
            }
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CoroutineContext motionDurationScaleImpl = (MotionDurationScale) coroutineContextMo2465z.mo2464u(MotionDurationScale.Key.f17196a);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl();
            objectRef.f51659a = motionDurationScaleImpl;
        }
        if (pausableMonotonicFrameClock != null) {
            coroutineContext2 = pausableMonotonicFrameClock;
        }
        CoroutineContext coroutineContextMo2465z2 = coroutineContextMo2465z.mo2465z(coroutineContext2).mo2465z(motionDurationScaleImpl);
        Recomposer recomposer = new Recomposer(coroutineContextMo2465z2);
        synchronized (recomposer.f16461b) {
            recomposer.f16479t = true;
        }
        ContextScope contextScopeM20560a = CoroutineScopeKt.m20560a(coroutineContextMo2465z2);
        LifecycleOwner lifecycleOwnerM9180a = ViewTreeLifecycleOwner.m9180a(view);
        Lifecycle lifecycle = lifecycleOwnerM9180a != null ? lifecycleOwnerM9180a.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1299xff837ba8(view, recomposer));
            lifecycle.mo9123a(new C1300xff837ba9(contextScopeM20560a, pausableMonotonicFrameClock, recomposer, objectRef, view));
            return recomposer;
        }
        InlineClassHelperKt.m5598c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
