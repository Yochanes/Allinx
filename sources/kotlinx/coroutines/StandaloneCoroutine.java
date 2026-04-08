package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/StandaloneCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
class StandaloneCoroutine extends AbstractCoroutine<Unit> {
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: e0 */
    public final boolean mo20625e0(Throwable th) {
        CoroutineExceptionHandlerKt.m20559a(th, this.f55239c);
        return true;
    }
}
