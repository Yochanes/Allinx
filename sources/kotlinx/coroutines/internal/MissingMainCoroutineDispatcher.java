package kotlinx.coroutines.internal;

import androidx.compose.p013ui.platform.AbstractC1313i;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: I0 */
    public final boolean mo9154I0(CoroutineContext coroutineContext) {
        m20843b1();
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: S */
    public final DisposableHandle mo20567S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        m20843b1();
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: b */
    public final void mo20572b(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        m20843b1();
        throw null;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m20843b1() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        m20843b1();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return AbstractC1313i.m6244a(']', "Dispatchers.Main[missing", "");
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* JADX INFO: renamed from: a1 */
    public final MainCoroutineDispatcher mo20642a1() {
        return this;
    }
}
