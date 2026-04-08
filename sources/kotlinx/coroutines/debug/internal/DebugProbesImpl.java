package kotlinx.coroutines.debug.internal;

import _COROUTINE.CoroutineDebuggingKt;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public final class DebugProbesImpl {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentWeakMap f55658a;

    /* JADX INFO: renamed from: b */
    public static final Function1 f55659b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public final CoroutineStackFrame getCallerFrame() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext getF56306b() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f55658a;
            DebugProbesImpl.f55658a.remove(this);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        Object objM18312a;
        CoroutineDebuggingKt.m74a("_CREATION", new Exception());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f55658a = new ConcurrentWeakMap(false);
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            Intrinsics.m18597e(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            TypeIntrinsics.m18629e(1, objNewInstance);
            objM18312a = (Function1) objNewInstance;
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (objM18312a instanceof Result.Failure) {
            objM18312a = null;
        }
        f55659b = (Function1) objM18312a;
        new ConcurrentWeakMap(true);
    }
}
