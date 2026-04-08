package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstanceInternal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\b"}, m18302d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/atomicfu/AtomicRef;", "", "owner", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56549h = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J=\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000b\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0005R\u000b\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0005R\u000b\u0010\u001c\u001a\u00020\u001a8\u0016X\u0096\u0005R\u000b\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¨\u0006\u001e"}, m18302d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "value", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "onCancellation", "resume", "(VLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;V)V", "Lkotlin/Result;", "result", "resumeWith", "(Lkotlin/Result;)V", "", "idempotent", "tryResume", "(VLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isActive", "isCancelled", "isCompleted", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {

        /* JADX INFO: renamed from: a */
        public final CancellableContinuationImpl f56550a;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f56550a = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: A */
        public final void mo20510A(Object obj, Function1 function1) {
            this.f56550a.mo20510A((Unit) obj, function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: I */
        public final void mo20511I(Object obj) {
            this.f56550a.mo20511I(obj);
        }

        @Override // kotlinx.coroutines.Waiter
        /* JADX INFO: renamed from: b */
        public final void mo20522b(Segment segment, int i) {
            this.f56550a.mo20522b(segment, i);
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext getF56402a() {
            return this.f56550a.f55265f;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: m */
        public final boolean mo20512m(Throwable th) {
            return this.f56550a.mo20512m(th);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            this.f56550a.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: s */
        public final Symbol mo20513s(Object obj, Function3 function3) {
            MutexImpl mutexImpl = MutexImpl.this;
            C6340a c6340a = new C6340a(mutexImpl, this);
            Symbol symbolM20520F = this.f56550a.m20520F((Unit) obj, c6340a);
            if (symbolM20520F != null) {
                MutexImpl.f56549h.set(mutexImpl, null);
            }
            return symbolM20520F;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: y */
        public final void mo20514y(Object obj, Function3 function3) {
            Unit unit = Unit.f51459a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f56549h;
            MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, null);
            this.f56550a.mo20510A(unit, new C6341b(mutexImpl, this));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0005¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {

        /* JADX INFO: renamed from: a */
        public final SelectInstanceInternal f56552a;

        /* JADX INFO: renamed from: b */
        public final Object f56553b;

        public SelectInstanceWithOwner(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.f56552a = selectInstanceInternal;
            this.f56553b = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* JADX INFO: renamed from: a */
        public final void mo20898a(DisposableHandle disposableHandle) {
            this.f56552a.mo20898a(disposableHandle);
        }

        @Override // kotlinx.coroutines.Waiter
        /* JADX INFO: renamed from: b */
        public final void mo20522b(Segment segment, int i) {
            this.f56552a.mo20522b(segment, i);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* JADX INFO: renamed from: c */
        public final boolean mo20899c(Object obj, Object obj2) {
            boolean zMo20899c = this.f56552a.mo20899c(obj, obj2);
            if (zMo20899c) {
                MutexImpl.f56549h.set(MutexImpl.this, this.f56553b);
            }
            return zMo20899c;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* JADX INFO: renamed from: e */
        public final void mo20900e(Object obj) {
            MutexImpl.f56549h.set(MutexImpl.this, this.f56553b);
            this.f56552a.mo20900e(obj);
        }
    }

    public MutexImpl(boolean z2) {
        super(1, z2 ? 1 : 0);
        this.owner$volatile = z2 ? null : MutexKt.f56555a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.mo20514y(r1, r4.f56565b);
     */
    @Override // kotlinx.coroutines.sync.Mutex
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo20909a(Continuation continuation) {
        boolean zM20912f = m20912f();
        Unit unit = Unit.f51459a;
        if (!zM20912f) {
            CancellableContinuationImpl cancellableContinuationImplM20543b = CancellableContinuationKt.m20543b(IntrinsicsKt.m18556b(continuation));
            try {
                CancellableContinuationWithOwner cancellableContinuationWithOwner = new CancellableContinuationWithOwner(cancellableContinuationImplM20543b);
                while (true) {
                    int andDecrement = SemaphoreAndMutexImpl.f56563g.getAndDecrement(this);
                    if (andDecrement <= this.f56564a) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (m20915e(cancellableContinuationWithOwner)) {
                            break;
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

    @Override // kotlinx.coroutines.sync.Mutex
    /* JADX INFO: renamed from: b */
    public final boolean mo20910b() {
        return Math.max(SemaphoreAndMutexImpl.f56563g.get(this), 0) == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* JADX INFO: renamed from: c */
    public final void mo20911c(Object obj) {
        while (mo20910b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56549h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = MutexKt.f56555a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    release();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20912f() {
        int i;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.f56563g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f56564a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    c2 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f56549h.set(this, null);
                    c2 = 0;
                    break;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        return "Mutex@" + DebugStringsKt.m20565a(this) + "[isLocked=" + mo20910b() + ",owner=" + f56549h.get(this) + ']';
    }
}
