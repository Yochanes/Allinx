package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
