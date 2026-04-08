package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {

    /* JADX INFO: renamed from: c */
    public final CoroutineContext f55239c;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            m20626i0((Job) coroutineContext.mo2464u(Job.Key.f55324a));
        }
        this.f55239c = coroutineContext.mo2465z(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: Q */
    public final String mo20492Q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX INFO: renamed from: R0 */
    public final void m20493R0(CoroutineStart coroutineStart, AbstractCoroutine abstractCoroutine, Function2 function2) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        Unit unit = Unit.f51459a;
        if (iOrdinal == 0) {
            try {
                DispatchedContinuationKt.m20820a(unit, IntrinsicsKt.m18556b(IntrinsicsKt.m18555a(abstractCoroutine, this, function2)));
                return;
            } finally {
                resumeWith(ResultKt.m18312a(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.m18599g(function2, "<this>");
                IntrinsicsKt.m18556b(IntrinsicsKt.m18555a(abstractCoroutine, this, function2)).resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                CoroutineContext coroutineContext = this.f55239c;
                Object objM20859c = ThreadContextKt.m20859c(coroutineContext, null);
                try {
                    if (function2 instanceof BaseContinuationImpl) {
                        TypeIntrinsics.m18629e(2, function2);
                        objInvoke = function2.invoke(abstractCoroutine, this);
                    } else {
                        objInvoke = IntrinsicsKt.m18557c(function2, abstractCoroutine, this);
                    }
                    ThreadContextKt.m20857a(coroutineContext, objM20859c);
                    if (objInvoke != CoroutineSingletons.f51584a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    ThreadContextKt.m20857a(coroutineContext, objM20859c);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: f0 */
    public final void mo20494f0(CompletionHandlerException completionHandlerException) {
        CoroutineExceptionHandlerKt.m20559a(completionHandlerException, this.f55239c);
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getF56402a() {
        return this.f55239c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF44934g() {
        return this.f55239c;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM18311a = Result.m18311a(obj);
        if (thM18311a != null) {
            obj = new CompletedExceptionally(false, thM18311a);
        }
        Object objM20631n0 = m20631n0(obj);
        if (objM20631n0 == JobSupportKt.f55349b) {
            return;
        }
        mo20577j(objM20631n0);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: t0 */
    public final void mo20495t0(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            mo20491P0(obj);
            return;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        mo20490N0(CompletedExceptionally.f55275b.get(completedExceptionally) != 0, completedExceptionally.f55276a);
    }

    /* JADX INFO: renamed from: P0 */
    public void mo20491P0(Object obj) {
    }

    /* JADX INFO: renamed from: N0 */
    public void mo20490N0(boolean z2, Throwable th) {
    }
}
