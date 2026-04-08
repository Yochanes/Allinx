package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"", "message", "", "a", "(Ljava/lang/String;)V", "b", "runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PreconditionsKt {
    /* JADX INFO: renamed from: a */
    public static final void m4402a(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: b */
    public static final void m4403b(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
