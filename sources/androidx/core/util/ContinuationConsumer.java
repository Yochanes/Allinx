package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/core/util/ContinuationConsumer;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
