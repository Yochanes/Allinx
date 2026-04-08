package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\t8\u0016X\u0096\u0005¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/atomicfu/AtomicRef;", "", "_reusableCancellableContinuation", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56319j = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f56320d;

    /* JADX INFO: renamed from: f */
    public final ContinuationImpl f56321f;

    /* JADX INFO: renamed from: g */
    public Object f56322g;

    /* JADX INFO: renamed from: i */
    public final Object f56323i;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.f56320d = coroutineDispatcher;
        this.f56321f = continuationImpl;
        this.f56322g = DispatchedContinuationKt.f56324a;
        this.f56323i = ThreadContextKt.m20858b(continuationImpl.getF56402a());
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: g */
    public final Object mo20526g() {
        Object obj = this.f56322g;
        this.f56322g = DispatchedContinuationKt.f56324a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.f56321f;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF56402a() {
        return this.f56321f.getF56402a();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM18311a = Result.m18311a(obj);
        Object completedExceptionally = thM18311a == null ? obj : new CompletedExceptionally(false, thM18311a);
        ContinuationImpl continuationImpl = this.f56321f;
        CoroutineContext f55239c = continuationImpl.getF56402a();
        CoroutineDispatcher coroutineDispatcher = this.f56320d;
        if (coroutineDispatcher.mo9154I0(f55239c)) {
            this.f56322g = completedExceptionally;
            this.f55293c = 0;
            coroutineDispatcher.mo6095j0(continuationImpl.getF56402a(), this);
            return;
        }
        EventLoop eventLoopM20646a = ThreadLocalEventLoop.m20646a();
        if (eventLoopM20646a.f55301c >= 4294967296L) {
            this.f56322g = completedExceptionally;
            this.f55293c = 0;
            eventLoopM20646a.m20581b1(this);
            return;
        }
        eventLoopM20646a.m20582c1(true);
        try {
            CoroutineContext f55239c2 = continuationImpl.getF56402a();
            Object objM20859c = ThreadContextKt.m20859c(f55239c2, this.f56323i);
            try {
                continuationImpl.resumeWith(obj);
                while (eventLoopM20646a.m20584e1()) {
                }
            } finally {
                ThreadContextKt.m20857a(f55239c2, objM20859c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f56320d + ", " + DebugStringsKt.m20566b(this.f56321f) + ']';
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: c */
    public final Continuation getF55264d() {
        return this;
    }
}
