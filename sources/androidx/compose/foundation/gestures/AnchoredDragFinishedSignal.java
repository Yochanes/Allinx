package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnchoredDragFinishedSignal;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnchoredDragFinishedSignal extends CancellationException {
    public AnchoredDragFinishedSignal() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
