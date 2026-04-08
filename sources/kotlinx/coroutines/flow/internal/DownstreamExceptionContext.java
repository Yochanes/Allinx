package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DownstreamExceptionContext implements CoroutineContext {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoroutineContext f56284a;

    /* JADX INFO: renamed from: b */
    public final Throwable f56285b;

    public DownstreamExceptionContext(Throwable th, CoroutineContext coroutineContext) {
        this.f56284a = coroutineContext;
        this.f56285b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: L0 */
    public final Object mo2461L0(Object obj, Function2 function2) {
        return this.f56284a.mo2461L0(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: b0 */
    public final CoroutineContext mo2463b0(CoroutineContext.Key key) {
        return this.f56284a.mo2463b0(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: u */
    public final CoroutineContext.Element mo2464u(CoroutineContext.Key key) {
        return this.f56284a.mo2464u(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: z */
    public final CoroutineContext mo2465z(CoroutineContext coroutineContext) {
        return this.f56284a.mo2465z(coroutineContext);
    }
}
