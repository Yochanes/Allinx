package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C6252a;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class SemaphoreAndMutexImpl {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56559c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f56560d = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56561e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f56562f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56563g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f56564a;

    /* JADX INFO: renamed from: b */
    public final C6252a f56565b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.f56564a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "The number of acquired permits should be in 0..").toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.f56565b = new C6252a(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.mo20514y(r3, r4.f56565b);
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20914d(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f56563g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f56564a;
        } while (andDecrement > i);
        Unit unit = Unit.f51459a;
        if (andDecrement <= 0) {
            CancellableContinuationImpl cancellableContinuationImplM20543b = CancellableContinuationKt.m20543b(IntrinsicsKt.m18556b(continuationImpl));
            try {
                if (!m20915e(cancellableContinuationImplM20543b)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (m20915e(cancellableContinuationImplM20543b)) {
                                break;
                            }
                        }
                    }
                }
                Object objM20533o = cancellableContinuationImplM20543b.m20533o();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
                if (objM20533o != coroutineSingletons) {
                    objM20533o = unit;
                }
                if (objM20533o == coroutineSingletons) {
                    return objM20533o;
                }
            } catch (Throwable th) {
                cancellableContinuationImplM20543b.m20517B();
                throw th;
            }
        }
        return unit;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20915e(Waiter waiter) {
        Object objM20814a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56561e;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f56562f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.f56566a;
        long j = andIncrement / ((long) SemaphoreKt.f56573f);
        loop0: while (true) {
            objM20814a = ConcurrentLinkedListKt.m20814a(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m20852b(objM20814a)) {
                Segment segmentM20851a = SegmentOrClosed.m20851a(objM20814a);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f56355c >= segmentM20851a.f56355c) {
                        break loop0;
                    }
                    if (!segmentM20851a.m20850j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM20851a)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM20851a.m20848f()) {
                                segmentM20851a.m20818e();
                            }
                        }
                    }
                    if (segment.m20848f()) {
                        segment.m20818e();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m20851a(objM20814a);
        int i = (int) (andIncrement % ((long) SemaphoreKt.f56573f));
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.f56576f;
        while (!atomicReferenceArray.compareAndSet(i, null, waiter)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = SemaphoreKt.f56569b;
                Symbol symbol2 = SemaphoreKt.f56570c;
                while (!atomicReferenceArray.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray.get(i) != symbol) {
                        return false;
                    }
                }
                boolean z2 = waiter instanceof CancellableContinuation;
                Unit unit = Unit.f51459a;
                if (z2) {
                    ((CancellableContinuation) waiter).mo20514y(unit, this.f56565b);
                    return true;
                }
                if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).mo20900e(unit);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
        }
        waiter.mo20522b(semaphoreSegment2, i);
        return true;
    }

    public final void release() {
        int i;
        Object objM20814a;
        boolean zMo20899c;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56563g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f56564a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56559c;
            SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f56560d.getAndIncrement(this);
            long j = andIncrement2 / ((long) SemaphoreKt.f56573f);
            SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.f56567a;
            while (true) {
                objM20814a = ConcurrentLinkedListKt.m20814a(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (SegmentOrClosed.m20852b(objM20814a)) {
                    break;
                }
                Segment segmentM20851a = SegmentOrClosed.m20851a(objM20814a);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f56355c >= segmentM20851a.f56355c) {
                        break;
                    }
                    if (!segmentM20851a.m20850j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM20851a)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM20851a.m20848f()) {
                                segmentM20851a.m20818e();
                            }
                        }
                    }
                    if (segment.m20848f()) {
                        segment.m20818e();
                    }
                }
            }
            SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m20851a(objM20814a);
            semaphoreSegment2.m20815a();
            zMo20899c = false;
            if (semaphoreSegment2.f56355c <= j) {
                int i3 = (int) (andIncrement2 % ((long) SemaphoreKt.f56573f));
                Symbol symbol = SemaphoreKt.f56569b;
                AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.f56576f;
                Object andSet = atomicReferenceArray.getAndSet(i3, symbol);
                if (andSet == null) {
                    int i4 = SemaphoreKt.f56568a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == SemaphoreKt.f56570c) {
                            zMo20899c = true;
                            break;
                        }
                    }
                    Symbol symbol2 = SemaphoreKt.f56569b;
                    Symbol symbol3 = SemaphoreKt.f56571d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, symbol2, symbol3)) {
                            if (atomicReferenceArray.get(i3) != symbol2) {
                                break;
                            }
                        } else {
                            zMo20899c = true;
                            break;
                        }
                    }
                    zMo20899c = !zMo20899c;
                } else if (andSet != SemaphoreKt.f56572e) {
                    boolean z2 = andSet instanceof CancellableContinuation;
                    Unit unit = Unit.f51459a;
                    if (z2) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                        Symbol symbolMo20513s = cancellableContinuation.mo20513s(unit, this.f56565b);
                        if (symbolMo20513s != null) {
                            cancellableContinuation.mo20511I(symbolMo20513s);
                            zMo20899c = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof SelectInstance)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zMo20899c = ((SelectInstance) andSet).mo20899c(this, unit);
                    }
                }
            }
        } while (!zMo20899c);
    }
}
