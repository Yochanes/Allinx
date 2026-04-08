package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Unconfined extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c */
    public static final Unconfined f55372c = new Unconfined();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        YieldContext yieldContext = (YieldContext) coroutineContext.mo2464u(YieldContext.f55375c);
        if (yieldContext == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        yieldContext.f55376b = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
