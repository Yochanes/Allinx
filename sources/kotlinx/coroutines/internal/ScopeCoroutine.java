package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {

    /* JADX INFO: renamed from: d */
    public final Continuation f56353d;

    public ScopeCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f56353d = continuation;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: f */
    public void mo20503f(Object obj) {
        DispatchedContinuationKt.m20820a(CompletionStateKt.m20552a(obj), IntrinsicsKt.m18556b(this.f56353d));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f56353d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: j */
    public void mo20577j(Object obj) {
        this.f56353d.resumeWith(CompletionStateKt.m20552a(obj));
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: l0 */
    public final boolean mo20628l0() {
        return true;
    }
}
