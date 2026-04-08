package kotlinx.coroutines;

import io.intercom.android.sdk.survey.block.C5698n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "Key", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* JADX INFO: renamed from: b */
    public static final Key f55277b = new Key(ContinuationInterceptor.Key.f51580a, new C5698n(15));

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @ExperimentalStdlibApi
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key.f51580a);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    /* JADX INFO: renamed from: C0 */
    public final DispatchedContinuation mo18548C0(ContinuationImpl continuationImpl) {
        return new DispatchedContinuation(this, continuationImpl);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean mo9154I0(CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined);
    }

    /* JADX INFO: renamed from: Z0 */
    public CoroutineDispatcher mo20558Z0(int i) {
        LimitedDispatcherKt.m20826a(i);
        return new LimitedDispatcher(this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[RETURN] */
    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineContext mo2463b0(CoroutineContext.Key key) {
        Intrinsics.m18599g(key, "key");
        boolean z2 = key instanceof AbstractCoroutineContextKey;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f51581a;
        if (z2) {
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext.Key key2 = this.f51575a;
            Intrinsics.m18599g(key2, "key");
            return ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f51577b == key2) && ((CoroutineContext.Element) abstractCoroutineContextKey.f51576a.invoke(this)) != null) ? emptyCoroutineContext : this;
        }
        if (ContinuationInterceptor.Key.f51580a == key) {
        }
    }

    /* JADX INFO: renamed from: j0 */
    public abstract void mo6095j0(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.ContinuationInterceptor
    /* JADX INFO: renamed from: k */
    public final void mo18549k(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Intrinsics.m18597e(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        do {
            atomicReferenceFieldUpdater = DispatchedContinuation.f56319j;
        } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == DispatchedContinuationKt.f56325b);
        Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
        CancellableContinuationImpl cancellableContinuationImpl = obj instanceof CancellableContinuationImpl ? (CancellableContinuationImpl) obj : null;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.m20530k();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.m20565a(this);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public final CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        CoroutineContext.Element element;
        Intrinsics.m18599g(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (ContinuationInterceptor.Key.f51580a == key) {
                return this;
            }
            return null;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key key2 = this.f51575a;
        Intrinsics.m18599g(key2, "key");
        if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f51577b == key2) && (element = (CoroutineContext.Element) abstractCoroutineContextKey.f51576a.invoke(this)) != null) {
            return element;
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo16938y0(CoroutineContext coroutineContext, Runnable runnable) {
        mo6095j0(coroutineContext, runnable);
    }
}
