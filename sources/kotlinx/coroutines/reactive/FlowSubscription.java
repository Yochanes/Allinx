package kotlinx.coroutines.reactive;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004R\u0019\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¨\u0006\r"}, m18302d2 = {"Lkotlinx/coroutines/reactive/FlowSubscription;", "T", "Lorg/reactivestreams/Subscription;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "", "cancellationRequested", "Z", "Lkotlinx/atomicfu/AtomicLong;", MetricTracker.Action.REQUESTED, "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/coroutines/Continuation;", "producer", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlowSubscription<T> extends AbstractCoroutine<Unit> implements Subscription {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f56399f = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56400g = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* JADX INFO: renamed from: d */
    public final Subscriber f56401d;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    public FlowSubscription(Subscriber subscriber) {
        super(null, false, true);
        this.f56401d = subscriber;
        this.producer$volatile = new C6337x4b4643a3(this.f55239c, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m20869T0(FlowSubscription flowSubscription, Continuation continuation) {
        FlowSubscription$flowProcessing$1 flowSubscription$flowProcessing$1;
        flowSubscription.getClass();
        if (continuation instanceof FlowSubscription$flowProcessing$1) {
            flowSubscription$flowProcessing$1 = (FlowSubscription$flowProcessing$1) continuation;
            int i = flowSubscription$flowProcessing$1.f56407d;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowSubscription$flowProcessing$1.f56407d = i - Integer.MIN_VALUE;
            } else {
                flowSubscription$flowProcessing$1 = new FlowSubscription$flowProcessing$1(flowSubscription, continuation);
            }
        }
        Object obj = flowSubscription$flowProcessing$1.f56405b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = flowSubscription$flowProcessing$1.f56407d;
        Unit unit = Unit.f51459a;
        try {
        } catch (Throwable th) {
            if (!flowSubscription.cancellationRequested || flowSubscription.isActive() || th != flowSubscription.mo17051N()) {
                try {
                    flowSubscription.f56401d.onError(th);
                } catch (Throwable th2) {
                    ExceptionsKt.m18297a(th, th2);
                    CoroutineExceptionHandlerKt.m20559a(th, flowSubscription.f55239c);
                }
            }
        }
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            flowSubscription$flowProcessing$1.f56404a = flowSubscription;
            flowSubscription$flowProcessing$1.f56407d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FlowSubscription flowSubscription2 = flowSubscription$flowProcessing$1.f56404a;
        ResultKt.m18313b(obj);
        try {
            flowSubscription2.f56401d.onComplete();
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.m20559a(th3, flowSubscription2.f55239c);
        }
        return unit;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancellationRequested = true;
        mo17054i(null);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        Continuation continuation;
        if (j <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = f56399f;
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                continuation = (Continuation) f56400g.getAndSet(this, null);
            } while (continuation == null);
            continuation.resumeWith(Unit.f51459a);
        }
    }
}
