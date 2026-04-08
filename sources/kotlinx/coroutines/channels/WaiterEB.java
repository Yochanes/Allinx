package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.Waiter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/WaiterEB;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class WaiterEB {

    /* JADX INFO: renamed from: a */
    public final Waiter f55633a;

    public WaiterEB(Waiter waiter) {
        this.f55633a = waiter;
    }

    public final String toString() {
        return "WaiterEB(" + this.f55633a + ')';
    }
}
