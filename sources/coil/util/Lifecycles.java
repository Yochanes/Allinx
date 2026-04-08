package coil.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class Lifecycles {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m12530a(Lifecycle lifecycle, ContinuationImpl continuationImpl) throws Throwable {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuationImpl instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuationImpl;
            int i = lifecycles$awaitStarted$1.f33993d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.f33993d = i - Integer.MIN_VALUE;
            } else {
                lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuationImpl);
            }
        }
        Object obj = lifecycles$awaitStarted$1.f33992c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = lifecycles$awaitStarted$1.f33993d;
        Unit unit = Unit.f51459a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = lifecycles$awaitStarted$1.f33991b;
            lifecycle2 = lifecycles$awaitStarted$1.f33990a;
            try {
                ResultKt.m18313b(obj);
                lifecycleObserver2 = (LifecycleObserver) objectRef.f51659a;
                if (lifecycleObserver2 != null) {
                    lifecycle2.mo9125c(lifecycleObserver2);
                }
                return unit;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.f51659a;
                if (lifecycleObserver != null) {
                }
                throw th;
            }
        }
        ResultKt.m18313b(obj);
        if (lifecycle.getF24894d().compareTo(Lifecycle.State.f24883d) >= 0) {
            return unit;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            lifecycles$awaitStarted$1.f33990a = lifecycle;
            lifecycles$awaitStarted$1.f33991b = objectRef2;
            lifecycles$awaitStarted$1.f33993d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(lifecycles$awaitStarted$1));
            cancellableContinuationImpl.m20534p();
            Lifecycles$awaitStarted$2$1 lifecycles$awaitStarted$2$1 = new Lifecycles$awaitStarted$2$1(cancellableContinuationImpl);
            objectRef2.f51659a = lifecycles$awaitStarted$2$1;
            lifecycle.mo9123a(lifecycles$awaitStarted$2$1);
            if (cancellableContinuationImpl.m20533o() == coroutineSingletons) {
                return coroutineSingletons;
            }
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.f51659a;
            if (lifecycleObserver2 != null) {
            }
            return unit;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.f51659a;
            if (lifecycleObserver != null) {
                lifecycle2.mo9125c(lifecycleObserver);
            }
            throw th;
        }
    }
}
