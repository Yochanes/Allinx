package androidx.compose.runtime;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/LeftCompositionCancellationException;", "Landroidx/compose/runtime/internal/PlatformOptimizedCancellationException;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LeftCompositionCancellationException extends PlatformOptimizedCancellationException {
    public LeftCompositionCancellationException() {
        super("The coroutine scope left the composition");
    }
}
