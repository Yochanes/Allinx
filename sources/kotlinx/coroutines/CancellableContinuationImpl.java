package kotlinx.coroutines;

import com.google.common.primitives.Ints;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006R\u000b\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004R\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004R\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¨\u0006\u000e"}, m18302d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "Lkotlinx/coroutines/DisposableHandle;", "_parentHandle", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55261g = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55262i = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55263j = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final Continuation f55264d;

    /* JADX INFO: renamed from: f */
    public final CoroutineContext f55265f;

    public CancellableContinuationImpl(int i, Continuation continuation) {
        super(i);
        this.f55264d = continuation;
        this.f55265f = continuation.getF55239c();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.f55240a;
    }

    /* JADX INFO: renamed from: E */
    public static Object m20515E(NotCompleted notCompleted, Object obj, int i, Function3 function3) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function3 != null || (notCompleted instanceof CancelHandler)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, (CancellationException) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: x */
    public static void m20516x(NotCompleted notCompleted, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + notCompleted + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* JADX INFO: renamed from: A */
    public final void mo20510A(Object obj, Function1 function1) {
        m20518C(obj, this.f55293c, new C6252a(function1, 0));
    }

    /* JADX INFO: renamed from: B */
    public final void m20517B() {
        Continuation continuation = this.f55264d;
        Throwable th = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.f56319j;
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Symbol symbol = DispatchedContinuationKt.f56325b;
                if (obj == symbol) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, symbol, this)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != symbol) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m20530k();
            mo20512m(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m20518C(Object obj, int i, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55262i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                Object objM20515E = m20515E((NotCompleted) obj2, obj, i, function3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM20515E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m20540w()) {
                    m20530k();
                }
                m20531l(i);
                return;
            }
            if (obj2 instanceof CancelledContinuation) {
                CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                cancelledContinuation.getClass();
                if (CancelledContinuation.f55267c.compareAndSet(cancelledContinuation, 0, 1)) {
                    if (function3 != null) {
                        m20528i(function3, cancelledContinuation.f55276a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m20519D(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.f55264d;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        m20518C(obj, (dispatchedContinuation != null ? dispatchedContinuation.f56320d : null) == coroutineDispatcher ? 4 : this.f55293c, null);
    }

    /* JADX INFO: renamed from: F */
    public final Symbol m20520F(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55262i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof NotCompleted;
            Symbol symbol = CancellableContinuationImplKt.f55266a;
            if (!z2) {
                boolean z3 = obj2 instanceof CompletedContinuation;
                return null;
            }
            Object objM20515E = m20515E((NotCompleted) obj2, obj, this.f55293c, function3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM20515E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m20540w()) {
                m20530k();
            }
            return symbol;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* JADX INFO: renamed from: I */
    public final void mo20511I(Object obj) {
        m20531l(this.f55293c);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: a */
    public final void mo20521a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55262i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                cancellationException2 = cancellationException;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (completedContinuation2.f55274e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            CompletedContinuation completedContinuationM20551a = CompletedContinuation.m20551a(completedContinuation2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuationM20551a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            CancelHandler cancelHandler = completedContinuation2.f55271b;
            if (cancelHandler != null) {
                m20527h(cancelHandler, cancellationException);
            }
            Function3 function3 = completedContinuation2.f55272c;
            if (function3 != null) {
                m20528i(function3, cancellationException, completedContinuation2.f55270a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.Waiter
    /* JADX INFO: renamed from: b */
    public final void mo20522b(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f55261g;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m20537t(segment);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Continuation getF55264d() {
        return this.f55264d;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: d */
    public final Throwable mo20524d(Object obj) {
        Throwable thMo20524d = super.mo20524d(obj);
        if (thMo20524d != null) {
            return thMo20524d;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: e */
    public final Object mo20525e(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).f55270a : obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: g */
    public final Object mo20526g() {
        return f55262i.get(this);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f55264d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getF55239c() {
        return this.f55265f;
    }

    /* JADX INFO: renamed from: h */
    public final void m20527h(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.mo20500d(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m20559a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.f55265f);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20528i(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f55265f;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m20559a(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m20529j(Segment segment, Throwable th) {
        CoroutineContext coroutineContext = this.f55265f;
        int i = f55261g.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.mo20714h(i, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m20559a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m20530k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55263j;
        DisposableHandle disposableHandle = (DisposableHandle) atomicReferenceFieldUpdater.get(this);
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.dispose();
        atomicReferenceFieldUpdater.set(this, NonDisposableHandle.f55357a);
    }

    /* JADX INFO: renamed from: l */
    public final void m20531l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f55261g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                Continuation continuation = this.f55264d;
                boolean z2 = i == 4;
                if (!z2 && (continuation instanceof DispatchedContinuation)) {
                    boolean z3 = i == 1 || i == 2;
                    int i4 = this.f55293c;
                    if (z3 == (i4 == 1 || i4 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                        CoroutineContext f55265f = dispatchedContinuation.f56321f.getF55239c();
                        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.f56320d;
                        if (coroutineDispatcher.mo9154I0(f55265f)) {
                            coroutineDispatcher.mo6095j0(f55265f, this);
                            return;
                        }
                        EventLoop eventLoopM20646a = ThreadLocalEventLoop.m20646a();
                        if (eventLoopM20646a.f55301c >= 4294967296L) {
                            eventLoopM20646a.m20581b1(this);
                            return;
                        }
                        eventLoopM20646a.m20582c1(true);
                        try {
                            DispatchedTaskKt.m20579a(this, continuation, true);
                            do {
                            } while (eventLoopM20646a.m20584e1());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                DispatchedTaskKt.m20579a(this, continuation, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, Ints.MAX_POWER_OF_TWO + (536870911 & i2)));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* JADX INFO: renamed from: m */
    public final boolean mo20512m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55262i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cancelledContinuation)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            NotCompleted notCompleted = (NotCompleted) obj;
            if (notCompleted instanceof CancelHandler) {
                m20527h((CancelHandler) obj, th);
            } else if (notCompleted instanceof Segment) {
                m20529j((Segment) obj, th);
            }
            if (!m20540w()) {
                m20530k();
            }
            m20531l(this.f55293c);
            return true;
        }
    }

    /* JADX INFO: renamed from: n */
    public Throwable mo20532n(JobSupport jobSupport) {
        return jobSupport.mo17051N();
    }

    /* JADX INFO: renamed from: o */
    public final Object m20533o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zM20540w = m20540w();
        do {
            atomicIntegerFieldUpdater = f55261g;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM20540w) {
                    m20517B();
                }
                Object obj = f55262i.get(this);
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).f55276a;
                }
                int i3 = this.f55293c;
                if (i3 == 1 || i3 == 2) {
                    Job job = (Job) this.f55265f.mo2464u(Job.Key.f55324a);
                    if (job != null && !job.isActive()) {
                        CancellationException cancellationExceptionMo17051N = job.mo17051N();
                        mo20521a(cancellationExceptionMo17051N);
                        throw cancellationExceptionMo17051N;
                    }
                }
                return mo20525e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((DisposableHandle) f55263j.get(this)) == null) {
            m20535q();
        }
        if (zM20540w) {
            m20517B();
        }
        return CoroutineSingletons.f51584a;
    }

    /* JADX INFO: renamed from: p */
    public final void m20534p() {
        DisposableHandle disposableHandleM20535q = m20535q();
        if (disposableHandleM20535q != null && m20539v()) {
            disposableHandleM20535q.dispose();
            f55263j.set(this, NonDisposableHandle.f55357a);
        }
    }

    /* JADX INFO: renamed from: q */
    public final DisposableHandle m20535q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.f55265f.mo2464u(Job.Key.f55324a);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleM20603f = JobKt.m20603f(job, true, new ChildContinuation(this));
        do {
            atomicReferenceFieldUpdater = f55263j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleM20603f)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return disposableHandleM20603f;
    }

    /* JADX INFO: renamed from: r */
    public final void m20536r(Function1 function1) {
        m20537t(new CancelHandler.UserSupplied(function1));
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM18311a = Result.m18311a(obj);
        if (thM18311a != null) {
            obj = new CompletedExceptionally(false, thM18311a);
        }
        m20518C(obj, this.f55293c, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* JADX INFO: renamed from: s */
    public final Symbol mo20513s(Object obj, Function3 function3) {
        return m20520F(obj, function3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        m20516x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bc, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20537t(NotCompleted notCompleted) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f55262i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Active) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, notCompleted)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof CancelHandler) || (obj instanceof Segment)) {
                break;
            }
            if (obj instanceof CompletedExceptionally) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                completedExceptionally.getClass();
                if (!CompletedExceptionally.f55275b.compareAndSet(completedExceptionally, 0, 1)) {
                    m20516x(notCompleted, obj);
                    throw null;
                }
                if (obj instanceof CancelledContinuation) {
                    if (!(obj instanceof CompletedExceptionally)) {
                        completedExceptionally = null;
                    }
                    Throwable th = completedExceptionally != null ? completedExceptionally.f55276a : null;
                    if (notCompleted instanceof CancelHandler) {
                        m20527h((CancelHandler) notCompleted, th);
                        return;
                    } else {
                        Intrinsics.m18597e(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m20529j((Segment) notCompleted, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                if (notCompleted instanceof Segment) {
                    return;
                }
                Intrinsics.m18597e(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) notCompleted, (Function3) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (completedContinuation2.f55271b != null) {
                m20516x(notCompleted, obj);
                throw null;
            }
            if (notCompleted instanceof Segment) {
                return;
            }
            Intrinsics.m18597e(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            CancelHandler cancelHandler = (CancelHandler) notCompleted;
            Throwable th2 = completedContinuation2.f55274e;
            if (th2 != null) {
                m20527h(cancelHandler, th2);
                return;
            }
            CompletedContinuation completedContinuationM20551a = CompletedContinuation.m20551a(completedContinuation2, cancelHandler, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuationM20551a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo20541z());
        sb.append('(');
        sb.append(DebugStringsKt.m20566b(this.f55264d));
        sb.append("){");
        Object obj = f55262i.get(this);
        sb.append(obj instanceof NotCompleted ? "Active" : obj instanceof CancelledContinuation ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(DebugStringsKt.m20565a(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m20538u() {
        return f55262i.get(this) instanceof NotCompleted;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m20539v() {
        return !(f55262i.get(this) instanceof NotCompleted);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m20540w() {
        if (this.f55293c != 2) {
            return false;
        }
        Continuation continuation = this.f55264d;
        Intrinsics.m18597e(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return DispatchedContinuation.f56319j.get((DispatchedContinuation) continuation) != null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* JADX INFO: renamed from: y */
    public final void mo20514y(Object obj, Function3 function3) {
        m20518C(obj, this.f55293c, function3);
    }

    /* JADX INFO: renamed from: z */
    public String mo20541z() {
        return "CancellableContinuation";
    }
}
