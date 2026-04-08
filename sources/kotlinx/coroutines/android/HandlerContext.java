package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import p001A.AbstractC0000a;
import p008J.C0016a;
import p008J.C0017b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-android"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HandlerContext extends HandlerDispatcher implements Delay {

    /* JADX INFO: renamed from: c */
    public final Handler f55379c;

    /* JADX INFO: renamed from: d */
    public final String f55380d;

    /* JADX INFO: renamed from: f */
    public final boolean f55381f;

    /* JADX INFO: renamed from: g */
    public final HandlerContext f55382g;

    public HandlerContext(Handler handler, String str, boolean z2) {
        this.f55379c = handler;
        this.f55380d = str;
        this.f55381f = z2;
        this.f55382g = z2 ? this : new HandlerContext(handler, str, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: I0 */
    public final boolean mo9154I0(CoroutineContext coroutineContext) {
        return (this.f55381f && Intrinsics.m18594b(Looper.myLooper(), this.f55379c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: S */
    public final DisposableHandle mo20567S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f55379c.postDelayed(runnable, j)) {
            return new C0016a(this, runnable);
        }
        m20657b1(coroutineContext, runnable);
        return NonDisposableHandle.f55357a;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* JADX INFO: renamed from: a1 */
    public final MainCoroutineDispatcher mo20642a1() {
        return this.f55382g;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: b */
    public final void mo20572b(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1 handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1 = new HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1(cancellableContinuationImpl, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f55379c.postDelayed(handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1, j)) {
            cancellableContinuationImpl.m20536r(new C0017b(0, this, handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1));
        } else {
            m20657b1(cancellableContinuationImpl.f55265f, handlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m20657b1(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.m20599b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        DefaultIoScheduler.f56472c.mo6095j0(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f55379c == this.f55379c && handlerContext.f55381f == this.f55381f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f55379c) ^ (this.f55381f ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f55379c.post(runnable)) {
            return;
        }
        m20657b1(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherMo20642a1;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f55294a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f56350a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherMo20642a1 = mainCoroutineDispatcher.mo20642a1();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherMo20642a1 = null;
            }
            str = this == mainCoroutineDispatcherMo20642a1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f55380d;
        if (string == null) {
            string = this.f55379c.toString();
        }
        return this.f55381f ? AbstractC0000a.m2C(string, ".immediate") : string;
    }

    public HandlerContext(Handler handler) {
        this(handler, null, false);
    }
}
