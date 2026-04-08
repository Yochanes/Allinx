package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/PublicCancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class PublicCancelFutureOnCancel implements CancelHandler {
    @Override // kotlinx.coroutines.CancelHandler
    /* JADX INFO: renamed from: d */
    public final void mo20500d(Throwable th) {
        if (th != null) {
            throw null;
        }
    }

    public final String toString() {
        return "CancelFutureOnCancel[null]";
    }
}
