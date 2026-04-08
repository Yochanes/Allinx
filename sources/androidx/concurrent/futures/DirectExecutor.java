package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class DirectExecutor implements Executor {

    /* JADX INFO: renamed from: a */
    public static final DirectExecutor f20835a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DirectExecutor[] f20836b;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        f20835a = directExecutor;
        f20836b = new DirectExecutor[]{directExecutor};
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f20836b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
