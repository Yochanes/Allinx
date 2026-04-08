package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u001e\b\u0002\u0010\u0002\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, m18302d2 = {"T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class EventLoop_commonKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f55313a = new Symbol("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    public static final Symbol f55314b = new Symbol("CLOSED_EMPTY");

    /* JADX INFO: renamed from: a */
    public static final long m20591a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
