package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "FrameAwaiter", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BroadcastFrameClock implements MonotonicFrameClock {

    /* JADX INFO: renamed from: a */
    public final Function0 f16212a;

    /* JADX INFO: renamed from: c */
    public Throwable f16214c;

    /* JADX INFO: renamed from: b */
    public final Object f16213b = new Object();

    /* JADX INFO: renamed from: d */
    public ArrayList f16215d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public ArrayList f16216f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final AtomicInt f16217g = new AtomicInt(0);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class FrameAwaiter<R> {

        /* JADX INFO: renamed from: a */
        public final Function1 f16218a;

        /* JADX INFO: renamed from: b */
        public final CancellableContinuationImpl f16219b;

        public FrameAwaiter(Function1 function1, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f16218a = function1;
            this.f16219b = cancellableContinuationImpl;
        }
    }

    public BroadcastFrameClock(Function0 function0) {
        this.f16212a = function0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m4201b(long j) {
        Object objM18312a;
        synchronized (this.f16213b) {
            try {
                ArrayList arrayList = this.f16215d;
                this.f16215d = this.f16216f;
                this.f16216f = arrayList;
                this.f16217g.set(0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    FrameAwaiter frameAwaiter = (FrameAwaiter) arrayList.get(i);
                    frameAwaiter.getClass();
                    try {
                        objM18312a = frameAwaiter.f16218a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objM18312a = ResultKt.m18312a(th);
                    }
                    frameAwaiter.f16219b.resumeWith(objM18312a);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
        FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl);
        synchronized (this.f16213b) {
            Throwable th = this.f16214c;
            if (th != null) {
                cancellableContinuationImpl.resumeWith(ResultKt.m18312a(th));
            } else {
                boolean zIsEmpty = this.f16215d.isEmpty();
                this.f16215d.add(frameAwaiter);
                if (zIsEmpty) {
                    this.f16217g.set(1);
                }
                cancellableContinuationImpl.m20536r(new BroadcastFrameClock$withFrameNanos$2$1(this, frameAwaiter));
                if (zIsEmpty) {
                    try {
                        ((Recomposer$broadcastFrameClock$1) this.f16212a).invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f16213b) {
                            try {
                                if (this.f16214c == null) {
                                    this.f16214c = th2;
                                    ArrayList arrayList = this.f16215d;
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        ((FrameAwaiter) arrayList.get(i)).f16219b.resumeWith(ResultKt.m18312a(th2));
                                    }
                                    this.f16215d.clear();
                                    this.f16217g.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
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
