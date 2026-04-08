package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/internal/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
